package org.expleo.sarch.dsl.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.expleo.sarch.dsl.generator.SoftwareArchitectureDslGenerator;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture;
import org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage;
import org.expleo.sarch.dsl.validation.SoftwareArchitectureDslValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

@ExtendWith(InjectionExtension.class)
@InjectWith(SoftwareArchitectureDslInjectorProvider.class)
public class SoftwareArchitectureDslFullTest {

    @Inject
    ParseHelper<Architecture> parseHelper;

    @Inject
    ValidationTestHelper validationHelper;

    @Inject
    SoftwareArchitectureDslGenerator generator;

    // Parsing test
    @Test
    public void testValidArchitectureParsing() throws Exception {
        String model = """
            Architecture "MySystem" {
              interface I {
                String value
              }
              component A {
                provides I via p
              }
            }
        """;
        Architecture architecture = parseHelper.parse(model);
        assertNotNull(architecture);
        assertEquals("MySystem", architecture.getName());
        validationHelper.assertNoErrors(architecture);
    }

    // Validation: duplicate component names
    @Test
    public void testDuplicateComponentName() throws Exception {
        String model = """
            Architecture "Test" {
              component Comp1 {}
              component Comp1 {}
            }
        """;
        Architecture architecture = parseHelper.parse(model);
        validationHelper.assertError(architecture, SoftwareArchitectureDslPackage.Literals.COMPONENT,
                SoftwareArchitectureDslValidator.DUPLICATE_COMPONENT_NAME);
    }

    // Validation: unresolved interface
    @Test
    public void testUnresolvedInterface() throws Exception {
        String model = """
            Architecture "Test" {
              component C {
                provides UnknownInterface via port1
              }
            }
        """;
        Architecture architecture = parseHelper.parse(model);
        validationHelper.assertError(
        	    architecture,
        	    SoftwareArchitectureDslPackage.Literals.PORT,
        	    Diagnostic.LINKING_DIAGNOSTIC
        	);
    }

    // Validation: duplicate provides
    @Test
    public void testDuplicateProvides() throws Exception {
        String model = """
            Architecture "Test" {
              interface I {}
              component C {
                provides I via p1
                provides I via p2
              }
            }
        """;
        Architecture architecture = parseHelper.parse(model);
        validationHelper.assertError(architecture, SoftwareArchitectureDslPackage.Literals.PORT,
                SoftwareArchitectureDslValidator.DUPLICATE_PROVIDED_INTERFACE);
    }

    // Validation: provides and requires same interface
    @Test
    public void testProvideAndRequireSameInterface() throws Exception {
        String model = """
            Architecture "Test" {
              interface I {}
              component C {
                provides I via p1
                requires I via p2
              }
            }
        """;
        Architecture architecture = parseHelper.parse(model);
        validationHelper.assertError(
        	    architecture,
        	    SoftwareArchitectureDslPackage.Literals.PORT,
        	    SoftwareArchitectureDslValidator.PROVIDES_AND_REQUIRES_SAME_INTERFACE
        	);
    }

    // Validation: unfulfilled requirement
    @Test
    public void testUnfulfilledRequirement() throws Exception {
        String model = """
            Architecture "Test" {
              interface I {}
              component C {
                requires I via r1
              }
            }
        """;
        Architecture architecture = parseHelper.parse(model);
        validationHelper.assertError(architecture, SoftwareArchitectureDslPackage.Literals.PORT,
                SoftwareArchitectureDslValidator.UNFULFILLED_REQUIREMENT);
    }

    @Test
    public void testJsonGeneration() throws Exception {
        String model = """
            Architecture "TestArch" {
              interface I1 { String value }
              component C {
                provides I1 via p
              }
            }
        """;

        Architecture architecture = parseHelper.parse(model);
        Resource resource = architecture.eResource();

        InMemoryFileSystemAccessMock fsa = new InMemoryFileSystemAccessMock();
        generator.doGenerate(resource, fsa, null);

        // Use resource URI last segment + .json as generated filename
        String generatedFileName = resource.getURI().lastSegment().replaceFirst("\\.[^.]+$", "") + ".json";

        String json = fsa.getGeneratedFile(generatedFileName);

        System.out.println("Generated file name: " + generatedFileName);
        System.out.println("Generated JSON content: " + json);

        assertNotNull(json, "Generated JSON file should not be null");
        assertTrue(json.contains("TestArch"));
        assertTrue(json.contains("I1"));
    }



}

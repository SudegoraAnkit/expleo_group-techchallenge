package org.expleo.sarch.dsl.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.expleo.sarch.dsl.softwareArchitectureDsl.Architecture;
import org.expleo.sarch.dsl.softwareArchitectureDsl.SoftwareArchitectureDslPackage;
import org.expleo.sarch.dsl.validation.SoftwareArchitectureDslValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

@ExtendWith(org.eclipse.xtext.testing.extensions.InjectionExtension.class)
@InjectWith(SoftwareArchitectureDslInjectorProvider.class)
public class SoftwareArchitectureDslParsingTest {

    @Inject
    ParseHelper<Architecture> parseHelper;

    @Inject
    ValidationTestHelper validationHelper;

    @Test
    public void testValidArchitecture() throws Exception {
        String input = """
            Architecture "MySystem" {
              interface I {
                String value
              }
              component A {
                provides I via p
              }
            }
        """;

        Architecture arch = parseHelper.parse(input);
        assertNotNull(arch);
        assertEquals("MySystem", arch.getName());

        validationHelper.assertNoErrors(arch);
    }

    @Test
    public void testDuplicateComponentNames() throws Exception {
        String input = """
            Architecture "DupSystem" {
              component C {}
              component C {}
            }
        """;
        Architecture arch = parseHelper.parse(input);
        validationHelper.assertError(arch, SoftwareArchitectureDslPackage.Literals.COMPONENT,
            SoftwareArchitectureDslValidator.DUPLICATE_COMPONENT_NAME);
    }
}

package org.expleo.sarch.dsl.ui.action;

import org.eclipse.core.commands.*;
import org.eclipse.core.resources.*;
import org.eclipse.core.runtime.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.*;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.*;
import org.eclipse.ui.handlers.HandlerUtil;
import org.expleo.sarch.dsl.generator.SoftwareArchitectureDslGenerator;
import org.expleo.sarch.dsl.ui.util.*;

public class GenerateJsonHandler extends AbstractHandler {
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
        Object firstElement = selection.getFirstElement();

        if (firstElement instanceof IFile file && "sarch".equalsIgnoreCase(file.getFileExtension())) {
            try {
                ResourceSet resourceSet = new ResourceSetImpl();
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                Resource emfResource = resourceSet.getResource(uri, true);

                SoftwareArchitectureDslGenerator generator = new SoftwareArchitectureDslGenerator();
                EclipseFileSystemAccess2 fsa = new EclipseFileSystemAccess2(file.getParent());
                generator.doGenerate(emfResource, fsa, null);

                // Open the generated JSON file (assuming one output)
                for (String generatedFile : fsa.getGeneratedFiles().keySet()) {
                    JsonViewerUtil.openGeneratedJsonFile(file.getProject().getName(), generatedFile);
                }

            } catch (Exception e) {
                throw new ExecutionException("Failed to generate and open JSON", e);
            }
        }

        return null;
    }
}

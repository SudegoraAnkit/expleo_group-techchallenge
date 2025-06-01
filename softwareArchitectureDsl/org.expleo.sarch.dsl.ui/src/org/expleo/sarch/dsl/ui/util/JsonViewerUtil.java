package org.expleo.sarch.dsl.ui.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

public class JsonViewerUtil {
    public static void openGeneratedJsonFile(String projectName, String relativePath) {
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = root.getProject(projectName);
        IFile file = project.getFile(new Path(relativePath));

        if (file.exists()) {
            PlatformUI.getWorkbench().getDisplay().asyncExec(() -> {
                try {
                    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    IDE.openEditor(page, file);
                } catch (Exception e) {
                    e.printStackTrace(); // Or use logging
                }
            });
        }
    }
}


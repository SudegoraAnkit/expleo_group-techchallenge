package org.expleo.sarch.dsl.ui.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.util.RuntimeIOException;

import java.util.HashMap;
import java.util.Map;

public class EclipseFileSystemAccess2 implements IFileSystemAccess2 {
    private final IContainer outputContainer;
    private final Map<String, String> generatedFiles = new HashMap<>();

    public EclipseFileSystemAccess2(IContainer outputContainer) {
        this.outputContainer = outputContainer;
    }

    @Override
    public void generateFile(String fileName, String outputCfgName, CharSequence contents) {
        try {
            IFile file = outputContainer.getFile(new Path(fileName));
            InputStream stream = new ByteArrayInputStream(contents.toString().getBytes(StandardCharsets.UTF_8));
            if (file.exists()) {
                file.setContents(stream, true, true, null);
            } else {
                file.create(stream, true, null);
            }
            generatedFiles.put(fileName, file.getFullPath().toString());
        } catch (Exception e) {
            throw new RuntimeException("Failed to write file: " + fileName, e);
        }
    }

    @Override
    public void generateFile(String fileName, CharSequence contents) {
        generateFile(fileName, IFileSystemAccess2.DEFAULT_OUTPUT, contents);
    }

    // Other methods can remain unimplemented if unused
    @Override public boolean isFile(String path) { return false; }
    @Override public CharSequence readTextFile(String path) { return null; }
    @Override public void deleteFile(String path) {}
    @Override public void deleteFile(String path, String outputCfgName) {}

    public Map<String, String> getGeneratedFiles() {
        return generatedFiles;
    }

	@Override
	public URI getURI(String path, String outputConfiguration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URI getURI(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateFile(String fileName, String outputCfgName, InputStream content) throws RuntimeIOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateFile(String fileName, InputStream content) throws RuntimeIOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InputStream readBinaryFile(String fileName, String outputCfgName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream readBinaryFile(String fileName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CharSequence readTextFile(String fileName, String outputCfgName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFile(String path, String outputConfigurationName) throws RuntimeIOException {
		// TODO Auto-generated method stub
		return false;
	}
}

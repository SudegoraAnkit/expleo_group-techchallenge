package org.expleo.sarch.dsl.tests;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.util.RuntimeIOException;

public class InMemoryFileSystemAccessMock implements IFileSystemAccess2 {

    private final Map<String, String> files = new HashMap<>();

    @Override
    public void generateFile(String fileName, CharSequence contents) {
        files.put(fileName, contents.toString());
    }

    @Override
    public boolean isFile(String path) {
        return files.containsKey(path);
    }

    @Override
    public String readTextFile(String path) {
        return files.get(path);
    }

    public String getGeneratedFile(String fileName) {
        return files.get(fileName);
    }

    // Stub all other methods if needed (for now they're not used)
    @Override public void generateFile(String fileName, String outputCfg, CharSequence contents) {}
    @Override public void deleteFile(String fileName) {}

	@Override
	public void deleteFile(String fileName, String outputConfigurationName) {
		// TODO Auto-generated method stub
		
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

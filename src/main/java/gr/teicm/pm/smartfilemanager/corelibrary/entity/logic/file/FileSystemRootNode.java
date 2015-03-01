/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.file;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ToNio
 */
public class FileSystemRootNode extends AbstractFile {

    private List<AbstractFile> rootfs;

    public FileSystemRootNode() throws IOException {
        super("", null);
        super.setAlias("ParentOfRootDirs");
        this.rootfs = new ArrayList<>();
        intializeChildren();
    }

    @Override
    protected boolean isFolderish() {
        return true;
    }

    private void intializeChildren() throws IOException {
        Iterable<Path> fileSystems = FileSystems.getDefault().getRootDirectories();
        for (Path fileSystem : fileSystems) {
            rootfs.add(new RootChild(fileSystem, this));
        }
    }

    @Override
    public List<AbstractFile> getAllChildren() {
        return rootfs;
    }

    @Override
    protected String getCharNameOnly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String getFullName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

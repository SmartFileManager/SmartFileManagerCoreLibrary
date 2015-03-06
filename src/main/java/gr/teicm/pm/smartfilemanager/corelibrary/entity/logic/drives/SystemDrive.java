/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.drives;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.exceptions.EntityNotFolderishException;
import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.file.AbstractFile;
import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.file.PathNameSanitization;
import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces.IFileProperties;

/**
 *
 * @author theweb
 */
public class SystemDrive extends AbstractFile {

    private PathNameSanitization childName;
    private List<AbstractFile> children;
    private Path file;
    private Date date;

    public SystemDrive(Path name, AbstractFile parent) throws IOException {
        super(name.toString(), parent);
        childName = new PathNameSanitization(name.toString());
        setAlias(childName.getOnlyLetter() + " Drive");
        this.children = new ArrayList<>();
        this.file = name;
        initializeRootDirPermissions();
        setSize(file);
        setLastModifiedTime(file);
    }

    private void intializeChildren() throws IOException {
        Iterable<Path> fileSystems = FileSystems.getDefault().getRootDirectories();
        for (Path fileSystem : fileSystems) {
            children.add(new SystemDrive(fileSystem, this));
        }
    }

    @Override
    protected String getCharNameOnly() {
        return (childName.getOnlyLetter());
    }

    @Override
    protected String getFullName() {
        return (childName.getDrive());
    }

    @Override
    protected boolean isFolderish() {
        return (!Files.isRegularFile(file));
    }

    private void isRootDirReadable() {
        setReadability(Files.isReadable(file));
    }

    private void isRootDirWritable() {
        setWritability(Files.isWritable(file));
    }

    private void initializeRootDirPermissions() {
        isRootDirReadable();
        isRootDirWritable();
    }

    @Override
    public List<AbstractFile> getAllChildren() throws EntityNotFolderishException {
        children = getContents(file);
        return (children);
    }

    @Override
    public IFileProperties getProperties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

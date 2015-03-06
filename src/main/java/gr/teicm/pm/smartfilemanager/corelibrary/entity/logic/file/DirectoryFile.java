/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.file;

import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.exceptions.EntityNotFolderishException;
import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces.IFileProperties;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ToNio
 */
public class DirectoryFile extends AbstractFile {

    private Path file;
    private List<AbstractFile> children;
    private Date date;

    protected DirectoryFile(Path file, AbstractFile parent) {
        super(file.getFileName().toString(), parent);
        this.file = file;
        setAlias("Folder");
        setLastModifiedTime(file);
        setSize(file);
    }

    @Override
    protected boolean isFolderish() {
        return (!Files.isRegularFile(file));
    }

    @Override
    public List<AbstractFile> getAllChildren() throws EntityNotFolderishException {
        children = getContents(file);
        return children;
    }

    @Override
    protected String getCharNameOnly() {
        return (getName());
    }

    @Override
    protected String getFullName() {
        return (getName());
    }

    @Override
    public IFileProperties getProperties() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

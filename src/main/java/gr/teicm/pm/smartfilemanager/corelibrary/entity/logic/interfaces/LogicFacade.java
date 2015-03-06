/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author ToNio
 */
public interface LogicFacade {

    /**
     * Gets all the system drives
     *
     * @return List of root drives C:\ D:\ in windows or /dev/sdax in unix like
 systems - sth that implements IFile (AbstractFile).
     */
    public List<? extends IFile> getRootEntity();

    /**
     * Gets the entity size
     *
     * @param entity the entity that you it's size
     * @return entity size
     */
    public String getEntitySize(IFile entity);

    public String getEntityLastModified(IFile entity);

    /**
     * Determines if you can read an entity
     *
     * @param entity the entity that you refer to
     * @return boolean if you can read an entity
     */
    public boolean isEntityReadable(IFile entity);

    /**
     * Determines if you can write to an entity
     *
     * @param entity the entity that you refer to
     * @return boolean if you can write to the entity
     */
    public boolean isEntityWriteable(IFile entity);

    /**
     * Determines if an entity contains other entities
     *
     * @param entity the entity that you refer to
     * @return boolean if there are other entities contained
     */
    public boolean isFolderish(IFile entity);

    /**
     * Gets all the entities contained within an entity
     *
     * @param entity the entity that contains other entities
     * @return boolean if there are other entities contained
     */
    public Collection getAllChildren(IFile entity);

    /**
     * Renames an entity
     * 
     * @param entity the entity that you want to rename
     */
    public void rename(IFile entity);

    /**
     * Deletes an entity
     * 
     * @param entity the entity that you want to delete
     */
    public void delete(IFile entity);

    /**
     * Performs cut operation
     * 
     * @param entity the entity that you want to cut
     */
    public void cut(IFile entity);
    
    /**
     * Performs copy operation
     * 
     * @param entity the entity that you want to copy
     */
    public void copy(IFile entity);
    
    /**
     * Performs paste operation
     * pastes an entity
     * 
     * @param entity the entity that you want to paste
     * @param newName the entity's new name
     */
    public void paste(IFile entity, String newName);

    public void addEntityChangeListener(EntityChangedListener listener);

    public void removeEntityChangeListener(EntityChangedListener listener);

}

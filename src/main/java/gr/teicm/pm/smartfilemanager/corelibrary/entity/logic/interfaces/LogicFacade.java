/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces;

import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces.IEntity;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author ToNio
 */
public interface LogicFacade {

    public List<IEntity> getRootEntity();

    public String getEntitySize(IEntity entity);

    public String getEntityLastModified(IEntity entity);

    public boolean isEntityReadable(IEntity entity);

    public boolean isEntityWriteable(IEntity entity);

    public boolean isFolderish(IEntity entity);

    public Collection getAllChildren(IEntity entity);

    public void rename(IEntity entity);

    public void delete(IEntity entity);

    public void cut(IEntity entity);

    public void copy(IEntity entity);

    public void paste(IEntity entity, String newName);

    public void addEntityChangeListener(EntityChangedListener listener);

    public void removeEntityChangeListener(EntityChangedListener listener);

}

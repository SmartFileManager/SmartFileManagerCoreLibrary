/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.exceptions;

import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces.IEntity;

/**
 *
 * @author ToNio
 */
public class EntityNotFolderishException extends Exception {

    private IEntity entity;
    private String reason;

    public EntityNotFolderishException(IEntity entity, String reason) {
        this.entity = entity;
        this.reason = reason;
    }

    public EntityNotFolderishException() {
    }

    public IEntity getEntity() {
        return this.entity;
    }

    public String getReason() {
        return this.reason;
    }
}

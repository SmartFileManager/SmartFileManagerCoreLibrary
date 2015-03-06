/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.exceptions;

import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces.IFile;

/**
 *
 * @author ToNio
 */
public class EntityNotFolderishException extends Exception {

    private IFile entity;
    private String reason;

    public EntityNotFolderishException(IFile entity, String reason) {
        this.entity = entity;
        this.reason = reason;
    }

    public EntityNotFolderishException() {
    }

    public IFile getEntity() {
        return this.entity;
    }

    public String getReason() {
        return this.reason;
    }
}

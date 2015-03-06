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
public class EntityPasteFailedException extends Exception {

    private IFile entity;
    private String reason;

    public EntityPasteFailedException(IFile entity, String reason) {

    }

    public IFile getEntity() {
        return this.entity;
    }

    public String getReason() {
        return this.reason;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.smartfilemanagercorelibrary.entity.logic;

/**
 *
 * @author ToNio
 */
public class EntityNotFolderishException extends Exception {

    private EntityInterface entity;
    private String reason;

    public EntityNotFolderishException(EntityInterface entity, String reason) {
        this.entity = entity;
        this.reason = reason;
    }

    public EntityNotFolderishException() {
    }

    public EntityInterface getEntity() {
        return this.entity;
    }

    public String getReason() {
        return this.reason;
    }
}

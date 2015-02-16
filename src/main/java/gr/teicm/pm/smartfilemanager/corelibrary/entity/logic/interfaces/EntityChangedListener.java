/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces;

import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.EntityChangedEvent;

/**
 *
 * @author ToNio
 */
public interface EntityChangedListener {

    public void entityChanged(EntityChangedEvent event);

}

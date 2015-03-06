/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.drives;

import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.interfaces.IFileProperties;
import java.util.Date;
import org.apache.commons.lang3.SystemUtils;

/**
 *
 * @author user
 */
public class UnixDriveProperties implements IFileProperties {

    public UnixDriveProperties() throws Exception {

        if (!SystemUtils.IS_OS_LINUX) {
            throw new Exception("Wrong os");
        }
    }

    @Override
    public long getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getLastModified() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isReadable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isWritable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

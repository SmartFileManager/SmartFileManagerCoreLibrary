/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.definitions;

/**
 *
 * @author user
 */
public enum OperatingSystem {

    WINDOWS {
                @Override
                public String toString() {
                    return ("Windows");
                }
            },
    GNULINUX {
                @Override
                public String toString() {
                    return ("Linux");
                }
            }
}

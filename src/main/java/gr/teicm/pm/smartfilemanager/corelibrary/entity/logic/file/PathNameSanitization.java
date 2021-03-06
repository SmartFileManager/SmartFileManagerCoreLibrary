/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.file;

public class PathNameSanitization {

    private String userPath = " ";

    private PathNameSanitization() {
    }

    ;
    public PathNameSanitization(String rootChildName) {
        this.userPath = rootChildName;
    }

    public String getDrive() {
        return (getOnlyLetter() + ":" + "\\");
    }

    protected String getDirectoryName() {
        return (this.userPath);
    }

    public String getOnlyLetter() {
        return (this.userPath.substring(0, 1));
    }

    protected String getFullPath(String path) {
        userPath += path;
        return (userPath);
    }

    protected String getFullPath() {
        return (userPath);
    }
}

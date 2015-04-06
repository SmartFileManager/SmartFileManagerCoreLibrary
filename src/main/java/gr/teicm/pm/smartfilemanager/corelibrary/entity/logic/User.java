/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.corelibrary.entity.logic;

/**
 *
 * @author user
 */
public class User {
    public static String getUsername(){
    return(System.getProperty("user.name"));
    }
}

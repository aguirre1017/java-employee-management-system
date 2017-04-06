/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

/**
 *
 * @author Christine Targa
 */
public class Config {

    public static final String DATABASE_NAME = "employee_management_system";
    public static final String DATABASE_SERVER = "localhost";
    public static final String DATABASE_USER_ID = "root";
    public static final String DATABASE_PASSWORD = "";

    public static final String connection_url = "jdbc:mysql://" + DATABASE_SERVER + "/" + DATABASE_NAME;
}

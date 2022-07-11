/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.Database;
import models.User;

/**
 *
 * @author Gatotkaca
 */
public class UserController {
    final static String TABLE_NAME = "Users";
    
    // statement = interface untuk menggunakan query
    static Statement statement;
    static ResultSet result;   
    
    public UserController() {
    }
    
    public List<User> index() {
        Database database = new Database();
        Connection connection = database.connect();
        
        String query = "SELECT * FROM " + TABLE_NAME + ";";
        List<User> listUser = new ArrayList<User>();
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                User user = new User(result.getString("id"), result.getString("name"), result.getString("username"), result.getString("password"));
                listUser.add(user);
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println("controllers.UserController.getAll() : " + e);
        }
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("controllers.UserController.index() : " + e);
        }
        
        return listUser;
    }
    
    public void store(User user) {
        Database database = new Database();
        Connection connection = database.connect();
        
        String query = "INSERT INTO " + TABLE_NAME+ " VALUES(UPPER('" + user.getId() + "'), '" + user.getName() + "', '" + user.getUsername() + "','" + user.getPassword() + "')";
            
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
        } catch (SQLException e) {
            System.err.println("controllers.UserController.store() : " + e);
        }
        
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("controllers.UserController.index() : " + e);
        }
    }
    
    public User show(String username) {
        Database database = new Database();
        Connection connection = database.connect();
        
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE username = '" + username + "';";
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                User user = new User(result.getString("id"), result.getString("name"), result.getString("username"), result.getString("password"));
                connection.close();
                statement.close();
                return user;
            }
            System.err.println("controllers.UserController.show() : User tidak ditemukan");
            return null;
        } catch (SQLException e) {
            System.err.println("controllers.UserController.show() : "+ e);
            return null;
        }
    }
    
    public Boolean destroy(String username) {
        Database database = new Database();
        Connection connection = database.connect();
        
        String query = "DELETE FROM " + TABLE_NAME + " WHERE username = '" + username + "';";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.close();
            statement.close();
            return true;
        } catch (Exception e) {
            System.err.println("controllers.UserController.destroy() : " + e);
            return false;
        }
    }
}

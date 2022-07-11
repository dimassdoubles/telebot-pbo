/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import static controllers.MemberController.statement;
import static controllers.UserController.statement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.Database;
import models.Chat;

/**
 *
 * @author Gatotkaca
 */
public class ChatController {
    final static String TABLE_NAME = "Chats";
    
    // statement = interface untuk menggunakan query
    static Statement statement;
    static ResultSet result;   
    
    public ChatController() {
    }
    
    public List<Chat> index() {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT * FROM " + TABLE_NAME + " ORDER BY created_at DESC;";
        List<Chat> listChat = new ArrayList<Chat>();
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                Chat chat = new Chat(result.getString("id"), result.getString("category"), result.getString("sender"), result.getString("message"));
                listChat.add(chat);
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println("controllers.ChatController.getAll() : " + e);
        }
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("controllers.UserController.index() : " + e);
        }
        
        return listChat;
    }
    
    public boolean store(Chat chat) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "INSERT INTO " + TABLE_NAME + " VALUES(UPPER('" + chat.getId() + "'), '" + chat.getCategory()+ "', '" + chat.getSender()+ "', '" + chat.getMessage() + "', NOW());";
            
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
//            System.out.println("controllers.ChatController.store() : Berhasil menyimpan data chat");
            connection.close();
            statement.close();
            return true;
        } catch (SQLException e) {
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.err.println("controllers.ChatController.store() : Gagal menyimpan data chat (" + e + ")");
            return false;
        }
    }
    
    public Chat show(String id) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE id = '" + id + "';";
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                Chat selectedChat = new Chat(result.getString("id"), result.getString("category"), result.getString("sender"), result.getString("message"));
                connection.close();
                statement.close();
                return selectedChat;
            }
            statement.close();
            return null;
        } catch (SQLException e) {
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.err.println("controllers.ChatController.show() : " + e);
            return null;
        }
    }
    
    public boolean destroy(String id) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE id = '" + id + "';";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
//            System.out.println("controllers.ChatController.destroy() : Data Chat berhasil dihapus");
            connection.close();
            statement.close();
            return true;
        } catch (Exception e) {
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.err.println("controllers.ChatController.destroy() : " + e);
            return false;
        }
    }
}

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
import models.Keyword;

/**
 *
 * @author Gatotkaca
 */
public class KeywordController {
    final static String TABLE_NAME = "Keywords";
    
    // statement = interface untuk menggunakan query
    static Statement statement;
    static ResultSet result;   
    
    public KeywordController() {
    }
    
    public List<Keyword> index() {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT * FROM " + TABLE_NAME + " ORDER BY keyword ASC;";
        List<Keyword> listKeyword = new ArrayList<Keyword>();
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                Keyword keyword = new Keyword(result.getString("id"), result.getString("keyword"), result.getString("response"));
                listKeyword.add(keyword);
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println("controllers.KeywordController.getAll() : " + e);
        }
        
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("controllers.UserController.index() : " + e);
        }
        
        return listKeyword;
    }
    
    public boolean store(Keyword keyword) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "INSERT INTO " + TABLE_NAME + " VALUES(UPPER('" + keyword.getId() + "'), '" + keyword.getKeyword()+ "', '" + keyword.getResponse() + "');";
            
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
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
            System.err.println("controllers.KeywordController.store() : Gagal menyimpan data keyword (" + e + ")");
            return false;
        }
    }
    
    public Keyword show(String keyword) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE keyword = '" + keyword + "';";
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                Keyword selectedKeyword = new Keyword(result.getString("id"), result.getString("keyword"), result.getString("response"));
                connection.close();
                statement.close();
                return selectedKeyword;
            }
            connection.close();
            statement.close();
            System.err.println("controllers.KeywordController.show() : Keyword tidak ditemukan");
            return null;
        } catch (SQLException e) {
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.out.println("controllers.KeywordController.show() (" + e + ")");
            return null;
        }
    }
    
    public String getResponse(String keyword) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT response FROM " + TABLE_NAME + " WHERE keyword = '" + keyword + "';";
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                String response = result.getString("response");
                connection.close();
                statement.close();
                return response;
            }
            connection.close();
            statement.close();
            System.err.println("controllers.KeywordController.show() : Keyword tidak ditemukan");
            return "Maaf, Keyword tidak terdaftar";
            
        } catch (Exception e) {
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.out.println("controllers.KeywordController.show() : Keyword tidak ditemukan (" + e + ")");
            return "Maaf, terjadi kesalahan pada sistem kami";
        }
    }
    
    public boolean update(Keyword keyword) {
        Database database = new Database();
        Connection connection = database.connect();
        String id = keyword.getId();
        String textKeyword = keyword.getKeyword();
        String response = keyword.getResponse();
        
        String query = "UPDATE keywords SET keyword = '" + textKeyword + "', response = '" + response + "' WHERE keywords.id = '" + id + "'";
        
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
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
            System.err.println("controllers.KeywordController.destroy() : " + e);
            return false;
        }
    }
    
    public Boolean destroy(String id) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "DELETE FROM " + TABLE_NAME + " WHERE id = '" + id + "';";
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
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
            System.err.println("controllers.KeywordController.destroy() : " + e);
            return false;
        }
    }
}

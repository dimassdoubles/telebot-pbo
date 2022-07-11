package controllers;

import static controllers.UserController.statement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.Database;
import models.Member;

/**
 *
 * @author Gatotkaca
 */
public class MemberController {
    final static String TABLE_NAME = "Members";
    
    // statement = interface untuk menggunakan query
    static Statement statement;
    static ResultSet result;   
    
    public MemberController() {
    }
    
    public List<Member> index() {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT * FROM " + TABLE_NAME + " ORDER BY name;";
        List<Member> listMember = new ArrayList<Member>();
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                Member member = new Member(result.getString("id"), result.getString("name"), result.getString("username"));
                listMember.add(member);
            }
            statement.close();
        } catch (SQLException e) {
            System.err.println("controllers.MemberController.getAll() : " + e);
        }
        try {
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.err.println("controllers.UserController.index() : " + e);
        }
        return listMember;
    }
    
    public boolean store(Member member) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "INSERT INTO " + TABLE_NAME + " VALUES(UPPER('" + member.getId() + "'), '" + member.getName() + "', '" + member.getUsername()+ "')";
            
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
            System.err.println("controllers.MemberController.store() : Gagal menyimpan data member (" + e + ")");
            return false;
        }
    }
    
    public Member show(String id) {
        Database database = new Database();
        Connection connection = database.connect();
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE id = '" + id + "';";
        try {
            statement = connection.createStatement();
            result = statement.executeQuery(query);
            while(result.next()) {
                Member member = new Member(result.getString("id"), result.getString("name"), result.getString("username"));
                connection.close();
                statement.close();
                return member;
            }
            connection.close();
            statement.close();
            System.err.println("controllers.MemberController.show() : Member tidak ditemukan");
            return null;
        } catch (SQLException e) {
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.err.println("controllers.MemberController.show() : " + e);
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
            try {
                statement.close();
                connection.close();
            } catch (Exception e2) {
                System.err.println("controllers.UserController.index() : " + e2);
            }
            System.err.println("controllers.MemberController.destroy() : " + e);
            return false;
        }
    }
}

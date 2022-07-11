/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import generator.Generator;

/**
 *
 * @author Gatotkaca
 */
public class Member {
    private String id;
    private String name;
    private String username;
    
    public Member(String id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }
    
    public Member(String name, String username) {
        Generator generator = new Generator();
        this.id = generator.getId();
        this.name = name;
        this.username = username;
    }
    
    public void print() {
        System.out.println("id       : " + id);
        System.out.println("name     : " + name);
        System.out.println("username : " + username);
    }


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    
}

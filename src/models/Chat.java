package models;

import generator.Generator;
/**
 *
 * @author Gatotkaca
 */
public class Chat {
    private String id;
    private String category;
    private String sender;
    private String message;
    
    public Chat(String id, String category, String sender, String message) {
        this.id = id;
        this.category = category;
        this.sender = sender;
        this.message = message;
    }
    
    public Chat(String category, String sender, String message) {
        Generator generator = new Generator();
        this.id = generator.getId();
        this.category = category;
        this.sender = sender;
        this.message = message;   
    }
    
    public void print() {
        System.out.println("id       : " + id);
        System.out.println("category : " + category);
        System.out.println("sender   : " + sender);
        System.out.println("message  : " + message);
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
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the sender
     */
    public String getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    
}

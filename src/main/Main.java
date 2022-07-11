/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import bot.MasBot;
import controllers.ChatController;
import controllers.KeywordController;
import controllers.MemberController;
import controllers.UserController;
import generator.Generator;
import java.util.ArrayList;
import java.util.List;
import models.Member;
import models.User;
import views.MainFrame;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Chat;
import models.Keyword;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import views.LoginFrame;
import views.widgets.ConfirmDialog;

/**
 *
 * @author Gatotkaca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Test User Controller ------------------------------------------------
        
//        UserController userController = new UserController(connection);
//        List<User> listUser = new ArrayList<User>();
//        listUser = userController.index();
//        System.out.println(listUser.get(0).getId());
//        User userBaru = new User("dimas", "dimas4", "123");
//        userController.store(userBaru);
//        userController.index();
//        Generator generator = new Generator();
//        generator.getId();
//        User bacaUser = userController.show("dimas9");
//        if (bacaUser != null) {
//            System.out.println(bacaUser.getId());
//            System.out.println(bacaUser.getName());
//            System.out.println(bacaUser.getUsername());
//            System.out.println(bacaUser.getPassword());
//        } else {
//            System.err.println("User tidak ada");
//        }
//        
//        userController.destroy("grtththh56");





        // Test Member Controller ----------------------------------------------
        
//        MemberController memberController = new MemberController(connection);
//        Member memberBaru = new Member("Dimas Saputro", "dimas3", "dimas@gmail.com");
//        
//        memberController.store(memberBaru);
//        memberController.index();
//        memberController.destroy("dimas2");
//        memberController.index();




        // Test Keyword Controller ---------------------------------------------
        
//        KeywordController keywordController = new KeywordController(connection);
//        Keyword keywordBaru = new Keyword("p", "pape pape, ga da akhlak");
//        
//        keywordController.store(keywordBaru);
//        keywordController.index();
//        keywordController.destroy("hallo");
//        keywordController.index();
//        keywordController.show("hallo");





        // Test Chat Controller ------------------------------------------------
//        ChatController chatController = new ChatController(connection);
//        Chat chatBaru = new Chat("O", "dimas", "Apa kabar ?");
//        
//        chatController.store(chatBaru);
//        chatController.index();
//        chatController.show("WRI070D");
//        chatController.destroy("WRI070D");
//        chatController.index();





        // Main Program --------------------------------------------------------
        
        
        
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(false);
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setMainFrame(mainFrame);
        loginFrame.setVisible(true);


        System.out.println("Siap dimulai");








        // Telegram Bot --------------------------------------------------------
        
//        try {
//            // You can use your own BotSession implementation if needed.
//            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
//            botsApi.registerBot(new MasBot());
//        } catch (TelegramApiException e) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
//        }
        
    }
    
}

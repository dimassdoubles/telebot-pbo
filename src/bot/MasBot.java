/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bot;

//import com.pengrad.telegrambot.request.SendMessage
import static com.google.common.base.Strings.nullToEmpty;
import controllers.ChatController;
import controllers.KeywordController;
import controllers.MemberController;
import main.Database;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.sql.Connection;
import java.util.List;
import models.Chat;
import models.Member;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.User;
import views.contents.ChatPanel;
import views.contents.MemberPanel;


/**
 *
 * @author Gatotkaca
 */
public class MasBot extends TelegramLongPollingBot{
    private MemberPanel memberPanel;
    private ChatPanel chatPanel;
    private static String admin;
    
    public void setAdmin(String admin) {
        this.admin = admin;
        System.out.println("bot.MasBot.setAdmin() disini" + admin);
    }
    

    @Override
    public String getBotToken() {
        return "5432344890:AAFKmHMa1eEurfp7IiyCexEt3fk4T2rqZIw";
    }

    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            
            // Controller 
            KeywordController keywordController = new KeywordController();
            MemberController memberController = new MemberController();
            ChatController chatController = new ChatController();
            
            String textMessage = update.getMessage().getText();
            String chatId = update.getMessage().getChatId().toString();
            String username = update.getMessage().getFrom().getUserName();
            
            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            
            Chat receivedChat = new Chat("I", username, update.getMessage().getText());
            chatController.store(receivedChat);
            chatPanel.refresh();
            
            
            if (textMessage.equals("/register")) {
                String name = nullToEmpty(update.getMessage().getFrom().getFirstName()) + " " + nullToEmpty(update.getMessage().getFrom().getLastName());
                
                if (memberController.show(chatId) != null) {
                    sendMessage(message, "O", admin, "Kamu sudah terdaftar, ga usah daftar lagi !", chatController);
                    chatPanel.refresh();
                    try {
                        execute(message); // Call method to send the message
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                else if (memberController.store(new Member(chatId, name, username))) {
                    memberPanel.refresh();

                    sendMessage(message, "O", admin, "Register berhasil gan, selamat!", chatController);
                    chatPanel.refresh();
                    try {
                        execute(message); // Call method to send the message
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                } else {
                    sendMessage(message, "O", admin, "Register gagal gan, maap :(", chatController);
                    chatPanel.refresh();
                    try {
                        execute(message); // Call method to send the message
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
                
            } else if (memberController.show(chatId) == null) {
                sendMessage(message, "O", admin, "/register dulu gan !", chatController);
                chatPanel.refresh();
                try {
                    execute(message); // Call method to send the message
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            } else {
                String keyword = update.getMessage().getText();
                String response = keywordController.getResponse(keyword);
                message.setText(response);

                sendMessage(message, "O", admin, response, chatController);
                chatPanel.refresh();
                }
            }
            
            
    }

    @Override
    public String getBotUsername() {
        return "Telebot PBO";
    }

    /**
     * @param memberPanel the memberPanel to set
     */
    public void setMemberPanel(MemberPanel memberPanel) {
        this.memberPanel = memberPanel;
    }

    /**
     * @param chatPanel the chatPanel to set
     */
    public void setChatPanel(ChatPanel chatPanel) {
        this.chatPanel = chatPanel;
    }
    
    public void sendMessage(SendMessage message, String category, String sender, String text, ChatController chatController) {
        message.setText(text);
        try {
            execute(message); // Call method to send the message
            Chat newChat = new Chat(category, sender, text);
            chatController.store(newChat);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean sendBroadcast(String broadcastText) {
        MemberController memberController = new MemberController();
        List<Member> listMember = memberController.index();
        
        SendMessage message = new SendMessage();
        message.setText(broadcastText);
        
        try {
            for (int i = 0; i < listMember.size(); i++) {
                message.setChatId(listMember.get(i).getId());
                execute(message); // Call method to send the message
            }
            System.out.println("bot.MasBot.sendBroadcast()" + admin);
            Chat chat = new Chat("B", admin, broadcastText);
            ChatController chatController = new ChatController();
            chatController.store(chat);
            System.out.println("bot.MasBot.sendBroadcast()");
            return true;
        } catch (Exception e) {
            System.out.println("bot.MasBot.sendBroadcast() broadcast gagal");
            return false;
        }
            
        
        
    }
    
}

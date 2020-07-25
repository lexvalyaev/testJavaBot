
//import com.oracle.tools.packager.Log;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

public class Bot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText();
        System.out.println("И");
        sendMsg(update.getMessage().getChatId().toString(), "И");
    }

    public synchronized void sendMsg(String chatId, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(chatId);
        sendMessage.setText(s);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            //Log.log(Level.SEVERE, "Exception: ", e.toString());
        }
    }
    
    
    
    @Override
    public String getBotUsername() {
        return "Тест по Охране труда. В разработке.";
    }

    @Override
    public String getBotToken() {
        FileInputStream fis;
        Properties property = new Properties();
        String botToken="";

        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);

            botToken = property.getProperty("botToken");


        } catch (IOException e) {
            System.err.println(e.toString());
        }

        return botToken;
    }
}

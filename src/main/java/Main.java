import helper.Helper;
import helper.Question;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.util.ArrayList;
import java.util.List;

import static helper.Helper.getQuestionsFromFile;

public class Main extends TelegramBotsApi
{

    public static void main(String[] args) {

        /*ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }*/
        getQuestionsFromFile("./src/main/resources/testFormat3.txt");

    }
}

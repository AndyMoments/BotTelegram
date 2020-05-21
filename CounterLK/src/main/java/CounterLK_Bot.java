import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.Clock;

public class CounterLK_Bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

        String command=update.getMessage().getText();

        SendMessage message = new SendMessage();

        if(command.equals("/minombre")){

            System.out.println(update.getMessage().getFrom().getFirstName());

            message.setText(update.getMessage().getFrom().getFirstName());

        }
        if(command.equals("/miapellido")){

            System.out.println(update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getLastName());

        }
        if(command.equals("/minombrecompleto")){

            System.out.println(update.getMessage().getFrom().getFirstName()+" "+update.getMessage().getFrom().getLastName());

            message.setText(update.getMessage().getFrom().getFirstName()+" "+update.getMessage().getFrom().getLastName());

        }






        message.setChatId(update.getMessage().getChatId());

        try {
            execute (message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    public String getBotUsername() {
        return "CounterLK_Bot";
    }

    public String getBotToken() {
        return "911744959:AAFb3-ulJTi0wBAS0im_fWNiPkPrbGC0GjQ";
    }
}

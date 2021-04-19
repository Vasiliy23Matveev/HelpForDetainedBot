import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.HashMap;
import java.util.Map;


public class Bot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasContact()) {
            long chat_id =update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String userName = update.getMessage().getForwardSenderName();
            Contact contact = update.getMessage().getContact();
            System.out.println(contact);
            Message message = new Message(chat_id, text, userName);
            MessageListener.getMessage(message, contact);
        }
        if (update.hasMessage() && update.getMessage().hasText()) {
            long chat_id =update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String userName = update.getMessage().getForwardSenderName();

            Message message = new Message(chat_id, text, userName);

            System.out.println(message);
            MessageListener.getMessage(message);



        }
    }

    public void sendMessageFromServer(SendMessage message) {
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() { return ConfProperties.getProperty("BOT_USERNAME"); }

    @Override
    public String getBotToken() {
        return ConfProperties.getProperty("BOT_TOKEN");
    }
}

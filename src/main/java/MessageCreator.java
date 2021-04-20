import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MessageCreator {

    public static SendMessage createAnswerMessage(long chat_id, String command) {

        SendMessage answer = new SendMessage();

        if (command.equals("/start")) {
            answer.setText(MessageTextProperties.getMessages("START_MESSAGE"));
            answer.setChatId(chat_id);
            answer.setReplyMarkup(KeyboardConstructor.startKeyboard());
        }
        else if (command.equals("Продолжить")) {
            answer.setText(MessageTextProperties.getMessages("CITY_SELECT_MESSAGE"));
            answer.setChatId(chat_id);
            answer.setReplyMarkup(KeyboardConstructor.citySelectionKeyboard());

        }

        else if (command.equals("Москва")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("MOSCOW_chat_id"));

        }
        else if (command.equals("Санкт-Петербург")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("SPB_chat_id"));

        }else if (command.equals("Екатеринбург")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("EKB_chat_id"));

        }else if (command.equals("Самара")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("SAMARA_chat_id"));

        }else if (command.equals("Калининград")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("KLGD_chat_id"));

        }
        else if (command.equals("Псков")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("PSK_chat_id"));

        }
        else if (command.equals("Хабаровск")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("city1_chat_id"));

        }
        return answer;
    }

}

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MessageCreator {

    public static SendMessage createAnswerMessage(long chat_id, String command) {

        SendMessage answer = new SendMessage();

        if (command.equals("/start")) {
            answer.setText("Привет! Если тебя приняли, то ты попал как раз по адресу! Чтобы тебе была оказана помощь, после нажатия кнопки" +
                    "Продолжить будет предложено поделиться контактом. Сделай это, данные будут направлены людям, " +
                    "которые будут тебе помогать!");
            answer.setChatId(chat_id);
            answer.setReplyMarkup(KeyboardConstructor.startKeyboard());
        }
        else if (command.equals("Продолжить")) {
            answer.setText("Выбери свой город из списка. Твои данные будут направлены в чат в юристам, которые тобой займутся");
            answer.setChatId(chat_id);
            answer.setReplyMarkup(KeyboardConstructor.citySelectionKeyboard());

        }

        else if (command.equals("Москва")) {
            answer.setText("Новая заявочка! " + MessageListener.applicantContact);
            answer.setChatId(ConfProperties.getProperty("city1_chat_id"));

        }
        return answer;
    }

}

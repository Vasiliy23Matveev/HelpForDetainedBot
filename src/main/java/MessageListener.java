import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;

public class MessageListener {
    static Bot bot = new Bot();
    public static String applicantContact;

    public static void getMessage(Message message) {

        SendMessage answerMessage;
        answerMessage = MessageCreator.createAnswerMessage(message.getChat_id(), message.getText());
        answerMessage.enableMarkdown(true);
        bot.sendMessageFromServer(answerMessage);

    }

    public static void getMessage(Message message, Contact contact) {
        SendMessage answerMessage;
        applicantContact = contact.getPhoneNumber() + " " + contact.getFirstName() + " " + contact.getLastName();
        answerMessage = MessageCreator.createAnswerMessage(message.getChat_id(), "Продолжить");
        bot.sendMessageFromServer(answerMessage);
    }

    public static void getMessage(Message message, String applicantContact) {
        SendMessage answerMessage;
        answerMessage = MessageCreator.createAnswerMessage(message.getChat_id(), message.getText());
        bot.sendMessageFromServer(answerMessage);
    }

}

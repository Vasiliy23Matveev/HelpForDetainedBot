import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;

public class KeyboardConstructor {
    public static ReplyKeyboardMarkup startKeyboard() {
        ArrayList<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow firstKeyboardRow = new KeyboardRow();
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        keyboardRows.clear();


        KeyboardButton keyboardButton = new KeyboardButton("Продолжить");
        keyboardButton.setRequestContact(true);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        firstKeyboardRow.add(keyboardButton);
        //firstKeyboardRow.add("Продолжить");

        keyboardRows.add(firstKeyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }

    public static ReplyKeyboardMarkup citySelectionKeyboard() {
        ArrayList<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow firstKeyboardRow = new KeyboardRow();
        KeyboardRow secondKeyboardRow = new KeyboardRow();
        KeyboardRow thirdKeyboardRow = new KeyboardRow();
        KeyboardRow forthKeyboardRow = new KeyboardRow();
        KeyboardRow fifthKeyboardRow = new KeyboardRow();
        KeyboardRow sixthKeyboardRow = new KeyboardRow();
        KeyboardRow seventhKeyboardRow = new KeyboardRow();


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        keyboardRows.clear();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        firstKeyboardRow.add("Москва");
        secondKeyboardRow.add("Санкт-Петербург");
        thirdKeyboardRow.add("Екатеринбург");
        forthKeyboardRow.add("Самара");
        fifthKeyboardRow.add("Калининград");
        sixthKeyboardRow.add("Псков");
        seventhKeyboardRow.add("Хабаровск");

        keyboardRows.add(firstKeyboardRow);
        keyboardRows.add(secondKeyboardRow);
        keyboardRows.add(thirdKeyboardRow);
        keyboardRows.add(forthKeyboardRow);
        keyboardRows.add(fifthKeyboardRow);
        keyboardRows.add(sixthKeyboardRow);
        keyboardRows.add(seventhKeyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        return replyKeyboardMarkup;
    }
}

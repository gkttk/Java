package homework10.messenger;

import homework10.messenger.chat.Chat;
import homework10.messenger.message.Message;
import homework10.messenger.message.api.MessageType;
import homework10.messenger.registration.Registration;
import homework10.messenger.saver.ConsoleSaver;
import homework10.messenger.saver.FileSaver;
import homework10.messenger.saver.SaverMessagesWithToString;


public class MessengerMain {
    public static void main(String[] args) {

        User user1 = Registration.createNewUser("Sanek@gmail.ru", "12345?67");
        User user2 = Registration.createNewUser("Olya@gmail.ru", "321786?45");

        Chat chat1 = new Chat(user1, user2);

        Message<String> message1 = new Message<>(user1, MessageType.TEXT, "Всем привет");
        Message<String> message2 = new Message<>(user2, MessageType.TEXT, "пРиФфКи");
        Message<String> message3 = new Message<>(user1, MessageType.TEXT, "Подскажи сколько стоит проезд");
        Message<Integer> message4 = new Message<>(user2, MessageType.TEXT, 500);

        chat1.addMessage(message1, message2, message3, message4);

        ConsoleSaver cSaver1 = new ConsoleSaver();
        cSaver1.saveChat(chat1);

        FileSaver fSaver = new FileSaver();
        fSaver.saveChat(chat1);

        SaverMessagesWithToString smwtS = new SaverMessagesWithToString();
        smwtS.saveChat(chat1);


    }
}

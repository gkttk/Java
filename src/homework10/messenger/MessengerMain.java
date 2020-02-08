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
        try {
            Registration.deSerializeRegistration();//в начале программы проходит десериализация списка зарегестрированных пользователей(если он существует в пакете messenger.registration.registrationFiles)

            User user1 = Registration.createNewUser("Sanek@gmail.ru", "12345?67");//регистрация пользователя1
            User user2 = Registration.createNewUser("Olya@gmail.ru", "321786?45");//регистрация пользователя2

            Chat chat1 = new Chat(user1, user2);//пользователи создают чат между собой

            Message<String> message1 = new Message<>(user1, MessageType.TEXT, "Всем привет");
            Message<String> message2 = new Message<>(user2, MessageType.TEXT, "пРиФфКи");
            Message<String> message3 = new Message<>(user1, MessageType.TEXT, "Подскажи сколько стоит проезд");
            Message<Integer> message4 = new Message<>(user2, MessageType.TEXT, 500);

            chat1.addMessage(message1, message2, message3, message4);

            ConsoleSaver cSaver1 = new ConsoleSaver();
            cSaver1.saveChat(chat1);//вывод сообщений чата в консоль

            FileSaver fSaver = new FileSaver();
            fSaver.saveChat(chat1);//сохранение истории чата в бинарный файл(пакет messenger.saver.forSaver)

            SaverMessagesWithToString smwtS = new SaverMessagesWithToString();
            smwtS.saveChat(chat1);//сохранение истории чата в текстовый файл(пакет messenger.saver.forSaver)

        } finally {
            Registration.serializeRegistration();//сериализация зарегестрированных пользователей

        }

    }
}

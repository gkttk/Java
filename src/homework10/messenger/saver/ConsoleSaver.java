package homework10.messenger.saver;

import homework10.messenger.User;
import homework10.messenger.chat.api.IChat;
import homework10.messenger.message.Message;
import homework10.messenger.saver.api.ISaverChat;

public class ConsoleSaver implements ISaverChat {

    @Override
    public void saveChat(IChat chat) {
        System.out.print("Пользователи чата: ");
        try{
            for(User user: chat.getUsersInChat()){
                System.out.print(user.getName() + " |");
            }
        }catch (NullPointerException e){
            System.out.println("В чате нет пользователей");
        }

        System.out.println("\nСообщения в чате:");
        for(Message message:chat.getChatMessages()){
            System.out.println(message.getData());
        }
    }
}

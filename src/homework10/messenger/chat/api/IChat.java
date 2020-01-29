package homework10.messenger.chat.api;

import homework10.messenger.User;
import homework10.messenger.message.Message;

import java.util.List;
import java.util.Set;

public interface IChat {
    void addMessage(Message message);
    Set<User> getUsersInChat();
    List<Message> getChatMessages();
    double getChatID();

}

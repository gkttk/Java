package homework10.messenger.chat;

import homework10.messenger.chat.api.IChat;
import homework10.messenger.message.Message;
import homework10.messenger.User;

import java.io.Serializable;
import java.util.*;

public class Chat implements IChat, Serializable {


    private int chatID = 0;
    private final Set<User> usersInChat = new HashSet<>();
    private final List<Message> chatMessages = new LinkedList<>();

    public Chat(User user1, User user2) {
        chatID++;
        usersInChat.add(user1);
        usersInChat.add(user2);
    }

    public int getChatID() {
        return chatID;
    }

    @Override
    public Set<User> getUsersInChat(){
        Set<User> copyUsersInChat = new HashSet<>(usersInChat);//чтобы не могли через геттер менять значение
        return copyUsersInChat;
    }
    @Override
    public List<Message> getChatMessages(){
        List<Message> copyChatMessages = new LinkedList<>(chatMessages);//чтобы не могли через геттер менять значение
        return copyChatMessages;
    }

    @Override
    public void addMessage(Message message) {
        List<Message> list = new LinkedList<>();
        list.add(message);
        addMessage(list);
    }

    public void addMessage(Message... messages) {
        addMessage(Arrays.asList(messages));
    }

    public void addMessage(List<Message> listOfMessages) {
        for(Message message: listOfMessages){
            if(message.getUser() == null){
                continue;
            }
            chatMessages.add(message);
        }
    }
}

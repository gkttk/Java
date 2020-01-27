package homework10.messenger.message;

import homework10.messenger.message.api.MessageType;
import homework10.messenger.User;

import java.util.Date;

public class Message<T> {

    public User getUser() {
        return user;
    }

    private User user;
    MessageType type;

    public T getData() {
        return data;
    }

    private T data;
    private Date date;

    public Message(User user, MessageType type, T data){
        this.user = user;
        this.type = type;
        this.data = data;
        date = new Date();
    }
}

package homework10.messenger.message;

import homework10.messenger.message.api.MessageType;
import homework10.messenger.User;
import java.io.Serializable;
import java.util.Date;

public class Message<T> implements Serializable {

    private User user;
    MessageType type;
    private T data;
    private Date date;

    public Message(User user, MessageType type, T data){
        this.user = user;
        this.type = type;
        this.data = data;
        date = new Date();
    }

    public User getUser() {
        return user;
    }

    public T getData() {
        return data;
    }

    public String toString(){
        return user.getName() + " написал \t" + data + " \t" + date;
    }
}

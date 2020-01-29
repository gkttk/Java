package homework10.messenger;

import homework10.messenger.chat.Chat;
import homework10.messenger.chat.api.IChat;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {


    private int id;
    private String name;
    private String password;
    private final Set<Chat> userChats = new HashSet<>();

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public Set<Chat> getUserChats() {
        return userChats;
    }

    public String getName() {
        return name;
    }

    public void leaveChat(IChat chat){
        if(this.getUserChats().contains(chat)){
            this.getUserChats().remove(chat);
            chat.getUsersInChat().remove(this);
        }
        else{
            System.out.println("Данный пользователь не находится в чате, который пытается покинуть");
        }
    }

    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof User)){
            return false;
        }
        User obj1 = (User)obj;
        if(this.getId() == obj1.getId() && this.getName().equals(obj1.getName())){
            return true;
        }
        return false;
    }

    public int hashCode(){
        return 5*getId() + this.getName().length() + 12;
    }



    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();

    }

    private void readObjectNoData() throws InvalidObjectException {
        throw new InvalidObjectException("Stream data required");
    }

}

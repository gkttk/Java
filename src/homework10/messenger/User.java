package homework10.messenger;

import java.io.*;


public class User implements Serializable {

    private int id;
    private String name;
    private String password;


    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

package homework10.messenger.registration;

import homework10.messenger.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Registration {
    private static int id = 0;
    private static  Map<String, User> registeredUsers = new HashMap<>();

    public static User createNewUser(String name, String password) {
        if (Validation.checkName(name)) {
            if (Validation.checkPassword(password)) {
                return registration(new User(++id, name, password));
            } else {
                throw new IllegalArgumentException("\nВведенный пароль не удовлетворяет требованиям:\n" +
                        "1)Пароль должен быть не короче 7 символов\n2)В пароле не должно быть повторяющихся подряд символов\n" +
                        "3)В пароле обязательно должен присутствовать один из символов ':/!?+%");
            }
        } else {
            throw new IllegalArgumentException("Имя пользователя должно представлять из себя e-mail");
        }
    }


    private static User registration(User user) {
        for (String name : registeredUsers.keySet()) {
            if (name.equalsIgnoreCase(user.getName())) {
                throw new IllegalArgumentException("Пользователь с именем " + name + " уже существует");
            }
        }
        registeredUsers.put(user.getName(), user);
        return user;
    }

    public static void serializeRegistration(ObjectOutputStream ous) throws IOException {
        ous.writeObject(registeredUsers);
    }

    public static void deSerializeRegistration(ObjectInputStream ois) throws IOException, ClassNotFoundException {
       registeredUsers = (Map<String, User>)ois.readObject();
    }

}

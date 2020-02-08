package homework10.messenger.registration;

import homework10.messenger.User;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Registration {
    private static int id = 0;
    private static Map<String, User> registeredUsers = new HashMap<>();

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

    public static void serializeRegistration() {
        Map<String, User> copyRegisteredUsers = registeredUsers;
        try (FileOutputStream fos = new FileOutputStream("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework10\\messenger\\registration\\registrationFiles\\registeredUsers.bin");
             ObjectOutputStream ous = new ObjectOutputStream(fos)) {

            ous.writeObject(copyRegisteredUsers);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }

    }

    public static void deSerializeRegistration(){
        try (FileInputStream fis = new FileInputStream("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework10\\messenger\\registration\\registrationFiles\\registeredUsers.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Map<String, User> copyRegisteredUser = (Map<String, User>) ois.readObject();
            registeredUsers = copyRegisteredUser;
        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }

}

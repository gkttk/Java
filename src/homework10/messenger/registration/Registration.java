package homework10.messenger.registration;

import homework10.messenger.User;

import java.util.HashMap;
import java.util.Map;

public class Registration {
   private static int id = 0;
   private static final Map<String, User> registeredUsers = new HashMap<>();

   public static User createNewUser(String name, String password) {
       if (Validation.checkName(name)) {
           if(Validation.checkPassword(password)){
               return registration(new User(++id, name, password));
           }
           else{
               System.out.println("Пароль не подходит");
               return null;
           }
       } else {
           System.out.println("Имя должно представлять из себя email");
           return null;
       }
   }



   private static User registration(User user){
       for(String name:registeredUsers.keySet()){
           if(name.equalsIgnoreCase(user.getName())){
               System.out.println("Пользователь с таким именем уже существует");
               return null;
           }
       }
       registeredUsers.put(user.getName(), user);
      return user;
   }

}

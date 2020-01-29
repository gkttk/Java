package homework10.messenger.registration;

public class Validation {

    public static boolean checkName(String name) {
        if (name.matches("[A-Za-z0-9]+@[A-Za-z0-9.]+")) {
            return true;
        }
        return false;
    }

    public static boolean checkPassword(String password) {
        if (password.length() < 7) {
            System.out.println("Введенный пароль короче 7 символов");
            return false;
        }
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                System.out.println("В пароле не должны идти подряд одинаковые символы, в веденном пароле символ" + password.charAt(i) + " повторяется 2 раза подряд");
                return false;
            }
        }
        if (password.matches("[A-Za-z0-9]*[':\\/!?+%]+[A-Za-z0-9]*")) {
            return true;
        }
        return false;
    }
}

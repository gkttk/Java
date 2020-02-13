package homework11;

import java.io.*;
import java.util.List;

public class WriteReadStudentList {

    public static boolean writeList(File file, List<Student> list) {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))) {
            ous.writeObject(list);
            System.out.println("Лист студентов записан в файл " + file.getName() + " программу прерываю");
            return true;
        }//try
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }//catch
    }//if

    public static List<Student> readList(File file){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Student>)ois.readObject();
        }//try
        catch (ClassNotFoundException e) {
            System.out.println("Класс не найден");
        }//catch
        catch (IOException ex) {
            ex.printStackTrace();
        }//catch
        finally {
            System.out.println("Прочитано " + file.getName());

        }
        return null;
    }
}


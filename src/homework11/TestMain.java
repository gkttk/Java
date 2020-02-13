package homework11;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        List<Student> studentsList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            studentsList.add(new Student());
        }//заполнение списка 100 студентами

        File file = new File("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework11\\files\\listOfStudents.bin");
        if (!file.exists()) {
            WriteReadStudentList.writeList(file, studentsList);
           /* try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file))) {
                ous.writeObject(studentsList);
                System.out.println("Лист студентов записан в файл " + file.getName() + " программу прерываю");
                return;
            }//try1
            catch (IOException e) {
                e.printStackTrace();
            }//catch1*/
        }//if
        else {
            studentsList = WriteReadStudentList.readList(file);
            if(studentsList == null){
                throw new IllegalStateException("Список не прочитался");
            }
          /*  try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                studentsList = (List<Student>) ois.readObject();
                System.out.println("Прочитано " + file.getName());
            }//try2
            catch (ClassNotFoundException e) {
                System.out.println("Класс не найден");
            }//catch2_1
            catch (IOException ex) {
                ex.printStackTrace();
            }//catch2_2*/
        }//else


        List<Student> listOfStudentsGradeBelow7 = studentsList.stream().sorted().filter(student -> student.getGrade() < 7).collect(Collectors.toList());


        File file2 = new File("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework11\\files\\listOfStudentsGradeBelow7.bin");
        if (!file2.exists()) {
            WriteReadStudentList.writeList(file2, listOfStudentsGradeBelow7);
          /*  try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file2))) {
                ous.writeObject(listOfStudentsGradeBelow7);
                System.out.println("Измененный лист студентов(остались только студенты с оценкой менее 7) записан в " + file2.getName() + " программу прерываю");
                return;
            }//try3
            catch (IOException e) {
                e.printStackTrace();
            }//catch3*/
        }//if2
        else {
            try {
                WriteReadStudentList.readList(file2);
              /*  listOfStudentsGradeBelow7 = (List<Student>) ois.readObject();
                System.out.println("Прочитано " + file2.getName());*/
                Random rand = new Random();
                for (int i = 0; i < 3; i++) {
                    listOfStudentsGradeBelow7.remove(rand.nextInt(listOfStudentsGradeBelow7.size()));
                }

            }//try4
            catch (ClassNotFoundException e) {
                System.out.println("Класс не найден");
            }//catch4_1
            catch (IOException ex) {
                ex.printStackTrace();
            }//catch4_2
        }//else2


    }

}


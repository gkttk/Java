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
           if(WriteReadStudentList.writeList(file, studentsList)) return;
        }//if
        else {
            studentsList = WriteReadStudentList.readList(file);

            if (studentsList == null) {
                throw new IllegalStateException("Список не прочитался");
            }else {
                System.out.println("Размер листа " + studentsList.size());
            }
        }//else


        List<Student> listOfStudentsGradeBelow7 = studentsList.stream().sorted().filter(student -> student.getGrade() < 7).collect(Collectors.toList());
        File file2 = new File("D:\\GitHub\\Kirill_Sviridov(Java)\\src\\homework11\\files\\listOfStudentsGradeBelow7.bin");
        if (!file2.exists()) {
           if(WriteReadStudentList.writeList(file2, listOfStudentsGradeBelow7)) return;
        }//if2
        else {
            listOfStudentsGradeBelow7 = WriteReadStudentList.readList(file2);
            if (listOfStudentsGradeBelow7 == null) {
                throw new IllegalStateException("Список не прочитался");
            }else {
                System.out.println("Размер листа " + listOfStudentsGradeBelow7.size());
            }

            Random rand = new Random();
            for (int i = 0; i < 3; i++) {
                listOfStudentsGradeBelow7.remove(rand.nextInt(listOfStudentsGradeBelow7.size()));
            }
            if(WriteReadStudentList.writeList(file2, listOfStudentsGradeBelow7)) return;
        }//else2


    }

}


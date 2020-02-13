package homework11;

import java.io.Serializable;
import java.util.Random;

public class Student implements Serializable, Comparable<Student> {
    private StringBuilder name = new StringBuilder("");
    private StringBuilder surname = new StringBuilder("");
    private StringBuilder patronymic= new StringBuilder("");



    private int grade;

    Student(){
        Random rand = new Random();
        name.append(Character.toUpperCase(Alphabet.randChar()));
        for(int i = 0; i<rand.nextInt(6)+2; i++){
            name.append(Alphabet.randChar());
        }
        surname.append(Character.toUpperCase(Alphabet.randChar()));
        for(int i = 0; i<rand.nextInt(6)+2; i++){
            surname.append(Alphabet.randChar());
        }
        patronymic.append(Character.toUpperCase(Alphabet.randChar()));
        for(int i = 0; i<rand.nextInt(6)+2; i++){
            patronymic.append(Alphabet.randChar());
        }
        grade = rand.nextInt(10);
    }

    public int getGrade() {
        return grade;
    }


    @Override
    public int compareTo(Student o) {
        if(this.getGrade() > o.getGrade()) return 1;
        else if(this.getGrade() < o.getGrade()) return -1;
        else return 0;
    }
}

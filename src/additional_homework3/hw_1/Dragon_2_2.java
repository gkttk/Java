package additional_homework3.hw_1;
import java.util.Scanner;
public class Dragon_2_2 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int heads = 3;
    int age;


        System.out.println("Введите возраст дракона");
        age = reader.nextInt();
        for(int i = 1 ; i <= age ; i++){
            if(i < 200){
                heads += 3;
            }
            else if(i >= 200 && i < 300){
                heads += 2;
            }
            else{
                heads +=1;
            }
        }
        System.out.println("Количество голов = " + heads + "\nКоличество глаз = " + heads*2);
    }
}

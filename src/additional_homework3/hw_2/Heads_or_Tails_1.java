package additional_homework3.hw_2;
import java.util.Random;
public class Heads_or_Tails_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int heads = 0;
        int tails = 0;
        int num;
        for(int i = 0; i<1000; i++){
            num = rand.nextInt(10);
            if(num < 5){
                heads++;
            }
            else{
                tails++;
            }
        }//for
        System.out.printf("Орел выпал %d раз\nРешка выпала - %d раз ", heads, tails);

    }
}

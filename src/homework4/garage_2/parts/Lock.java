package homework4.garage_2.parts;

import homework4.garage_2.parts.api.key.IKey;
import homework4.garage_2.parts.api.lock.ILock;

import java.util.Scanner;

public class Lock implements ILock {

    private String secret;
    private boolean isOpen = false;

    public Lock(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Задайте пароль замку");
        this.secret = reader.nextLine();
    }//constructor()

    public Lock(String secret){
        this.secret = secret;
    }//constructor(+)

    @Override
    public void open(IKey key) {
        if(isOpen){
            System.out.println("Замок и так открыт");
        }
        else{
            if(this.secret.equals(key.getKey())){
            System.out.println("Открываю замок...");
            isOpen = true;
        }
        else{
            System.out.println("Ключ не подходит");
        }
        }
    }

    @Override
    public void close() {
        if(isOpen){
            System.out.println("Закрываю замок...");
            isOpen = false;
        }
        else{
            System.out.println("Замок и так закрыт");
        }
    }

    @Override
    public boolean getLockCondition() {
        return isOpen;
    }

    @Override
    public String getSecret() {
        return secret;
    }
}

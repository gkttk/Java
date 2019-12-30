package homework4.garage_2.parts;

import homework4.garage_2.parts.api.key.IKey;

import java.util.Scanner;

public class Key implements IKey {

    private String key;

    public Key(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Задайте ключ");
        this.key = reader.nextLine();
    }//constructor()

    public Key(String key){
        this.key = key;
    }//constructor(+)

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void changeKey(String newKey) {
        this.key = newKey;

    }
}

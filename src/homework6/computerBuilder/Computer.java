package homework6.computerBuilder;

import homework6.computerBuilder.parts.api.IParts;

import java.util.Arrays;

public class Computer {
    private String id;
    private Enum[] standards;
    private IParts[] parts;

    public void setId(String id){
        this.id = id;
    }

    public void setStandards(Enum[] standards){
        this.standards = standards;
    }

    public void setParts(IParts[] parts){
        this.parts = parts;
    }

    public void start() {
        boolean isOk = true;
        for (IParts part : parts) {
            if (!part.check(standards)) {
                System.out.println("Деталь " + part.getID() + " не подходит к этому компьютеру");
                isOk = false;
            }
        }
        if (isOk) {
            System.out.println("Запускаю компьютер...");
        } else {
            System.out.println("Необходимо заменить детали");
        }
    }

    public String toString(){
        StringBuilder info = new StringBuilder("ID = " + id +
                "\nStandarts - " + Arrays.deepToString(standards) +
                "\nParts:\n");

        for (IParts part: parts){
            info.append(part.getInfo());
        }

        return info.toString();
    }



}

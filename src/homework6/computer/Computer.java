package homework6.computer;

import homework6.computer.parts.api.IParts;

public class Computer {
    private Enum[] standards;
    private IParts[] parts;


    public Computer(Enum[] standards, IParts[] parts) {
        this.standards = standards;
        this.parts = parts;
    }

    public void start(){
       boolean isOk = true;
        for(IParts part: parts){
            if(!part.check(standards)){
                System.out.println("Деталь " + part.getID() + " не подходит к этому компьютеру");
                isOk = false;
            }
        }
        if(isOk){
        System.out.println("Запускаю компьютер...");
        }
        else{
            System.out.println("Необходимо заменить детали");
        }


    }

}

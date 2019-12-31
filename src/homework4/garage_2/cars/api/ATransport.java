package homework4.garage_2.cars.api;

import homework4.garage_2.parts.api.engine.*;
import homework4.garage_2.parts.api.lock.ILock;
import homework4.garage_2.parts.api.wheels.IWheels;

public abstract class ATransport implements ITransport {

    protected IEngine engine;
    protected IWheels wheels;
    protected ILock lock;
    private boolean isGo = false;
    private boolean isFull = false;
    private boolean isDoorOpen = false;

    protected double maxTanks;
    protected double currentFuelLevel;
    private int traveled = 0;
     private int numberOfPeopleInside = 0;

@Override
public void setNumberOfPeopleInside(int numberOfPeople){
    numberOfPeopleInside = numberOfPeople;
}

    @Override
    public void go() {
        if(engine != null && wheels != null){
            if(!lock.getLockCondition()){
                System.out.println("Сначала откройте замок");
                return;
            }
            if(engine.getEngineCondition()){
                System.out.println("Поехали...");
                isGo = true;
            }
            else{
                System.out.println("Сначала заведите двигатель");
            }
        }
        else{
            System.out.println("Недостаточно запчастей");
        }
    }

    @Override
    public boolean getDoorCondition(){
        return isDoorOpen;
    }

    @Override
    public void stop() {
        if(isGo){
            System.out.println("Автомобиль останавливается...");
            isGo = false;
        }
        else{
            System.out.println("Автомобиль и так стоит");
        }
    }

    @Override
    public void openDoor(){
        if(isDoorOpen){
            System.out.println("Дверь и так открыта");
        }
        else{
            if(lock.getLockCondition()){
                System.out.println("Открываю дверь");
                isDoorOpen = true;
            }
            else{
                System.out.println("Замок закрыт");
            }
        }
    }

    @Override
    public void refuel() {
        if (engine.getFuelType() == FuelType.ELECTRICITY) {
            if (isFull) {
                System.out.println("Автомобиль уже заряжен");
            } else {
                System.out.println("Заряжаю автомобиль...");
                isFull = true;
            }
        } else {
            if (isFull) {
                System.out.println("Автомобиль уже заправлен");
            } else {
                System.out.println("Заправляю автомобиль...");
                isFull = true;
            }
        }
    }//заправка/зарядка

    @Override
    public ILock getLock(){
        return lock;
    }

    @Override
   public IEngine getEngine(){
        return engine;
   }

    @Override
    public boolean tryToStart(){
        if(!lock.getLockCondition()){
            System.out.println("Сначала откройте замок");
            return false;
        }
        if(!isDoorOpen){
            System.out.println("Сначала откройте дверь");
            return false;
        }
        if(engine == null){
            System.out.println("В автомобиле нет двигателя");
            return false;
        }
        if(!isFull){
            System.out.println("Необходимо заправить/зарядить автомобиль");
            return false;
        }
        if(!engine.getEngineCondition()){
            System.out.println("Заведите автомобиль");
            return false;
        }
        if(wheels == null){
            System.out.println("У автомобиля нет колес");
            return false;
        }
        System.out.println("Автомобиль готов к поездке");
        return true;

    }

    @Override

    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }

    @Override
    public int getNumberOfPeopleInside() {
        return numberOfPeopleInside;
    }

    public boolean consumption(double effort){
        if(currentFuelLevel > effort*numberOfPeopleInside*getEngine().getBasicConsumption()){
            currentFuelLevel -= effort*numberOfPeopleInside*getEngine().getBasicConsumption();
            traveled++;
            return true;
        }
        else{
            return false;
        }



    }

   public int getTraveled(){
        return traveled;
   };

    public void setTraveled(){
        this.traveled = 0;
    }


}




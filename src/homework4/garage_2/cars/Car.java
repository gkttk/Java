package homework4.garage_2.cars;
import homework4.garage_2.api.ICar;
import homework4.garage_2.parts.*;



public abstract class Car implements ICar {
    protected String id;
    protected int numberOfSeats;
    protected Engine engine = null;
    protected Wheels wheels = null;
    protected boolean isStarted = false;
    protected boolean isOpen = false;
    protected boolean Fuel = false;
    protected boolean isMove = false;


    protected Car(String id, int numberOfSeats){
      this.id = id;
      this.numberOfSeats = numberOfSeats;
    }//конструктор

    @Override
    public void start() {
        if(isOpen) {
            if (engine == null) {
                System.out.println("Не заводится, не хватает запчастей...");
            }
            else if(!Fuel) {
                System.out.println("Необходима дозаправка");
            }
            else{
                System.out.println("Автомобиль завелся...");
                isStarted = true;
            }
        }
        else{
            System.out.println("Сначала откройте автомобиль");
        }
    }// запуск, проверка на открытие дверей, заправку и наличие двигателя

    @Override
    public void go(){
        if(isMove){
            System.out.println("Автомобиль уже движется...");
        }
       else if(wheels == null){
            System.out.println("Нужны колеса");
        }
        else if(isStarted){
            System.out.println("Поехали...");
            Fuel = false;
            isMove = true;

        }
        else{
            System.out.println("Не едет, сначала нужно завести автомобиль...");
        }
    }//поездка, проверка на наличие колес, проверка заведен ли двигатель

    @Override
    public void refuel(){
        if(engine == null){
            System.out.println("Двигатель отсутствует, нечего заправлять");
        }
        else{
            System.out.println("Заправляю автомобиль...");
            Fuel = true;
        }
    }//заправка, проверка на наличие двигателя

    @Override
    public void stop(){
        if(isStarted)
        {
            System.out.println("Останавливаю и глушу автомобиль...");
            isStarted = false;
            isMove = false;
        }
        else {
            System.out.println("Автомобиль еще даже не заведен...");
        }
    }//заглушить автомобиль, проверка на запуск

    @Override
    public void close() {
        if(isOpen){
            System.out.println("Закрываю автомобиль...");
            isOpen = false;
        }
        else{
            System.out.println("Автомобиль уже закрыт");
        }

    }//закрыть автомобиль, проверка открыт ли

    @Override
    public void open() {
        if(isOpen){
            System.out.println("Автомобиль уже открыт");
        }
        else
        System.out.println("Необходим ключ");
    }//попытка откроыть автомобиль без ключа, проверка открыт ли

    @Override
    public void getData() {
        System.out.println("Автомобиль\t- " + id + "\nМест\t- " + numberOfSeats);
        engine.getData();
        wheels.getData();

    }// полная информация об автомобиле(характеристики авто, мотора, колес)
}

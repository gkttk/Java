package homework4.garage_2.parts;
import homework4.garage_2.enums.TypeOfFuel;

public class Engine extends Part{

    private double capacity;
    private TypeOfFuel typeF;


    public Engine(){
        super("Двигатель");
        capacity = 1;
        typeF = TypeOfFuel.GASOLINE;
    }

   public Engine(String id, double capacity, TypeOfFuel type){
        super(id);
       this.capacity = capacity;
       typeF = type;
   }

   public Engine(Engine eng){
        super(eng.id);
        this.capacity = eng.capacity;
        this.typeF = eng.typeF;
   }//готовый двигатель


    @Override
    public void getData() {
        System.out.printf("\nИнформация по двигателю:\n" +
                "Наименование\t- %s\n" +
                "Объем\t- %f\n" +
                "Тип топлива\t- " + typeF, id, capacity);
        System.out.println();
    }
}

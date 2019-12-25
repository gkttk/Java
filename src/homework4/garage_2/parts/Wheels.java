package homework4.garage_2.parts;

import homework4.garage_2.enums.TypeOfWheels;

public class Wheels extends Part{
  private double radius;
  private TypeOfWheels typeW;

  public Wheels(){
      super("Колеса");
      radius = 1;
      typeW = TypeOfWheels.ALL_SEASON;
  }

  public Wheels(String id, double radius, TypeOfWheels type){
      super(id);
      this.radius = radius;
      typeW = type;
  }

  public Wheels(Wheels wheels){
      super(wheels.id);
      this.radius = wheels.radius;
      this.typeW = wheels.typeW;
  }


    @Override
    public void getData() {
        System.out.printf("\nИнформация по колесам:\n" +
                "Наименование\t- %s\n" +
                "Радиус\t- %f\n" +
                "Тип колес\t- " + typeW, id, radius);
        System.out.println();

    }
}

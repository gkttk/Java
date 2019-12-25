package homework4.enum_1;

import homework4.enum_1.api.ICountries;

import java.util.Comparator;

public enum Countries implements ICountries, Comparator<Countries>{
    RUSSIA(17_100_000, 146_780_720), CANADA(37_856_060, 9_984_670),
    CHINA(1_400_507_000, 9_597_000), USA(331_427_186, 9_519_431),
    BRAZIL(210_862_485, 8_515_770), AUSTRALIA(25_575_000, 7_692_024),
    INDIA(1_370_469_000, 3_287_263), ARGENTINA(44_938_712, 2_780_400),
    KAZAKHSTAN(18_617_750, 2_724_902), ALGERIA(43_053_000, 2_381_741);

    private int population;
    private int area;

    Countries(int population, int area){
    this.population = population;
    this.area = area;
    }//constructor Countries

    @Override
    public int getPopulation() {
        return population;
    }//getPopulation

    @Override
    public int getArea(){
        return area;
    }//getArea


    @Override
    public int compare(Countries o1, Countries o2) {
        if(o1.area > o2.area) {
            System.out.println("Площадь " + o1.name() + " больше Площади " + o2.name());
            return 1;
        }
        else if (o1.area < o2.area) {
            System.out.println("Площадь " + o2.name() + " больше Площади " + o1.name());
            return -1;
        }
        else {
            System.out.println("Площадь " + o1.name() + " равна Площади " + o2.name());
            return 0;
        }
    }


}//Countries

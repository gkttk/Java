package homework4.garage_2.parts.api.engine;

public enum FuelType {
    GASOLINE("Бензин"), DIESEL("Дизель"), ELECTRICITY("Электричество");
    private String name;

    FuelType(String name){
        this.name = name;
    }

    public  String toString(FuelType type){
        return name;
    }
}

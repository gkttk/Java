package homework4.garage_2.parts.api.wheels;

public enum TypeWheels {
    WINTER("Зимние"), SUMMER("Летние"), ALL_SEASONS("Всесезонные");
    private String name;
    TypeWheels(String name){
        this.name = name;
    }

    public String toString(TypeWheels type){
        return name;
    }
}

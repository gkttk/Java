package homework4.enum_1;


    import homework4.enum_1.api.ICountries;

public class Test {
    public static void main(String[] args) {

        Countries country1 = Countries.valueOf("AUSTRALIA");
        Countries country2 = Countries.AUSTRALIA;
        System.out.println(country1 == country2);//true

        // Countries country3 = Countries.valueOf("GERMANY");//Ошибка, константы GERMANY нет в перечислении Countries

        country1.compare(country1, country2);

        ICountries country3 = Countries.BRAZIL;
        ICountries country4 =  Countries.valueOf("RUSSIA");
        System.out.println(country3 == country4);//false

    }
}


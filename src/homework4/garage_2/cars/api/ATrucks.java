package homework4.garage_2.cars.api;

public abstract class ATrucks extends ATransport {
    protected final int numberOfWheels = 6;
    private final char license = 'C';

    @Override
    public int getNumberOfWheels(){
        return numberOfWheels;
    };

    @Override
    public char getLicense(){
        return license;
    }


}

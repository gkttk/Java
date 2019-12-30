package homework4.garage_2.cars.api;

public abstract class ACars extends ATransport {
    protected final int numberOfWheels = 4;
    private final char license = 'B';

    @Override
    public int getNumberOfWheels(){
        return numberOfWheels;
    };

    @Override
    public char getLicense(){
        return license;
    }

}

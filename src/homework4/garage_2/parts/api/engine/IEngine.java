package homework4.garage_2.parts.api.engine;

public interface IEngine {

    void switchOn();
    void switchOff();

    boolean getEngineCondition();
    String getEngineId();
    double getEngineCapacity();
    FuelType getFuelType();
    double getBasicConsumption();

    void getEngineData();


}

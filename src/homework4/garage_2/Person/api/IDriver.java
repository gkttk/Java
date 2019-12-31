package homework4.garage_2.Person.api;

import homework4.garage_2.cars.api.ITransport;
import homework4.garage_2.parts.api.key.IKey;

import java.util.ArrayList;

public interface IDriver {
    void seatToTransport(ITransport transport, int numberOfPeople);
    String getName();
    char getLicense();
    ArrayList<IKey> getKeys();
    void accelerator(ITransport transport);

}

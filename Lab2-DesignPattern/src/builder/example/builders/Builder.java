package builder.example.builders;

import builder.example.components.Engine;
import builder.example.components.GPSNavigator;
import builder.example.components.Transmission;
import builder.example.components.TripComputer;
import builder.example.cars.CarType;

/**
 * EN: Builder interface defines all possible ways to configure a product.
 *
 * RU: Интерфей�? Строител�? объ�?вл�?ет в�?е возможные �?тапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

package builder.example;

import builder.example.builders.CarBuilder;
import builder.example.builders.CarManualBuilder;
import builder.example.cars.Car;
import builder.example.cars.Manual;
import builder.example.director.Director;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-кла�?�?. Зде�?ь в�?ё �?водит�?�? воедино.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // EN: Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        //
        // RU: Директор получает объект конкретного �?троител�? от клиента
        // (приложени�?). Приложение �?амо знает какой �?троитель и�?пользовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // EN: The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        //
        // RU: Готовый продукт возвращает �?троитель, так как Директор чаще в�?его
        // не знает и не зави�?ит от конкретных кла�?�?ов �?троителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // EN: Director may know several building recipes.
        //
        // RU: Директор может знать больше одного рецепта �?троитель�?тва.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}

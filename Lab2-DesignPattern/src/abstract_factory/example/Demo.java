package abstract_factory.example;

import abstract_factory.example.app.Application;
import abstract_factory.example.factories.GUIFactory;
import abstract_factory.example.factories.MacOSFactory;
import abstract_factory.example.factories.WindowsFactory;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-кла�?�?. Зде�?ь в�?ё �?водит�?�? воедино.
 */
public class Demo {

    /**
     * EN: Application picks the factory type and creates it in run time
     * (usually at initialization stage), depending on the configuration or
     * environment variables.
     *
     * RU: Приложение выбирает тип и �?оздаёт конкретные фабрики динамиче�?ки
     * и�?ход�? из конфигурации или окружени�?.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

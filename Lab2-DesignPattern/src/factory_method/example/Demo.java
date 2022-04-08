package factory_method.example;

import factory_method.example.factory.Dialog;
import factory_method.example.factory.HtmlDialog;
import factory_method.example.factory.WindowsDialog;

/**
 * EN: Demo class. Everything comes together here.
 *
 * RU: Демо-кла�?�?. Зде�?ь в�?ё �?водит�?�? воедино.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * EN: The concrete factory is usually chosen depending on configuration or
     * environment options.
     *
     * RU: Приложение �?оздаёт определённую фабрику в зави�?имо�?ти от конфигурации
     * или окружени�?.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * EN: All of the client code should work with factories and products
     * through abstract interfaces. This way it does not care which factory it
     * works with and what kind of product it returns.
     *
     * RU: Ве�?ь о�?тальной клиент�?кий код работает �? фабрикой и продуктами только
     * через общий интерфей�?, по�?тому дл�? него неважно кака�? фабрика была
     * �?оздана.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

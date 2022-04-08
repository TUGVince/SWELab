package abstract_factory.example.app;

import abstract_factory.example.buttons.Button;
import abstract_factory.example.checkboxes.Checkbox;
import abstract_factory.example.factories.GUIFactory;

/**
 * EN: Factory users don't care which concrete factory they use since they work
 * with factories and products through abstract interfaces.
 *
 * RU: Код, и�?пользующий фабрику, не волнует �? какой конкретно фабрикой он
 * работает. В�?е получатели продуктов работают �? продуктами через аб�?трактный
 * интерфей�?.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

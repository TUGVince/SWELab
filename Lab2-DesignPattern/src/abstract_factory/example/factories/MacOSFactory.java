package abstract_factory.example.factories;

import abstract_factory.example.buttons.Button;
import abstract_factory.example.buttons.MacOSButton;
import abstract_factory.example.checkboxes.Checkbox;
import abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * EN: Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 *
 * RU: Кажда�? конкретна�? фабрика знает и �?оздаёт только продукты �?воей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

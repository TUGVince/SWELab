package abstract_factory.example.factories;

import abstract_factory.example.buttons.Button;
import abstract_factory.example.checkboxes.Checkbox;

/**
 * EN: Abstract factory knows about all (abstract) product types.
 *
 * RU: �?б�?трактна�? фабрика знает обо в�?ех (аб�?трактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

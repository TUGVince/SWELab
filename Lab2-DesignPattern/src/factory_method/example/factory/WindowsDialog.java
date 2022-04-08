package factory_method.example.factory;

import factory_method.example.buttons.Button;
import factory_method.example.buttons.WindowsButton;

/**
 * EN: Windows Dialog will produce Windows buttons.
 *
 * RU: Диалог на �?лементах операционной �?и�?темы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

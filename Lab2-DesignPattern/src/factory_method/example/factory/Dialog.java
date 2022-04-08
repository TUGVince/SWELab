package factory_method.example.factory;

import factory_method.example.buttons.Button;

/**
 * EN: Base factory class. Note that "factory" is merely a role for the class.
 * It should have some core business logic which needs different products to be
 * created.
 *
 * RU: Базовый кла�?�? фабрики. Заметьте, что "фабрика" – �?то в�?его лишь
 * дополнительна�? роль дл�? кла�?�?а. Он уже имеет какую-то бизне�?-логику, в
 * которой требует�?�? �?оздание разнообразных продуктов.
 */
public abstract class Dialog {

    public void renderWindow() {
        // EN: ... other code ...
        //
        // RU: ... о�?тальной код диалога ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * EN: Subclasses will override this method in order to create specific
     * button objects.
     *
     * RU: Подкла�?�?ы будут переопредел�?ть �?тот метод, чтобы �?оздавать конкретные
     * объекты продуктов, разные дл�? каждой фабрики.
     */
    public abstract Button createButton();
}

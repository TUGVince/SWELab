package abstract_factory.example.buttons;

/**
 * EN: Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 *
 * RU: Паттерн предполагает, что у ва�? е�?ть не�?колько �?емей�?тв продуктов,
 * наход�?щих�?�? в отдельных иерархи�?х кла�?�?ов (Button/Checkbox). Продукты одного
 * �?емей�?тва должны иметь общий интерфей�?.
 *
 * Это — общий интерфей�? дл�? �?емей�?тва продуктов кнопок.
 */
public interface Button {
    void paint();
}

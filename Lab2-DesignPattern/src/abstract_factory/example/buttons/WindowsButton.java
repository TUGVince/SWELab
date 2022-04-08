package abstract_factory.example.buttons;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 *
 * RU: В�?е �?емей�?тва продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под Windows.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}

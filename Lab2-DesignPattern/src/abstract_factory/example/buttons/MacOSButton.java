package abstract_factory.example.buttons;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 *
 * RU: В�?е �?емей�?тва продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под MacOS.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

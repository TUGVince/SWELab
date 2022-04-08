package abstract_factory.example.checkboxes;

/**
 * EN: All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 *
 * RU: В�?е �?емей�?тва продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариаци�? чекбок�?а под MacOS.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}

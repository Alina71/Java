package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
    public static void selectFromDropDown(WebElement dropDown, String visibleText) {
        Select sel = new Select(dropDown);
        sel.selectByVisibleText(visibleText);
    }

    public static void selectFromDropDown(String value, WebElement dropDown) {
        Select sel = new Select(dropDown);
        sel.selectByValue(value);
    }

    public static void selectFromDropDown(WebElement dropDown, int index) {
        Select sel = new Select(dropDown);
        sel.selectByIndex(index);
    }
}
package Base.Elements;

import Base.BaseElement;
import org.openqa.selenium.By;

public class InputField extends BaseElement {
    public InputField(By locator, String elementName) {
        super(locator, elementName);
    }
    public void fulfillInputArea(String textToFulfill) {
        getElement().sendKeys(textToFulfill);
    }
}

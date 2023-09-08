package Base.Elements;

import Base.BaseElement;
import Driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends BaseElement {
    public CheckBox(By locator, String elementName) {
        super(locator, elementName);
    }
    protected WebElement getElement(){
        return Singleton.driver().findElement(locator);
    }
    public void clickCheckBox(){
        getElement().click();
    }
}

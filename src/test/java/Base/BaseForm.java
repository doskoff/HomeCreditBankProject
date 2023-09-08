package Base;

import Driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseForm {
    private final String elementName;
    private By locator;

    public BaseForm(By locator, String elementName){
        this.locator = locator;
        this.elementName = elementName;
    }
    public boolean openPage(By locator){
        return Singleton.driver().findElement(locator).isDisplayed();
    }

}

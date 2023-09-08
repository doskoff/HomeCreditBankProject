package Base;

import Driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseElement {
    protected By locator;
    protected String elementName;
    protected WebDriverWait wait;
    public BaseElement(By locator, String elementName){
        this.locator = locator;
        this.elementName = elementName;
        wait = new WebDriverWait(Singleton.driver(), Duration.ofSeconds(5));
    }
    protected WebElement getElement(){
        return Singleton.driver().findElement(locator);
    }
    public String getText(){
        return getElement().getText();
    }
    public void click(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        getElement().click();
    }
}

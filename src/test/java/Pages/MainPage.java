package Pages;


import Base.BaseForm;
import Base.Elements.Link;
import Utils.JavaScriptScripts;
import org.openqa.selenium.By;


public class MainPage extends BaseForm {
    public MainPage() {
        super(By.xpath("//a[@class='logo__img aff__adbb__a5x5jf']"), "Mail.ru logo");
    }
    public final By registrationLink = By.xpath("//a[contains(@class, 'ph-project__register')]");
    public final Link registrationLinkElement = new Link(registrationLink, "Registration Link element");
    public void clickRegistrationLink(){
        JavaScriptScripts.scrollingUntilElement(registrationLink);
        registrationLinkElement.click();
    }
}

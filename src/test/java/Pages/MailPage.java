package Pages;

import Base.BaseForm;
import Base.Elements.Button;
import org.openqa.selenium.By;


public class MailPage extends BaseForm {
    public MailPage() {
        super(By.xpath("//div[@class='button2__txt' and contains(text(), 'Отметить все прочитанными')]"), "mail label");
    }
    public final By iconButton = By.xpath("//div[@class='ph-auth svelte-bp6up3']");
    private final Button iconButtonElement = new Button(iconButton, "icon Button Element");
    public void iconButtonClick(){
        iconButtonElement.click();
    }
    private final By exitButton=By.xpath("//div[@class='ph-item ph-item__social svelte-1popff4' and @tabindex='0' and @data-testid='whiteline-account-exit']");
    private final Button exitButtonElement = new Button(exitButton, "exit Button Element");
    public void exitButtonClick(){
        exitButtonElement.click();
    }
}

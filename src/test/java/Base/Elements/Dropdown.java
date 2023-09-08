package Base.Elements;

import Base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dropdown extends BaseElement {
    public Dropdown(By locator, String elementName) {
        super(locator, elementName);
    }
    public void selectDayByText(String day) {
        WebElement dayDropdown = getElement();
        dayDropdown.click();
        WebElement dayOption = getElement().findElement(By.xpath("//div[contains(@class, 'select-0-2-131')]//span[text()='" + day + "']"));
        dayOption.click();
    }
    public void selectMonthByText(String month) {
        WebElement monthDropdown = getElement();
        monthDropdown.click();
        WebElement monthOption = getElement().findElement(By.xpath("//div[contains(@class, 'select-0-2-131')]//span[text()='" + month + "']"));
        monthOption.click();
    }

    public void selectYearByText(String year) {
        WebElement yearDropdown = getElement();
        yearDropdown.click();
        WebElement yearOption = getElement().findElement(By.xpath("//div[contains(@class, 'select-0-2-131')]//span[text()='" + year + "']"));
        yearOption.click();
    }

}

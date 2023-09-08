package Pages;

import Base.BaseForm;
import Base.Elements.*;
import Utils.Data;
import Utils.Generator;
import Utils.JavaScriptScripts;
import Utils.JsonReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;

public class RegistrationPage  extends BaseForm {

    public RegistrationPage() {
        super(By.xpath("//div[contains(@class, '_2F1k-ReGugy8-wThA3uvT-')]/h6[@class='base-0-2-6 h6-0-2-13' and text()='Обычная почта']"), "Registration page label");
    }
    public final By registrationLabel = By.xpath("//h3[@class='base-0-2-6 h3-0-2-10' and text()='Создание почтового ящика']");
    private final By inputName = By.xpath("//*[@id='fname']");
    private final By lastName = By.xpath("//*[@id='lname']");
    public final InputField inputNameElement= new InputField(inputName, "input Name Element");
    public final InputField lastNameElement= new InputField(lastName, "input lastName Element");
    private final By maleCheckBox = By.xpath("//label[@tabindex='0' and @class='label-0-2-145']/div[@class='radio-0-2-146']/div[@class='border-0-2-148']");
    public final CheckBox maleCheckBoxElement = new CheckBox(maleCheckBox, "male checkbox element");
    private final By emailInput = By.xpath("//*[@id='aaa__input']");
    public final InputField emailInputElement = new InputField(emailInput, "email input element");
    private final By passwordInput = By.xpath("//*[@id='password']");
    public final InputField passwordInputElement = new InputField(passwordInput, "password input element");
    private final By repeatPasswordInput = By.xpath("//*[@id='repeatPassword']");
    public final InputField repeatPasswordInputElement = new InputField(repeatPasswordInput, "repeat password input element");

    private final By dayInput = By.xpath("//div[contains(@class, 'Select__control')]/div[contains(@class, 'Select__value-container')]/span[contains(@class, 'base-0-2-6 control-0-2-14 secondary-0-2-20')]");
    public final By monthInput = By.xpath("//div[contains(@class, 'Select__control')]/div[contains(@class, 'Select__value-container')]/span[contains(@class, 'base-0-2-6 control-0-2-14 secondary-0-2-20')]");
    private final By yearInput = By.xpath("//div[contains(@class, 'Select__control')]/div[contains(@class, 'Select__value-container')]/span[contains(@class, 'base-0-2-6 control-0-2-14 secondary-0-2-20')]");
    public final Dropdown dayInputElement = new Dropdown(dayInput,"day input element");
    public final Dropdown monthInputElement = new Dropdown(monthInput, "month input element");
    public final Dropdown yearInputElement = new Dropdown(yearInput, "month input element");

    private final By regButton = By.xpath("//*[@id=\"root\"]/div/div[4]/div[4]/div/div/div/div/form/button");
    public final Button regButtonElement = new Button(regButton, "reg button element");
    public void clickRegButton(){
        JavaScriptScripts.scrollingUntilElement(regButton);
        regButtonElement.click();
    }
    public final By errorLabel= By.xpath("//small[contains(text(), 'Ящик с таким именем уже существует')]");
    public final Label errorLabelElement = new Label(errorLabel, "error label");
    public void insertUserCredentials(String email, String password){
        inputNameElement.fulfillInputArea(JsonReader.getName());
        lastNameElement.fulfillInputArea(JsonReader.getLastName());
        maleCheckBoxElement.clickCheckBox();
        emailInputElement.fulfillInputArea(email);
        passwordInputElement.fulfillInputArea(password);
        repeatPasswordInputElement.fulfillInputArea(password);
        dayInputElement.selectDayByText(Data.getTodayDay());
        monthInputElement.selectMonthByText(Data.getTodayMonth());
        yearInputElement.selectYearByText(Integer.toString(Data.getTodayYear()-15));

    }
}

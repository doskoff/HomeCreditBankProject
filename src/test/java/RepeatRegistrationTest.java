import Base.BaseTest;
import Base.Elements.Button;
import Base.Elements.InputField;
import Driver.Singleton;
import Pages.MailPage;
import Pages.MainPage;
import Pages.RegistrationPage;
import Utils.Generator;
import Utils.JsonReader;
import Utils.WorkWithFiles;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.io.IOException;

public class RepeatRegistrationTest extends BaseTest {
    String filePath = JsonReader.getFilePath();
    private final String email = Generator.generateRandomEmail();
    private final String password = Generator.generatePassword();
    private static final Logger LOGGER = Logger.getLogger(RepeatRegistrationTest.class);
    @Test
    public void repeatRegistrationTest() throws IOException {
        LOGGER.error("main page is open");
        MainPage mainPage = new MainPage();
        mainPage.clickRegistrationLink();
        RegistrationPage registrationPage = new RegistrationPage();
        LOGGER.error("Registration page is open");
        Assert.assertTrue(registrationPage.openPage(registrationPage.registrationLabel), "Registration page is not open");
        registrationPage.insertUserCredentials(email, password);
        WorkWithFiles.saveCreds(filePath,email);
        registrationPage.clickRegButton();
        //ВРЕМЯ ДЛЯ ВВОДА КАПЧИ
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MailPage mailPage  = new MailPage();
        LOGGER.error("mail page is open");
        Assert.assertTrue(mailPage.openPage(mailPage.iconButton), "Mail page is not open");
        mailPage.iconButtonClick();
        mailPage.exitButtonClick();
        MainPage secondOpenMainPage = new MainPage();
        LOGGER.error("main page is open");
        Assert.assertTrue(secondOpenMainPage.openPage(secondOpenMainPage.registrationLink), "Main page is not open");
        secondOpenMainPage.clickRegistrationLink();
        RegistrationPage secondOpenRegistrationPage = new RegistrationPage();
        LOGGER.error("Registration page is open");
        Assert.assertTrue(secondOpenRegistrationPage.openPage(secondOpenRegistrationPage.registrationLabel), "Registration page is not open");
        secondOpenRegistrationPage.insertUserCredentials(email, password);
        LOGGER.error("Message is on the page");
        Assert.assertTrue(secondOpenRegistrationPage.openPage(secondOpenRegistrationPage.errorLabel), "There is no such test");
        LOGGER.error(secondOpenRegistrationPage.errorLabelElement.getText());
        System.out.println(secondOpenRegistrationPage.errorLabelElement.getText());
    }
}


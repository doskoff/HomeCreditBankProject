package Base;

import Driver.Singleton;
import Pages.MainPage;

import Utils.JsonReader;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class BaseTest {

    @BeforeTest
    public static void beforeTest(){
        Singleton.driver().manage().window().maximize();
        Singleton.driver().get(JsonReader.getUrl());
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.openPage(mainPage.registrationLinkElement.locator), "Main page is not open");

    }
    @AfterTest
    public static void afterTest(){
        Singleton.closeDriver();
    }

}

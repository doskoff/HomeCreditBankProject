package Driver;

import Utils.JsonReader;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Singleton {
    private static WebDriver driver;
    private static final String driverName= JsonReader.getBrowser();

    private Singleton(){}
    public static WebDriver driver() {
        if (driver == null) {
            try {
                if (driverName.equals("chrome")) {
                    driver = ChromeDriverFactory.createChromeDriver();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                } else if (driverName.equals("firefox")) {
                    driver = FirefoxDriverFactory.createFirefoxDriver();
                }
            }
            catch (Exception ex){
                System.out.println("No such browser");
            }
        }
        return driver;
    }
    public static void closeDriver(){
        driver.quit();
        driver=null;
    }
}

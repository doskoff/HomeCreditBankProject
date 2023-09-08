package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverFactory {
    public static WebDriver createChromeDriver() {
        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();

        return new ChromeDriver(opt);
    }
}

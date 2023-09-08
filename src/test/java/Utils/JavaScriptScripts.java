package Utils;

import Driver.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptScripts {
    static JavascriptExecutor js = (JavascriptExecutor) Singleton.driver();
    public static void scrollingUntilElement(By locator){
        js.executeScript("arguments[0].scrollIntoView()",Singleton.driver().findElement(locator));
    }
}

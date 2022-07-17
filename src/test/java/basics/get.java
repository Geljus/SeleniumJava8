package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get {
    private WebDriver driver = null;

    @Before
    public void setup() {
        driver = new EdgeDriver();
    }

    @Test
    public void howToOpenBrowserWindow() {
        driver.get("https://www.google.com/");
        driver.get("https://www.yandex.ru/");
        driver.navigate().back();
        driver.navigate().forward();
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}

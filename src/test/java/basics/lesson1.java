package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson1 {
    private WebDriver driver = null;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void howToOpenBrowserWindow() {
        driver.get("https://www.google.com/");

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

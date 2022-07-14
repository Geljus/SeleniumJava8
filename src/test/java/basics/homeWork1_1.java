package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class homeWork1_1 {
    private WebDriver driver = null;

    @Before
    public void setup() {
        driver = new EdgeDriver();
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

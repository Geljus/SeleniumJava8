package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson2 {
    private WebDriver driver = null;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void howToOpenBrowserWindow() {
        driver.get("https://www.telekom.com/en/contact-forms/careers");
//        WebElement container = driver.findElement(By.id("id56"));
//        WebElement button = container.findElement(By.tagName("a"));

        driver.findElement(By.cssSelector("#id56>a"));
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

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
//        driver.get("https://www.telekom.com/en/contact-forms/careers");
//        driver.get("https://www.yandex.ru");
//        WebElement container = driver.findElement(By.id("id56"));
//        WebElement button = container.findElement(By.tagName("a

//        WebElement searchField = driver.findElement(By.cssSelector(".geolink__reg"));
//        driver.navigate().refresh();
//        System.out.println(searchField);
//        searchField.click();

        driver.get("https://bolt.eu/ru/");
        WebElement searchField1 = driver.findElement(By.cssSelector(".cb-bolt-btn-primary"));
        searchField1.click();

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

package basics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class lesson5 {
    private WebDriver driver = null;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void howToUseBasicCommands() {
//        driver.get("https://ya.ru/");
//       WebElement searchField = driver.findElement(By.cssSelector("input.search3__input.mini-suggest__input"));
//        searchField.sendKeys("test");
//        searchField.sendKeys(Keys.ENTER);
//        driver.findElement(By.cssSelector("input#uniq16578506621841.input__control.mini-suggest__input")).getAttribute("value");
//        driver.findElement(By.cssSelector("input#uniq16578506621841.input__control.mini-suggest__input")).getText();

        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php#load_box");
        driver.findElement(By.cssSelector(".time_feild option")).getAttribute("selected");

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}

package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aaa {
    WebDriver driver;

    @BeforeAll
    static void downloadDriver(){
        WebDriverManager.chromedriver().setup();;
    }

    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
    }

    @AfterEach
    void closeBrowser(){
        driver.quit();
    }

    @Test
    void navigationTest(){
        driver.get("http://google.com");
        driver.get("http://selenide.org");
        System.out.println("done");
    }
}

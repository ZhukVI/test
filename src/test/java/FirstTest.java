import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstTest {

    @Test
    public  void firstTest(){
        System.setProperty("chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome driver has been opened");
        driver.get("https://www.onliner.by/");
        //WebElement footerItem = driver.findElement(By.xpath("//li[@class='footer-style__item']//a[contains(text(),'Контакты редакции')]"));
        //WebElement fastsearch = driver.findElement(By.id("fast-search"));
        //WebElement fastsearchInput = driver.findElement(By.name("query"));
        //WebElement fastsearch1 = driver.findElement(By.cssSelector("#userbug"));
        WebElement footerItem = driver.findElement(By.xpath("//a[text()='Авто']//..//..//a[@title='RSS']"));
        //System.out.println(footerItem.getText());
        footerItem.click();
        System.out.println(driver.getCurrentUrl());
        System.out.println("Onliner home page has been opened");
        //driver.quit();
        System.out.println("Chrome driver has been closed");
    }

}

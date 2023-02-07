//package app;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.junit.annotations.Test;
//
//public class SeleniumAPITest {
//
//    WebDriver driver;
//    @BeforeAll
//    static void loadDriver(){
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void setupDriver(){
//        driver = new ChromeDriver();
//    }
//
////    @AfterEach
////    void closeBrowser(){
////        driver.close();
////    }
////    @Test
////    void windowTest(){
////        driver.get("https://demo.guru99.com/test/guru99home/");
////        System.out.println(driver.getTitle());
////        String firstId = driver.getWindowHandle();
////        driver.switchTo().newWindow(WindowType.WINDOW).get("https://google.com");
////        System.out.println(driver.getTitle());
////        driver.switchTo().window(firstId);
////        System.out.println(driver.getTitle());
////    }
////
////
////    void iFrameTest {
////
////    }
//}

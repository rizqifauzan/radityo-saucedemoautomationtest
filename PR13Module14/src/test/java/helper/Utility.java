package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

    public static WebDriver webDriver;


    //membuka googlechrome
    public static void startWebDriver(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver  .manage().window().fullscreen();
        webDriver .get("https://www.saucedemo.com/");
    }
    //menutup setelah selesai

    public static void quitDriver(){
        webDriver.quit();
    }
}

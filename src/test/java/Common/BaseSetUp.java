package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetUp {
    protected static WebDriver driver;
    String url = "https://iresource.smartdev.vn/";

    public WebDriver getDriver(){
        return driver;
    }

    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }
    public void tearDown(){
        driver.quit();
    }
}

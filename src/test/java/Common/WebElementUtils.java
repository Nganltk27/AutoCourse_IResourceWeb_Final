package Common;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebElementUtils {
    public static void inputToElement(WebElement element, String value){
        element.sendKeys(value);
    }
    public static void clickOnElement(WebElement element){
        element.click();
    }
    public static void getErrorMessage(WebElement element, String message){
        Assert.assertEquals(element.getText(), message);
    }
    public static void getTitle(WebElement element, String title) {
        Assert.assertEquals(element.getText(), title);
    }
}

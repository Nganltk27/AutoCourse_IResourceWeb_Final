package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProjectsPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/div[1]")
    private WebElement manageProjTitle;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[1]/nav/div[2]/div/i")
    private WebElement logOutBt;

    public ManageProjectsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getManageProjTitle() {
        return manageProjTitle;
    }

    public WebElement getLogOutBt() {
        return logOutBt;
    }
}
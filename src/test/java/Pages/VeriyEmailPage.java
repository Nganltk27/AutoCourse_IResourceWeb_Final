package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VeriyEmailPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/h2")
    private WebElement veriyEmailTitle;
    @FindBy(xpath = "//input[@type='text'] ")
    private WebElement digitCode;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/div/form/button")
    private WebElement confirmBt;
    @FindBy(css = "input[type=\"text\"]")
    private WebElement disposEmailTxt;
    @FindBy(xpath = "/html/body/div/div[3]/div[1]/div[2]/div/button")
    private WebElement disposEmailBt;
    @FindBy (xpath = "//div[@class='ng-binding ng-scope']")
    private WebElement emailContent;
    @FindBy (xpath = "//div[@class='Toastify__toast-body']")
    private WebElement warningMsg;

    public VeriyEmailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getVeriyEmailTitle() {
        return veriyEmailTitle;
    }

    public WebElement getDigitCode() {
        return digitCode;
    }

    public WebElement getConfirmBt() {
        return confirmBt;
    }

    public WebElement getDisposEmailTxt() {
        return disposEmailTxt;
    }

    public WebElement getDisposEmailBt() {
        return disposEmailBt;
    }

    public WebElement getEmailContent() {
        return emailContent;
    }

    public WebElement getWarningMsg() {
        return warningMsg;
    }
}

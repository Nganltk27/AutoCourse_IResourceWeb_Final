package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;
    @FindBy(name = "email")
    private WebElement emailLogin;
    @FindBy (name = "password")
    private WebElement passWdLogin;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[5]/button")
    private WebElement loginBt;
    @FindBy (xpath = "/html/body/div/div/div[2]/div/div/div[1]")
    private WebElement warningMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[2]/p")
    private WebElement reqEmailMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[2]/p")
    private WebElement invalidEmailMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[1]/form/div[3]/p")
    private WebElement reqPassMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div/div[2]/a") //css = "a[href*='/signup']"
    private WebElement signUpHyperLink;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getEmailLogin() {
        return emailLogin;
    }

    public WebElement getPassWdLogin() {
        return passWdLogin;
    }

    public WebElement getLoginBt() {
        return loginBt;
    }

    public WebElement getWarningMsg() {
        return warningMsg;
    }

    public WebElement getReqEmailMsg() {
        return reqEmailMsg;
    }

    public WebElement getReqPassMsg() {
        return reqPassMsg;
    }

    public WebElement getInvalidEmailMsg() {
        return invalidEmailMsg;
    }

    public WebElement getSignUpHyperLink() {
        return signUpHyperLink;
    }
}

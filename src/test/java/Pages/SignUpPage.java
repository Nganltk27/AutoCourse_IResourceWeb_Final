package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;
    @FindBy (xpath = "/html/body/div/div/div[1]/div/div[2]/div[2]/h2")
    //html/body/div/div/div[1]/div/div[2]/div[2]/h2
    private WebElement signUpTitle;
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy (name = "lastname")
    private WebElement lastName;
    @FindBy (name = "email")
    private WebElement emailSignUp;
    @FindBy (name = "password")
    private WebElement passSignUp;
    @FindBy (name = "confirmPassword")
    private WebElement confirmPass;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[6]/button")
    private WebElement signUpBt;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[2]/div[1]/p")
    private WebElement reqFirNameMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[2]/div[2]/p")
    private WebElement reqLastNameMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[3]/p")
    private WebElement reqEmailMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[4]/p")
    private WebElement reqPassMsg;
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[1]/div/div[2]/div[2]/form/div/div[5]/p")
    private WebElement reqConfirmPassMsg;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSignUpTitle() {
        return signUpTitle;
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getEmailSignUp() {
        return emailSignUp;
    }

    public WebElement getPassSignUp() {
        return passSignUp;
    }

    public WebElement getConfirmPass() {
        return confirmPass;
    }

    public WebElement getSignUpBt() {
        return signUpBt;
    }

    public WebElement getReqFirNameMsg() {
        return reqFirNameMsg;
    }

    public WebElement getReqLastNameMsg() {
        return reqLastNameMsg;
    }

    public WebElement getReqEmailMsg() {
        return reqEmailMsg;
    }

    public WebElement getReqPassMsg() {
        return reqPassMsg;
    }

    public WebElement getReqConfirmPassMsg() {
        return reqConfirmPassMsg;
    }
}

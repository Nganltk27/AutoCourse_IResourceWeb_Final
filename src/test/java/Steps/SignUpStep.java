package Steps;

import Common.BaseSetUp;
import Common.WebElementUtils;
import Pages.LoginPage;
import Pages.SignUpPage;
import Pages.VeriyEmailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStep extends BaseSetUp {
    LoginPage loginPage = new LoginPage(BaseSetUp.driver);
    SignUpPage signUpPage = new SignUpPage(BaseSetUp.driver);
    VeriyEmailPage veriyEmailPage = new VeriyEmailPage(BaseSetUp.driver);

    //TC_SU_01
    @Given("Go to Login page")
    public void goToLoginPage() throws InterruptedException {
        setDriver();
        loginPage = new LoginPage(BaseSetUp.driver);
        signUpPage = new SignUpPage(BaseSetUp.driver);
    }
    @When("Click on Sign Up hyperlink")
    public void clickOnSignUpHyperlink() throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();",loginPage.getSignUpHyperLink() );
        WebElementUtils.clickOnElement(loginPage.getSignUpHyperLink());
        Thread.sleep(3000);
    }
    @Then("The Sign Up page should display with {string}")
    public void theSignUpPageShouldDisplayWith(String title) {
        WebElementUtils.getTitle(signUpPage.getSignUpTitle(),title);
        tearDown();
    }
    //TC_SU_02
    @And("Input valid data into all fields")
    public void inputValidDataIntoAllFields(String firstname, String lastname, String email, String password, String confirmPass) {
        WebElementUtils.inputToElement(signUpPage.getFirstName(),firstname);
        WebElementUtils.inputToElement(signUpPage.getLastName(),lastname);
        WebElementUtils.inputToElement(signUpPage.getEmailSignUp(),email);
        WebElementUtils.inputToElement(signUpPage.getPassSignUp(),password);
        WebElementUtils.inputToElement(signUpPage.getConfirmPass(),confirmPass);
    }
    @And("Click on Sign Up button")
    public void clickOnSignUpButton() {
        WebElementUtils.clickOnElement(signUpPage.getSignUpBt());
    }
    @Then("The Verify email should display with {string}")
    public void theVerifyEmailShouldDisplayWith(String title) {
        WebElementUtils.getTitle(veriyEmailPage.getVeriyEmailTitle(),title);
        tearDown();
    }
    //TC_SU_03
    @And("Miss all fields blank")
    public void missAllFieldsBlank() {
    }
    @Then("The warning message should display {string}")
    public void theWarningMessageShouldDisplay(String message) {
        WebElementUtils.getErrorMessage(signUpPage.getReqEmailMsg(),message);
        tearDown();
    }

    //TC_SU_04
    @And("Input number in Firstname field and valid data in remaining fields")
    public void inputNumberInFirstnameFieldAndValidDataInRemainingFields(String firstname, String lastname, String email, String password, String confirmPass) {
        WebElementUtils.inputToElement(signUpPage.getFirstName(),firstname);
        WebElementUtils.inputToElement(signUpPage.getLastName(),lastname);
        WebElementUtils.inputToElement(signUpPage.getEmailSignUp(),email);
        WebElementUtils.inputToElement(signUpPage.getPassSignUp(),password);
        WebElementUtils.inputToElement(signUpPage.getConfirmPass(),confirmPass);
    }
    @Then("The warning message should display below Firstname field with {string}")
    public void theWarningMessageShouldDisplayBelowFirstnameFieldWith(String message) {
        WebElementUtils.getErrorMessage(signUpPage.getFirstName(),message);
        tearDown();
    }
    //Tc_SU_05
    @And("Input number in Lastname field and valid data in remaining fields")
    public void inputNumberInLastnameFieldAndValidDataInRemainingFields(String firstname, String lastname, String email, String password, String confirmPass) {
        WebElementUtils.inputToElement(signUpPage.getFirstName(),firstname);
        WebElementUtils.inputToElement(signUpPage.getLastName(),lastname);
        WebElementUtils.inputToElement(signUpPage.getEmailSignUp(),email);
        WebElementUtils.inputToElement(signUpPage.getPassSignUp(),password);
        WebElementUtils.inputToElement(signUpPage.getConfirmPass(),confirmPass);
    }
    @Then("The warning message should display below Lastname field with {string}")
    public void theWarningMessageShouldDisplayBelowLastnameFieldWith(String message) {
        WebElementUtils.getErrorMessage(signUpPage.getLastName(),message);
        tearDown();
    }
}

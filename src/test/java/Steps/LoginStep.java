package Steps;

import Common.BaseSetUp;
import Common.WebElementUtils;
import Pages.LoginPage;
import Pages.ManageProjectsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

public class LoginStep extends BaseSetUp {
    LoginPage loginPage = new LoginPage(BaseSetUp.driver);
    ManageProjectsPage manageProjectsPage = new ManageProjectsPage(BaseSetUp.driver);

    //TC_LG_01
    @Given("Navigate to Login page")
    public void navigateToLoginPage() {
        setDriver();
        loginPage = new LoginPage(BaseSetUp.driver);
        manageProjectsPage = new ManageProjectsPage(BaseSetUp.driver);
    }
    @When("Leave all fields blank")
    public void leaveAllFieldsBlank(){
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),"");
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),"");
        WebElementUtils.clickOnElement(loginPage.getLoginBt());
    }
    @Then("The message should display")
    public void theMessageShouldDisplay() {
        WebElementUtils.getErrorMessage(loginPage.getReqEmailMsg(),"Required!");
        WebElementUtils.getErrorMessage(loginPage.getReqPassMsg(), "Required!");
        tearDown();
    }
    //TC_LG_02
    @When("Input valid data in all fields")
    public void inputValidDataInAllFields(DataTable table)  {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(1));
    }
    @And("Click on Login button")
    public void clickOnLoginButton() {
        WebElementUtils.clickOnElement(loginPage.getLoginBt());
    }
    @Then("The Manage Projects page should display with {string}")
    public void theManageProjectsPageShouldDisplayWith(String title) throws Exception {
        Thread.sleep(3000);
        WebElementUtils.getTitle(manageProjectsPage.getManageProjTitle(),title);
        WebElementUtils.clickOnElement(manageProjectsPage.getLogOutBt());
        tearDown();
    }
    //TC_LG_03
    @When("Input valid data into Password field")
    public void inputValidDataIntoPasswordField(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(0));
    }

    @Then("The error message should display below Email field with {string}")
    public void theErrorMessageShouldDisplayWith(String message) {
        WebElementUtils.getErrorMessage(loginPage.getReqEmailMsg(),message);
        tearDown();
    }
    //TC_LG_04
    @When("Input space characters into Email field")
    public void inputSpaceCharactersIntoEmailField(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(1));
    }
    //TC_LG_05
    @When("Input invalid format email")
    public void inputInvalidEmail(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(1));
    }
    @Then("The error message should display below email field with {string}")
    public void theWarningMessageShouldDisplayWith(String message) {
        WebElementUtils.getErrorMessage(loginPage.getInvalidEmailMsg(),message);
        tearDown();
    }
    //TC_LG_06
    @When("Input unregistered email")
    public void inputUnregisteredEmail(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(1));
    }
    @Then("The error message should display popup top-right with {string}")
    public void theErrorMessageShouldDisplayPopupTopRightWith(String message) throws InterruptedException {
        Thread.sleep(3000);
        WebElementUtils.getErrorMessage(loginPage.getWarningMsg(),message);
        tearDown();
    }
    //TC_LG_07
    @When("Input valid data in Email field")
    public void inputValidDataInEmailField(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
    }

    @Then("The error message should display below Password field with {string}")
    public void theErrorMessageShouldDisplayBelowPasswordFieldWith(String message) {
        WebElementUtils.getErrorMessage(loginPage.getReqPassMsg(),message);
        tearDown();
    }
    //TC_LG_08
    @When("Input space characters into Password field")
    public void inputSpaceCharactersIntoPasswordField(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(1));
    }
    //TC_LG_09
    @When("Input wrong password")
    public void inputWrongPassword(DataTable table) {
        List<List<String>> data = table.cells();
        WebElementUtils.inputToElement(loginPage.getEmailLogin(),data.get(1).get(0));
        WebElementUtils.inputToElement(loginPage.getPassWdLogin(),data.get(1).get(1));
    }
}

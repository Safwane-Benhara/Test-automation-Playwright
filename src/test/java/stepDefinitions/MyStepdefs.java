package stepDefinitions;

import com.microsoft.playwright.Page;
import configuration.ConfigfileReader;
import configuration.PlaywrightManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.Basetools;


public class MyStepdefs extends Basetools {
    private final Page page;
    private final LoginPage loginPage;
    private final String url=ConfigfileReader.get("URL");

    public MyStepdefs(){
        this.page= PlaywrightManager.page;
        this.loginPage =new LoginPage(page);
    }



    @Given("im in the login page")
    public void imInTheLoginPage() {

        page.navigate(url);
        Assert.assertTrue(loginPage.emailField.isVisible());
    }

    @And("i fill in the email field with an existing email")
    public void iFillInTheEmailFieldWithAnExistingEmail() {
        System.out.println(System.getenv("EMAIL1"));
        String email=System.getenv("EMAIL1");
        loginPage.emailField.fill(email);

    }

    @And("i fill in the password field with a the correct password")
    public void iFillInThePasswordFieldWithATheCorrectPassword() {
        System.out.println(System.getenv("PASSWORD"));
        String password=System.getenv("PASSWORD");
        loginPage.passwordField.fill(password);
    }

    @When("i click on the sign in button")
    public void iClickOnTheSignInButton() {
        loginPage.signInField.click();
    }

    @Then("im redirected to the main products page")
    public void imRedirectedToTheMainProductsPage() {

        page.waitForURL("http://localhost:4173/shop/home", new Page.WaitForURLOptions().setTimeout(5000));
        Assert.assertTrue(page.url().equals("http://localhost:4173"+"/shop/home"));
    }

    @And("i fill in the email field with {string}")
    public void iFillInTheEmailFieldWith(String email ) {
        loginPage.emailField.fill(email);

    }

    @And("i fill in the password field with {string}")
    public void iFillInThePasswordFieldWith(String password) {
        loginPage.passwordField.fill(password);

    }

    @Then("an Error popup shows up saying that the user does not exist")
    public void anErrorPopupShowsUpSayingThatTheUserDoesNotExist() {
        waitForVisibility(loginPage.errorPopup, 5000);

    }
}

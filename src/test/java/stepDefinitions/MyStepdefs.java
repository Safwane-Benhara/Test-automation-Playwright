package stepDefinitions;

import com.microsoft.playwright.Page;
import configuration.ConfigfileReader;
import configuration.PlaywrightManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.MainPage;



public class MyStepdefs {
    private final Page page;
    private final MainPage mainPage;
    private final String url=ConfigfileReader.get("URL");

    public MyStepdefs(){
        this.page= PlaywrightManager.page;
        this.mainPage=new MainPage(page);
    }

    @Given("im in the main page")
    public void imInTheMainPage() {
        page.navigate(url);

        mainPage.logginBtn.click();
        //page.waitForTimeout(5000);




    }

    @And("i fill the username and password fields")
    public void iFillTheUsernameAndPasswordFields() {
        mainPage.usernameField.fill("Admin");
        mainPage.passwordField.fill("admin123");

    }

    @And("i click on the Login button")
    public void iClickOnTheLoginButton() {
        mainPage.logginBtn.click();
        page.waitForTimeout(5000);
    }
}

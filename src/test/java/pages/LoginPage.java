package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {
    private final Page page;

    //locators in loginPage

    public final Locator emailField;
    public final Locator passwordField;
    public final Locator signInField;
    public final Locator errorPopup;


    //locators init


    public LoginPage(Page page){
        this.page=page;
        this.emailField=page.locator("//input[@type='email']");
        this.passwordField=page.locator("//input[@type='password']");
        this.signInField=page.locator("//button[contains(text(),'Sign In')]");
        this.errorPopup=page.locator("//div[contains(text(),\"User doesn't exists\")]");
    }
}

package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class MainPage {
    private final Page page;
    public final Locator usernameField;
    public final Locator passwordField;
    public final Locator logginBtn;


    //locators init


    public MainPage(Page page){
        this.page=page;
        this.usernameField=page.locator("input[name=\"username\"]");
        this.passwordField=page.locator("input[type*=\"password\"]");
        this.logginBtn=page.locator("//button[contains(., 'Login')]");
    }
}

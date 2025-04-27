package configuration;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PlaywrightManager {
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    @Before
    public void setUp(){
        playwright=Playwright.create();
        browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        context=browser.newContext();
        page=context.newPage();
    }

    @After
    public void tearDown(){
        //Thread.sleep(3000);
        if(browser !=null)
            browser.close();
        if(playwright!=null)
            playwright.close();
    }


}
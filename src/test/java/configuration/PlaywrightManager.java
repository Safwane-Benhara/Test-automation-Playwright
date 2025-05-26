package configuration;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.List;

public class PlaywrightManager {
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;

    @Before
    public void setUp(){
        playwright=Playwright.create();
        browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setArgs(List.of("--start-maximized")));
        context=browser.newContext( new Browser.NewContextOptions().setViewportSize(null));
        page=context.newPage();
    }

    @After
    public void tearDown() throws InterruptedException {
        //Thread.sleep(30000);
        if(browser !=null)
            browser.close();
        if(playwright!=null)
            playwright.close();
    }


}
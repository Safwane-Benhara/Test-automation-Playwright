package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProductPage {
    private final Page page;




    //locators in product page
    public final Locator productsBtn;
    public final Locator cartBtn;
    public final Locator menFilter;
    public final Locator womenFilter;
    public final Locator kidsFilter;
    public final Locator acessoirFilter;
    public final Locator footWearFilter;
    public final Locator nikeFilter;
    public final Locator adidasFilter;
    public final Locator pumaFilter;
    public final Locator leviFilter;
    public final Locator zaraFilter;
    public final Locator hmFilter;
    public   final Locator addFirstProdCart;
    public final Locator cartCounter;
    public final Locator checkoutBtn;
    public final Locator paymentBtn;;



    public ProductPage(Page page) {
        this.page=page;
        this.cartBtn= page.locator("svg[class*=\"cart\"]\n");
        this.menFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Men']");
        this.womenFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Women']");
        this.kidsFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Kids']");
        this.acessoirFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Accessories']");
        this.footWearFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Accessories']");
        this.nikeFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Nike']");
        this.adidasFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Adidas']");
        this.pumaFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Puma']");
        this.leviFilter = page.locator("//div[contains(@class,'grid')]/label[text()=\"Levi's\"]");
        this.zaraFilter = page.locator("//div[contains(@class,'grid')]/label[text()='Zara']");
        this.hmFilter = page.locator("//div[contains(@class,'grid')]/label[text()='H&M']");
        this.addFirstProdCart=page.locator("(//div[contains(@class,'grid-cols-4')]//button)[1]");


        this.productsBtn = page.locator("//label[text()='Products']");
        this.cartCounter = page.locator("//button//span[text()='User cart']/preceding-sibling::span");
        this.checkoutBtn = page.locator("//button[contains(text(),'Checkout')]");
        this.paymentBtn = page.locator("//button[contains(text(),'Paypal')]");
    }



}

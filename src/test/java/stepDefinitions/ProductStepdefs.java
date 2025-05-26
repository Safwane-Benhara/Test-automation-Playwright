package stepDefinitions;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import configuration.PlaywrightManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductPage;
import testData.TestData;
import utils.Basetools;

public class ProductStepdefs extends Basetools {
    private final Page page;
    private final ProductPage productPage;


    public ProductStepdefs() {
        this.page = PlaywrightManager.page;
        this.productPage = new ProductPage(page);
    }

    @Given("im in the products page")
    public void imInTheProductsPage() {
    }

    @And("i click on add to cart on an availble product")
    public void iClickOnAddToCartOnAnAvailbleProduct() {
        System.out.println("f");
       productPage.addFirstProdCart.click();
       int cartNumber=Integer.parseInt(String.valueOf(productPage.cartCounter.textContent()));
        TestData.put("cartnumber",cartNumber);



    }

    @And("i click on the cart button")
    public void iClickOnTheCartButton() {
        productPage.cartBtn.click();
    }

    @And("the number of product in the cart is incremented by one")
    public void theNumberOfProductInTheCartIsIncrementedByOne() {
        int expected = (Integer) TestData.get("cartnumber") ;
        int actual = Integer.parseInt(productPage.cartCounter.textContent().trim());
        Assert.assertEquals(expected, actual);


    }

    @When("i click on the checkout button")
    public void iClickOnTheCheckoutButton() {
        productPage.checkoutBtn.click();

    }

    @And("the product is visible in the cart session")
    public void theProductIsVisibleInTheCartSession() {
        Assert.assertTrue(page.locator("//p[contains(text(),\"$\")]").isVisible());
    }

    @And("im redirected to the checkout page")
    public void imRedirectedToTheCheckoutPage() {
        page.waitForURL("http://localhost:4173/shop/checkout", new Page.WaitForURLOptions().setTimeout(5000));
        Assert.assertTrue(page.url().equals("http://localhost:4173/shop/checkout"));
    }

    @And("i selected an existing adress")
    public void iSelectedAnExistingAdress() {
        page.locator("(//label[contains(text(),'Address')])[1]").click();
    }

    @And("i click on proceed with payment button")
    public void iClickOnProceedWithPaymentButton() {
        productPage.paymentBtn.click();

    }

    @Then("im redirected to the paypal payment page")
    public void imRedirectedToThePaypalPaymentPage() {
    }
}
package pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@name='qty']")
    private WebElement quantity;

    @FindBy(xpath = "//div[@class='add']/button[@type='submit']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement goToCheckoutBtn;

    public ProductPage setQuantity(String quant){
        quantity.clear();
        quantity.sendKeys(quant);
        return this;
    }

    public ProductPage addToCart(){
        addToCartBtn.click();
        return this;
    }

    public ProductPage goToCheckout(){
        waitToBeVisible(goToCheckoutBtn);
        goToCheckoutBtn.click();
        return this;
    }
}

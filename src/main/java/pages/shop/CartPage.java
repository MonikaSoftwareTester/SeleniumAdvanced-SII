package pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='label']")
    private WebElement productName;

    @FindBy(xpath = "//input[@class='js-cart-line-product-quantity form-control']")
    private WebElement quantityField;

    @FindBy(xpath = "//span[@class='price']")
    private WebElement price;

    @FindBy(xpath = "//span[@class='product-price']")
    private WebElement totalPrice;

    @FindBy(xpath = "//i[@class='material-icons float-xs-left']")
    private WebElement wastebasket;

    @FindBy(xpath = "//span[@class='no-items']")
    private WebElement infoAfterEmptyingBasket;

    public String getProductName() {
        return productName.getText();
    }

    public String getQuantity() {
        return quantityField.getAttribute("value");
    }

    public String getPrice() {
        return price.getText();
    }

    public String getTotalPrice() {
        return totalPrice.getText();
    }

    public void emptyBasket() {
        click(wastebasket);
    }

    public String getInfo() {
        waitToBeVisible(infoAfterEmptyingBasket);
        return infoAfterEmptyingBasket.getText();
    }
}
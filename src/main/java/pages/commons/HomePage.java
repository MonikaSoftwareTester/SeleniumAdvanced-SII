package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@alt='Hummingbird printed t-shirt']")
    private WebElement tshirt;

    @FindBy(xpath = "//h3/a")
    private List<WebElement> popularProducts;


    public String getRandomPopularProduct(){
        String randomProduct = getRandomElement(popularProducts).getText();
        return randomProduct;
    }

    public HomePage chooseTshirt(){
        tshirt.click();
        return this;
    }




}

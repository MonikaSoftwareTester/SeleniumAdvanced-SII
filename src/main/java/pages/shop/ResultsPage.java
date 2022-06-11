package pages.shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.List;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/div/article/div/div[1]/h2/a")
    private WebElement result;

    public String showDisplayedProductName(){
        waitToBeVisible(result);
        return result.getText();
    }



}

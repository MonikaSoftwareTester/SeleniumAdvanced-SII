package base;

import org.testng.annotations.BeforeMethod;
import pages.commons.*;
import pages.user.LoginPage;
import pages.user.RegistrationPage;

import java.util.Calendar;

public class Pages extends TestBase {
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public TopMenuPage topMenuPage;

    public HomePage homePage;

    public CartPage cartPage;

    public ProductPage productPage;

    public ResultsPage resultsPage;


    @BeforeMethod
    public void pagesSetup() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        topMenuPage = new TopMenuPage(driver);

        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        productPage = new ProductPage(driver);
        resultsPage = new ResultsPage(driver);


    }
}

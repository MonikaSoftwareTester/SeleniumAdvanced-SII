package pages.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.LoginPage;

public class TopMenuPage extends BasePage {
    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".user-info a")
    private WebElement goToSignInBtn;

    @FindBy(css = ".account span")
    private WebElement userName;

    @FindBy(xpath = "//*[@name='s']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

    public LoginPage goToSignIn(){
        click(goToSignInBtn);
        return new LoginPage(driver);
    }

    public String getLoggedInUserName(){
        return userName.getText();
    }

    public TopMenuPage setSearchText(String text){
        sendKeys(searchInput, text);
        return this;
    }

    public TopMenuPage searchSubmit(){
        click(searchBtn);
        return this;
    }



}



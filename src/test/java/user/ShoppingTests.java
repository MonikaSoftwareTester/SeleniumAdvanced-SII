import base.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ShoppingTests extends Pages {


    @Test
    public void shouldSearchRandomProduct() {

        String searchedProduct = homePage.getRandomPopularProduct();

        topMenuPage.setSearchText(searchedProduct).searchSubmit();

        String displayedProduct = resultsPage.showDisplayedProductName();

        Assert.assertEquals(displayedProduct, searchedProduct);

    }

    @Test
    public void shouldCheckCartDetails() {

        homePage.chooseTshirt();

        productPage.setQuantity("3").addToCart().goToCheckout();

        Assert.assertEquals(cartPage.getProductName(), "HUMMINGBIRD T-SHIRT");
        Assert.assertEquals(cartPage.getQuantity(), "3");
        Assert.assertEquals(cartPage.getPrice(), "$19.12");
        Assert.assertEquals(cartPage.getTotalPrice(), "$57.36");

        cartPage.emptyBasket();

        Assert.assertEquals(cartPage.getInfo(), "There are no more items in your cart");

    }

}

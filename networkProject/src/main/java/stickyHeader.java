import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class stickyHeader extends BasePage {
    By searchBarLocator = By.id("search");
    By shoppingBagIcon = By.cssSelector(".header__basketMobile > .-shoppingBag.header__icon");
    By headerLogo = By.cssSelector(".col-md-2");
    public stickyHeader(WebDriver driver) {
        super(driver);
    }
    public void searchBox() {
        clicks(searchBarLocator);
        typeInput(searchBarLocator, "jean");
    }
    public void clickShoppingBag() {
        clicks(shoppingBagIcon);
    }
    public void clickHeaderCheckoutLogo() {
        clicks(headerLogo);
    }
}

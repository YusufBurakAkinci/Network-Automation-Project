import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ShoppingBag extends BasePage{
    By sizeInfo = By.cssSelector("div:nth-of-type(2) > .header__basketProductVariation--val");
    By priceInfo = By.cssSelector(".-salePrice.a-product__price");
    By goBasketButton = By.cssSelector(".header__basket--checkout");
    By basketProductRemoveIcon = By.cssSelector(".header__basketProductRemove");
    By emptyBasketText = By.cssSelector(".header__emptyBasketText");


    public ShoppingBag(WebDriver driver) {
        super(driver);
    }
    public void clickRemoveIcon() {
        clicks(basketProductRemoveIcon);
    }
    public void checkEmptyBasketText() {
        checkElementValue(emptyBasketText, "Sepetiniz Henüz Boş");
    }
    public void clickGoToBasketButton() {
        clicks(goBasketButton);
    }
}

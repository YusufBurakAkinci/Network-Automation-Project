import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RemoveCardPopUp extends BasePage{
    By removeCartButton = By.cssSelector(".-black.btn.o-removeCartModal__button");
    public RemoveCardPopUp(WebDriver driver) {
        super(driver);
    }
    public void removeCardModelButton() {
    }
}

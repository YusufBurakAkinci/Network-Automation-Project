
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public  WebElement findSelectedElement(By locator){

        return driver.findElement(locator);
    }
    public List<WebElement> findAllElement(By locator)
    {
        return driver.findElements(locator);

    }
    public void  clicks(By locator)
    {
        findSelectedElement(locator).click();

    }
    public  void  typeInput(By locator, String text){
        driver.findElement(locator).sendKeys(text, Keys.ENTER);


    }
    public Boolean isDisplayed(By locator){
        return findSelectedElement(locator).isDisplayed();
    }
    public void checkUrl(String URL){
        String secondURl = driver.getCurrentUrl();
        Assert.assertEquals(secondURl, URL);

    }
    public void hoverOver(By locator){
        WebElement element = findSelectedElement(locator);
        action.moveToElement.(element).perform();

    }
    public void checkElementValue(By locator, String text){
       String checkedText = findSelectedElement().getText();
       Assert.assertEquals(checkedText, text);
    }
}

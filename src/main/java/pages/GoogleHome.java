package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

    private WebDriver driver;

    @FindBy(name="q")
    public WebElement searchInput;


    public GoogleHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void searchSomething(){

        searchInput.clear();
        searchInput.sendKeys("Hello");


    }


}

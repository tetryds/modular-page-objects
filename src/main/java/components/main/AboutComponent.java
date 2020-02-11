package components.main;

import components.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutComponent extends BaseComponent {
    @FindBy(linkText = "Join Us")
    private WebElement joinButton;

    public AboutComponent(WebDriver driver) {
        super(driver);
    }

    public void clickJoinUs() {
        joinButton.click();
    }
}

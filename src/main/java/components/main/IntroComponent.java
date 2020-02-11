package components.main;

import components.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntroComponent extends BaseComponent {
    @FindBy(linkText = "Join Us")
    private WebElement joinButton;

    public IntroComponent(WebDriver driver) {
        super(driver);
    }

    public void clickJoinUs() {
        joinButton.click();
    }
}

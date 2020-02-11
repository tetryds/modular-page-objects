package components.common;

import components.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterComponent extends BaseComponent {
    @FindBy(linkText = "Join Us")
    private WebElement joinButton;

    public FooterComponent(WebDriver driver) {
        super(driver);
    }

    public void clickJoinUs() {
        joinButton.click();
    }
}

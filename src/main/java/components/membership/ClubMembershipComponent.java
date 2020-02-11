package components.membership;

import components.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClubMembershipComponent extends BaseComponent {
    @FindBy(linkText = "Sign Up")
    private WebElement signUpButton;

    public ClubMembershipComponent(WebDriver driver) {
        super(driver);
    }

    public void clickSignUp() {
        signUpButton.click();
    }
}

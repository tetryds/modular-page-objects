package pages;

import components.membership.MembershipOptionsComponent;
import org.openqa.selenium.WebDriver;

public class MembershipPage extends BasePage {
    public MembershipPage(WebDriver driver) {
        super(driver);
    }

    public MembershipOptionsComponent options() {
        return new MembershipOptionsComponent(driver);
    }
}

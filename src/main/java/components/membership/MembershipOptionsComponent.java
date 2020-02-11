package components.membership;

import components.BaseComponent;
import components.membership.ClubMembershipComponent;
import org.openqa.selenium.WebDriver;

public class MembershipOptionsComponent extends BaseComponent {
    public MembershipOptionsComponent(WebDriver driver) {
        super(driver);
    }

    public ClubMembershipComponent clubMembership() {
        return new ClubMembershipComponent(driver);
    }
}

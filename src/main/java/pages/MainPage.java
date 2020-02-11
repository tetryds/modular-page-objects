package pages;

import components.common.FooterComponent;
import components.common.HeaderComponent;
import components.main.AboutComponent;
import components.main.IntroComponent;
import components.main.SubscriptionComponent;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponent header() {
        return new HeaderComponent(driver);
    }

    public IntroComponent intro() {
        return new IntroComponent(driver);
    }

    public AboutComponent about() {
        return new AboutComponent(driver);
    }

    public SubscriptionComponent subscription() {
        return new SubscriptionComponent(driver);
    }

    public FooterComponent footer() {
        return new FooterComponent(driver);
    }
}

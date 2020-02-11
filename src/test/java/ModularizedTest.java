import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import pages.MembershipPage;

public class ModularizedTest {

    private static WebDriver driver;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ministryoftesting.com/");
    }

    @Test
    public void signUpTest() {
        MainPage main = new MainPage(driver);
        main.intro().clickJoinUs();

        MembershipPage membership = new MembershipPage(driver);
        membership.options().clubMembership().clickSignUp();

        Assertions.assertEquals(driver.getCurrentUrl(),
                "https://www.ministryoftesting.com/account/signup?plan=theclub");
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}

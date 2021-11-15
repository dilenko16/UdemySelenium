import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {


private  final SelenideElement ownerName = $x("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

    @Test
    public void testGoogle(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }




}

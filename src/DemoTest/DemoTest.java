package DemoTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chetan\\Chrome_Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}

}
 
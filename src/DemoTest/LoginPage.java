package DemoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Chetan\\Chrome_Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://3dv.in/");
		driver.findElement(By.id("TxtUserId")).sendKeys("abc");
		driver.findElement(By.id("TxtPassword")).sendKeys("123");
		driver.findElement(By.id("BtnSignIn")).click();
	}

}

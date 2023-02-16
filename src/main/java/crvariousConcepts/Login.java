package crvariousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
static	WebDriver driver;
	
	public static void main(String[] args) {
init();
loginTest();
tearDown();

init();
negLoginTest();
tearDown();

	}

	public static void init() {
		// set up system property
		System.setProperty("webdriver.chrome.driver", "C:\\Workspaces\\FirstJavaProj\\crm\\driver\\chromedriver.exe");
		// object to evoke browser
		 driver = new ChromeDriver();
		// delete cookies
		driver.manage().deleteAllCookies();
		// get to website
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();

	}

	public static void loginTest() {
		// insert userName
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click sign in button
		driver.findElement(By.name("login")).click();

	}

	public static void negLoginTest() {
		// insert userName
		driver.findElement(By.id("username")).sendKeys("demo@techfios123.com");
		// insert password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// click sign in button
		driver.findElement(By.name("login")).click();

	}

	public static void tearDown() {
		// close
		driver.close();

	}

}

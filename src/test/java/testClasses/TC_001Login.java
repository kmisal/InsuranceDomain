package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configureClass.PathConfigure;

public class TC_001Login {

	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\misal\\src\\main\\resources\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(PathConfigure.facebookLogin);
	}

}

package org.facebook;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amar\\eclipse-workspace\\SeleniumBasic\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	String title = driver.getTitle();
	System.out.println(title);
	WebElement txtUsrName = driver.findElement(By.name("email"));
	txtUsrName.sendKeys("Puru");
	WebElement txtPassword = driver.findElement(By.name("pass"));
	txtPassword.sendKeys("12345");
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}
}

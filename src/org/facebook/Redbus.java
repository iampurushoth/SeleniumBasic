package org.facebook;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redbus {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Amar\\eclipse-workspace\\SeleniumBasic\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("Chennai");
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("Madurai");
	
}
}

package org.facebook;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hdfcbank {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Amar\\eclipse-workspace\\SeleniumBasic\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	//Enter Cust ID in HDFC Bank using Frames
	WebElement fra = driver.findElement(By.xpath("//frame[@name='login_page']"));
	driver.switchTo().frame(fra);
	WebElement custid = driver.findElement(By.xpath("//input[@type='text']"));
	custid.sendKeys("98765432");
	WebElement continu = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	continu.click();
}
}

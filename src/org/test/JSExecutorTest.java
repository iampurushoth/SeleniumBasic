package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSExecutorTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Amar\\eclipse-workspace\\SeleniumBasic\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement txtusr = driver.findElement(By.id("email"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Purushoth123@gmail.com')", txtusr);
		WebElement txtpwd = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','123456')",txtpwd);
		WebElement btnlogin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btnlogin);
		Object getusr = js.executeScript("return arguments[0].getAttribute('value')", txtusr);
		System.out.println("Print User Name"+getusr.toString());
	}

}

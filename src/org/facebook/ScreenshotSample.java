package org.facebook;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotSample {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Amar\\eclipse-workspace\\SeleniumBasic\\Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	//String title = driver.getTitle();
	Date d= new Date(0);
	System.out.println(d.toString());
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	TakesScreenshot snap=(TakesScreenshot)driver;
	File from = snap.getScreenshotAs(OutputType.FILE);
	
	//screenshots are saving in the Website title name.png
	
	File to=new File("C:\\Users\\Amar\\eclipse-workspace\\SeleniumBasic\\Screenshots\\"+sdf.format(d)+".png");
	
	FileUtils.copyFile(from, to);
	System.out.println("Done");
	driver.quit();
}
}

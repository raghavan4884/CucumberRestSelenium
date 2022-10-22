package com.test.seleniumframework;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserMethods {
	
	public static WebDriver driver;
	
	public WebDriver getDriver(String browser)
	{
		switch(browser)
		{
		case "chromeIncognito":
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");	
			ChromeOptions c=new ChromeOptions();
			c.addArguments("--incognito");
			
			driver=new ChromeDriver(c);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			
			
			break;
		}
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");			
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			break;
			
		}
		
		case "edge":
		{
			System.setProperty("webdriver.edge.driver","D:\\Softwares\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			break;
		}
		}
		return driver;
	}

	public void openUrl(String url)
	{
		driver.get(url);
	}
	public void navigateUrl(String url)
	{
		driver.navigate().to(url);
	}
	public void navigateBack()
	{
		driver.navigate().back();
	}
	public void navigateForward()
	{
		driver.navigate().forward();
	}
	public String getPgTitle()
	{
		return driver.getTitle();
	}
	public String getPgSource()
	{
		return driver.getPageSource();
	}
	public void closeBrowser()
	{
		driver.close();
		
	}
	public void quitBrowser()
	{
		driver.quit();
	
	}
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	public void minimizeBrowser()
	{
		driver.manage().window().minimize();
	}
	
}

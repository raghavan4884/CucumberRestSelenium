package com.test.seleniumframework;

import java.util.Set;

public class WindowMethods extends BrowserMethods{
	
	public String getWindow()
	{
		return driver.getWindowHandle();
	}
	
	public Set<String> getWindows()
	{
		return driver.getWindowHandles();
	}
	
	public void switchWindow(String windowName)
	{
		driver.switchTo().window(windowName);
	}
	

}

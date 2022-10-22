package com.test.seleniumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.test.utilities.XMLutilites;

public class ElementMethods extends BrowserMethods {
	
	public WebElement getElement(String fileName,String elementName)
	{
		WebElement element=null;
		XMLutilites xu=new XMLutilites();
		String xmlValue=xu.xmlReader(fileName, elementName);
		String xmlArray[]=xmlValue.split("~");
		String locatorType=xmlArray[0];
		String locatorValue=xmlArray[1];
		switch(locatorType)
		{
		case "id":
		{
			element=driver.findElement(By.id(locatorValue));
			break;
			
		}
		case "name":
		{
			element=driver.findElement(By.name(locatorValue));
			break;
		}
		case "className":
		{
			element=driver.findElement(By.className(locatorValue));
			break;
		}
		case "tagName":
		{
			element=driver.findElement(By.tagName(locatorValue));
			break;
		}
		case "linkText":
		{
			element=driver.findElement(By.linkText(locatorValue));
			break;
		}
		case "partialLinkText":
		{
			element=driver.findElement(By.partialLinkText(locatorValue));
			break;
		}
		case "xpath":
		{
			element=driver.findElement(By.xpath(locatorValue));
			break;
		}
		case "cssSelector":
		{
			element=driver.findElement(By.cssSelector(locatorValue));
			break;
		}
		}
		
		return element;
				
	}
	
	public String getElementText(WebElement element)
	{
		return element.getText();
	}
	public String getAttributeValue(WebElement element,String attribute)
	{
		return element.getAttribute(attribute);
	}
	public String getCssProperty(WebElement element,String property)
	{
		return element.getCssValue(property);
	}
	public int getELementWidth(WebElement element)
	{
		Dimension d=element.getSize();
		return d.getWidth();
		
	}
	public int getElementHeight(WebElement element)
	{
		Dimension d=element.getSize();
		return d.getHeight();		
	}
	public int getPointX(WebElement element)
	{
		Point p=element.getLocation();
		return p.getX();
	}
	public int getPointY(WebElement element)
	{
		Point p=element.getLocation();
		return p.getY();
	}

	public void clearText(WebElement element)
	{
		element.clear();
	}
	public void enterValue(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public void enterValue(WebElement element,Keys key)
	{
		
		element.sendKeys(key);
	}
	public boolean verifyDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	public boolean verifyEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	public boolean verifySelected(WebElement element)
	{
		return element.isSelected();
				
	}
	public void clickElement(WebElement element)
	{
		element.click();
	}
	public void submitElement(WebElement element)
	{
		element.submit();
	}
	
	
}

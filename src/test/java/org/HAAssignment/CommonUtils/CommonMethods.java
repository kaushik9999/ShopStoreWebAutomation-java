package org.HAAssignment.CommonUtils;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods {
	
	protected WebDriver driver;
	public void selectDropDown(List<WebElement> list,String text) {
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAttribute("value").equalsIgnoreCase(text)) {
				
				list.get(i).click();
			}
		}
		
		
	}
	
	public void scrollToView(int noOfPixels) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+noOfPixels+")", "");
		Actions act = new Actions(driver);
		act.release().perform();
		
	}
	
	
	public void moveToElement(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public String randomString() {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder(10);
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		
		return output;
	}
	
}

package com.selenium.crawl;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrawlSelenium {

	public static void main(String[] args) {
		 System.setProperty("webdriver.firefox.marionette","../home/pundarika/Downloads/geckodriver.exe");
		    
	        WebDriver driver = new FirefoxDriver();

	        driver.get("http://www.indeed.com/q-*-jobs.html");
	     //   WebElement element = driver.findElement(By.name("q"));
	        String path="id('jobsLink')";
	    
	        String text = driver.findElement(By.xpath(path)).getText();
	        List<WebElement> ds = driver.findElements(By.tagName("a"));
	       

			Iterator<WebElement> iter = ds.iterator();
			
			while(iter.hasNext()) {
			    WebElement we = iter.next();
			System.out.println(we.getText());
			   
			}
	        System.out.println("Page title is: " + text);
	        driver.close();
	}

}

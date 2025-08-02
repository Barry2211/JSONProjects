package com.ipt.brokenlinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/login.php");
		List<WebElement> aTags = driver.findElements(By.xpath("//a"));
		for(WebElement a:aTags) {
			String attribute = a.getAttribute("href");
			if(attribute.contains("https")) {
				try {
					URL url = new URL(attribute);
					URLConnection openConnection = url.openConnection();
					HttpURLConnection http = (HttpURLConnection)openConnection;
					http.connect();
					int code = http.getResponseCode();
					if(code>=400) {
						System.out.println(attribute + " Is a Broken Link");
					}
					else {
						System.out.println(attribute + " Is a Valid Link");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
		
	}
}

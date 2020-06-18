package Week.day2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		
		//Go to Home Page
		driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[1]").click();
		System.out.println("Home Page Title: " + driver.getTitle());
		driver.findElementByXPath("((//a[@class='wp-categories-link maxheight'])[3])/img").click();
		
		//Find where am supposed to go without clicking me?
		String findMe = driver.findElementByXPath("(//a[@link='blue'])[2]").getAttribute("href");
		System.out.println("Directed URL: " + findMe);
		
	    //Verify am I broken?
		String broken = driver.findElementByLinkText("Verify am I broken?").getAttribute("href");	
		Thread.sleep(3000);
		if(broken.contains("error")) {
			System.out.println("URL is Broken");
		}
		else {
			System.out.println("URL is not Broken");
		}
		Thread.sleep(3000);
		
		
		//Go to Home Page (Interact with same link name)
		String h1=driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[1]").getText();
		String h2=driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[2]").getText();
		if(h1.equals(h2)) {
		  driver.findElementByXPath("(//a[contains(text(),'Go to Home Page')])[1]").click();
		  driver.findElementByXPath("((//a[@class='wp-categories-link maxheight'])[3])/img").click();
		  } 
		 System.out.println(h1 + " First link has been clicked"); 
		 
			
		
		  //How many links are available in this page?
		  String countLinks=driver.findElementByLinkText("How many links are available in this page?").getAttribute("href"); 
		  System.out.println(countLinks);
		 
		  driver.get("http://leafground.com/pages/Link.html#");
		  List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		  System.out.println(allLinks.size());
	
    	driver.close();	
		
	}

}

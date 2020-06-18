package Week.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		
		//Click button to travel home page
		driver.findElementByXPath("//button[@id='home']").click();
		System.out.println("Home Page Title: " + driver.getTitle());
		driver.findElementByXPath("((//a[@class='wp-categories-link maxheight'])[2])/img").click();
		
		//Find position of button (x,y)
		System.out.println("Button Location(x,y): " + driver.findElementByXPath("//button[@id='position']").getLocation());
		
		//Find button color
		System.out.println("Button css value: " +driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
		System.out.println("Button Colour: " + driver.findElementByXPath("//button[@id='color']").getAttribute("style"));
		
		//Find the height and width
		System.out.println("Button Size(H,W): " +driver.findElementByXPath("//button[@id='size']").getSize());
		
		driver.close();
	}

}

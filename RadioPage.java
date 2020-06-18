package Week.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		
		//Are you enjoying the classes?
        driver.findElementByXPath("//input[@id='yes']").click();
        
        //Find default selected radio button
        boolean unchecked = driver.findElementByXPath("(//label[@for='Unchecked'])/input").isSelected();
		  if(unchecked==true) {
		  System.out.println("Default selected button is: Unchecked"); } 
		  else {
		  System.out.println("Default selected button is: checked"); }
		 
        
        //Select your age group (Only if choice wasn't selected)
        boolean age= driver.findElementByXPath("(//input[@class='myradio'])[4]").isSelected();
        if(age==true) {
        	System.out.println("Selected Age Group is: 21-40years");
        }
        else {
        	driver.findElementByXPath("(//input[@class='myradio'])[4]").click();
        	System.out.println("Selected Age Group is: 21-40years through click option");
        }
        driver.close();
	}

}

package capstoneproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Flipkartoperation {
	@Test
	public static void FlipKart() throws InterruptedException 
	{
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	PageFactory.initElements(driver, FlipKartHomePageObjects.class);
	FlipKartHomePageObjects.EnterMailID.sendKeys("stephenchelliah555@gmail.com");
	FlipKartHomePageObjects.RequestOTP.click();
	Thread.sleep(5000);
    Scanner sc=new Scanner(System.in);
	
	Integer receivinginputfromtheuser = sc.nextInt();
	String number=receivinginputfromtheuser.toString();
	Thread.sleep(15000);
	FlipKartHomePageObjects.EnterOTP.sendKeys(number);
	Thread.sleep(3000);
	FlipKartHomePageObjects.Verifybutton.click();
	//FlipKartHomePageObjects.notificationcancelling.click();
	FlipKartHomePageObjects.searchbox.sendKeys("mobiles");
	Thread.sleep(3000);
	FlipKartHomePageObjects.submit.click();
	
	
	PageFactory.initElements(driver, Mobilesectionpageobjects.class);
	Thread.sleep(3000);
	Mobilesectionpageobjects.MemoryRAM.click();
	Thread.sleep(2000);
	Mobilesectionpageobjects.selectedmobile.click();
	
       Set<String> setobj=driver.getWindowHandles();
       List<String> listobj=new ArrayList<String>(setobj);
       
    driver.switchTo().window(listobj.get(1));
    
    Mobilesectionpageobjects.GoTOCart.click();
    Thread.sleep(2000);
    Mobilesectionpageobjects.PlaceOrder.click();
    
	
	
	
	}
}

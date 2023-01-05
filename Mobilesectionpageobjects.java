package capstoneproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mobilesectionpageobjects {
	
	@FindBy(xpath="//div[@class='_24_Dny']/ancestor::div[@title='4 GB']")
	public static WebElement MemoryRAM;
	
	
	@FindBy(xpath="//div[text()='REDMI 10 (Caribbean Green, 64 GB)']")
	public static WebElement selectedmobile;
	
	
     @FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
     public static WebElement GoTOCart;
     
     @FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
     public static WebElement PlaceOrder;
	
	
}

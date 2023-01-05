package capstoneproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipKartHomePageObjects {
	
	
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	public static WebElement EnterMailID;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	public static WebElement RequestOTP;
	@FindBy(xpath="//input[@class='_2IX_2- _1WRfas']")
	public static WebElement EnterOTP;
	
	@FindBy(xpath="//button[text()='Verify'][@class='_2KpZ6l _14EHzR _3dESVI']")
	public static WebElement Verifybutton;
	
	@FindBy(xpath="//button[text()='✕']")
	public static WebElement notificationcancelling;
	
	@FindBy(name="q")
    public static WebElement searchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement submit;
	
	
}

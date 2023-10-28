package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Logout 
{
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[2]/a/svg")
	WebElement account;
	@FindBy(xpath="//*[@id=\"MainContent\"]/section/div/div[1]/a")
	WebElement signout;

	   public Logout(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	   
	   
	   public void logout()                          //logout from just watch site
	   {
		  account.click();
		  signout.click();
		   
	   }
}

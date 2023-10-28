package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accountcreation 
{
   WebDriver driver;
   @FindBy(xpath="//*[@id=\"topbar\"]/div/div[3]/div/ul/li[2]/a/span")
   WebElement accounticon;
   @FindBy(xpath="//*[@id=\"login-form\"]/div/a")
   WebElement create;
   @FindBy(id="FirstName")
   WebElement fname;
   @FindBy(id="LastName")
   WebElement lname;
   @FindBy(id="Email")
   WebElement email;
   @FindBy(id="CreatePassword")
   WebElement password;
   @FindBy(xpath="//*[@id=\"create_customer\"]/div[2]/input")
   WebElement submit;
   
   
   public Accountcreation(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   

   public void accountcreation(String f,String l,String e,String p)        //justwatch account creation
   {
	     accounticon.click();
	     create.click();
	     fname.sendKeys(f);
	     lname.sendKeys(l);
	     email.sendKeys(e);
	     password.sendKeys(p);
	     submit.click();
	
   }
   
}

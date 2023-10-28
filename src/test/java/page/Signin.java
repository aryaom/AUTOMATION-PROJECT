package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Signin 
{
   WebDriver driver;
   @FindBy(xpath="//*[@id=\"topbar\"]/div/div[3]/div/ul/li[2]/a/span")
   WebElement accounticon;
   @FindBy(id="CustomerEmail")
   WebElement signinemail;
   @FindBy(id="CustomerPassword")
   WebElement signinpassword;
   @FindBy(xpath="//*[@id=\"customer_login\"]/input[3]")
   WebElement signin;

   
   public Signin(WebDriver driver)                
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   
   public void signin(String es, String ep)             //Justwatch signin
   {
   	   accounticon.click();
   	   signinemail.sendKeys(es);
   	   signinpassword.sendKeys(ep);
   	   signin.click();
   	   driver.navigate().refresh();
   }
}

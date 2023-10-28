package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemremove 
{
   WebDriver driver;
   @FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[1]/a/span[1]")
   WebElement cart;
   @FindBy(xpath="//*[@id=\"shopify-section-template--16805301420280__main\"]/section/div/div/form/div[2]/div[1]/div[3]/div/div[3]/a")
   WebElement remove;
   
   
   public Itemremove(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   public void removeitem()                      //removing 1 item from cart
   {
	   cart.click();
	   remove.click();
   }
}

package page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itemsearch 
{
   WebDriver driver;
   @FindBy(xpath="//*[@id=\"shopify-section-sections--16805296537848__header\"]/header/div[1]/div/div/div/nav/predictive-search/form/button")
   WebElement searchicon;
   @FindBy(xpath="/html/body/div[1]/div[2]/header/div[1]/div/div/div/nav/predictive-search/form/div[1]/input")
   WebElement searchbox;
   public Itemsearch(WebDriver driver) 
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   
   public void search(String s)                     //justwatch item search
   { 
	   searchbox.click();
	   searchbox.sendKeys(s);
	   searchicon.click();
	   JavascriptExecutor j=(JavascriptExecutor)driver;  
	   j.executeScript("window.scrollBy(0,300)");
   }
}

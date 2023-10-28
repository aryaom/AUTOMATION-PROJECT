package page;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class Addcart
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"8126629544184\"]/div/a/div/div/div[1]/img[2]")
	WebElement item1;
	@FindBy(xpath="//*[@id=\"product_form_8126629544184\"]/div[3]/div[2]/button")
	WebElement addcart1;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[1]/a")
	WebElement itemcart;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/announcement-bar/div/div[2]/div/div[3]/div/ul/li[1]/a/span[1]")
	WebElement justwatchcart;
	@FindBy(xpath="//*[@id=\"shopify-section-template--16805301420280__main\"]/section/div/div/form/div[2]/div[2]/div[2]/div[2]/a")
	WebElement continueshopping;
	@FindBy(xpath="//*[@id=\"8119828807928\"]/div/a/div/div/div[1]/img[2]")
	WebElement item2;
	@FindBy(xpath="//*[@id=\"product_form_8119828807928\"]/div[3]/div[2]/button")
	WebElement addcart2;
	
	
	
	public Addcart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void addtitem1()                      //adding first item to cart
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		item1.click();
		addcart1.click();
		Actions a=new Actions(driver);
		a.moveToElement(itemcart);
		itemcart.click();
		justwatchcart.click();
		continueshopping.click();
		driver.navigate().back();
	}
	
	
	public void additem2()                       //adding second item to cart          
	{
		item2.click();
		addcart2.click();
	}

	
}

				


	
	

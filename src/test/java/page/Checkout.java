package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"shopify-section-template--16805301420280__main\"]/section/div/div/form/div[2]/div[2]/div[2]/div[2]/a")
	WebElement checkout;
	@FindBy(id="TextField0")
	WebElement firstname;
	@FindBy(id="TextField1")
	WebElement lastname;
	@FindBy(id="shipping-address1")
	WebElement address;
	@FindBy(id="TextField3")
	WebElement apartment;
	@FindBy(id="TextField4")
	WebElement city;
	@FindBy(id="Select1")
	WebElement state;
	@FindBy(id="TextField5")
	WebElement pincode;
	@FindBy(id="TextField6")
	WebElement phone;
	
	
	
	public Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void checkout(String f,String l,String a,String at,String c,String p,String m)                            //checkout
	{
		checkout.click();
		firstname.sendKeys(f);
		lastname.sendKeys(l);
		address.sendKeys(a);
		apartment.sendKeys(at);
		city.sendKeys(c);
		Select s=new Select(state);
		s.selectByValue("KL");
		pincode.sendKeys(p);
		phone.sendKeys(m);
		driver.navigate().back();		
	}
}

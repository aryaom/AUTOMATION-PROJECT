package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.Accountcreation;
import page.Addcart;
import page.Checkout;
import page.Itemremove;
import page.Itemsearch;
import page.Logout;
import page.Signin;

public class Justwatchtest 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		driver=new ChromeDriver(c);
		driver.get("https://www.justwatches.com");                 //Loading just watch site
        driver.manage().window().maximize();
		driver.navigate().refresh();
		
	}
	@Test
	public void justwatchtest() throws Exception
	{
		 Accountcreation ac=new Accountcreation(driver);
		 //ac.accountcreation("ARYA","NARAYANAN","aruzzzaaa@gmail.com","Arya@1999");
		 Signin s=new Signin(driver);
		 s.signin("aruzzzaaa@gmail.com","Aryaom@1999");
		 Itemsearch is=new Itemsearch(driver);
		 is.search("women");
		 Addcart a=new Addcart(driver);
		 a.addtitem1();
		 a.additem2();
		 Itemremove ir=new Itemremove(driver);
		 ir.removeitem();
		 Checkout c=new Checkout(driver);
		 c.checkout("ARYA","NARAYANAN","Sindooram","Uthiyoor","Mattannur","670702","8281590767");
		 Logout l=new Logout(driver);
		 l.logout();
		
		  
	}
	
}


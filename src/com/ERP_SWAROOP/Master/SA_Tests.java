package com.ERP_SWAROOP.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ERP_SWAROOP.Master.POM_LoginPage.loginpage;

public class SA_Tests
{

	@Test
public void exe()
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	
	loginpage LP=PageFactory.initElements(driver,loginpage.class);
	LP.Adminlogin("admin","master");
	
	//Shomepage HP=PageFactory.initElements(driver,Shomepage.class);
   //HP.Sitems();
  // HP.Suppliers();
   //HP.purchases();
}
	
	
}

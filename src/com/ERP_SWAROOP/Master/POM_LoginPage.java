package com.ERP_SWAROOP.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_LoginPage 
{
	public class loginpage 
	{
	@FindBy (id="btnreset")
	WebElement Reset;

	@FindBy (id="username")
	WebElement UN;

	@FindBy (id="password")
	WebElement Password;

	@FindBy (id="btnsubmit")
	WebElement Login;

	public void Adminlogin(String Uname,String Pwd)
	{
		Reset.click();
		UN.sendKeys(Uname);
		Password.sendKeys(Pwd);
		Login.click();
	}
	}

	
}

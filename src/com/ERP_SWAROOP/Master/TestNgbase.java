package com.ERP_SWAROOP.Master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNgbase
{

	public StockAcc_Master  SL=new StockAcc_Master();
	 
	  @BeforeTest
	  public void AdminLogin() 
	  {
	  SL.Adminlogin("admin","master");
	  }

	  @AfterTest
	  public void logout() 
	  {
	  SL.Logout();
	  }

	  @BeforeSuite
	  public void OpenApp() throws IOException
	  {
	 // SL=new StockAcc_Master();
	  SL.openApp("http://webapp.qedgetech.com");
	  }

	  @AfterSuite
	  public void close() 
	  {
	  SL.Close();
	  }
	

}

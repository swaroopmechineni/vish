package com.ERP_SWAROOP.Master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class StockAcc_Master 

	
	{

	public static List<WebElement> okbs;
	public static Properties PR;
	public static FileInputStream fis;
	public static  WebDriver driver;
	public static  String Eval;
	public static String Aval;
	

	    public String openApp(String URL) throws IOException
	    {
	    	
	    PR=new Properties();
	    fis=new FileInputStream("D:\\Swaroop\\ERP_swaroop\\src\\com\\ERP_SWAROOP\\Master\\Rep.properties"); 
	    PR.load(fis);   
	    
	    Eval="Login";
	    driver=new FirefoxDriver();
	    driver.get(URL);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    Aval=driver.findElement(By.id("btnsubmit")).getText();
	    if (Eval.equalsIgnoreCase(Aval)) 
	    {
	    	return "pass";	
		}
	    else
	    {
	    	return "fail";
	    }
	
	
	    }
	    public String Adminlogin(String Un,String Pwd)
	    {
	    	{
	    	    	Eval="Administrator";
	    	    	driver.findElement(By.id(PR.getProperty("RB"))).click();
	    	    	driver.findElement(By.id(PR.getProperty("Un"))).sendKeys(Un);
	    	    	driver.findElement(By.id(PR.getProperty("Pwd"))).sendKeys(Pwd);
	    	    	driver.findElement(By.id(PR.getProperty("LB"))).click();
	    	    	
	    	    	Aval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	    	    	
	    	    	if (Eval.equalsIgnoreCase(Aval)) 
	    	        {
	    	    		
	    	    		//System.out.println("Login Pass");
	    	        	return "pass";	
	    	    	}
	    	        else
	    	        {
	    	        	
	    	        	//System.out.println("Login Fail");
	    	        	return "fail";
	    	        }
	    	        
	    	    }
	    	    }
	    public String Suppliers(String name,String add,String city,String country,String cnctper,String phno,String email,String mob,String notes ) throws InterruptedException
	    {
	    	driver.findElement(By.linkText("Suppliers")).click();
			driver.findElement(By.xpath("//div[@id='ewContentColumn']/div[@class='panel panel-default ewGrid']/div[@class='panel-heading ewGridUpperPanel']/div[@class='ewListOtherOptions']/div[@class='ewAddEditOption ewListOptionSeparator']/div[@class='btn-group ewButtonGroup']/a[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();	
			Thread.sleep(2000);
	    	driver.findElement(By.name("x_Supplier_Name")).sendKeys(name);
			driver.findElement(By.name("x_Address")).sendKeys(add);
			driver.findElement(By.name("x_City")).sendKeys(city);
			driver.findElement(By.name("x_Country")).sendKeys(country);
			driver.findElement(By.name("x_Contact_Person")).sendKeys(cnctper);
			driver.findElement(By.name("x_Phone_Number")).sendKeys(phno);
			driver.findElement(By.name("x__Email")).sendKeys(email);
			driver.findElement(By.name("x_Mobile_Number")).sendKeys(mob);
			driver.findElement(By.name("x_Notes")).sendKeys(notes);
			driver.findElement(By.name("btnAction")).click();
			driver.findElement(By.xpath("//button[contains(.,'OK!')]")).click();
			driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
			
			if (Eval.equalsIgnoreCase(Aval)) 
	        {
	    		
	    		//System.out.println("Login Pass");
	        	return "pass";	
	    	}
	        else
	        {
	        	
	        	//System.out.println("Login Fail");
	        	return "fail";
	    }
	    
	    }
	    public String  StockCategories(String name) throws InterruptedException
	   
	    {
	  
	    	Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
        
	    driver.findElement(By.linkText("Stock Categories")).click();
	    driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("x_Category_Name")).sendKeys("abc");
	    driver.findElement(By.name("btnAction")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(.,'OK!')]")).click();
	    driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	    Thread.sleep(2000);
	    
	   
		if (Eval.equalsIgnoreCase(Aval)) 
	        {
	    		
	    		//System.out.println("Login Pass");
	        	return "pass";	
	    	}
	        else
	        {
	        	
	        	//System.out.println("Login Fail");
	        	return "fail";
	    }
	    }
		    
	    public String UOM(String UOM_id,String UOM_description)
		{
			  driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
		      Actions act= new Actions(driver);
		      act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")));
		      act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")));
		      act.click();
		      act.build().perform();
		      driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		      driver.findElement(By.id("x_UOM_ID")).sendKeys(UOM_id);
		      driver.findElement(By.id("x_UOM_Description")).sendKeys(UOM_description);
		      driver.findElement(By.id("btnAction")).click();
		      driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		      driver.findElement(By.xpath(".//*[@class='ajs-button btn btn-primary']")).click();
		      
		      Eval="Add succeeded";
		      Aval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
		      if (Eval.equalsIgnoreCase(Aval)) 
		      {
		    	 //System.out.println(Eval+ "is equal to "+ Aval+ ", Test pass"); 
		    	  return "Pass";
			  } 
		      else
		      {
		    	  return "fail";
			  }
		}
		      public String Logout()
		  	{
		  		driver.findElement(By.id("logout")).click();
		  		
		  		
		  	   //okbs=driver.findElements(By.xpath(pr.getProperty("LOCok_xpath")));
		  		okbs=driver.findElements(By.xpath(PR.getProperty("LOCok_xpath")));
		  	    
		  	    for (int i = 0; i<okbs.size(); i++) 
		  	    {
		  			if (okbs.get(i).getText().equalsIgnoreCase("OK!")) 
		  			{
		  				okbs.get(i).click();
		  				break;
		  			}
		  		}
		  		
		  		
		  		Eval="Login";
		  		Aval=driver.findElement(By.id(PR.getProperty("LB_id"))).getText();
		  	    
		  	    if (Eval.equalsIgnoreCase(Aval)) 
		  	    {
		  	    	return "pass";	
		  		}
		  	    else
		  	    {
		  	    	return "fail";
		  	    }
		  	}
		  	
		  	public void Close()
		  	{
		  		driver.close();
		  		
		  	}


		}
	


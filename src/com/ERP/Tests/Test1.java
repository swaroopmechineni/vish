package com.ERP.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com/login.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Suppliers")).click();
		driver.findElement(By.xpath("//div[@id='ewContentColumn']/div[@class='panel panel-default ewGrid']/div[@class='panel-heading ewGridUpperPanel']/div[@class='ewListOtherOptions']/div[@class='ewAddEditOption ewListOptionSeparator']/div[@class='btn-group ewButtonGroup']/a[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.name("x_Supplier_Name")).sendKeys("apollo");
		driver.findElement(By.name("x_Address")).sendKeys("Ameerpet");
		driver.findElement(By.name("x_City")).sendKeys("Hyderabad");
		driver.findElement(By.name("x_Country")).sendKeys("India");
		driver.findElement(By.name("x_Contact_Person")).sendKeys("Ross");
		driver.findElement(By.name("x_Phone_Number")).sendKeys("4654646");
		driver.findElement(By.name("x__Email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("x_Mobile_Number")).sendKeys("9999999999");
		driver.findElement(By.name("x_Notes")).sendKeys("Orasore");
		driver.findElement(By.name("btnAction")).click();
		driver.findElement(By.xpath("//button[contains(.,'OK!')]")).click();
		driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
		
		

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
	    

        Actions a1=new Actions(driver);
        a1.moveToElement(driver.findElement(By.linkText("Stock Items"))).build().perform();
        
        driver.findElement(By.linkText("Unit of Measurement")).click();
        driver.findElement(By.xpath("//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("x_UOM_ID")).sendKeys("99999");
        driver.findElement(By.name("x_UOM_Description")).sendKeys("sag5");
        driver.findElement(By.name("btnAction")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(.,'OK!')]")).click();
        driver.findElement(By.xpath("//button[@class='ajs-button btn btn-primary']")).click();
	
      //Purchases
	    driver.findElement(By.linkText("Purchases")).click();
	    driver.findElement(By.xpath("//div[@id='ewContentColumn']/div[@class='panel panel-default ewGrid']/div[@class='panel-heading ewGridUpperPanel']/div[@class='ewListOtherOptions']/div[@class='ewAddEditOption ewListOptionSeparator']/div[@class='btn-group ewButtonGroup']/a[@class='btn btn-default ewAddEdit ewAdd btn-sm']")).click();
	    Thread.sleep(2000);
        driver.findElement(By.id("x_Supplier_ID")).click();
        
        
        
        
	}   
	
	

}

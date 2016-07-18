package com.ERP_SWAROOP.Master;

import java.io.IOException;

public class Methodcalling {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		StockAcc_Master x=new StockAcc_Master();
		
	String re=x.openApp("http://webapp.qedgetech.com");
	System.out.println(re);
	
	
	String re1=x.Adminlogin("admin","master");
	System.out.println(re1);
	
	

	String re2=x.Suppliers("apollo","Ameerpet","Hyderabad","India","Ross","4654646","abc@gmail.com","9999999999","Orasore");
	System.out.println(re2);

	

	String re3=x.StockCategories("abc");
	System.out.println(re3);
	
	
	String re4=x.UOM("9999","sag5");
	System.out.println(re4);
	
	}
	

}


package com.ERP_SWAROOP.Master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SAtcs extends TestNgbase
{
	@Test(dataProvider="Udata")
	public void UOM(String uid,String udesc)
{
	SL.UOM(uid,udesc);
}
@Test
public void Sc() throws InterruptedException
{
SL.StockCategories("mobileACC11");
}
@DataProvider

  public Object[][] Udata()
{
	Object[][] Obj=new Object[3][2];
	
	Obj[0][0]="1001gb";
	Obj[0][1]="testng1";
			

	Obj[1][0]="1002gb";
	Obj[1][1]="testng2";
	

	Obj[2][0]="1003gb";
	Obj[2][1]="testng2";
			return Obj;
	}
}

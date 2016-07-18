package com.ERP_SWAROOP.Tests;

import java.io.Closeable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ERP_SWAROOP.Master.StockAcc_Master;

public class Lib 
{

	public static void main(String[] args) throws IOException
	{
		
		       StockAcc_Master SL=new StockAcc_Master ();
				String res=SL.openApp("http://webapp.qedgetech.com/login.php");
		        System.out.println(res);
		       res=SL.Adminlogin("admin","master");
		       System.out.println(res);
		       
		       //test data path
		       FileInputStream fis=new FileInputStream("D:\\Swaroop\\ERP_swaroop\\src\\com\\ERP_SWAROOP\\Tests\\testdata.xlsx");
		       
		       //create work book
		       
		        XSSFWorkbook WB=new XSSFWorkbook(fis);
		        XSSFSheet WS=WB.getSheet("UOM");
		       int RC=WS.getLastRowNum();
		    		   System.out.println(RC);
		    		   for (int i=1; i<=RC; i++) 
		    		   {
						XSSFRow WR=WS.getRow(i);
						XSSFCell WC1=WR.getCell(0);
						XSSFCell WC2=WR.getCell(1);
						XSSFCell WC3=WR.createCell(2);
						
						String UOM_id=WC1.getStringCellValue();
						String UOM_description=WC2.getStringCellValue();
						
						 res=SL.UOM(UOM_id,UOM_description);
				           
				           System.out.println(res);
				           
				           WC3.setCellValue(res);
		    			   
		    			   
					}
		        
		       FileOutputStream fos=new FileOutputStream("D:\\Swaroop\\ERP_swaroop\\src\\com\\ERP_SWAROOP\\Results\\uomres.xlsx");
		       WB.write(fos);
		       WB.close();
	}
}

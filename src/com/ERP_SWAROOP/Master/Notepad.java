package com.ERP_SWAROOP.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad 
{

	public static void main(String[] args) throws IOException 
	{
		StockAcc_Master  SL=new StockAcc_Master();
		String res=SL.openApp("http://webapp.qedgetech.com");
        System.out.println(res);
       res=SL.Adminlogin("admin","master");
       System.out.println(res);
		
		String Fpath="D:\\Swaroop\\ERP_swaroop\\src\\com\\ERP_SWAROOP\\Tests\\Notepad.txt";
		String Rpath="D:\\Swaroop\\ERP_swaroop\\src\\com\\ERP_SWAROOP\\Results\\UOMResults.txt";
		String SD;
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);

        FileWriter FW=new FileWriter(Rpath);
        BufferedWriter BW=new BufferedWriter(FW);
        BW.write(Sread+"$$$$"+"Results");
        BW.newLine();
        
        while ((SD=BR.readLine())!=null)
        {
   		System.out.println(SD);
   		String[] SR=SD.split("####");
   		String UID=SR[0];
   		System.out.println(UID);
   		String UDESC=SR[1];
   		System.out.println(UDESC);
   		
   		res=SL.UOM(UID,UDESC);
		System.out.println(res);
   		
   		BW.write(UID+"@@@@"+UDESC+"@@@@"+res);
   		BW.newLine();
   		
   	}
            BW.close();
            BR.close();
        
	
	}

}

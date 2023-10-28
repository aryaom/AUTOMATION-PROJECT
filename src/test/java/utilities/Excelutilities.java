package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities 
{
	public static String getCellValue(String x,String s,int r,int c)
	{
		try
		{
			FileInputStream f=new FileInputStream(x);
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFCell cell=wb.getSheet(s).getRow(r).getCell(c);
			if(cell.getCellType()==org.apache.poi.ss.usermodel.CellType.STRING)
			{
				return cell.getStringCellValue();			
			}
		else
		{
			double v=cell.getNumericCellValue();
			int val=(int)v;
			return String.valueOf(val);
			
		}
		
	}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getRowCount(String x,String s) throws Exception
	{
		try
		{
		
		FileInputStream f=new FileInputStream(x);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		int row = wb.getSheet(s).getLastRowNum();
		return row;
		}
		catch(Exception e)
		{
			return 0;
		}
}
}
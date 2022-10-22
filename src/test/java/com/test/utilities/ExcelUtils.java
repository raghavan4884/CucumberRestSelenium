package com.test.utilities;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {
	
	public HSSFWorkbook workbook;
	public HSSFSheet sheet;
	public HSSFCell cell;
	
	public HSSFSheet openSheet(String fileName,String sheetName)
	{
		File file=new File(fileName);
		try
		{
		FileInputStream fis=new FileInputStream(fileName);
		workbook=new HSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sheet;
	}
	public HSSFSheet openSheet(String fileName,int sheetNumber)
	{
		File file=new File(fileName);
		try
		{
			FileInputStream fis=new FileInputStream(fileName);
			workbook=new HSSFWorkbook(fis);
			sheet=workbook.getSheetAt(sheetNumber);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return sheet;
	}

	public int getTotalRows(String fileName,String sheetName)
	{
		int totalRows=openSheet(fileName,sheetName).getPhysicalNumberOfRows();
		return totalRows;
	}
	public int getTotalRows(String fileName,int sheetNumber)
	{
		int totalRows=openSheet(fileName,sheetNumber).getPhysicalNumberOfRows();
		return totalRows;
	}

	public String getStrValue(String fileName,String sheetName,int row,int col)
	{
		String value=openSheet(fileName,sheetName).getRow(row).getCell(col).getStringCellValue();
		return value;
	}
	public String getStrValue(String fileName,int sheetNumber,int row,int col)
	{
		String value=openSheet(fileName,sheetNumber).getRow(row).getCell(col).getStringCellValue();
		return value;
		
	}
	public int getIntValue(String fileName,String sheetName,int row,int col)
	{
		int value=(int) openSheet(fileName,sheetName).getRow(row).getCell(col).getNumericCellValue();
		return value;
		
	}
	public int getIntValue(String fileName,int sheetNumber,int row,int col)
	{
		int value=(int) openSheet(fileName,sheetNumber).getRow(row).getCell(col).getNumericCellValue();
		return value;
		
	}
	public void writeToSheet(String fileName,String sheetName,int row,int col,String message)
	{
		try
		{
			File file=new File(fileName);
			FileOutputStream fos=new FileOutputStream(file);
			cell=openSheet(fileName,sheetName).getRow(row).createCell(col);
			cell.setCellValue(message);
			workbook.write(fos);
			fos.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}



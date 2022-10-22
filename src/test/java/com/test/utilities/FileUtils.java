package com.test.utilities;

import java.io.*;

public class FileUtils {

	public void writeToFile(String fileName,String message)
	{
		File file=new File(fileName);
		try
		{
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			pw.println(message);
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String readFromFile(String fileName)
	{
		File file=new File(fileName);
		String fileValue=null;
		String value=null;
		try
		{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			while((fileValue=br.readLine())!=null)
			{
				value=fileValue;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return value;
	}
}

package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import constants.FileConstants;

public class FileUtils {
	
	public static String readHomePageTestData(String testData) throws IOException
	{
		
		FileInputStream f=new FileInputStream(FileConstants.HOMEPAGETEST_DATA_FILE_PATH);
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(testData);
		
	}
	
	public static String readCategoryPageTestData(String testData) throws IOException
	{
		
		FileInputStream f=new FileInputStream(FileConstants.CATEGORYPAGETEST_DATA_FILE_PATH);
		Properties p=new Properties();
		p.load(f);
		return p.getProperty(testData);
		
	}

}

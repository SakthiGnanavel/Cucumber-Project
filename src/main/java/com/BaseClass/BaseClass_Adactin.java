package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_Adactin {
	
	public static WebDriver driver;
	
	public static String value;
	
	public static WebDriver get_driver(String browsertype) {

		if (browsertype.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browsertype.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

		return driver;
	}
	public static void getUrl(String url) {

		driver.get(url);
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void inputvalue(WebElement element , String name) {
		element.sendKeys(name);
	}
	
	public static void select(WebElement element, String type, String v) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("value")){
			s.selectByValue(v);
		} else if (type.equalsIgnoreCase("Text")){
			s.selectByVisibleText(v);
		}
		}
	
	public static void javaScript() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)");
	
	
	
	}
	public static void implicitwait() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void screenshot(String path) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

		File fl = new File(path);
		
		FileUtils.copyFile(screenshotAs, fl);
	}
	
public static  String data(String path , int rowindex, int columnindex) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(1);
		
		Row row = sheetAt.getRow(rowindex);
		
		Cell cell = row.getCell(columnindex);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			 value = cell.getStringCellValue();
		}
		else if (cellType.equals(CellType.NUMERIC)) {
			 double numericCellValue = cell.getNumericCellValue();
			 
			 value = Double.toString(numericCellValue);
		
		}
		return path;
	}
	
	}
	


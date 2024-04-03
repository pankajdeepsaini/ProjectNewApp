package TestCaseFile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import UtilitiesFIle.ReadConfiguration;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static Logger log;
	
	ReadConfiguration rc = new ReadConfiguration();
	
	
	String Browser = rc.getbrowser();
	String URL = rc.geturl();
	@BeforeTest
    public void browserlaunch() {
    	
    	
    	
    	switch(Browser.toLowerCase()) {
    	case"edge":
    		driver= new EdgeDriver();
    		driver.manage().window().maximize();
    		break;
    	case"chrome":
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		break;
    	case"firefox":
    		driver = new FirefoxDriver();
    		driver.manage().window().maximize();
    		break;
    	
    	default:
    	    driver = null;
    	    break;
    	}
    	log = LogManager.getLogger("AppTestBehaviour");
    		
    }
    public void ScreenShot() throws Exception {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File f1 = new File("C:\\Users\\panks\\Contacts\\FirstCryProjectDDF\\Screenshot\\image.png");
    	FileUtils.copyFile(source, f1);
    	
    }
    @AfterTest
    public void close() throws Exception {
    	ScreenShot();
    }
}

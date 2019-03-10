package testBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setrup {
	//driver is static variable4
	public static WebDriver driver;
	public void openBrowser(){
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://akuteegapadu.com/student");
		
	}
	public void screenShot(String img) throws IOException{
	File images=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(images, new File(img));	
		
	}
   
}

package test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.EdmodoStudentpage;
import testBase.Setrup;

public class EdmodoStudentLoginpagetest extends Setrup {
	EdmodoStudentpage test;
	
	@BeforeMethod
	public void open(){
		openBrowser();
		test=PageFactory.initElements(driver, EdmodoStudentpage.class);
	}
	@Test
	public void login() throws Exception{
		boolean pass=test.student();
		Assert.assertTrue(pass);
		test.studenlogin("vamsi@edmodo.in", "123456");
		Thread.sleep(3000);
		screenShot("C:/Users/JV/Desktop/Workspace/EdmodoStudent/sreenshotoutput/tc1.png");
	}
	@Test
	public void example(){
		System.out.println("vidya Ocean");
	}
	@Test
	public void example2(){
		System.out.println("vidya ");
	}

	@AfterMethod
	public void close(){
		driver.close();
	}
}

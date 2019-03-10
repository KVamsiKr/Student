package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Setrup;

public class EdmodoStudentpage extends Setrup {
	@FindBy(xpath="//*[text()='Student Login']")WebElement studentL;
	@FindBy(xpath="//input[@type='text']")WebElement uname;
	@FindBy(xpath="//input[@type='password']")WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
    public EdmodoStudentpage() {
    	PageFactory.initElements(driver, this);
    	}
    public boolean student(){
        boolean	x=studentL.isDisplayed();
        studentL.click();
    	return x;
    	 }
    public void studenlogin(String un,String pass) throws Exception{
    	uname.sendKeys(un);
    	pwd.sendKeys(pass);
    	Thread.sleep(5000);
    	signin.click();
    	
    }
	

}

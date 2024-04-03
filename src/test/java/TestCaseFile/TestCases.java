package TestCaseFile;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageObjectModel.LoginCancelOrderLogout;
import PageObjectModel.LoginOrderLogout;

@Listeners(UtilitiesFIle.ExtentWithListener.class)
public class TestCases extends BaseClass {
  
	
@Test(priority=1)
public void Loginorder() throws Exception {
	driver.get(URL);

	JavascriptExecutor js = (JavascriptExecutor)driver;
	LoginOrderLogout pom = new LoginOrderLogout(driver);

Actions act = new Actions(driver);


   
pom.searchweb("firstcry");
act.sendKeys(Keys.ENTER).build().perform();

pom.clickonlink();
    pom.clickonlogin();

    pom.Entermobileno("9675744813");
    Thread.sleep(2000);
    pom.contine();
   
    pom.firtotp("0 ");
  
    pom.secondotp("9 ");
   
    pom.thirdotp(" 9"); 
    
    pom.fourotp(" 1");
   
    pom.fiveotp("0");
   
    pom.sixotp(" 0 ");
  
    pom.submit();
  
    pom.searchclick();
   
    pom.searchboxsendkeys("Bags");
    act.sendKeys(Keys.ENTER).build().perform();
    pom.addtocart();
   
    pom.seecart();
  
    pom.showpayment();

    pom.clickCOD();
   
    pom.confirmCOD();
    
    Thread.sleep(5000);
    pom.viewdetails();
    
    Thread.sleep(3000);
    pom.reload1();
    
    Thread.sleep(6000);
    pom.reload2();
    
    Thread.sleep(9000);
    pom.reload3();
    
//    Thread.sleep(4000);
//    js.executeScript("window.scrollTo(0,650)");
//    
//    Thread.sleep(5000);
//    pom.logout();
    
    Thread.sleep(2000);
    pom.Cancelclick();
    
	Thread.sleep(1000);
    WebElement a1=driver.findElement(By.xpath( "//select[@ id='cprdCancelReason']" ));
    act.click(a1).build().perform();
	Select s1 = new Select(a1);
	s1.selectByVisibleText("Cancelling due to extra charges");
	
	Thread.sleep(2000);
	WebElement a2= driver.findElement(By.xpath(" //select[@id='cancelCPrdSubReason']" ));
	act.click(a2).build().perform();
	Select s2 = new Select(a2);
	s2.selectByValue("50");
    
    pom.nextbutton();
    
    pom.confirmbutton();
    
    Thread.sleep(2000);
    pom.crossclick();
    
    Thread.sleep(4000);
    js.executeScript("window.scrollTo(0,650)");
    
    Thread.sleep(5000);
    pom.Clogout();
    
    
    Thread.sleep(6000);
    driver.close();
    
    

}


//@Test(priority=2)
//public void LoginCancelorder() throws Exception {
//	Thread.sleep(8000);
//	driver.get(URL);
//	Actions act = new Actions(driver);
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	
//	 LoginCancelOrderLogout LCO = new  LoginCancelOrderLogout(driver);
//	 
//	 
//	 LCO.searchweb("firstcry");
//	    act.sendKeys(Keys.ENTER).build().perform();
//	   
//	    LCO.clickonlink();
//	
//  
//	    LCO.clickonlogin();
//
//	    LCO.Entermobileno("9675744813");
//	    Thread.sleep(2000);
//	    LCO.contine();
//	   
//	    LCO.firtotp("4 ");
//	  
//	    LCO.secondotp("7 ");
//	   
//	    LCO.thirdotp(" 5"); 
//	    
//	    LCO.fourotp(" 4");
//	   
//	    LCO.fiveotp("5");
//	   
//	    LCO.sixotp(" 7 ");
//	  
//	    LCO.submit();
//	    
//	    LCO.myaccount();
//	    
//	    Thread.sleep(2000);
//	    LCO.orderhistory();
//	    
//	    Thread.sleep(2000);
//	    LCO.clickorder();
//	    
//	    Thread.sleep(2000);
//	    LCO.Cancelclick();
//	    
//		Thread.sleep(1000);
//	    WebElement a1=driver.findElement(By.xpath( "//select[@ id='cprdCancelReason']" ));
//	    act.click(a1).build().perform();
//		Select s1 = new Select(a1);
//		s1.selectByVisibleText("Cancelling due to extra charges");
//		
//		Thread.sleep(2000);
//		WebElement a2= driver.findElement(By.xpath(" //select[@id='cancelCPrdSubReason']" ));
//		act.click(a2).build().perform();
//		Select s2 = new Select(a2);
//		s2.selectByValue("50");
//	    
//	    LCO.nextbutton();
//	    
//	    LCO.confirmbutton();
//	    Thread.sleep(2000);
//	    LCO.crossclick();
//	    
//	    Thread.sleep(4000);
//	    js.executeScript("window.scrollTo(0,650)");
//	    
//	    Thread.sleep(5000);
//	    LCO.Clogout();
//	    
//	    
//	    Thread.sleep(6000);
//	    driver.close();
//	
//} 
}

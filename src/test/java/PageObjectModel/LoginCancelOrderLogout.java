package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCancelOrderLogout {
	WebDriver driver;
	public  LoginCancelOrderLogout(WebDriver D) {
		
    driver =D;
    PageFactory.initElements(D, this);
   
}
	
@FindBy(id="APjFqb" )WebElement b1;
	
	@FindBy(xpath="//span [@class='x2VHCd OSrXXb ob9lvb']")WebElement b2;
	
	
	@FindBy(xpath="//span [@class='anch poplogin_main poplogin R12_61']" )WebElement b3;
	@FindBy(xpath="//input[@placeholder='Enter your Email-Id or Mobile No.*']" )WebElement b4;
	@FindBy(xpath="//div [@class='loginSignup_continueBtn_block bg_ff btn_fill']" )WebElement b5;
	@FindBy(id="notp0" )WebElement b6;
	@FindBy(id="notp1" )WebElement b7;
	@FindBy(id="notp2")WebElement b8;
	@FindBy(id="notp3" )WebElement b9; 
	@FindBy(id="notp4" )WebElement b10;
	@FindBy(id="notp5") WebElement b11;
	@FindBy(xpath="//div [@class='loginSignup_submitOtpBtn_block bg_ff btn_fill' ]" )WebElement b12;
	
	@FindBy(xpath="//span [@class='anch myacc_2']")WebElement b13;
	
	@FindBy(linkText="Order History")WebElement b14;
	
	@FindBy(xpath="//div [@class='product_img f_left']" )WebElement b15;
	
	@FindBy(xpath="//li[@cancel-level='prd-cancel']" )WebElement b16;
	//
	@FindBy(xpath= "//select[@ id='cprdCancelReason']" )WebElement b17;
	@FindBy(xpath=" //select[@id='cancelCPrdSubReason']" )WebElement b18;
	//
	@FindBy(xpath="//span [@class='upprCase next-btn  cprd-nxtbtn cancelButtons']" )WebElement b19;
	@FindBy(xpath="//span[@ class='upprCase next-btn  cprd-nxtbtn confirm-btn cancelButtons']" )WebElement b20;
	@FindBy(xpath="//div [@id='cancelOverlayclose']" )WebElement b21;
	
	@FindBy(xpath="//a[@onclick='SiteLogout1()']" )WebElement b22;
	
	public void searchweb(String text) {
		b1.sendKeys(text);
	}
	public void clickonlink() {
		b2.click();
	}
	
	
	
    public void clickonlogin() {
		b3.click();
	}
    public void Entermobileno(String no) {
		b4.sendKeys(no);
	}
    public void contine() {
		b5.click();
	}
    public void firtotp(String one) {
		b6.sendKeys(one);
	}
    public void secondotp(String two) {
	b7.sendKeys(two);
}
    public void thirdotp(String three) {
	b8.sendKeys(three);
}
    public void fourotp(String four) {
	b9.sendKeys(four);
}
    public void fiveotp(String five) {
	b10.sendKeys(five);
}
    public void sixotp(String six) {
	b11.sendKeys(six);
}
    public void  submit() {
		b12.click();
	}
    
    public void myaccount() {
    	b13.click();
    }
    public void orderhistory() {
    	b14.click();
    }
    public void clickorder() {
    	b15.click();
    }
    public void Cancelclick() {
    	b16.click();
    }
 
    public void nextbutton() {
    	b19.click();
    }
    public void confirmbutton() {
    	b20.click();
    }
    public void crossclick() {
    	b21.click();
    }
    public void Clogout() {
    	b22.click();
    }

}

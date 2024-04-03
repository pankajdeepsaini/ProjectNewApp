package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrderLogout {

	
	WebDriver driver;
	public LoginOrderLogout(WebDriver D) {
		driver = D;
		PageFactory.initElements(D, this);
	
	}
	
@FindBy(id="APjFqb" )WebElement a1;
	@FindBy(xpath="//span [@class='x2VHCd OSrXXb ob9lvb']")WebElement a2;
	
	@FindBy(xpath="//span [@class='anch poplogin_main poplogin R12_61']" )WebElement a3;
	@FindBy(xpath="//input[@placeholder='Enter your Email-Id or Mobile No.*']" )WebElement a4;
	@FindBy(xpath="//div [@class='loginSignup_continueBtn_block bg_ff btn_fill']" )WebElement a5;
	@FindBy(id="notp0" )WebElement a6;
	@FindBy(id="notp1" )WebElement a7;
	@FindBy(id="notp2")WebElement a8;
	@FindBy(id="notp3" )WebElement a9; 
	@FindBy(id="notp4" )WebElement a10;
	@FindBy(id="notp5") WebElement a11;
	@FindBy(xpath="//div [@class='loginSignup_submitOtpBtn_block bg_ff btn_fill' ]" )WebElement a12;
	
	@FindBy(xpath="//input [@id='search_box']" )WebElement a13;
	@FindBy(xpath="//input [@id='search_box']" )WebElement a14;
	
	@FindBy(xpath="//div[@id='10691122']" )WebElement a15;
	@FindBy(xpath="//li[@class='mbc midicon']" )WebElement a16;
	@FindBy(xpath="//div [@class='showpayment_popup']" )WebElement a17;
	@FindBy(xpath="//div[@class='main-credebi cashond_sec btn']" )WebElement a18;
	@FindBy(xpath="//div [@class='cod-ordersbtn J14SB_42 cl_fff btn PreCOD btn_comm btn_outline']" )WebElement a19;
	
	@FindBy(xpath="//a [@class='link_bold']")WebElement a20;
	
	@FindBy(xpath="//button [@id='reload-button']")WebElement a21;
	@FindBy(xpath="//button [@id='reload-button']")WebElement a22;
	@FindBy(xpath="//button [@id='reload-button']")WebElement a23;
	
//	@FindBy(xpath="//a[@onclick='SiteLogout1()']")WebElement a24;
	
	@FindBy(xpath="//li[@cancel-level='prd-cancel']" )WebElement b16;
	//
	@FindBy(xpath= "//select[@ id='cprdCancelReason']" )WebElement b17;
	@FindBy(xpath=" //select[@id='cancelCPrdSubReason']" )WebElement b18;
	//
	@FindBy(xpath="//span [@class='upprCase next-btn  cprd-nxtbtn cancelButtons']" )WebElement b19;
	@FindBy(xpath="//span[@ class='upprCase next-btn  cprd-nxtbtn confirm-btn cancelButtons']" )WebElement b20;
	@FindBy(xpath="//div [@id='cancelOverlayclose']" )WebElement b21;
	
	@FindBy(xpath="//a[@onclick='SiteLogout1()']")WebElement b22;
	
	
	
	
	public void searchweb(String text) {
		a1.sendKeys(text);
	}
	public void clickonlink() {
		a2.submit();
	}
	
    public void clickonlogin() {
		a3.click();
	}
    public void Entermobileno(String no) {
		a4.sendKeys(no);
	}
    public void contine() {
		a5.click();
	}
    public void firtotp(String one) {
		a6.sendKeys(one);
	}
    public void secondotp(String two) {
	a7.sendKeys(two);
}
    public void thirdotp(String three) {
	a8.sendKeys(three);
}
    public void fourotp(String four) {
	a9.sendKeys(four);
}
    public void fiveotp(String five) {
	a10.sendKeys(five);
}
    public void sixotp(String six) {
	a11.sendKeys(six);
}
    public void  submit() {
		a12.click();
	}
    public void  searchclick() {
		a13.click();
	}
    public void searchboxsendkeys(String prod) {
		a14.sendKeys(prod);
   	}
    public void addtocart () {
		a15.click();
   	}
    public void seecart () {
		a16.click();
   	}
    public void showpayment () {
		a17.click();
   	}
    public void clickCOD () {
		a18.click();
   	}
    public void confirmCOD () {
		a19.click();
   	}
    public void viewdetails() {
    	a20.click();
    }
    public void reload1() {
    	a21.click();
    }
    public void reload2() {
    	a22.click();
    }
    public void reload3() {
    	a23.click();
    }
//    public void logout() {
//    	a24.click();
//    }
    
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

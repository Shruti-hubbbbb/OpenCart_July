package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;
import pageObjects.AccountRegistrationPage;

public class TC_001_AccountRegistrationTest extends BaseClass {


	@Test(groups= {"Regression","Master"})
	public void test_account_Registration()
	{
		logger.info("***starting***");
		try {
			
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("***setting data***");
		regpage.setFirstName(randomeString());
		regpage.setLastName(randomeString());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setPassword(randomAlphaNumeric());
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getConfirmationmsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created");
	}
	
	catch(Exception e)
		{
		Assert.fail();
		}
	}
}

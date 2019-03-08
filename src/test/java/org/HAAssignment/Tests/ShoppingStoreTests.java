package org.HAAssignment.Tests;
import java.util.Map;
import java.util.NoSuchElementException;
import org.HAAssignment.frameworkUtils.WebDriverBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingStoreTests extends WebDriverBase {

	
	@Test(dataProvider = "SampleAppTestData", priority = 1, enabled = true)
	public void searchCompleteOrderNewUser(Map<String, String> data) throws InterruptedException  {
		ssp.searchForAnItem(data.get("ProductName"));
		ssp.moveToAProduct();
		ssp.addToKart();
		ssp.proceedToCheckOut();
		ssp.scrollToView(300);
		ssp.getAddress2().click();
		userName = ssp.randomString()+"@mail.com";
		System.out.println(userName+"UserName");
		ssp.getEmailCreate().sendKeys(userName);
		ssp.getCreateSubmit().click();
		//ssp.getMaleGender().click();
		ssp.userReg(data);
		ssp.scrollToView(400);
		ssp.getProcessAdd().click();
		ssp.getCvg().click();
		ssp.getProcessCarrier().click();
		ssp.getPayByCO().click();
		ssp.getCartNavigation().click();
		String text="";
		try {
			 text= ssp.getAlertMes().getText();
		}
		catch(NoSuchElementException ne) {
			ne.printStackTrace();
		}
		finally {
			Assert.assertTrue("Your order on My Store is complete.".equalsIgnoreCase(text));
		}
		
	}

	@Test(dataProvider = "SampleAppTestData", priority = 2, enabled = true)
	public void searchCompleteOrderExistingUser(Map<String, String> data)  {
		ssp.getSignIn().click();
		ssp.getEmail().sendKeys(userName);
		ssp.getPassword().sendKeys(data.get("Password"));
		ssp.getLoginBtn().click();
		ssp.searchForAnItem(data.get("ProductName"));
		ssp.moveToAProduct();
		ssp.addToKart();
		ssp.proceedToCheckOut();
		ssp.scrollToView(800);
		ssp.getAddress2().click();
		ssp.getProcessAdd().click();
		ssp.getCvg().click();
		ssp.getProcessCarrier().click();
		ssp.getPayByCO().click();
		ssp.getCartNavigation().click();
		String text="";
		try {
			 text= ssp.getAlertMes().getText();
		}
		catch(NoSuchElementException ne) {
			ne.printStackTrace();
		}
		finally {
			Assert.assertTrue("Your order on My Store is complete.".equalsIgnoreCase(text));

		
	}
	
	}	
}
	
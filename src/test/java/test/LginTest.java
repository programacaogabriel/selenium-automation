package test;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LginTest extends BaseTest {

	
	@Test
	public void testValidLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUser("admin@yourstore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();

		System.out.println("Title of Page is "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");
	}
}

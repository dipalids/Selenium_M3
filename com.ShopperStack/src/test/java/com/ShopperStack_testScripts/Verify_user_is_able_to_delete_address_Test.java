package com.ShopperStack_testScripts;

import org.testng.annotations.Test;

import com.ShopperStack.Pom.HomePage;
import com.ShopperStack.Pom.MyAddressPage;
import com.ShopperStack.Pom.MyProfilePage;
import com.ShopperStack.genericUtility.BaseTest;

public class Verify_user_is_able_to_delete_address_Test extends BaseTest{
	
	@Test
	public void addAddress() throws InterruptedException {
		
		homePage.getAccountBtn().click();
		homePage.getMyProfileBtn().click();
		
		MyProfilePage myProfilePage=new MyProfilePage(driver);
		myProfilePage.getMyAddressBtn().click();
		
		MyAddressPage myAddressPage=new MyAddressPage(driver);
		myAddressPage.getDeleteAdress().click();
		Thread.sleep(2000);
		myAddressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
}

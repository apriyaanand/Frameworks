package com.webappsecurity.zero.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.pages.Login;
import com.webappsecurity.zero.pages.TransferFundsConfirmationpage;
import com.webappsecurity.zero.pages.TransferFundsPage;
import com.webappsecurity.zero.pages.TransferFundsVerifyPage;
import com.webappsecurity.zero.pages.TransferLinkPage;

import utils.GenericMethods;

public class VerifyTransferFunds extends Base {
	
	@Test
	
	public void verifyFundTransfer() throws IOException {
		Login lp = new Login(driver);
		TransferLinkPage tl = new TransferLinkPage(driver);
		TransferFundsPage tf = new TransferFundsPage(driver);
		TransferFundsVerifyPage tfv = new TransferFundsVerifyPage(driver);
		TransferFundsConfirmationpage tfc = new TransferFundsConfirmationpage(driver);
	
		String[][] data = GenericMethods.getData("C:\\SW_Testing_Priya\\GET\\Book1.xlsx", "Sheet1");
		
		for(int i = 1;i<data.length;i++) {
		
	lp.loginApp(data[i][0],data[i][1]);
	driver.navigate().back();
	tl.verifyTransferFundsLink();
	tf.transferFund(Integer.parseInt(data[i][2]),Integer.parseInt(data[i][3]),data[i][4],data[i][5] );
	tfv.transferFundsVerify();
	String actualConMsg = tfc.transferFundsConfirmation();
	String expectedConMsg = data[i][6];
	Assert.assertEquals(actualConMsg, expectedConMsg,"Row number is:"+i);
	tfc.getLogOut();
	tl.clicksignInBtn();
	
	
	
		}

	
		
	}

}

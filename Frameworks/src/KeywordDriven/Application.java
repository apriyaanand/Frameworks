package KeywordDriven;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.GenericMethods;

public class Application {
	
	@Test
	
	public void verifyInvalidLogin() throws IOException {
		
	String[][] data = GenericMethods.getData("C:\\SW_Testing_Priya\\GET\\Book1.xlsx 	", "Sheet2");
	Methods mtd = new Methods();
	
	//Checking how Github works
			
	
	for(int i=1; i<data.length;i++) {
		switch(data[i][3]) {
		case "openApp":
			mtd.openApplication(data[i][6]);
			break;
		case "enterInTextBox":
			mtd.enterTextBox(data[i][5], data[i][6]);
			break;
		case "clickButton":
			mtd.clickButton(data[i][4], data[i][5]);
			break;
		case "verifyMsg":
		String actualMsg = mtd.getMessage(data[i][4], data[i][5]);
		String expectedMsg = (data[i][6]);
		Assert.assertEquals(actualMsg, expectedMsg);
		break;
		case "closeApp":
			mtd.closeApplication();
			break;
			
			
		}
		
	}
	}

}

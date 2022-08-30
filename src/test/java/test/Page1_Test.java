package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Page1;
import util.BrowserFactory;

public class Page1_Test {
	
	WebDriver driver;
	@Test
	public void validateTheCheckBox() throws InterruptedException {
		driver=BrowserFactory.init();
		
		Page1 pg= PageFactory.initElements(driver, Page1.class);
		pg.insertDataInCheckBox("Junit1");
		pg.clickCheckBoxButton();
		pg.clickToggleAllBox();
		pg.clickCheckBox1();
		pg.removeCheckedBox();
		pg.removeAllCheckedBoxes();
		
		BrowserFactory.TearDown();
	}
	
}

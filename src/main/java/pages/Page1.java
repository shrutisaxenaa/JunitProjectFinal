package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 {
	
	WebDriver driver;
	
	public Page1(WebDriver driver) {
		this.driver=driver;
	}
	public int generateRandomNumber() {
		Random randomNumber= new Random();
		int RandomNumber=randomNumber.nextInt(100);
		return RandomNumber;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@type='text' and @name='data']")WebElement checkBoxField;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/input[2]")WebElement checkBoxButton;
	@FindBy(how=How.NAME,using="allbox")WebElement toggleAll;
	@FindBy(how=How.XPATH,using="//input[@type='checkbox' and @name='todo[0]']")WebElement checkBox1;
	@FindBy(how=How.XPATH,using="//input[@type='submit' and @value='Remove']")WebElement removeButton;
	
	public void insertDataInCheckBox(String data) {
		int randomNumber=generateRandomNumber();
		checkBoxField.sendKeys(data+randomNumber);
	}
	public void clickCheckBoxButton() {
		checkBoxButton.click();
	}
	
	
	public void clickToggleAllBox() {
		toggleAll.click();
		
	}
	public void clickCheckBox1() {
		checkBox1.click();
	}
	
	public void removeCheckedBox() {
		removeButton.click();
	}
	
	public void removeAllCheckedBoxes() {
		toggleAll.click();
		removeButton.click();
	}
	
}

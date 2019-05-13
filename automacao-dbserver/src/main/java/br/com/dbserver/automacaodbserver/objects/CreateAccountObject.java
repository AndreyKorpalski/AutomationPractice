package br.com.dbserver.automacaodbserver.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountObject {
	private final WebDriver driver;
	
	public CreateAccountObject(WebDriver driver) {
		this.driver=driver;		
	}
	

	public WebElement getLogin() {
		return driver.findElement(By.id("contact-link"));		
	}
	
	public WebElement getCreateAccount() {
		
		return driver.findElement(By.id("email_create"));
	}
	
	public WebElement getCreateAccountButton() {
		return driver.findElement(By.id("SubmitCreate"));
	}
	
	public WebElement getSexoMasculinoButton() {
		return driver.findElement(By.id("uniform-id_gender1"));
			
	}
	
	public WebElement getFirstNameTextField() {
		return driver.findElement(By.id("customer_firstname"));
	}
	
	public WebElement getLastNameTextField() {
		return driver.findElement(By.id("customer_lastname"));
	}
	
	public WebElement getEmailTextField() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getPasswordTextField() {
		return driver.findElement(By.id("passwd"));
	}
	
	public WebElement getDaysBrithSelector() {
		return driver.findElement(By.id("days"));
	}
	public WebElement getDayBirthSelector() {
		return driver.findElement(By.xpath("//*[@id=\"days\"]/option[3]"));
	}
	
	public WebElement getMonthsBirthSelector() {
		return driver.findElement(By.id("months"));
	}
	public WebElement getMonthBirthSelector() {
		return driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]"));
	}
 
	public WebElement getYearsBirthSelector() {
		return driver.findElement(By.id("years"));
	}
	
	public WebElement getYearBirthSelector() {
		return driver.findElement(By.xpath("//*[@id=\"years\"]/option[26]"));
	}
	
	public WebElement getFirstNameAddressTextField() {
		return driver.findElement(By.id("firstname"));
	}
	
	public WebElement getLastNameAddressTextField() {
		return driver.findElement(By.id("lastname"));
	}
	
	public WebElement getCompanyTextField() {
		return driver.findElement(By.id("company"));
	}
	
	public WebElement getCityTextField() {
		return driver.findElement(By.id("city"));
	}
	
	public WebElement getState() {
		return driver.findElement(By.id("id_state"));
	}
	
	public WebElement getStateCalifornia() {
		return driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[6]"));
	}
	
	public WebElement getPostCodeTextField() {
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getCountry() {
		return driver.findElement(By.id("id_country"));
	}
	
	public WebElement getCountryUS() {
		return driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
	}
	
    public WebElement getMobilePhoneTextField() {
    	
    	return driver.findElement(By.id("phone_mobile"));
    }
    
    public WebElement getAliasAddressTextField() {
    	
    	return driver.findElement(By.id("alias"));
    } 
 
    public WebElement getRegisterAccountButton() {
    	return driver.findElement(By.id("submitAccount"));
    }
    
    
    public WebElement getTest() {
    	return driver.findElement(By.id("search_query_top"));
    }
}
	
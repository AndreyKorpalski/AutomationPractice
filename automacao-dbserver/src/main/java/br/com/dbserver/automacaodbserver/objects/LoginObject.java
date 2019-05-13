package br.com.dbserver.automacaodbserver.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginObject {
	private final WebDriver driver;
	
	public LoginObject(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getLogin() {
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
	}
	 
	
}

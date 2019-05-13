package br.com.dbserver.automacaodbserver.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseProductObject {
	private final WebDriver driver;
	
	public ChooseProductObject(WebDriver driver) {
		this.driver=driver;		
	}
	

	public WebElement GetProduct() {
		return driver.findElement(By.xpath("//ul[@id='homefeatured']/li/div/div[2]/h5/a"));		
	}
	
	
}

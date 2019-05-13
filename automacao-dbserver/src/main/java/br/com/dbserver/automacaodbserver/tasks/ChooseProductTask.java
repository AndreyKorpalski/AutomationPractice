package br.com.dbserver.automacaodbserver.tasks;

import org.openqa.selenium.WebDriver;
import br.com.dbserver.automacaodbserver.objects.ChooseProductObject;


public class ChooseProductTask {
	private WebDriver driver;
	private ChooseProductObject Product;
	
	public ChooseProductTask (WebDriver driver,ChooseProductObject GetProduct) {
		this.driver= driver;
		this.Product= GetProduct;
	}
	
	public void GetProduct () {
		Product.GetProduct().click();
		 
	}
	

}
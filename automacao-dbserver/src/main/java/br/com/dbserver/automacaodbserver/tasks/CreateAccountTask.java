package br.com.dbserver.automacaodbserver.tasks;

import org.openqa.selenium.WebDriver;
import br.com.dbserver.automacaodbserver.objects.CreateAccountObject;

public class CreateAccountTask {
	private WebDriver driver;
	private CreateAccountObject account;
	
	public CreateAccountTask (WebDriver driver,CreateAccountObject createAccount) {
		this.driver= driver;
		this.account=createAccount;
	}
	
	public void createAccount () {
//		this.account.getTest().sendKeys("teste");
//		account.getLogin().click();
		account.getCreateAccount().sendKeys("andrey@andrey.com.br");
		account.getCreateAccountButton().click();
		 
	}
	

}

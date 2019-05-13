package br.com.dbserver.testcase;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.dbserver.automacaodbserver.tasks.CreateAccountTask;

public class CreateAccountTestCase {
	
	private WebDriver driver;
	private CreateAccountTask task;
	
	@Before
	public void setUp() {
		this.driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	
}	
	@Test
	public void createAccountTestCase() {
		System.out.println("bombou!");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		task.createAccount();
	}

	@After
	public void tearDown() {
		//driver.quit();
	}

}

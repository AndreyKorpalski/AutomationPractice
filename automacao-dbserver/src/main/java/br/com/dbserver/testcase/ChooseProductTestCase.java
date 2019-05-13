package br.com.dbserver.testcase;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import br.com.dbserver.automacaodbserver.tasks.ChooseProductTask;

public class ChooseProductTestCase {
	
	private WebDriver driver;
	private ChooseProductTask task;
	
	@Before
	public void setUp() {
		this.driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
	}	
	
	@Test
	public void chooseProductTestCase() {
		//System.out.println("bombou!");
		driver.manage().timeouts().implicitlyWait(900,TimeUnit.SECONDS);
		task.GetProduct();
	}
	
	@After
	public void tearDown() {
		//driver.quit();
	}
}
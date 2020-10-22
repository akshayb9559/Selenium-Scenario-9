package demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileReader {

	ConfigFileReader configFileReader;
	WebDriver wd;
//	String url = configFileReader.getApplicationUrl();

	@Before
	public void setUp() throws Exception {
		configFileReader=new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		wd = new ChromeDriver();
		wd.get(configFileReader.getApplicationUrl());
		wd.manage().window().maximize();
	}

	@Test
	public void test() {
		
	}

	@After
	public void tearDown() throws Exception {
		wd.quit();
	}
}

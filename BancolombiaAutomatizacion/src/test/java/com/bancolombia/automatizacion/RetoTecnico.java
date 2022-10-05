package com.bancolombia.automatizacion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetoTecnico {
	private WebDriver driver ;
	By personasLocator =By.id("header-personas");
	By solicitudLocator =By.id("header-solicitud-productos");
	By inversionesLocator = By.xpath("//*[@id=\"filtro-inversiones\"]");
	By conocemasLocator =By.id("conoce-inversion-0");
	@Before
	public void setUp () {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bancolombia.com/personas?_ga=2.201556114.2061039423.1664922956-1505900671.1664557984");
	}
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	@Test
	public void personas () {
		driver.findElement(personasLocator).click();
		driver.findElement(solicitudLocator).click();
		driver.findElement(inversionesLocator).click();
		driver.findElement(conocemasLocator).click();
	}
	

}

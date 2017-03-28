/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Driver;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author e13056
 */
public class TestSelenium01 {
    
    public TestSelenium01() {
    }
    
    static WebDriver driver;
    
    @BeforeClass
    public static void setUpClass() {
        
        System.setProperty("webdriver.chrome.driver", "/home/e13056/Desktop/CO324/workshop selenium/SeleniumWebTestingWorkshop/Lib/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://enterprise-demo.orangehrmlive.com/");
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
        
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
        
    }
    
    @Test
    public void TestA(){
    
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
    driver.findElement(By.id("btnLogin")).click();
    
    String Expected_title = driver.getTitle();
    String Actual_title = "OrangeHRM";
    
    Assert.assertEquals(Expected_title,Actual_title);
    
    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

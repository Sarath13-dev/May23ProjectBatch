package org.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.input.TeeInputStream;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.schema.idl.errors.MissingScalarImplementationError;
import io.opentelemetry.sdk.metrics.data.Data;
import net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		//Set the property of the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\newEclipseWorkspe\\SeleniumAprEvebatch\\Driver\\chromedriver.exe");
		//WebDriver interface - object
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUsername = driver.findElement(By.cssSelector("input#email"));
		txtUsername.sendKeys("1234");
		
		System.out.println("I worked in QA Branch");
		System.out.println("Automation Testing");
		
		
	}
	
	

}

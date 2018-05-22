package com.seleniumui;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uiTest {
	public static void main(String[] args) {
		
        // Access the web
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zatro.es/");
        
        //Looking for the search button and clicking on it
        WebElement link = driver.findElement(By.className("buscar-btn"));
        link.click();
        
        //On the search write what we are looking
        WebElement search = driver.findElement(By.className("iBuscar"));
        search.click();
        search.sendKeys("Adidas");
        
        //click on search
        WebElement enter = driver.findElement(By.className("flecha-buscar"));
        enter.click();
        
        //click the second item on the list
        WebElement soption = driver.findElement(By.linkText("Nmd_r2 pk")); 
        String url = soption.getAttribute("href");
        System.out.println(url);
        soption.click();
        
        //waiting for the adv and clicking on close
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("js-cerrar-popup-newsletter")));
        
        WebElement closepopupone = driver.findElement(By.className("js-cerrar-popup-newsletter"));
        closepopupone.click();
        
        //Click on dropdown and select second option
        WebElement dropdown = driver.findElement(By.className("js-open-tallas"));
        dropdown.click();
        
        WebElement optiontwo = driver.findElement(By.cssSelector("li[data-value='12241']"));
        optiontwo.click();
        
        //Add Item to shopping cart
        WebElement addtocart = driver.findElement(By.className("add-cart"));
        addtocart.click();
        
        //go to pay button
        WebDriverWait waittwo = new WebDriverWait(driver, 100);
        waittwo.until(ExpectedConditions.elementToBeClickable(By.className("btn-pagar"))).click();
        
        //Go to cart 
        WebElement checkcart = driver.findElement(By.className("cesta-btn"));
        checkcart.click();
        
       //check if cart item is the same as the item we select on test 5
        WebElement cartitem = driver.findElement(By.xpath("//span[contains(text(),'Nmd_r2 pk')]"));

        WebElement parent = cartitem.findElement(By.xpath(".."));
        
        System.out.println("HELLO " + parent);
        
        
	}

}

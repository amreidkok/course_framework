package HelperPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddClient {
    public static WebDriver driver = WebDriverFactory.getDriver();

    public static void addClient(String ClientName)
    // This is Method to locate client screen elements
    // The method takes one argument of type String, named ClientName.
    // This allows you to pass a string value to the method when calling it
    {
        // Click Add Client Screen
        driver.findElement(By.cssSelector("#main-content > div > div.main-area.clearfix > div > ol > div.px-2 > div.form-row-flex.pt-2 > div:nth-child(4) > div > div:nth-child(4) > a")).click();
        // Add data and click add
        driver.findElement(By.id("ClientBusinessName")).sendKeys(ClientName);
        driver.findElement(By.id("submitBtn")).click();
    }
}

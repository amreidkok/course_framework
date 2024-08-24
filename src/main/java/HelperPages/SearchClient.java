package HelperPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchClient {
    public static WebDriver driver = WebDriverFactory.getDriver();

    public static void searchClient(String SearchName)
    {
        // Click on client menu in header
        driver.findElement(By.xpath("//a[@href='/owner/clients/index']")).click();
        // Search for clients
        WebElement searchname = driver.findElement(By.name("filter[first_name][like]"));
        searchname.clear();
        searchname.sendKeys( SearchName);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}

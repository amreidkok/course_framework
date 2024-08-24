import HelperPages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAddingClient {
    private static WebDriver driver = WebDriverFactory.getDriver();

    @BeforeMethod
    public static void login()
    // This method runs before any test method in this test class
    {
        Login.loginApp();
    }

    @Test (priority = 1)
    public static void AddClientValidData()
    // This method runs for the first test
    {
        // Adding test data to test
        String clientName ="Mohammed";
        String clientUpdatedName= "Mohammed El Nenaey";
        // Run Test
        AddClient.addClient(clientName);
        SearchClient.searchClient(clientName);
        ClientsActions.clientsActions();
        UpdateClient.updateClient(clientUpdatedName);
        SearchClient.searchClient(clientUpdatedName);
    }

    @Test (priority = 2)
    public static void AddClientBlankData()
    {
        AddClient.addClient("");
        WebElement errormsg = driver.findElement(By.cssSelector("div[class=\"error-message\"]"));
        Assert.assertTrue(errormsg.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"breadcrumb\"]/li[1]/a")).click();
    }

    @Test (priority = 3)
    public static void AddClientValidData2()
    {
        String clientName ="Nada";
        String clientUpdatedName= "Nada Essam";
        // Run Test
        AddClient.addClient(clientName);
        SearchClient.searchClient(clientName);
        ClientsActions.clientsActions();
        UpdateClient.updateClient(clientUpdatedName);
        SearchClient.searchClient(clientUpdatedName);
    }

    @AfterMethod
    public static void Logout()
    {
        Logout.logoutApp();
    }
}

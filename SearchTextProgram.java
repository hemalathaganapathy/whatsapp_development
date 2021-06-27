package MavenProgram1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTextProgram {
    private static WebDriver driver;
    @BeforeMethod
    public void setProperty()
    {
        System.out.println("Launching the browser");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test

    public void validationMethod(){
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        System.out.println("Actual title-->" +actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    @AfterMethod
    public void CloseBrowser(){
        System.out.println("Closing The Browser");
        driver.close();
    }
}

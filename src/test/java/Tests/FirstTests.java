package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FirstTests extends BaseTest {
    @Test (priority = 1)                            //TITLE
    public void titleCheck () {
        String actualTitle = driver.getTitle();
        String expectedTitle = "TestNG Tutorial: Annotations, Framework, Examples in Selenium";
        System.out.println("actualTitle is " + actualTitle);
        assertEquals(actualTitle,expectedTitle);
    }
    @Test(priority = 1)                            //mouseHover+click on Menu item
    public void mouseHover() {
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//*[@id=\"menu-5108-particle\"]/nav/ul/li[2]/div/span[1]/span"));
        actions.moveToElement(menuOption).perform();
        System.out.println("Done Mouse hover on 'Testing' from Menu");
        driver.findElement(By.xpath("//*[@id=\"menu-5108-particle\"]/nav/ul/li[2]/ul/li/div/div[1]/ul/li[2]/a/span/span")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Agile Testing Tutorial";
        assertEquals(actualTitle,expectedTitle);
    }

}

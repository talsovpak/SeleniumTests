package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
    @Test
    public void testHomeDepot()throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"headerMyAccountTitle\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"SPSOSignIn\"]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("talsovpak@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password-input-field\"]")).sendKeys("Sheri2002");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/button[1]/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("signInEmailField")).click();
    }
}

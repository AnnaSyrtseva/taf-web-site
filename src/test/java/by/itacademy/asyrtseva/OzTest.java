package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OzTest {
    @Test
    public void testOzIncorrectCredentials() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://oz.by/");
        OzPage pageoz = new OzPage();

        WebElement enterButton = driver.findElement(By.xpath(pageoz.enterButtonLocator));
        enterButton.click();
        WebElement emailTab = driver.findElement(By.xpath(pageoz.emailTabLocator));
        emailTab.click();
        WebElement inputLoginEmail = driver.findElement(By.xpath(pageoz.inputLoginEmail));
        inputLoginEmail.sendKeys("test@mail.com");
        WebElement inputLoginPassword = driver.findElement(By.xpath(pageoz.inputLoginPassword));
        inputLoginPassword.sendKeys("qwertyu111");
        WebElement submitButton = driver.findElement(By.xpath(pageoz.submitButton));
        submitButton.click();
        Thread.sleep(2000);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", driver.findElement(By.xpath(pageoz.errorMessageLogin)).getText());
        driver.close();
    }

    @Test
    public void testOzNameOfLoginPage() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://oz.by/");
        OzPage pageoz = new OzPage();

        WebElement enterButton = driver.findElement(By.xpath(pageoz.enterButtonLocator));
        enterButton.click();
        WebElement loginPopupTitle = driver.findElement(By.xpath(pageoz.loginPopuptitle));
        Thread.sleep(2000);
        Assertions.assertEquals("Вход", loginPopupTitle.getText());
        driver.close();
    }
}
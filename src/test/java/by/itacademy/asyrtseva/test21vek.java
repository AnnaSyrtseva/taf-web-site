package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test21vek {

    @Test
    public void test21vekLoginEmptyFields() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.21vek.by/");

        Page21vek page21vek = new Page21vek();

        WebElement cookieButton = driver.findElement(By.xpath(page21vek.cookieButtonLocator));
        cookieButton.click();

        Thread.sleep(1000);
        WebElement enterButton = driver.findElement(By.xpath(page21vek.enterButtonLocator));
        enterButton.click();

        WebElement loginButton = driver.findElement(By.xpath(page21vek.loginButtonLocator));
        loginButton.click();

        Thread.sleep(1000);
        WebElement submitButton = driver.findElement(By.xpath(page21vek.loginSubmitButton));
        submitButton.click();

        WebElement errorMessageLogin = driver.findElement(By.xpath(page21vek.errorMessageLogin));
        Assertions.assertEquals("Электронная почта не указана", errorMessageLogin.getText());

        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test21vekLoginEmptyPassword() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.21vek.by/");

        Page21vek page21vek = new Page21vek();

        WebElement cookieButton = driver.findElement(By.xpath(page21vek.cookieButtonLocator));
        cookieButton.click();

        Thread.sleep(1000);
        WebElement enterButton = driver.findElement(By.xpath(page21vek.enterButtonLocator));
        enterButton.click();

        WebElement loginButton = driver.findElement(By.xpath(page21vek.loginButtonLocator));
        loginButton.click();

        Thread.sleep(1000);
        WebElement inputLogin = driver.findElement(By.xpath(page21vek.inputLogin));
        inputLogin.sendKeys("test@mail.com");

        WebElement subminButton = driver.findElement(By.xpath(page21vek.loginSubmitButton));
        subminButton.click();

        Thread.sleep(1000);
        WebElement errorMessagePassword = driver.findElement(By.xpath(page21vek.errorMessagePassword));
        Assertions.assertEquals("Пароль не указан",errorMessagePassword.getText());

        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test21vekLoginIncorrectCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.21vek.by/");

        Page21vek page21vek = new Page21vek();

        WebElement cookieButton = driver.findElement(By.xpath(page21vek.cookieButtonLocator));
        cookieButton.click();

        Thread.sleep(1000);
        WebElement enterButton = driver.findElement(By.xpath(page21vek.enterButtonLocator));
        enterButton.click();

        WebElement loginButton = driver.findElement(By.xpath(page21vek.loginButtonLocator));
        loginButton.click();

        Thread.sleep(1000);
        WebElement inputLogin = driver.findElement(By.xpath(page21vek.inputLogin));
        inputLogin.sendKeys("test@mail.com");

        WebElement inputPasswoed = driver.findElement(By.xpath(page21vek.inputPassword));
        inputPasswoed.sendKeys("555555");

        WebElement subminButton = driver.findElement(By.xpath(page21vek.loginSubmitButton));
        subminButton.click();

        Thread.sleep(2000);
        WebElement errorMessageForIncorrectCredentials = driver.findElement(By.xpath(page21vek.errorMessageForIncorrectCredentials));
        Assertions.assertEquals("Неправильный пароль.", errorMessageForIncorrectCredentials.getText());

        Thread.sleep(1000);
        driver.quit();
    }

}

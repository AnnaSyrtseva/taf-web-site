package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RWTest {
    @Test
    public void testRWIncorrectCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://pass.rw.by/ru/");

        RWPage rwPage = new RWPage(driver);
        rwPage.clickProfileButton();
        Thread.sleep(2000);
        String actual = rwPage.getTextAuthModalPage();
        String expected = "Авторизация";
        Assertions.assertEquals(expected, actual);
        driver.quit();
    }
    @Test
    public void testRWEmptyPasswordField() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://pass.rw.by/ru/");

        RWPage rwPage = new RWPage(driver);
        rwPage.clickProfileButton();
        Thread.sleep(2000);
        rwPage.setInputLoginEmail("test@mail.com");
        rwPage.clickSubmitButton();
        String actual = rwPage.getTextErrorPassword();
        String expected = "Заполните поле";
        Assertions.assertEquals(expected,actual);
        driver.quit();
    }

    @Test
    public void testRWEmptyLoginFileds() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://pass.rw.by/ru/");
        RWPage rwPage = new RWPage(driver);
        rwPage.clickProfileButton();
        Thread.sleep(2000);
        rwPage.clickSubmitButton();
        String actualLogin = rwPage.getTextErrorLogin();
        String expectedLogin = "Заполните поле";
        Assertions.assertEquals(expectedLogin,actualLogin);
        String actualPassword = rwPage.getTextErrorPassword();
        String expectedPassword = "Заполните поле";
        Assertions.assertEquals(expectedPassword, actualPassword);
        driver.quit();
    }

    @Test
    public void testRWUnegisteredUser() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://pass.rw.by/ru/");
        RWPage rwPage = new RWPage(driver);
        rwPage.clickProfileButton();
        Thread.sleep(2000);
        rwPage.setInputLoginEmail("test@gmail.com");
        rwPage.setInputLoginPassword("qwerty123");
        rwPage.clickSubmitButton();
        Thread.sleep(2000);
        String actualMessage = rwPage.getErrorAuthMessage();
        String expectedMessage = "Пользователь не найден";
        Assertions.assertEquals(expectedMessage, actualMessage);
    }

}

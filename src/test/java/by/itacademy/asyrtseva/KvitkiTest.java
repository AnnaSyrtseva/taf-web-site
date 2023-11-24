package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KvitkiTest {
    @Test
    public void testKvitkiLoginPageOpened() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickLoginButton();
        Thread.sleep(2000);
        String actual = kvitkiPage.getTextLoginLabel();
        String expected = "Вход";
        Assertions.assertEquals(expected,actual);
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void testKvitkiLoginEmptyCredentials() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickButtonBunnerClose();
        kvitkiPage.clickButtonCookie();
        kvitkiPage.clickLoginButton();
        Thread.sleep(4000);
        kvitkiPage.clickInputLoginEmail();
        kvitkiPage.clickInputLoginPassword();
        String actualNoEmail = kvitkiPage.getTextErrorNoEmail();
        String extectedNoEmail = "Пожалуйста, заполните поле (Эл. почта)";
        Assertions.assertEquals(extectedNoEmail, actualNoEmail);
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void testKvitkiLoginEmptyCredentials2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickButtonCookie();
        kvitkiPage.clickLoginButton();
        Thread.sleep(2000);
        kvitkiPage.clickInputLoginPassword();
        kvitkiPage.clickInputLoginEmail();
        String actualNoPassword = kvitkiPage.getTextErrorNoPassword();
        String expectedNoPassword = "Пожалуйста, заполните поле (Пароль)";
        Assertions.assertEquals(expectedNoPassword, actualNoPassword);
    }
    @Test
    public void testKvitkiTextErrorEnterValidEmail() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kvitki.by/");
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickButtonCookie();
        kvitkiPage.clickLoginButton();
        Thread.sleep(2000);
        kvitkiPage.sendKeysInputLoginEmail("test");
        String actualEnterValidEmail = kvitkiPage.getTextErrorEnterValidEmail();
        String expectedEnterVaildEmail = "Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com";
        Assertions.assertEquals(expectedEnterVaildEmail, actualEnterValidEmail);
    }

}

package by.itacademy.asyrtseva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DominosTest extends BaseTest{

    @BeforeEach
    public void beforePizzaTempoTest() throws InterruptedException{
        driver.navigate().to("https://dominos.by/");
        Thread.sleep(2000);
    }

    @Test
    public void putMargaritaPizzaInBusket() throws InterruptedException {
        DominosPage dominos = new DominosPage(driver);
        dominos.clickButtonCloseBunner();
        dominos.clickButtonAddMargariteToProductPacket();
        dominos.clickButtonProductPacket();
        dominos.clickButtonChechoutOrder();
        String actual = dominos.getTextPizzaMargarite();
        String expected = "Маргарита";
        Assertions.assertEquals(expected, actual);
        Thread.sleep(2000);

    }

}

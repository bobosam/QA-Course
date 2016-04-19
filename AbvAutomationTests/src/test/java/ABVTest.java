import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.nio.charset.StandardCharsets;



import java.io.Console;
import java.util.concurrent.TimeUnit;

import static java.nio.charset.StandardCharsets.*;
import static org.junit.Assert.assertEquals;

public class ABVTest {


    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TestLogin_ValidCredentials_ShouldLoginCorrectly() {
        driver.get("http://abv.bg");

        String validUsername = "etlin";
        String validPassword = "Tinche14596";

        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.clear();
        usernameField.sendKeys(validUsername);

        passwordField.clear();
        passwordField.sendKeys(validPassword);

        WebElement logginButton = driver.findElement(By.id("loginBut"));
        logginButton.click();

        assertEquals("https://nm70.abv.bg/Mail.html", driver.getCurrentUrl());

        WebElement fullName = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div[1]/div[1]"));

        //assertEquals("????? ???????", fullName.getText());
    }

    @Test
    public void TestSendMail_AllrequiredFieldsPopulated_ShouldSendAndRecieveCorrectly(){
        driver.get("https://nm70.abv.bg/Mail.html#compose:");

       /*** WebElement toField = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[2]/td[2]/div/input"));
        toField.sendKeys("etlin@abv.bg");

        WebElement subject = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[2]/div[1]/table/tbody/tr[5]/td[2]/div/input"));
        subject.sendKeys("mesageFromSelenium");

        WebElement text = driver.findElement(By.cssSelector("input.gwt-TextBox"));
        text.sendKeys("selenium text");

        WebElement send = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/div[4]/div/div[4]/div/div[2]/div/div[2]/div/div[1]/div[1]"));
        send.click();***/
    }

    @After
    public void testDown() {

    }
}

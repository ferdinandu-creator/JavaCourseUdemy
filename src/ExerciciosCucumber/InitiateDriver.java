package ExerciciosCucumber;

import cucumber.api.java.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class InitiateDriver {

    WebDriver driver;
    ChromeOptions opt = new ChromeOptions();

        @BeforeEach
        public void setup(){
            driver = new ChromeDriver();
        }

        @AfterEach
        public void tearDown(){
            driver.quit();
    }
        @Test
        public void test(){
            System.setProperty("webdriver.chrome.driver","/Users/fernandooliveira/Desktop/JavaCourse/src/drivers/mac/chromedriver");
            opt.addArguments("--incognito");
            opt.addArguments("window-size=1920,1080");

            WebDriver driver = new ChromeDriver(opt);

            driver.get("https://google.com");//https://qachallengedev.devoteam.com.pt/Identity/Account/Manage

    }


    }


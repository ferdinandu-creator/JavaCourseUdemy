package ExerciciosCucumber;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstLoginQAChallenge {



    @Given("the user gets the link")
    public void the_user_gets_the_link(){
        InitiateDriver ini = new InitiateDriver();
        ini.test();

    }




}

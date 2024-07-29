package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Contact_Us_Steps {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webDriver.chrome.driver", "/Users/JohnnyAdhikari/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {

        driver.quit();

    }
    @Given("I access the ITsutra Contact Us page")
    public void i_access_the_ITsutra_contact_us_page() throws InterruptedException {
        driver.get("https://www.itsutra.com/contact-pages/contact-us");
        Thread.sleep(3000);


    }

    @When("I enter a first name")
    public void i_enter_a_first_name() throws InterruptedException {
        driver.findElement(By.name("Name")).sendKeys("Johnny");
        Thread.sleep(1000);


    }

    @And("I enter a last name")
    public void i_enter_a_last_name() throws InterruptedException {
        driver.findElement(By.name("Name")).sendKeys("Ad");
        Thread.sleep(1000);
    }

    @And("I enter an email address")
    public void i_enter_an_email_address() throws InterruptedException {
        driver.findElement(By.name("Email")).sendKeys("johnny@itsutra.com");
        Thread.sleep(1000);
    }

    @And("I enter a number")
    public void i_enter_a_number() throws InterruptedException {
        driver.findElement(By.name("Phone")).sendKeys("johnny@itsutra.com");
        Thread.sleep(1000);
    }

    @And("I enter a service")
    public void i_enter_a_service() throws InterruptedException {
        driver.findElement(By.name("Service")).sendKeys("Service");
        Thread.sleep(1000);
    }

    @And("I enter a comment")
    public void i_enter_a_comment() throws InterruptedException {
        driver.findElement(By.name("Message")).sendKeys("This is a test from BDD automation framework");
        Thread.sleep(1000);
    }

    @And("I click on Submit button")
    public void i_click_on_submit_button() {



    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {

    }

}

package stepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseTest;
import helpers.Helpers;

import org.junit.Assert;

public class MyAccounts extends BaseTest{
    //public static WebDriver driver;
    @Given("^user is on Dashboard$")
    public void user_is_on_Dashboard() throws Throwable {     
    	System.out.println("Dashboard is opened");
    }
   
    @When("user opens MyAccount page")
    public void user_opens_MyAccount_page() throws Throwable  {
    	driver.findElement(By.xpath("//span[contains(text(),'TestB')]")).click();
    }

    @Then("verify MyAccount page")
    public void verify_MyAccount_page() throws Throwable  {
    	String exp_message = "MY ACCOUNT";
    	String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals(exp_message, actual);
      	System.out.println("MY ACCOUNT page verified successfully");
    }

    @When("user opens My Personal information")
    public void user_opens_My_Personal_information() throws Throwable  {
    	driver.findElement(By.xpath("//span[contains(text(),'My personal information')]")).click();
    }

    @Then("verify Personal information page")
    public void verify_Personal_information_page() throws Throwable  {
    	String exp_message = "YOUR PERSONAL INFORMATION";
    	String actual = driver.findElement(By.xpath("//h1[@class='page-subheading']")).getText();
        Assert.assertEquals(exp_message, actual);
      	System.out.println("YOUR PERSONAL INFORMATION page verified successfully");
    }

    @When("user updates first name")
    public void user_updates_first_name() throws Throwable  {
//    	Helpers number=new Helpers();
//    	int num=number.generateRandom();
    	
    	driver.findElement(By.id("firstname")).sendKeys("TestK");
    	driver.findElement(By.id("old_passwd")).sendKeys("Password123");
    	driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();  	   
    	
    	
    }

    @Then("Personal Information gets updated")
    public void personal_Information_gets_updated() throws Throwable  {
    	
    	String exp_message = "Your personal information has been successfully updated.";
    	String actual = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
        Assert.assertEquals(exp_message, actual);
      	System.out.println("Message verified successfully");
      	
    	
    }
    
}

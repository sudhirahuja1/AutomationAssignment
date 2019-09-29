package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BaseTest;

import static helpers.Helpers.mouseOver;

import org.junit.Assert;

public class OrderProduct extends BaseTest{
    //public static WebDriver driver;
    @Given("^user is on Product page$")
    public void user_is_on_Product_page() throws Throwable { 
    	//Thread.sleep(3000);
    	mouseOver(driver.findElement(By.xpath("//a[contains(@href, 'id_category=3')]")));
       // Actions actions = new Actions(driver);
       // actions.moveToElement(driver.findElement(By.xpath("//a[contains(@href, 'id_category=3')]"))).perform();
    	driver.findElement(By.xpath("//a[contains(@href, 'http://automationpractice.com/index.php?id_category=5&controller=category')]")).click();
    }
    
    @When("^user adds a Product in cart$")
    public void user_adds_a_Product_in_cart() throws Throwable {
    	mouseOver(driver.findElement(By.xpath("//a[@class='product_img_link']//img[@class='replace-2x img-responsive']")));
        driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
    }
    
//    @When("^user enters username and Password$")
//    public void user_enters_username_and_Password() throws Throwable {
//    	//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]
//    	driver.findElement(By.id("email")).sendKeys("sudhirahuja1@gmail.com");
//        driver.findElement(By.id("passwd")).sendKeys("Password123");
//        driver.findElement(By.id("SubmitLogin")).click();   
//    }
    
    @Then("^success message of Product added is displayed$")
    public void success_message_of_Product_added_is_displayed() throws Throwable {
    	Thread.sleep(2000);
    	String exp_message = "Product successfully added to your shopping cart";
    	String actual = driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]")).getText();
        Assert.assertEquals(exp_message, actual);
       // driver.quit();  
    }      
   
    
    @Given("^user is ready to order$")
    public void user_is_ready_to_order() throws Throwable { 
      	System.out.println("Ready to order Product");
    }
    
    @When("^clicks on Proceed to checkout$")
    public void clicks_on_Proceed_to_checkout() throws Throwable {
    	
 //   	JavascriptExecutor js = (JavascriptExecutor) driver;

//        //This will scroll the web page till end.		
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
     	driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
     	System.out.println("Proceed to checkout clicked");
    }   
    
    @Then("^verify Shopping cart summary page$")
    public void verify_Shopping_cart_summary_page() throws Throwable {
    	String exp_message = "Your shopping cart";
    	String actual = driver.findElement(By.xpath("//span[@class='navigation_page']")).getText();
        Assert.assertEquals(exp_message, actual);
      
    }
    
    @When("^clicks on Proceed to checkout2$")
    public void clicks_on_Proceed_to_checkout2() throws Throwable {
    	
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        //This will scroll the web page till end.		
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
     	driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();
     	System.out.println("Proceed to checkout2 clicked");
    } 
    @Then("^verify Address page$")
    public void verify_Address_page() throws Throwable {
    	String exp_message = "ADDRESSES";
    	String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
        System.out.println("Proceed to checkout3 clicked");
      
    }
    
    @Then("^verify Shipping page$")
    public void verify_Shipping_page() throws Throwable {
    	String exp_message = "SHIPPING";
    	String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();
        System.out.println("Proceed to checkout4 clicked");
      
    }
    
    @Then("^verify Payment page$")
    public void verify_Payment_page() throws Throwable {
    	String exp_message = "PLEASE CHOOSE YOUR PAYMENT METHOD";
    	String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.findElement(By.xpath("//a[@class='bankwire']")).click();
        System.out.println("Bankwire clicked");
      
    }
    
    @Then("^complete Order$")
    public void complete_Order() throws Throwable {
    	String exp_message = "ORDER SUMMARY";
    	String actual = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals(exp_message, actual);
        driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
                
        String exp_message2 = "ORDER CONFIRMATION";
    	String actual2 = driver.findElement(By.xpath("//h1[@class='page-heading']")).getText();
        Assert.assertEquals(exp_message2, actual2);
        System.out.println("Product ordered successfully");
        
     }
    
    @Given("^user is on Order Confirmation page$")
    public void user_is_on_Order_Confirmation_page() throws Throwable { 
      	System.out.println("Ready to verify ordered Product");
    }
    
    @When("^user verify order history$")
    public void user_verify_order_history() throws Throwable { 
    	driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();
    	String exp_message2 = "ORDER HISTORY";
    	String actual2 = driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
        Assert.assertEquals(exp_message2, actual2);
      	System.out.println("Order History page verified successfully");
    }
    
    @Then("^user verifies ordered Product$")
    public void user_verifies_ordered_Product() throws Throwable { 
      	System.out.println("Ordered Product verified successfully");
    }
    
    @Given("^Browser is opened$")
    public void Browser_is_opened() throws Throwable { 
      	System.out.println("Browser open");
    }
    
    @Then("^Close Browser$")
    public void Close_Browser() throws Throwable { 
    	closeBrowser();
      	System.out.println("Browser closed");
    }
}

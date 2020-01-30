package stepGlue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef{
	WebDriver driver; 
	@Given("executive added the items to cart")
	public void executive_added_the_items_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("items price is calculated")
	public void items_price_is_calculated() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("bill is generated with final amount")
	public void bill_is_generated_with_final_amount() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}



	
@Given("Alex is existing customer")
public void alex_is_existing_customer() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Given("he has a good purchase record with store")
public void he_has_a_good_purchase_record_with_store() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("Alex provide his mobile no")
public void alex_provide_his_mobile_no() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
}

@Then("Alex should get registration success")
public void alex_should_get_registration_success() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}


@Given("Sales executive logged into the machine")
public void sales_executive_logged_into_the_machine() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	driver=Drivers.getDriver("chrome");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@When("Sales executive provides {string} and {string} as credentials")
public void sales_executive_provides_and_as_credentials(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	driver.findElement(By .name("userName")).sendKeys(string);
	driver.findElement(By .name("password")).sendKeys(string);
	driver.findElement(By .name("Cancel")).click();
	driver.quit();
	
	
}


@Then("Login is successful")
public void login_is_successful() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}



	@Given("Alex purchased microwave for {int} dollars")
	public void alex_purchased_microwave_for_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println(" Alex purchased microwave");
	}

	@Given("Alex has a receipt")
	public void alex_has_a_receipt() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Alex has a receipt");
	}

	@When("Alex returns the faulty microwave")
	public void alex_returns_the_faulty_microwave() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Alex returns the faulty microwave");
	}

	@Then("Alex got refund of {int} dollars")
	public void alex_got_refund_of_dollars(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("Alex got refund ");
	}
	@When("larry searches for a product in the search field")
	public void larry_searches_for_a_product_in_the_search_field(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new io.cucumber.java.PendingException();
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		for(String plist:pro_list) {
			driver.findElement(By .name("products")).sendKeys(plist);
			String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
			System.out.println(str);
			driver.findElement(By .name("products")).clear();
		}
			
		
	}






}

package bdd.stepDef;

import bdd.amazon.pageactions.ProductSearchActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductSearchSteps {

	ProductSearchActions psa = new ProductSearchActions();

	@Given("^Visit amazon\\.com$")
	public void visit_amazon_com() throws Throwable {
		psa.visitPage();
	}

	@When("^Search for Book using \"([^\"]*)\"$")
	public void search_for_Book_using(String Bookname) throws Throwable {
		psa.searchBook(Bookname);
	}

	@When("^Click on (\\d+)st item in the listed results$")
	public void click_on_st_item_in_the_listed_results(int arg1) throws Throwable {
		psa.clickItem();
	}

	@When("^Before Click on add to cart Add to Cart asset price from Step(\\d+)$")
	public void before_Click_on_add_to_cart_Add_to_Cart_asset_price_from_Step(int arg1) throws Throwable {
		psa.verifyPrice01();
	}

	@When("^Click on Add to Cart$")
	public void click_on_Add_to_Cart() throws Throwable {
		psa.addToCart();
	}

	@When("^Before Click on Proceed to Checkout asset price from Step(\\d+)$")
	public void before_Click_on_Proceed_to_Checkout_asset_price_from_Step(int arg1) throws Throwable {
		psa.verifyPrice02();
	}

	@Then("^Click on proceed to checkout$")
	public void click_on_proceed_to_checkout() throws Throwable {
		psa.checkOut();
	}
}

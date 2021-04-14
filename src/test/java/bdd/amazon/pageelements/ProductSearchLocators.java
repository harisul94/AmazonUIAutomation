package bdd.amazon.pageelements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductSearchLocators {
	// Search TextBox
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement txtSearchBox;

	// Search TextBox
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	public WebElement btnSearch;

	// Price Text
	@FindBy(className = "a-price-whole")
	public List<WebElement> bookPriceWhole;

	// Price Text
	@FindBy(className = "a-price-fraction")
	public List<WebElement> bookPriceFraction;

	// Price Text
	@FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
	public WebElement bookList;

	// Assert TextBox
	@FindBy(xpath = "//span[@id='newBuyBoxPrice']")
	public WebElement bookPrice02;

	// Add to cart
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	public WebElement addToCart;

	// Assert TextBox
	@FindBy(xpath = "//*[@id=\"hlb-subcart\"]/div[1]/span/span[2]")
	public WebElement bookPrice03;

	// Assert TextBox
	@FindBy(xpath = "//a[@id='hlb-ptc-btn-native']")
	public WebElement checkOut;

}

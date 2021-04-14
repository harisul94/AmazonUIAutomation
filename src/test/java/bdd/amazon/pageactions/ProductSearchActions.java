package bdd.amazon.pageactions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import bdd.amazon.pageelements.ProductSearchLocators;
import bdd.utilities.SetupDrivers;

public class ProductSearchActions {

	ProductSearchLocators psl;

	public ProductSearchActions() {
		psl = new ProductSearchLocators();
		PageFactory.initElements(SetupDrivers.driver, psl);
	}

	public void visitPage() throws Exception {
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
	}

	public void searchBook(String Bookname) throws Exception {
		psl.txtSearchBox.sendKeys(Bookname);
		Thread.sleep(1000);
	}

	public void clickItem() throws Exception {
		psl.btnSearch.click();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) SetupDrivers.driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);

	}

	public void verifyPrice01() throws Exception {
		String wholePrice = psl.bookPriceWhole.get(0).getText();
		String fractionPrice = psl.bookPriceFraction.get(0).getText();
		String totalPrice = "$" + wholePrice + "." + fractionPrice;

		assertEquals(totalPrice, "$47.49");
		System.out.println(totalPrice);

		Thread.sleep(1000);
		psl.bookList.click();
	}

	public void addToCart() throws Exception {
		JavascriptExecutor jse = (JavascriptExecutor) SetupDrivers.driver;
		jse.executeScript("window.scrollBy(0,300)");

		Thread.sleep(2000);

		String price02 = psl.bookPrice02.getText();
		assertEquals("$47.49", price02);
		System.out.println(price02);

		psl.addToCart.click();
		Thread.sleep(1000);
	}

	public void verifyPrice02() {
		String price03 = psl.bookPrice03.getText();
		assertEquals("$47.49", price03);
		System.out.println(price03);
	}

	public void checkOut() {
		psl.checkOut.click();

	}

}

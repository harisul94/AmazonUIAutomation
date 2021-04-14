@regration
Feature: Add product in the cart and checkout 

Scenario Outline: : User can book from search result and checkout 

	Given Visit amazon.com 
	When Search for Book using "<Bookname>" 
	And Click on 1st item in the listed results 
	And Before Click on add to cart Add to Cart asset price from Step3 
	And Click on Add to Cart 
	And Before Click on Proceed to Checkout asset price from Step3 
	Then Click on proceed to checkout 
	
	Examples: 
		|Bookname       		 |
		|qa testing for beginners|
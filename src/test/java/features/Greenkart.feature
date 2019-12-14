Feature: Greenkart Functions
@SmokeTest
Scenario: Greenkart Purchaase
Given User is on greenkart landing page 
When User searched for "Cucumber" vegetable
Then "Cucumber" results are displayed

@RegressionTest
Scenario Outline: Greenkart Purchaase
Given User is on greenkart landing page 
When User searched for <Name> vegetables
And Added items to cart
And User proceed to checkout page for purchase
Then Verify selected <Name> items are displayed in Check out page

Examples:
|Name   |
|Brinjal|
|Beetroot|

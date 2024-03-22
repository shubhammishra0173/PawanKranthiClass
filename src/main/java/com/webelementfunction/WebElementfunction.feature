Feature: Web Element Function

Background: common steps for web element function

Given Webelement function I open the facebook home page "https://www.facebook.com/login/"
Scenario: webelement function for single element
When I provide the unique location of findelement
Then I should get the webelement


Scenario:  webelement function for multiple elements
When I provide non unique locator 
Then It should return list of the elements
When Webelement I use quit method browser will close

Scenario: working with text box
When I call the sendkeys API with value of "abc.com" it should type in textbox
When I call the gettext API then it should return the text
When I call the clear API it should clear the text
Scenario: working with button,checkbox,hyperlink and radiobutton
#When I click on the button it should perform click button method
When I call the method of hyperlink then new page should open
When I click on the button then it should select radiobutton
When Webelement I use quit method browser will close
Scenario: Working with dropdown - combo box
When I call select by visible method on dropdown it will select the value based on ui
When I call select by index method on dropdown it will select the value based on index
When I call select by text method on dropdown it will select the value based on ui
When I call getoption method then it should return all the list of dropdown
When Webelement I use quit method browser will close
@test
Scenario: Login my profile
When I give my valid credential
Then user should be move in the homepage

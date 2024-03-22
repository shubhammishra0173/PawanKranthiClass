Feature: working with the iframe

Background: common steps for the scenario
Given I navigate to webpage "https://www.globalsqa.com/demo-site/frames-and-windows/"

Scenario: click on the element precise in Iframe
When I perform click on the element which is present in the iframe then it should be open
Then I close the browser
Scenario: Working with multiple window
Given I open the webpage "https://www.w3schools.com/js/js_popup.asp"
When I click on the button it will open browser window
Then I will switch in browser widnow
When I click on the homebutton it will open the homepage
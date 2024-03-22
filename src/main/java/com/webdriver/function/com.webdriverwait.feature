Feature: WebDriver wait function
Background: common step for all the scenario
Given I open the face book homepage "https://www.facebook.com/"

Scenario: web driver wait- fixed wait
When WebDriverwaitfunction I wait for "4000" ,it should wait
Then webdriverfunction I click on login button
#When I call the quite method browser will close

Scenario: web driver wait- Implicit wait
When I set the implicit wait for "10" seconds , it should wait for the elements till 10 seconds before throwing an exception
Then webdriverfunction I click on login button
And I send the value to the username textbox
#When I call the quite method browser will close
Scenario: webdriver wait: Dynamic wait
When I provide the dynamic wait with polling duration has 250 ms and timeout duration has 60 ms
Then webdriverfunction I click on login button
And I send the value to the username textbox
When I call the quite method browser will close
Feature: Browser function
Background:
Given I have chhromebrowser instance

Scenario: Browser function
When BrowsreFunction I use quit method browser will close

Scenario: Brwoser function open webpage
And Browserfunction I call the get with url "https://www.selenium.dev/"

When BrowsreFunction I use quit method browser will close

Scenario: Browser function back forward and refresh
And Browserfunction I call the get with url "https://www.selenium.dev/"
And Browserfunction I call the get with url "https://www.google.com" then it sohuld open the page
Then I call the back api then it should navigate back
Then I call the forward api this should move forward in browser
Then I call the refresh API then it should refresh the webpage

When BrowsreFunction I use quit method browser will close
Scenario: Maximize the browser window
When I called the maximize window then window will maximize

When BrowsreFunction I use quit method browser will close



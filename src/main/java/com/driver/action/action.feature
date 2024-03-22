Feature: Working with mouse and keyboard action
Background: common steps for the scenario
Given I navigate to webpage "https://demos.telerik.com/kendo-ui/dragdrop/events"

Scenario: working with context click
When I create the composite action
Then I build the action
And I perform the action
#When I click quit method thenbrowser will close
Scenario: working with drag and drop action
When I create the composite action for drag and drop
Then I build the action
And I perform the action
#When I click quit method thenbrowser will close
Scenario: Click and hold action
When I create the composite action for click and hold
Then I build the action
And I perform the action
When I click quit method thenbrowser will close
Scenario: Working with keyboard action
When I create the composite action for keyboard
Then I build the action
And I perform the action
When I click quit method thenbrowser will close
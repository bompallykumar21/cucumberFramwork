Feature: This is to test login feature

Scenario: enter valid username and valid password
Given browser is launched
When valid username and password are entered
And clicked on Login button
Then Login should be successfull

Scenario: enter invalid username and invalid password
Given browser is launched
#When valid username and password are entered
#And clicked on Login button
#Then Login should be successfull
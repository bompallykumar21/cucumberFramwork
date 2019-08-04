Feature: This features is used to check test data

Scenario Outline: Verify test data
Given browser is launched
When valid "<username>" and "<password>" are entered
Then test is "Passed"
Examples:
| username | password |
| username_1 | password_1 |
| username_2 | password_2 |

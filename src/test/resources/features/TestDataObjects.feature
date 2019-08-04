Feature: This features is used to check test data

Scenario Outline: Verify test data
Given browser is launched
When valid credentials are entered objectConcept
| username | password |
| <userName> | <password> |
When valid credentials are entered objectConcept again
| userNameSecond | passwordSecond |
| <userNameSecond> | <passwordSecond> |
Then test is "Passed"
Examples:
| userName | password | userNameSecond |passwordSecond |
| username_1 | password_1 |	userNameSecond_1	|	passwordSecond_1 |
#| username_2 | password_2 |

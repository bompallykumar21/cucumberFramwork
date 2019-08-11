Feature: This features is used to check test data

Background: 
Given browser is launched

@RegressionTest
Scenario Outline: Verify test data
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
| username_2 | password_2 |	|	|

@smokeTest
Scenario: Verify tagging1
When executing script using smokeTest

@RegressionTest
Scenario: Verify tagging1
When executing script using regressionTest

@RegressionTest @smokeTest
Scenario: Verify tagging1
When executing script using regressionTest
When executing script using smokeTest
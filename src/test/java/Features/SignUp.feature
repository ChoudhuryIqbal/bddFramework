Feature: Sign Up new Customer Feature 
	This feature deals with the sign up a functionality of the application
	
	
	Scenario:   I am in home page I want to sign up as new user with valid data
	Given : I click My Account Tab
	And I click sign up from dropdown 
	And I enter the following for login
	|First Name | Last Name| Mobile |Email       |password|Confirm Password|
	| Choudhury|  Iqbal | 9299292929|ic@gmail.com|Srilanka|Srilanka|
	And I click sign up button
	Then I should see the customers portal page.
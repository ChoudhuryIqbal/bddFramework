Feature: Sign Up new Customer Feature 
	This feature deals with the sign up a functionality of the application
	
	
	Scenario:   I am in home page I want to sign up as new user with valid data
	Given : I click My Account Tab
	And I click sign up from dropdown 
	And I enter the firstname as"choudhury", last name as "iqbal", mobile no as "1111111111", email as "g@mail.com",password as"password" and ;confirm it "password" 
	And I click sign up button
	Then I should see the customers portal page.
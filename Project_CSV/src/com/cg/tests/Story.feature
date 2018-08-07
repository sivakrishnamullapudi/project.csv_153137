Feature: Project Registration 
Scenario: Successfull Registration 
	Given Registration Page is loaded 
	When Enter employee firstName and lastName 
	And  Enter mail and number 
	And  Enter address and city 
	And Select stateName 
	Then Load Project Page 
	And Click Register for Project
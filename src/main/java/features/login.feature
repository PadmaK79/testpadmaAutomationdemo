Feature: Salesforce Login Feature

@Login
Scenario Outline: Salesforce Login Test Scenario
Given Launch the browser and navigate to SF login page web "<URL>"
When User enters valid Login page details "<username>" "<password>"
When user clicks on Login button
Then user clicks remind me later
 

Examples:
| URL| username | password |
| https://meritagehomes--qa.my.salesforce.com | Padma.Kavitha@meritagehomes.com.qa | Kavimerit#12 |

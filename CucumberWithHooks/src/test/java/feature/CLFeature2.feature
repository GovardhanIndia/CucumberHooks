Feature: Login for LeafTaps
Background:
And enter the username as DemoSalesManager
And enter the password as crmsfa
And click on login button
And click on CRMSFA

Scenario Outline: Create a new lead in leaf tapsLogin
And click on Create Leads Tab
And Enter Company Name as <companyName>
And Enter First Name as <firstName>
And Enter Last Name as <lastName>
And click on create lead
When Validate the first name as <firstName>
Then Lead Created Successfully

Examples:
|companyName|firstName|lastName|
|TCS|Govardhan|Surendran|
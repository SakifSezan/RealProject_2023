Feature: This is a feature to test login functionality
@tag1
Scenario: Verify client can login 
Given Launch <"URL">
Then Enter email address password and hit login button
Then Verify client can login


@tag2
Scenario: Verify user can search items
Given Launch Macys <"URL">
Then Search Manes cologn in search box 

@tag3
Scenario: Verify user can sign up 
Given Launch Demoblaze <"URL">
Then Click Signup link
Then Enter username enter password and click signup button
Then Verify user can sign up 



@tag4
Scenario: Verify user can add items to the cart
Given Launch <"URL"> DB
Then Click Nokia Lumia 1520
And Click Add to Cart button
Then Click Cart link
And  Verify user can add items to the cart


@tag5
Scenario: Check client can login
Given Launch RGPS <"URL">
Then Click login button
Then Enter email address/password and click Sign in button
And Check client can login
Then User can logout

@tag6
Scenario: Verify user can Apply using Apply Now button
Given Launch <"URL"> RGPS
Then Click Apply Now button
Then Fill out Application Form
Then Upload Profile photo
And Verify user can Apply using Apply Now button


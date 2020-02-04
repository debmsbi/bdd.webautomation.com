@homepage
Feature: Application Login

Scenario: Time Entry And Lunch default login
Given Initialize the browser with chrome
When User Enter PTORequestDates "12/25/2019 - 12/25/2019" and ptorequesttype "Sick" and login
Then Verify Timesheet is displayed





Feature: testing google app

Scenario: test telerik demo
Given User hit the telerik site
When User move "Canada" country from source to destination
Then User check the "Canada" country is moved successfully to destination

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file
Background:
 Scenario: Launch
    Given user is in login
    When Click on Elements
    Then vaidate title is "DEMOQA" 
 
   @tag2
  Scenario: Get the Email Address based on name
    When User click on Web Tables
    And user validate text Web Tables
    Then User reads email address for the following users
    |User|
    |Cierra|
    |Alden|
    |Kierra| 
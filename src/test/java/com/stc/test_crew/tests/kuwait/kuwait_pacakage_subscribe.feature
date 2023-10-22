Feature: E2E
  As a user,
  I want to be able to log into the DemoBlaze website,
  So that I can browse and select products, add them to my cart, place an order, and provide my account details for purchase

  Scenario Outline: Validate the Subscription Packages
    Given  stc website open into specific language "<language>"
    Examples:
      | language       |
      | arabic         |

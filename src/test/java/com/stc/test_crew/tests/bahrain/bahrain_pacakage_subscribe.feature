Feature: E2E
  As a customer,
  I want to be able to subscribe into stc package,
  So that I subscribe choose any package for Lite & Classic & Premium


  Scenario Outline: Validate the Subscription Packages
    Given  stc website open into specific language "<language>"
    Examples:
      | language       |
      | arabic         |

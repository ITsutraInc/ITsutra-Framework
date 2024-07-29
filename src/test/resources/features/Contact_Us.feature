Feature: WebDriver ITsutra - Contact Us

  Scenario: Validate Successful Submission
    Given I access the ITsutra Contact Us page
    When I enter a first name
    And I enter a last name
    And I enter an email address
    And I enter a number
    And I enter a service
    And I enter a comment
    And I click on Submit button
    Then I should be presented with a successful contact us submission message
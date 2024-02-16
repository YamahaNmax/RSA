Feature: Framework Test

  As a user I want to check jobs vacancies

  @sanity
  Scenario Outline: Verify user should able to check jobs

    Given I am on homepage of RSA
    When I click on search vacancies
    And I enter "<keyword>","<town>","<business line>","<hire type>"
    And I click on search button
    Then I should able to see the "<job vacancies>"
    Examples:
      | keyword                    | town         | business line      | hire type  | job vacancies                 |
      | Reinsurance Manager        | London       | Account Management | Specialist | Assistant Reinsurance Manager |
      | Credit Control Team Leader | Halifax      | Finance            | Specialist | Credit Control Team Leader    |
      | Reinsurance Manager        | London       | Account Management | Specialist | Senior QA Tester              |



Feature: Checking google

@Test
Scenario: Google Search
    Given user is present on Google URL
    And enter a search keyword 
    Then click search
    Then Search results are generated 
    
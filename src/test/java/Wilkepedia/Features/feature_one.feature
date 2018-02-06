Feature: Search

Scenario: Wikipediia Search

  Given I have launched my browser
  When I navigate to wikipedia
  And enter the text London
  And Select English as the search language
  And click on the search button
  Then I am on the search result page
  And the first heading of the result matches the text london
  And the result page contains the text From Wikipedia, the free encyclopedia confirming that language displayed is English




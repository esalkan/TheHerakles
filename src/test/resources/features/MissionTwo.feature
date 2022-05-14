Feature: Mission 2 Task
    @wip
    Scenario: Search for actors
      Given navigate to search engine
      When enter search bar for actor name "Bruce Willis"
      Then enter keys on keyboard
      And select "Bruce Willis - IMDb" from search results
      Then verify that title is "Bruce Willis - IMDb"

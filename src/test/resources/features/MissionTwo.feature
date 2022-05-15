# @author esalkan
# @vcard https://esalkan.com
# @project TheHerakles Task No :82
# @type Desktop Web Automation
# @repo https://github.com/esalkan/TheHerakles.git
Feature: Mission 2 Task

  @wip
  Scenario: Search for actors
      # 1. Navigate to “www.google.com”
    Given navigate to search engine
      # 2. Search for “Bruce Willis”
    When enter search bar for actor name "Bruce Willis"
      # 3. Click on the result from IMDB
    And select "Bruce Willis - IMDb" from search results
      # 4. After opening the “Bruce Willis” page on IMDB
    Then verify that title is "Bruce Willis - IMDb"
      # 4. ...., in the “Filmography” section, click on the drop down element that has a text with “Show by...”
    And select Show by... from drop down menu
    # 5. Select “Genre” from the drop down element
    Then select "Genre »" from drop down menu
    # 6. After navigating to the related page, click on the “Keywords” vertical tab from the “refine” section
    And click on the Keywords vertical tab from the refine section
    # 7. Verify the keywords are not sorted by name
    Then verify the keywords are not sorted by name
    # 8. And verify that “Incredible” is not a word in the keyword list.
    Then verify that "Incredible" is not a word in the keyword list

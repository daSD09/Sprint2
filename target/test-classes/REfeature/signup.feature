Feature: comments feature in Realestate application

  Background: Verify Login functionality
    Given User is on login page
    When User enter username and password
    Then user clicks on Login button
    And User is redirected to the dashboard
    Then User navigates to the comment section

  @search_funtion
  Scenario Outline: Verify search comment functionality by name, email id
    When User clicks the search field
    And User enters the name"<bh>"
    #Then User clicks the search button
    #And User enters the name"<yash@gmail.com>"
    Then User clicks the search button

    Examples: 
      | bh             |
      | yash@gmail.com |

  @filter_funtion
  Scenario Outline: Verify all comments functionality by comment type
    When User clicks the all comments dropdown list
    And User enters any option"<comments>" "<pings>"
    Then User clicks the filter button

    Examples: 
      | comments |
      | pings    |

  @spam_funtion
  Scenario Outline: Verify spam comment functionality
    When User clicks the spam button
    And User is directed to the spam folder
    Then User clicks the not spam button
    Then User clicks the delete permanently button

    Examples: 
      | spam               |
      | not spam           |
      | delete permanently |

  @movetotrash_funtion
  Scenario Outline: Verify move to trash functionality
    When User clicks the trash button
    And User is directed to the trash folder
    Then User clicks the spam button
    Then User clicks the restore button
    Then User clicks the delete permanently button

    Examples: 
      | spam               |
      | restore            |
      | delete permanently |

  @bulkactions
  Scenario Outline: Verify Bulk action functionality
    When User selects checkbox of comment
    Then User selects bulk actions dropdown list
    And User selects any option"<approve>" "<mark as spam >"
    Then User selects apply button

    Examples: 
      | approve      |
      | mark as spam |

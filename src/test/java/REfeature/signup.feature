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
    And User enters the name"<yash@gmail.com>"
    Then User clicks the search button

    Examples: 
      | bh             |
      | yash@gmail.com |

  @filter_funtion
  Scenario Outline: Verify filter functionality by comment type
    When User clicks the all comments type field
    Then User selects any of one option"<commenttype>"
    Then User clicks the filter button

   
    Examples: 
      | commenttype |
      | comments    |
      | pings       |

  @bulk_functionality
  Scenario Outline: Verify bulk functionality
    When User clicks bulk functions field
    Then User selects any of one option"<bulkoptions>"
    Then User clicks the apply button

    
      | bulkfunctions |
      | approve       |
      | unapprove     |

  @spam_funtion
  Scenario Outline: Verify spam comment functionality
    When User clicks the spam button
    And User is directed to the spam folder
    Then User selects any of one option"<spamoptions>"

    Examples: 
      | spamoptions        |
      | not spam           |
      | delete permanently |

  @movetotrash_funtion
  Scenario Outline: Verify move to trash functionality
    When User clicks the trash button
    And User is directed to the trash folder
    Then User selects any of one option"<trashoptions>"

    Examples: 
      | trashoptions       |
      | restore            |
      | delete permanently |

  @edit_function
  Scenario Outline: Verify edit functionality
    When User clicks edit button
    Then User is directed to the edit comment box
    And User selects the text to be editted
    Then User selects any of one option"<editoptions>"
    Then User selects update button

    Examples: 
      | editoptions |
      | bold        |
      | italics     |

  @quickedit_function
  Scenario Outline: Verify quick edit functionality
    When User clicks quick edit button
    And User is directed to quick edit comment box
    And User selects the text to be editted
    Then User selects any of one option"<editoptions1>"
    Then User selects update comment button

    Examples: 
      | editoptions1 |
      | bold        |
      | italics     |

  @reply_function
  Scenario Outline: Verify reply functionality
    When User clicks reply button
    And User is directed to reply to comment box
    And User types the reply "<hello>"
    Then User selects any of one option"<editoptions2>"
    Then User selects approve and reply button

    Examples: 
      | editoptions2 |
      | hello       |
      | bold        |
      | italics     |

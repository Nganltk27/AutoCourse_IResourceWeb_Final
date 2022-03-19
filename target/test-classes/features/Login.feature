Feature: Login functionality
  I want to verify the Login functionality

  @TC_LG_01
  Scenario: Cannot login account successful when leaving all fields blank
    Given Navigate to Login page
    When Leave all fields blank
    Then The message should display

  @TC_LG_02
  Scenario Outline: Login account successful when inputting valid data
    Given Navigate to Login page
    When Input valid data in all fields
      | email                   | password|
      | ngan.ltk27+12@gmail.com | Ngan@12345 |
    And Click on Login button
    Then The Manage Projects page should display with "<title>"
    Examples:
      | title           |
      | Manage Projects |

  @TC_LG_03
  Scenario Outline: Cannot login account successful when leaving Email field
    Given Navigate to Login page
    When Input valid data into Password field
      | password   |
      | Ngan@12345 |
    And Click on Login button
    Then The error message should display below Email field with "<message>"
    Examples:
      | message   |
      | Required! |

  @TC_LG_04
  Scenario Outline: Cannot login account successful when inputting space characters into Email field
    Given Navigate to Login page
    When Input space characters into Email field
      | Email | Password   |
      || Ngan@12345 |
    And Click on Login button
    Then The error message should display below Email field with "<message>"
    Examples:
      | message   |
      | Required! |

  @TC_LG_05
  Scenario Outline: Cannot login account successful when inputting invalid Email
    Given Navigate to Login page
    When Input invalid format email
      | Email                | Password   |
      | ngan@gmail           | Ngan@12345 |
    And Click on Login button
    Then The error message should display below email field with "<message>"
    Examples:
      | message              |
      | Invalid email format |
#
  @TC_LG_06
  Scenario Outline: Cannot login account successful when inputting unregistered email
    Given Navigate to Login page
    When Input unregistered email
      | Email                | Password   |
      | ngan@gmail.com       | Ngan@12345 |
    And Click on Login button
    Then The error message should display popup top-right with "<message>"
    Examples:
      | message                       |
      | Email or password is invalid. |

  @TC_LG_07
  Scenario Outline: Cannot login account successful when leaving Password field
    Given Navigate to Login page
    When Input valid data in Email field
      | Email                   |
      | ngan.ltk27+12@gmail.com |
    And Click on Login button
    Then The error message should display below Password field with "<message>"
    Examples:
      | message   |
      | Required! |

  @TC_LG_08
  Scenario Outline: Cannot login account successful when inputting space characters into Password field
    Given Navigate to Login page
    When Input space characters into Password field
      | email                   | password |
      | ngan.ltk27+12@gmail.com |          |
    And Click on Login button
    Then The error message should display below Password field with "<message>"
    Examples:
      | message   |
      | Required! |

  @TC_LG_09
  Scenario Outline: Cannot login account successful when inputting invalid password
    Given Navigate to Login page
    When Input wrong password
      | email                   | password |
      | ngan.ltk27+12@gmail.com | 123456789|
    And Click on Login button
    Then The error message should display popup top-right with "<message>"
    Examples:
      | message                       |
      | Email or password is invalid. |
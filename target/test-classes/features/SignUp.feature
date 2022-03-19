Feature: Login functionality
  I want to verify the Sign up functionality

  @TC_SU_01
  Scenario Outline: Can navigate to Sign Up page successful when click on Sign Up hyperlink
    Given Go to Login page
    When Click on Sign Up hyperlink
    Then The Sign Up page should display with "<title>"
    Examples:
      |title|
      |Sign Up|

  @TC_SU_02
  Scenario Outline: Sign up an account successful when inputting valid data in all fields
    Given Go to Login page
    When Click on Sign Up hyperlink
    And Input valid data into all fields
      | firstname | lastname | email                   | password  | confirm password |
      | Han       | Phan     | ngan.ltk27+a1@gmail.com | Han@12345 | Han@12345        |
    And Click on Sign Up button
    Then The Verify email should display with "<title>"
    Examples:
      | title        |
      | Verify Email |

  @TC_SU_03
  Scenario Outline: Cannot sign up an account successful when leaving all fields blank
    Given Go to Login page
    When Click on Sign Up hyperlink
    And Miss all fields blank
    And Click on Sign Up button
    Then The warning message should display "<message>"
    Examples:
      | message   |
      | Required! |

  @TC_SU_04
  Scenario Outline: Cannot sign up an account successful when input number in Firstname field
    Given Go to Login page
    When Click on Sign Up hyperlink
    And Input number in Firstname field and valid data in remaining fields
      | firstname | lastname | email                   | password  | confirm password |
      | 1234      | Phan     | ngan.ltk27+a1@gmail.com | Han@12345 | Han@12345        |
    And Click on Sign Up button
    Then The warning message should display below Firstname field with "<message>"
    Examples:
      | message   |
      | Please enter valid name |

  @TC_SU_05
  Scenario Outline: Cannot sign up an account successful when input number in Lastname field
    Given Go to Login page
    When Click on Sign Up hyperlink
    And Input number in Lastname field and valid data in remaining fields
      | firstname | lastname | email                   | password  | confirm password |
      | Haha      | 1565     | ngan.ltk27+a1@gmail.com | Han@12345 | Han@12345        |
    And Click on Sign Up button
    Then The warning message should display below Lastname field with "<message>"
    Examples:
      | message   |
      | Please enter valid name |


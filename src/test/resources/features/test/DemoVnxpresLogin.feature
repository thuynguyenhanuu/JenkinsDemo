@zIceAge
Feature: Test auto login 456

  @loginvnxrep
  Scenario Outline: login vnxpress
    Given open web vnxpress
    When user click on button dang nhap
    And user login web news with email "<email>" and password "<pass>"
    Examples:
      | email             | pass        |
      | thuy123@gmail.com | 12345Thuy@? |
      | chu123@gmail.com  | 12345Abc@?  |


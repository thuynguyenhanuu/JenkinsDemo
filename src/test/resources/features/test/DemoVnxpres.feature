#@driver:firefox
@zIceAge
Feature: Test auto 123

  @tintuc
  Scenario: search search
    Given open web vnxpress
    When user click on button thoi su
    And user click on button chinh tri
    And user search data with keyword
      | search        |
      | hehee         |
      | finish search |


  @tintuc
  Scenario: get Session
    Given open web vnxpress
    And user call session at step search


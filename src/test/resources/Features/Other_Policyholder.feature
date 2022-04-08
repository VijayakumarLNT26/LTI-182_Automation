
@LTI182
Feature: Validate Other policy holder feature enabled
  


  Scenario Outline: Validate Other Policy holder option enabled 
    Given I login with valid credentials "<username>" and "<password>"
    When I open existing application "<applicationRef>" and navigate to contract tab
    Then I select language as "<language>"
    Then I select policy holder from dropdown as "<policyholder>"
    Then I enter other policyholder "<firstname>" and "<lastname>"
    
    Examples: 
    |      username       |   password   | applicationRef | language | policyholder | firstname | lastname |
    | breathelife@lacapitale.com | MmdZLQ@7FWj0YbW |   E71348163    | English  |   Other			|   Auto    |  Payer   |
Feature: Feature to test Edit Application field1


  Scenario Outline: TC_02_Check user is able to Edit Application
    Given user enters "<username>" and "<password>"
    When user enters info "<firstname>" and "<lastname>"
    
    Examples:
    |      username     | password   |firstname|lastname|
    |dev@breathelife.com|9Lf06$9^GQox|David    |Smit|
 
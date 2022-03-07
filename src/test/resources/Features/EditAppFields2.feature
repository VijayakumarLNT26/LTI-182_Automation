Feature: Feature to test Edit Application field2


  Scenario Outline: TC_03_Check user is able to Edit Application
    Given user enters credentials "<username>" and "<password>"
    When user enters details  "<firstname>" and "<lastname>"
    Then select sex and marital status
    
    Examples: 
    |      username     | password   |firstname|lastname|
    |dev@breathelife.com|9Lf06$9^GQox|David    |Smit|
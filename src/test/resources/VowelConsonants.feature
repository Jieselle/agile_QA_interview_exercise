Feature: VowelConsonants

  Scenario:
    Given the following words:
      | FIRST SENTENCE |
      | second         |
    When count vowels and consonants
    Then this counts should return:
      | 0               | 0                   |
      | 2               | 4                   |

  Scenario:
    Given the following words:
      | first £$%£@$%  2341234 sentence |
      | second ":{}:> f@@9087           |
      | third   sentENCE                |
    When count vowels and consonants
    Then this counts should return:
      | 4               | 9                   |
      | 2               | 5                   |
      | 2               | 7                   |

  Scenario:
    Given the following words:
      | first sentence |
      | second         |
      | third          |
      | fourth         |
      | fifth          |
    When count vowels and consonants
    Then null should be returned

  Scenario:
    Given empty list
    When count vowels and consonants
    Then empty list should be returned


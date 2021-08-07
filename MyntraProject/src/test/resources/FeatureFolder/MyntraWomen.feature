Feature:  Myntra select Women funtionlity

@Regrassion @Sanity 
Scenario: Search for women
Given Open the Myntra homepage
When Select the Women icon
Then User should able to select women products

Scenario Outline:  Myntra woman Brand outline
Given Open the Myntra homepage
When Select the Women "<Itemes>"
And  Filter by "<Brand>"
Then User able to select their products
 Examples:
 |Items|Brand|
 |T-shirt|Nike|
 |Shoes|anybrand|
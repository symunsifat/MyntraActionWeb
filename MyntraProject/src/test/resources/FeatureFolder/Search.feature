Feature:  This feature file is for Myntra Search box

@Sanity @Regrassion
Scenario: Verify Search Functionality
Given: Customer landing on the Myntra homepage
When: Click on the Search box and write baby shoes
And: Click on Asics Kids Solid Running Shoes
Then: User able to see the ASICS Kids Black Solid Running Shoes in another tab

@Regrassion @Smoke
Scenario Outline: Verify Search Functionality
Given: Open Myntra website
When: Search for "<Items>"
And: Filter by "<Brand>"
Then: Item List Should have product of "<Brand>"

Examples: 
|Items|Brand|
|Shoes|Nike|
|Shirts|Gap|

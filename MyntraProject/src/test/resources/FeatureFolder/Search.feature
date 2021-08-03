Feature:  This feature file is for Myntra Search box

Scenario: Verify Search Functionality
Given: Customer landing on the Myntra homepage
When: Click on the Search box and write baby shoes
And: Click on Asics Kids Solid Running Shoes
Then: User able to see the ASICS Kids Black Solid Running Shoes in another tab

Scenario Outline: Verify Search Functionality
Given: Customer landing on the Myntra homepage
When: Click on the Search box and write baby shoes
And: User should be able to land on the Myntra homepage
And: User should be able to click on the image Kids Club
Then: User should be able to land on the Kids Club page
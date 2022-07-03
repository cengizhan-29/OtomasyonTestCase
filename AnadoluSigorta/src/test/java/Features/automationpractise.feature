Feature: Control Shooping Cart

  Scenario: Control Total,Total Products and Qty areas on the Shooping Cart

    Given Automation practise page is opened
    When I clicked the signin button
    Then I should be seeing that login page is opened
    When I entered "cyesilyurt29@gmail.com" and "Cengiz123." on the realated fields and clicked the signin button
    Then I should be seeing that Main page is opened
    When I clicked the "Woman" Tab on the Main Page
    Then I should be seeing that products of the women on the Category Page
    When I checked the Subcotegories on the the Category Page
    #Then I should be seeing that "TOPS" and "DRESSES" under the Subcotegories
    When I clicked on the 5. product on the Category Page
    Then I should be seeing that Details of Product  on the Product Detail Page
   When I clicked + button "3" times for piece of product on the Product Details Page
    And I clicked on the Add to Cart button on the Product Detail Page
    Then I should be seeing that "Total products" popup message
   When I clicked on the "Proceed to checkout" button on the Product Detail Page
    Then I should be seeing that Shooping Cart is opened like "Your shopping cart contains"
    When I checked the "Total","Total Products" and "Qty" areas
   # Then I should be seeing that "Total","Total Products" and "Qty" fields informaitons of related product

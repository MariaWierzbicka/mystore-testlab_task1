Feature: Log in and add new address
  Scenario Outline:
    Given user has an account on https://mystore-testlab.coderslab.pl/ and is not logged in
    When sign in button is clicked
    And valid {email} and {password} are entered and sign in button is clicked
    And Logged users name is clicked
    And Addresses or Add First Address is clicked
    And Create New Address is clicked
    And form is filled with <alias> <address> <city> <zipcode> <country> <phone>
    And Save button is clicked
    Then success alert is displayed
    And added address is displayed
    Examples:
    | alias       | address                  | city                        | zipcode | country     | phone          |
    | mauris elit | 507-209 Commodo St.      | Quarona                     | 54223   | Philippines | (699) 423-7411 |
    | et lacinia  | Ap #316-7776 Gravida Rd. | Soledad de Graciano Sanchez | T4V 3V4 | Spain       | (508) 718-4987 |
    | nec metus   | 381-5513 Scelerisque St. | Dipignano                   | 7763    | Mexico      | (457) 568-6960 |
    | risus at    | 794-8117 Lorem, Rd.      | Copiapa                     | 51819   | Brazil      | 1-964-306-3284 |

Feature: Log in and add new address

  Scenario Outline:
    Given user has an account on mystore-testlab.coderslab.pl and is not logged in
    When sign in button is clicked
    And valid <email> and <password> are entered and sign in button is clicked
    And Addresses button is clicked
    And Create New Address is clicked
    And form is filled with data "<alias>" "<address>" "<city>" "<zipcode>" "<country>" "<phone>"
    And Save button is clicked
    Then success alert is displayed
    And added address is displayed with proper data "<alias>" "<address>" "<city>" "<zipcode>" "<country>" "<phone>"
    Examples:
      | email                        | password  | alias          | address              | city      | zipcode | country        | phone          |
      | euhusxlmggfextjier@cwmxc.com | password1 | First Address  | 209 Comodo St.       | Quarona   | 54223   | United Kingdom | (699) 423-7411 |
      | luiepmnvnpuunhruhc@cazlg.com | password2 | Second Address | 7776 Gravida         | Boston    | T4V 3V4 | United Kingdom | (508) 718-4987 |
      | euhusxlmggfextjier@cwmxc.com | password1 | Third Address  | 5513 Scelerisque St. | Dipignano | 7763    | United Kingdom | (457) 568-6960 |
      | luiepmnvnpuunhruhc@cazlg.com | password2 | Fourth Address | 8117 Lorem Rd        | Copiapa   | 51819   | United Kingdom | 1-964-306-3284 |

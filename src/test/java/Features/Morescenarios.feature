Feature:  To provide multiple scenario in the file

    Background:open chrome
    Given open chrome and launch the URL as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


  Scenario: passing directly as string
      And username as "Admin" and password as "admin123"

      Scenario: passing datas with only datavalues
        Then passing datas with only datavalues
          |Admin|
           |admin123|

        Scenario: passing datas with header
          Then passing datas with header
          |username|Admin|
          |password|admin123|

          Scenario Outline: passing data as Examples
            Then passing data as Examples with username  as "<username1>" and password as "<password1>"
            Examples:
              |username1|password1|
              |Admin|admin123|


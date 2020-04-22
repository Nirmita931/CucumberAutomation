@03_SnfUpdatePremium
  Feature: Update Premium SNF Info

    Background:
      Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
      Then I choose "skilledNursing" care type
      Then I search for the facility on the search field with name "A New SNF Facility"
      Then I click on the facility from the dropdown

      Scenario Outline: Update the Premium Information of recently created SNF in PAC portal.
        Then I should be directed to the PAC portal
        Then I click on Premium Listing option from sub-left navigation bar
        Then I enter the description"<Description>", "<Website>" and Response of Rating "<RatingResponse>"
        Then I click on Save Changes button and verify the snackbar message
        Then I enter the "<spFeature1>", "<spFeature2>", "<spFeature3>", "<spFeature4>", "<spFeature5>", "<spFeature6>", "<spFeature7>", "<spFeature8>", "<spFeature9>", "<spFeature10>", "<spFeature11>", "<spFeature12>"

        Then I click on Save Changes button and verify the snackbar message
        Then I enter the testimonial "<Testimonial1>", "<Tname1>", "<Testimonial2>", "<Tname2>", "<Testimonial3>", "<Tname3>", "<Testimonial4>", "<Tname4>", "<Testimonial5>", "<Tname5>"
        Then I click on Save Changes button and verify the snackbar message
        Then I upload a brochure "<Brochure1>"
        Then I click on Save Changes button and verify the snackbar message
        And I log out of the PAC portal
        Examples:
          | Description | RatingResponse | Website | spFeature1 | spFeature2 | spFeature3 | spFeature4 | spFeature5 | spFeature6 | spFeature7 | spFeature8 | spFeature9 | spFeature10 | spFeature11 | spFeature12 | Testimonial1 | Tname1 | Testimonial2 | Tname2 | Testimonial3 | Tname3 | Testimonial4 | Tname4 | Testimonial5 | Tname5 | Brochure1                                                          |
          | abc         | adf            | xcvx    | asdf       | gdgds      | ersgdf     | eshrsdf    | asd        | sdgdf      | sdgsdf     | sdgdfs     | rete       | dfsgsdf     | sdfgsd      | sdgdsf      | agfgdf       | asfas  | asdfa        | asfas  | aadfgag      | adfadf | aadf         | asdad  | asd          | aga    | /Users/mac/IdeaProjects/CucumberSelenium/src/test/Files/sample.pdf |


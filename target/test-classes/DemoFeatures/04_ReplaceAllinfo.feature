@04_ReplaceAllInfo
  Feature: Replace All Info

    Background:
      Given I click on login after entering username "nirmita@gmail.com" and password "Orange1!"
      Then I choose "skilledNursing" care type
      Then I search for the facility on the search field with name "A New SNF Facility"
      Then I click on the facility from the dropdown

      Scenario Outline:
        Then I should be directed to the PAC portal
        Then I select Insurance In-Network option from the sub-left navigation bar
        Then I search and select for the insurance
          | Coresource | 4C Medical Group |
        Then I click on Save Changes button and verify the snackbar message

        Then I click on the Services option from the sub-left navigation bar
        Then I search and select for the service
          | 1:1 Sitters | HIV/AIDS |
        Then I click on Save Changes button and verify the snackbar message

        Then I click on Standard Listing option from the left nav bar
        Then I should fill all information "<LegalName>", "<PreviousName>", "<NPI>", "<UniqueId>", "<FaxNumber>", "<Capacity>", "<Station>", "<Staff>"
        Then I click on Save Changes button and verify the snackbar message

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
          | LegalName   | PreviousName   | NPI  | UniqueId | FaxNumber  | Capacity | Station | Staff | Description | RatingResponse | Website | spFeature1 | spFeature2 | spFeature3 | spFeature4 | spFeature5 | spFeature6 | spFeature7 | spFeature8 | spFeature9 | spFeature10 | spFeature11 | spFeature12 | Testimonial1 | Tname1   | Testimonial2 | Tname2  | Testimonial3 | Tname3    | Testimonial4 | Tname4    | Testimonial5 | Tname5  | Brochure1                                                          |
          | Legal Name1 | Previoud Name1 | 0011 | 0021     | 9872343178 | 600      | 60      | 34534 | abewc       | adfsfd         | xcsdfvx | assdfdf    | gdgsdfds   | ersgdfsf   | eshsdfrsdf | asfdsd     | sdgdsfdf   | sfddgsdf   | sdgdfdsafs | rsdete     | dfssdhfgsdf | sdfsgdfgsd  | sdsdfgdsf   | agfgsdfgdf   | assfdfas | asfdgsdfa    | asfgfas | aadsdfgfgag  | asdgdfadf | adsfgadf     | assdfgdad | asgsfd       | afsdgga | /Users/mac/IdeaProjects/CucumberSelenium/src/test/Files/sample.pdf |


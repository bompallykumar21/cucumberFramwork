@Routing
Feature: Single Pet Enrollments deom Salesforce to GIN and REN

  Background:
    Given User login to Salesforce application with valid Credentials

  @Todo
  Scenario Outline: Pet Enrollment with non wholepet for New born minimum age is 10 weeks
    When user navigates to "SQT" link
    And A lead is created with following data
      | leadFirstName   | leadLastName   | leadEmail   | leadPhone   | leadState   |
      | <leadFirstName> | <leadLastName> | <leadEmail> | <leadPhone> | <leadState> |
    And fill in pet details
      | petName   | petSpecies   | petBreed   | petAge   | planForPet   |
      | <petName> | <petSpecies> | <petBreed> | <petAge> | <planForPet> |
    And get the quote
    Then store the values for below
      | Total Annual Premiums          |
      | Monthly Premium (includes fee) |
    And Save the quote
    When user edit the person account details
    And A lead is created with following address
      | leadAddress | leadCity | billingState | leadZipCode |
      | PO Box 9998 | Tsaile   | AZ           | 86556       |
    And user saves the account info
    And user clicks on enrollment button
    And user performs the enrollment with following insured info
      | leadGender | leadDOB      |
      | Male       | current date |
    And user performs the enrollment with following origin info
      | OriginType  | OriginCode                   | VipCode                             |
      | ADVERTISING | ADVERTISING - GENERAL (0001) | ALL CONTACT WITH NAMED INSURED ONLY |
    And user performs the enrollment with following pet info
      | AcquiredDate | PetSex | PetColor | Provider |
      | current date | Female | BEIGE    | Yes      |
    And user performs the enrollment with following product info
      | fsa |
      | Yes |
    And answer following medical questions
      | routineVisits | physicalExam | recordRequired |
      | No            | Yes          | Yes            |
    And user performs the enrollment with following payment info
      | paymentMethod | paymentPlan          | glb | creditCardNumber | creditCardExpiration | sameAsInsured |
      | Credit Card   | CORE ANNUAL FULL PAY | Yes | 4112344112344113 | 02/2020              | Yes           |
    And Submit the enrollment application
    Then Store Policy Number which is generated
    And Click on Make Payment button
    And Verify Payment Successful
    Given User login to Ren application with valid Credentials
    And Click on IT RESEARCH
    And Click on menu "Policy Information"
    And Click on "Insured Query"
    And Search for the generated policy number
    And click on Search
    And Click on Policy No
    Then Verify Pet Name and Policy Number is valid
    Examples:
      | leadFirstName | leadLastName | leadEmail        | leadPhone  | leadState | petName | petSpecies | petBreed          | petAge | planForPet |
      | MinFN         | MinLN        | LeadFN@email.com | 78437***** | ARIZONA   | kkk     | CANINE     | AMERICAN FOXHOUND | 3      | MM100T     |
#     | MinFN         | MinLN        | LeadFN@email.com | 78437***** | ARIZONA   | kkk     | FELINE     | AMERICAN BOBTAIL  | 4      | MM100T     |

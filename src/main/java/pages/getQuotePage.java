package pages;

	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindAll;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;

	import static org.openqa.selenium.Keys.TAB;

	public class getQuotePage {

	    WebDriver driver;	  

	    @FindBy(xpath = "//input[contains(@id,'groupInclude')]")
	    public WebElement groupCheckbox;

	    @FindBy(xpath = "//img[contains(@src,'BinocularsIcon')]")
	    public WebElement groupSearch;

	    @FindBy(xpath = "//input[contains(@id,'EntityCode')]")
	    public WebElement entityCode;

	    @FindBy(xpath = "//input[contains(@id,'groupSearchSubmit')]")
	    public WebElement groupSearchSubmit;

	    @FindBy(xpath = "//input[contains(@src,'PlusSign')]")
	    public WebElement groupPlusIcon;

	    @FindBy(xpath = "//input[contains(@id,'groupCode')]")
	    WebElement groupCode;

	    @FindBy(xpath = "//input[contains(@id,'groupName')]")
	    WebElement groupName;

	    @FindBy(xpath = "//div[contains(@id,'leadInfo')]//input[contains(@id,'firstName')]")
	    WebElement leadFirstName;

	    @FindBy(xpath = "//div[contains(@id,'leadInfo')]//input[contains(@id,'lastName')]")
	    WebElement leadLastName;

	    @FindBy(xpath = "//div[contains(@id,'leadInfo')]//input[contains(@id,'email')]")
	    WebElement leadEmail;

	    @FindBy(xpath = "//div[contains(@id,'leadInfo')]//input[contains(@id,'phone')]")
	    WebElement leadPhoneNumber;

	    @FindBy(xpath = "//div[contains(@id,'leadInfo')]//select[contains(@id,'state')]")
	    WebElement stateDropDown;

	    @FindBy(xpath = "//label[text()='Zip Code:']/../following-sibling::td/input")
	    WebElement zipCodeTxtBox;

	    // When we are working with multiple pets, write dynamic xpath for pet row
	    // filling and loop it for n no.fo rows.
	    // The below xpaths selects first row pet details
	    @FindBy(xpath = "//input[contains(@id,'formQuote:petName')]")
	    WebElement petName;

	    @FindBy(xpath = "//select[contains(@id,'formQuote:speciesSelect')]")
	    WebElement petSpeciesDropDown;

	    @FindBy(xpath = "//select[contains(@id,'formQuote:breedSelect')]")
	    WebElement petBreedDropDown;

	    @FindBy(xpath = "//input[contains(@id,'formQuote:dobString')]")
	    WebElement petDOB;

	    @FindBy(xpath = "//input[contains(@id,'formQuote:petAge')]")
	    WebElement petAge;

	    @FindBy(xpath = "//select[contains(@id,'formQuote:newRenewSelect')]")
	    WebElement petRenewDropDown;

	    @FindBy(xpath = "//select[contains(@id,'formQuote:productSelect')]")
	    WebElement petPlanDropDown;

	    @FindBy(id = "j_id0:formQuote:riderSelect1")
	    WebElement pet1CareGuardRiderDropDown;

	    @FindBy(id = "j_id0:formQuote:cancerSelect1")
	    WebElement pet1CancerStatusDropDown;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:basePremiumField1']")
	    WebElement pet1basePremiumTxtBox;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:riderPremiumField1']")
	    WebElement pet1RiderPremiumTxtBox;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:totalPremiumField1']")
	    WebElement pet1MonthlyPremiumtxtBox;

	    @FindBy(xpath = "j_id0:formQuote:btnSave")
	    WebElement SaveBtn;

	    @FindBy(xpath = "//input[contains(@onclick,'saveQuoteStatus')]")
	    WebElement saveQuote;

	    @FindBy(id = "j_id0:formQuote:Enrollment")
	    WebElement enrollmentButton;

	    @FindBy(xpath = "//input[@id='j_id0:formQuote:Enrollment'][@type='submit']")
	    WebElement enrollmentBtn;

	    @FindBy(id = "j_id0:formQuote:clearPets")
	    WebElement clearPetsBtn;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:quoteIterator']/table/tbody/tr[13]/td[2]")
	    WebElement basePremiumTotal;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:quoteIterator']/table/tbody/tr[13]/td[3]")
	    WebElement riderPremiumTotal;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:quoteIterator']/table/tbody/tr[13]/td[4]")
	    WebElement totalPremiumTotalMonthly;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:quoteIterator']/table/tbody/tr[15]/td[3]")
	    WebElement totalSurCharges;

	    public double getBasePremiumTotal () {
	        double basePremiumTotalValue=Double.valueOf( basePremiumTotal.getText().trim().substring( 1 ).replace( ",","" ) );
	        return basePremiumTotalValue;
	    }

	    public double getTotalSurCharges () {
	        double totalSurChargesValue=Double.valueOf( totalSurCharges.getText().trim().substring( 1 ).replace( ",","" ));
	        return totalSurChargesValue;
	    }

	    public double getTotalAnualPremium () {
	        double totalAnualPremiumValue=Double.valueOf( totalAnualPremium.getText().trim().substring( 1 ).replace( ",","" ));
	        return totalAnualPremiumValue;
	    }

	    @FindBy(xpath = "//span[text()='Total Annual Premiums:']/../following-sibling::td/span")
	    WebElement totalAnualPremium;

	    @FindBy(xpath = "//span[text()=' Monthly Premium (includes fee):']/../../following-sibling::td/span")
	    WebElement monthlyPremium;

	    @FindBy(xpath = "//div[@id='j_id0:formQuote:quoteIterator']/table/tbody/tr[21]/td[3]")
	    WebElement initialPaymenttxtBox;

	    @FindBy(xpath = "//input[@value='Get Quote']")
	    WebElement getQuoteBtn;

	    @FindBy(xpath = "//span[text()='Total Discount:']/../following-sibling::td/span")
	    WebElement totalDiscount;

	    @FindBy(className = "messageText")
	    public WebElement getQuotePageErrorMessage;

	    @FindBy(id = "quoteWaitingBar")
	    WebElement quoteWaitingBar;


	    @FindBy(xpath = "//table[@class='messageTable']//div")
	    WebElement errorMessage;

	    @FindBy(xpath = "//*[@id='j_id0:formQuote:ginQuoteNumber']")
	    WebElement lblGINQuote;

	    @FindBy(xpath = "//*[@id='j_id0:formQuote:totalAnnualPremiumsField']")
	    WebElement lblAnnualPremium;

	    @FindBy(xpath = "//*[@id='j_id0:formQuote:breedSelect1']")
	    WebElement lblPetBreed;

	    @FindAll ({@FindBy(xpath="//select[contains(@id,'formQuote:breedSelect')]")})
	    private List<WebElement> lblPetBreeds;

	    @FindAll ({@FindBy(xpath="//div[contains(@id,'formQuote:basePremiumField')]//span")})
	    private List<WebElement> lblBasePremiums;

	    @FindAll ({@FindBy(xpath="//input[contains(@id,'formQuote:dobString')]")})
	    private List<WebElement> lblPetDOBs;

	    @FindAll ({@FindBy(xpath="//select[contains(@id,'formQuote:speciesSelect')]")})
	    private List<WebElement> lblPetSpeciess;

	    @FindBy(xpath = "//*[@id='j_id0:formQuote:j_id57:state']")
	    WebElement lblLeadState;

	    @FindBy(xpath = "//*[@id='j_id0:formQuote:dobString1']")
	    WebElement lblPetDOB;

	    @FindBy(xpath = "//*[@id='j_id0:formQuote:speciesSelect1']")
	    WebElement lblPetSpecies;

	    @FindBy(xpath = "//a[@id='j_id0:formPersonSearch:j_id5:j_id8:0:j_id10']")
	    WebElement lnkName;

	  
	    public String getpetDOB() {
	        String getpetDOBValue = lblPetDOB.getAttribute( "value" );
//	        System.out.println( "Pet DOB#####"+getpetDOBValue );
	        return getpetDOBValue;
	    }

	    public String getpetSpecies() {
	        Select select=new Select( lblPetSpecies );
	        String getpetSpeciesValue=select.getFirstSelectedOption().getText();
//	        System.out.println( "Prem Species Value#####"+getpetSpeciesValue);
	        return getpetSpeciesValue;
	    }

	    public String getpetBreed() {
	        Select select=new Select( lblPetBreed );
	        String getpetBreedValue=select.getFirstSelectedOption().getText();
//	        System.out.println( "Pet Breed Value#####"+getpetBreedValue );
	        return getpetBreedValue;
	    }


	    public String getleadState() {
	        Select select=new Select( lblLeadState );
	        String getleadStateValue = select.getFirstSelectedOption().getText();
//	        System.out.println( "Pet Lead State Value#####"+getleadStateValue );
	        return getleadStateValue;
	    }

	    public ArrayList getpetDOBs() {
	        ArrayList petDOBValues = new ArrayList();
	        for (int i = 0; i < lblPetDOBs.size(); i++) {
	            String petDOBValue = lblPetDOBs.get( i ).getAttribute( "value" );
	            petDOBValues.add( petDOBValue );
//	            System.out.println( "Pet DOB#####" + petDOBValue );
	        }
	        return petDOBValues;
	    }
	    public ArrayList getBasePremiums() {
	        ArrayList petBasePremiumValues = new ArrayList();
	        for(int i=0;i<lblBasePremiums.size();i++) {
	            String petBasePremiumValue = lblBasePremiums.get( i ).getText();
	            petBasePremiumValues.add( petBasePremiumValue );
//	            System.out.println( "Pet Premium#####" + petBasePremiumValue );
	        }
	        return petBasePremiumValues;
	    }

	    public ArrayList getpetSpeciess() {
	        ArrayList petSpeciessValues = new ArrayList();
	        for(int i=0;i<lblPetSpeciess.size();i++) {
	            Select select=new Select(lblPetSpeciess.get( i )  );
	            String petSpeciessValue = select.getFirstSelectedOption().getText();;
	            petSpeciessValues.add( petSpeciessValue );
//	            System.out.println( "Pet Species#####" + petSpeciessValue );
	        }
	        return petSpeciessValues;
	    }

	    public ArrayList getpetBreeds() {
	        ArrayList peBreedsValues = new ArrayList();
	        for(int i=0;i<lblPetBreeds.size();i++) {
	            Select select=new Select(lblPetBreeds.get( i )  );
	            String peBreedsValue = select.getFirstSelectedOption().getText();;
	            peBreedsValues.add( peBreedsValue );
//	            System.out.println( "Pet Breeds#####" + peBreedsValue );
	        }
	        return peBreedsValues;
	    }

	    public void saveQuote() {
	        // TODO Auto-generated method stub
	        saveQuote.click();
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {

	            e.printStackTrace();
	        }
	    }

	    public void enrollmentButton() {
	        // TODO Auto-generated method stub
	        enrollmentButton.click();
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {

	            e.printStackTrace();
	        }
	    }

	    public String getTotalDiscountApplied() {
	        return totalDiscount.getText();
	    }

	    public void clickGroup() throws InterruptedException {
	        groupCheckbox.click();
	        Thread.sleep(500);
	    }

	    public void fillGroupID(String groupID) {
	        groupCode.sendKeys(groupID, Keys.TAB);
	    }

	    public String getGroupName() {
	        return groupName.getAttribute("value");
	    }

	    public void groupSearch() {
	        groupSearch.click();
	    }

	    public void fillEntityCode(String entyCode) {
	        entityCode.sendKeys(entyCode);
	    }

	    public void groupSearchSubmit() {
	        groupSearchSubmit.click();
	    }

	    public void clickPlusIcon() {
	        groupPlusIcon.click();
	    }
	}

package domainObjects;

	import java.io.Serializable;
	import java.time.LocalDate;
	import java.util.List;

	public class PetDetails {
	    private List<PetDetails> petDetails;
	    private String petName;
	    public List<String> petNames;
	    private String petSpecies;
	    private String petBreed;
	    private String petAge;
	    private String petDoB;
	    private String planForPet;
	    private String acquiredDate;
	    private String petColor;
	    private String provider;
	    private String fsa;
	    private String pda;
	    private String ny;
	    private String medicalQuestion;
	    private String petSex;

	    //********Medicals*****

	    private String everBeenOnMedication;
	    private String everBeenOnMedicationInfor;
	    private String requiredMedication;
	    private String requiredMedicationInfor;
	    private String skininfected;
	    private String skinInfectedInfo;
	    private String urinaryProb;
	    private String urinaryProbInformation;
	    private String diseaseAffected;
	    private String diseaseAffectedInformation;
	    private String physicalExam;
	    private String recordRequired;
	    private String routineVisits;
	    private String routineVisitsInfo;
	    private String everHadSurgeries;
	    private String everHadSurgeriesInformation;
	    private String bumpsOrGrowths;
	    private String bumpsOrGrowthsInformation;
	    private String allergiesOrInfections;
	    private String allergiesOrInfectionsInfor;
	    private String haveAnyOtherHealthConditions;
	    private String haveAnyOtherHealthConditionsInfor;
	    private String everHadNationwideOrVeterinaryInsurance;
	    private String everHadNationwideOrVeterinaryInsuranceInfor;
	    private String petInjured;
	    private String insuredByUs;

	    //***********End Medicals******************

	    public String getPetSex() {
	        return petSex;
	    }

	    public void setPetSex(String petSex) {
	        this.petSex = petSex;
	    }

	    public String getMedicalQuestion() {
	        return medicalQuestion;
	    }

	    public void setMedicalQuestion(String medicalQuestion) {
	        this.medicalQuestion = medicalQuestion;
	    }

	    public String getFsa() {
	        return fsa == null ? "No" : fsa;
	    }

	    public void setFsa(String fsa) {
	        this.fsa = fsa;
	    }

	    public String getPda() {
	        return pda == null ? "No" : pda;
	    }

	    public String getNY() {
	        return ny == null ? "No" : ny;
	    }

	    public void setPda(String pda) {
	        this.pda = pda;
	    }

	    public void setNY(String ny) {
	        this.ny = ny;
	    }

	    public String getProvider() {
	        return provider;
	    }

	    public void setProvider(String provider) {
	        this.provider = provider;
	    }

	    public String getPetColor() {
	        return petColor;
	    }

	    public void setPetColor(String petColor) {
	        this.petColor = petColor;
	    }

	    public String getAcquiredDate() {
	        return acquiredDate;
	    }

	    public void setAcquiredDate(String acquiredDate) {
	        this.acquiredDate = acquiredDate;
	    }

	    public String getPetName() {
	        return petName;
	    }

	    public void setPetName(String petName) {
	        this.petName = petName;
	    }

	    public String getPetSpecies() {
	        return petSpecies;
	    }

	    public void setPetSpecies(String petSpecies) {
	        this.petSpecies = petSpecies;
	    }

	    public String getPetBreed() {
	        return petBreed;
	    }

	    public void setPetBreed(String petBreed) {
	        this.petBreed = petBreed;
	    }

	    public String getPetAge() {
	        return petAge;
	    }

	    public void setPetAge(String petAge) {
	        this.petAge = petAge;
	    }

	    public String getPlanForPet() {
	        return planForPet;
	    }

	    public void setPlanForPet(String planForPet) {
	        this.planForPet = planForPet;
	    }

	    public String getskininfected() {
	        return skininfected;
	    }

	    public void setskininfected(String skininfected) {
	        this.skininfected = skininfected;
	    }

	    public String getSkinInfectedInfo() {
	        return skinInfectedInfo == null ? "Test" : skinInfectedInfo;
	    }

	    public void setSkinInfectedInfo(String skinInfectedInfo) {
	        this.skinInfectedInfo = skinInfectedInfo;
	    }


	    public String getUrinaryProb() {
	        return urinaryProb;
	    }

	    public void setUrinaryProb(String urinaryProb) {
	        this.urinaryProb = urinaryProb;
	    }

	    public String getBumpsOrGrowths() {
	        return bumpsOrGrowths;
	    }

	    public void setBumpsOrGrowths(String bumpsOrGrowths) {
	        this.bumpsOrGrowths = bumpsOrGrowths;
	    }

	    public String getDiseaseAffected() {
	        return diseaseAffected;
	    }

	    public void setDiseaseAffected(String diseaseAffected) {
	        this.diseaseAffected = diseaseAffected;
	    }

	    public String getPhysicalExam() {
	        return physicalExam;
	    }

	    public void setPhysicalExam(String physicalExam) {
	        this.physicalExam = physicalExam;
	    }

	    public String getRecordRequired() {
	        return recordRequired;
	    }

	    public void setRecordRequired(String recordRequired) {
	        this.recordRequired = recordRequired;
	    }

	    public void setRoutineVisits(String routineVisits) {
	        this.routineVisits = routineVisits;
	    }

	    public String getRoutineVisitsInfo() {
	        return routineVisitsInfo == null ? "Test" : routineVisitsInfo;
	    }

	    public void setRoutineVisitsInfo(String routineVisitsInfo) {
	        this.routineVisitsInfo = routineVisitsInfo;
	    }

	    public String getEverBeenOnMedication() {
	        return everBeenOnMedication;
	    }

	    public void setEverBeenOnMedication(String everBeenOnMedication) {
	        this.everBeenOnMedication = everBeenOnMedication;
	    }

	    public String getEverBeenOnMedicationInfor() {
	        return everBeenOnMedicationInfor == null ? "Even Been On Medication: "+LocalDate.now() : everBeenOnMedicationInfor;
	    }

	    public void setEverBeenOnMedicationInfor(String everBeenOnMedicationInfor) {
	        this.everBeenOnMedicationInfor = everBeenOnMedicationInfor;
	    }

	    public String getRequiredMedicationInfor() {
	        return requiredMedicationInfor == null ? "Required Medical Information"+LocalDate.now() : requiredMedicationInfor;

	    }

	    public void setRequiredMedicationInfor(String requiredMedicationInfor) {
	        this.requiredMedicationInfor = requiredMedicationInfor;
	    }

	    public String getRoutineVisits() {
	        return routineVisits;
	    }

	    public List<String> getPetNames() {
	        return petNames;
	    }

	    public void setPetNames(List<String> petNames) {
	        this.petNames = petNames;
	    }

	    public List<PetDetails> getPetDetails() {
	        return petDetails;
	    }

	    public void setPetDetails(List<PetDetails> petDetails) {
	        this.petDetails = petDetails;
	    }

	    public String getEverHadSurgeries() {
	        return everHadSurgeries;
	    }

	    public void setEverHadSurgeries(String everHadSurgeries) {
	        this.everHadSurgeries = everHadSurgeries;
	    }


	    public String getEverHadSurgeriesInformation() {
//	        return everHadSurgeriesInformation == null ? "Ever Had Surgeries Information" : everHadSurgeriesInformation;
	        return everHadSurgeriesInformation == null ? "Ever Had Surgeries Information: "+LocalDate.now() : everHadSurgeriesInformation;
	    }

	    public void setEverHadSurgeriesInformation(String everHadSurgeriesInformation) {
	        this.everHadSurgeriesInformation = everHadSurgeriesInformation;
	    }

	    public String getAllergiesOrInfections() {
	        return allergiesOrInfections;
	    }

	    public void setAllergiesOrInfections(String allergiesOrInfections) {
	        this.allergiesOrInfections = allergiesOrInfections;
	    }

	    public String getAllergiesOrInfectionsInfor() {
//	        return allergiesOrInfectionsInfor == null ? "Allergies Or Infections Information" : allergiesOrInfectionsInfor;
	        return allergiesOrInfectionsInfor == null ? "Allergies Or Infections Information: "+LocalDate.now() : allergiesOrInfectionsInfor;
	    }

	    public void setAllergiesOrInfectionsInfor(String allergiesOrInfectionsInfor) {
	        this.allergiesOrInfectionsInfor = allergiesOrInfectionsInfor;
	    }


	    public void setBumpsOrGrowthsInformation(String bumpsOrGrowthsInformation) {
	        this.bumpsOrGrowthsInformation = bumpsOrGrowthsInformation;
	    }

	    public String getBumpsOrGrowthsInformation() {
	        return bumpsOrGrowthsInformation == null ? "Bumps Or Growths Information: "+LocalDate.now() : bumpsOrGrowthsInformation;
	    }

	    public String getDiseaseAffectedInformation() {
	        return diseaseAffectedInformation == null ? "Disease Affected Information: "+LocalDate.now() : diseaseAffectedInformation;
	    }

	    public void setDiseaseAffectedInformation(String diseaseAffectedInformation) {
	        this.diseaseAffectedInformation = diseaseAffectedInformation;
	    }

	    public String getHaveAnyOtherHealthConditions() {
	        return haveAnyOtherHealthConditions;
	    }

	    public void setHaveAnyOtherHealthConditions(String haveAnyOtherHealthConditions) {
	        this.haveAnyOtherHealthConditions = haveAnyOtherHealthConditions;
	    }

	    public String getHaveAnyOtherHealthConditionsInfor() {
	        return haveAnyOtherHealthConditionsInfor == null ? "Have Any Other Health Conditions Information: "+LocalDate.now() : haveAnyOtherHealthConditionsInfor;
	    }

	    public void setHaveAnyOtherHealthConditionsInfor(String haveAnyOtherHealthConditionsInfor) {
	        this.haveAnyOtherHealthConditionsInfor = haveAnyOtherHealthConditionsInfor;
	    }

	    public String getEverHadNationwideOrVeterinaryInsurance() {
	        return everHadNationwideOrVeterinaryInsurance;
	    }

	    public void setEverHadNationwideOrVeterinaryInsurance(String everHadNationwideOrVeterinaryInsurance) {
	        this.everHadNationwideOrVeterinaryInsurance = everHadNationwideOrVeterinaryInsurance;
	    }

	    public String getEverHadNationwideOrVeterinaryInsuranceInfor() {
	        return everHadNationwideOrVeterinaryInsuranceInfor == null ? "Ever Had Nation wide Or Veterinary Insurance Information: "+LocalDate.now() : everHadNationwideOrVeterinaryInsuranceInfor;
	    }

	    public void setEverHadNationwideOrVeterinaryInsuranceInfor(String everHadNationwideOrVeterinaryInsuranceInfor) {
	        this.everHadNationwideOrVeterinaryInsuranceInfor = everHadNationwideOrVeterinaryInsuranceInfor;
	    }

	    public String getRequiredMedication() {
	        return requiredMedication;
	    }

	    public void setRequiredMedication(String requiredMedication) {
	        this.requiredMedication = requiredMedication;
	    }

	    public String getPetDoB() {
	        return petDoB;
	    }

	    public void setPetDoB(String petDoB) {
	        this.petDoB = petDoB;
	    }

	    public String getUrinaryProbInformation() {
	        return urinaryProbInformation == null ? "urinary Prob Information: "+LocalDate.now() : urinaryProbInformation;
	    }

	    public void setUrinaryProbInformation(String urinaryProbInformation) {
	        this.urinaryProbInformation = urinaryProbInformation;
	    }

	    public String getPetInjured() {
	        return petInjured;
	    }

	    public void setPetInjured(String petInjured) {
	        this.petInjured = petInjured;
	    }
	    public String getInsuredByUs() {
	        return insuredByUs;
	    }

	    public void setInsuredByUs(String insuredByUs) {
	        this.insuredByUs = insuredByUs;
	    }
	}

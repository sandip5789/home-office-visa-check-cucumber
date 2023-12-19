package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.Utility.Utility;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement healthAndCareProfessional;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectJobType(){
        clickOnElement(healthAndCareProfessional);
        log.info("Click on '" + healthAndCareProfessional + "' tab");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on '" + continueButton + "' tab");
    }
}

package uk.gov.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.gov.Utility.Utility;

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement longerThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectLengthOfStay(String moreOrLess){
        clickOnElement(lessThanSixMonths);
        clickOnElement(longerThanSixMonths);
        log.info("Click on : " + moreOrLess + "more or less");


        switch (moreOrLess){
            case"lessThanSixMonths":
                System.out.println("6 months or less");
                break;
            case "longer than six months":
                System.out.println("longer than 6 months");
                break;
            default:
                System.out.println("Error message");
        }
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
        log.info("Click on : " + continueButton.getText());
    }
}


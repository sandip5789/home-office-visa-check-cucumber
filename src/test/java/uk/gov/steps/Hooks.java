package uk.gov.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import uk.gov.Utility.Utility;
import uk.gov.propertyreader.PropertyReader;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot,"image/jpg",scenario.getName());
        }
        closeBrowser();
    }
}

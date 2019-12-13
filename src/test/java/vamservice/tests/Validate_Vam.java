package vamservice.tests;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.relevantcodes.extentreports.LogStatus;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import vamservice.utils.*;
import static vamservice.utils.Utilities.*;


public class Validate_Vam extends TestBase {

    @Test
    public static void validateVamResponse() {

        for (int i = 0; i < csvReader().size(); i++) {
            extentTest = extentReports.startTest("Validate Vam response_TCO_"+i);

            try {
                vamResponse = returnVamResponse(i);
                extentTest.log(LogStatus.INFO, "URL : " + vam_env+configReader.getProperty("endPoint"));
                System.out.println(vamResponse.getBody().asString());
                softAssert.assertEquals( vamResponse.statusCode(),200);
                assertEquals(vamResponse.statusCode(),200);
                JsonObject bodyObject = new JsonParser().parse(vamResponse.body().asString()).getAsJsonObject();
                JsonObject globalParamObject = bodyObject.getAsJsonObject("globalParameters");
                JsonObject keyValuesObject = bodyObject.getAsJsonObject("keyValues");

                if (globalParamObject != null) {
                    for (String key : globalParamObject.keySet()) {
                        if (!key.equalsIgnoreCase("vip") && !key.equalsIgnoreCase("vprn") && !key.equalsIgnoreCase("pvrn")) {
                            // Verifying actual key value does not matches expected value
                            if (!globalParamObject.get(key).getAsString().equalsIgnoreCase(csvReader().get(i).get(key).toString())) {
                                extentTest.log(LogStatus.ERROR, "Value did not match for \"" + key
                                        + "\".<br/> Expected Value : " + csvReader().get(i).get(key) + "<br/> Actual Value : " + globalParamObject.get(key).getAsString());

                                softAssert.assertTrue(false, "Value did not match for " + key);
                            } else {
                                extentTest.log(LogStatus.INFO, "Value matched for \"" + key + "\".");
                            }

                        }
                    }
                }

                if (keyValuesObject != null) {
                    for (String key : keyValuesObject.keySet()) {
                        if (!key.equalsIgnoreCase("ltlg")) {
                            // Verifying actual key value does not matches expected value
                            if (!keyValuesObject.get(key).getAsString().equalsIgnoreCase(csvReader().get(i).get(key).toString())) {
                                extentTest.log(LogStatus.ERROR, "Value did not match for \"" + key
                                        + "\".<br/> Expected Value : " + csvReader().get(i).get(key) + "<br/> Actual Value : " + keyValuesObject.get(key).getAsString());
                                softAssert.assertTrue(false, "Value did not match for " + key);
                            } else {
                                extentTest.log(LogStatus.INFO, "Value matched for \"" + key + "\".");
                            }

                        }
                    }
                }
            }catch (Throwable e){
                extentTest.log(LogStatus.FAIL, e.fillInStackTrace());
            }

            extentReports.endTest(extentTest);

        }


    }
}

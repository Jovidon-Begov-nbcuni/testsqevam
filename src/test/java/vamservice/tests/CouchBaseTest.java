package vamservice.tests;


import com.relevantcodes.extentreports.LogStatus;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import vamservice.utils.*;
import vamservice.utils.configReader;

import static io.restassured.RestAssured.*;



public class CouchBaseTest extends TestBase {

    public static Response couchbaseResponse;


    @Test(priority = -1)
    public void Testing_Couchbase_is_up_and_running() throws Throwable {
        extentTest = extentReports.startTest("Validate health check status");

        int j=0;
        Throwable t=new Throwable();
        for (int i = 1; i < 11; i++) {
            try {
                RestAssured.baseURI = configReader.getProperty("couchbase" + i);
                couchbaseResponse = get("");

                Assert.assertEquals(couchbaseResponse.statusCode(),200);
                extentTest.log(LogStatus.PASS,configReader.getProperty("couchbase" + i));
                extentTest.log(LogStatus.INFO,"Milliseconds:  "+couchbaseResponse.getTimeIn(TimeUnit.MILLISECONDS));
                extentReports.endTest(extentTest);

            }catch(Throwable e){
                t=e; j++;
                extentTest.log(LogStatus.INFO,e.fillInStackTrace());
                extentTest.log(LogStatus.FAIL,"No connection with Couchbase:  " + configReader.getProperty("couchbase" + i));
            }
        }
        if(j>0) throw t;


    }




}

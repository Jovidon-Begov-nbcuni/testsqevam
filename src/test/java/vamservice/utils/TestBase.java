package vamservice.utils;

import vamservice.Pojo.TestPOJO;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.restassured.response.Response;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.io.*;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class TestBase {

    private String configFile = "configuration.properties";
    private String envFile = "environment.properties";
    private Properties properties;
    private static Properties envProp;
    private PropertyParser propertyParser;
    protected static TestPOJO testPOJO;
    protected static SoftAssert softAssert;
    protected static ExtentReports extentReports;
    protected static ExtentTest extentTest;
    protected static Response vamResponse;
    protected static String vam_env = configReader.getProperty("env");



    @BeforeSuite
    public void setup() throws IOException {
        propertyParser = new PropertyParser();
        properties = propertyParser.parseProperties(configFile);
        envProp = propertyParser.parseEnvProperties(envFile);
        testPOJO = new TestPOJO();
        softAssert = new SoftAssert();
        extentReports = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentFiles/Report.html", true);
        extentReports.addSystemInfo("Environment", properties.getProperty("env").substring(10, 13).toUpperCase())
                .loadConfig(new File(System.getProperty("user.dir") + "/test-output/extent-config.xml"));


    }

    @AfterSuite
    public void endTest() {

      //  extentReports.endTest(extentTest);
        extentReports.flush();
        extentReports.close();
        softAssert.assertAll();
    }
}

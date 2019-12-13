package vamservice.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import static io.restassured.RestAssured.given;
import static vamservice.utils.TestBase.*;

public class Utilities {

    public static List<Map<Object, Object>> csvReader() {

        String csvFile = "src/test/resources/DataSheet/testdata1.csv";
        String string = "";
        Object[] str;
        int count = 0;
        Object[] keys = null;
        Object[] values = null;

        List<Map<Object, Object>> mapList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((string = br.readLine()) != null) {
                HashMap<Object, Object> map = new HashMap<>();
                str = string.split(",");
                if (count == 0)
                    keys = str;
                else
                    values = str;

                count++;
                if (values != null) {
                    for (int i = 0; i < values.length; i++) {
                        map.put(keys[i], values[i]);
                    }
                    mapList.add(map);
                    values = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //    mapList.forEach(each-> System.out.println(each.get("nw")));

        return mapList;

    }

    public static Response returnVamResponse(int i) {
        RestAssured.baseURI = vam_env;
        vamResponse = given()
                .queryParam("brand", csvReader().get(i).get("brand"))
                .queryParam("appName", csvReader().get(i).get("appName"))
                .queryParam("platform", csvReader().get(i).get("platform"))
                .queryParam("adCompatibilityEncodingProfile", csvReader().get(i).get("adCompatibilityEncodingProfile"))
                .queryParam("playerName", csvReader().get(i).get("playerName"))
                .queryParam("playerVersion", csvReader().get(i).get("playerVersion"))
                .queryParam("deviceAdvertisingId", csvReader().get(i).get("deviceAdvertisingId"))
                .queryParam("adServerContentId", csvReader().get(i).get("adServerContentId"))
                .queryParam("deviceAdvertisingTrackingConsent", csvReader().get(i).get("deviceAdvertisingTrackingConsent"))
                .queryParam("deviceAdvertisingIdType", csvReader().get(i).get("deviceAdvertisingIdType"))
                .queryParam("locationPostalCode", csvReader().get(i).get("locationPostalCode"))
                .queryParam("mvpdHash", csvReader().get(i).get("mvpdHash"))
                .queryParam("videoDurationInSeconds", csvReader().get(i).get("videoDurationInSeconds"))
                .queryParam("appBundleId", csvReader().get(i).get("appBundleId"))
                .queryParam("httpReferer", csvReader().get(i).get("httpReferer"))
                .queryParam("locationLatitude", csvReader().get(i).get("locationLatitude"))
                .queryParam("locationLongitude", csvReader().get(i).get("locationLongitude"))
                .queryParam("appBuild", csvReader().get(i).get("appBuild"))
                .queryParam("appVersion", csvReader().get(i).get("appVersion"))
                .queryParam("cdnName", csvReader().get(i).get("cdnName"))
                .queryParam("sdkVersion", csvReader().get(i).get("sdkVersion"))
                .queryParam("playerWidthPixels", csvReader().get(i).get("playerWidthPixels"))
                .queryParam("playerHeightPixels", csvReader().get(i).get("playerHeightPixels"))
                .queryParam("coppaApplies", csvReader().get(i).get("coppaApplies"))
                .queryParam("isBingeViewer", csvReader().get(i).get("isBingeViewer"))
                .queryParam("streamType", csvReader().get(i).get("streamType"))
                .queryParam("obfuscatedFreewheelProfileId", csvReader().get(i).get("obfuscatedFreewheelProfileId"))
                .when().get(configReader.getProperty("endPoint"));
        return vamResponse;
    }


}

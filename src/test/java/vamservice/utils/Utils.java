package vamservice.utils;

import io.restassured.RestAssured;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

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


}

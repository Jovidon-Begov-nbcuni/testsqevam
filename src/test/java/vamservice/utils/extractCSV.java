package vamservice.utils;

import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class extractCSV {

    @Test
    public static void test1(){

        Utils.csvReader().forEach(System.out::println);
    }




}


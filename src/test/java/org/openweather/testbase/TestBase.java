package org.openweather.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/* Created
 * by Lamee */
public class TestBase {
    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "https://openweathermap.org";



    }
}

package org.openweather.weathertest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;
import org.openweather.testbase.TestBase;

import static io.restassured.RestAssured.given;

/* Created
 * by Lamee */
public class WeatherTest extends TestBase {



    @Test
    public void getAllCurrentWeatherInfo() {
        Response response = given()
                .log().all()
                .queryParam("format", "json")
                .queryParam("appid","API key" )
                .queryParam("q", "city name")
                .when()
                .get("/current");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The CurrentWeather is: " );
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void getAllCityInfo() {
        Response response = given()
                .log().all()
                .queryParam("format", "json")
                .queryParam("appid","API key" )
                .queryParam("q", "city name")
                .queryParam("id", "city id")
                .when()
                .get("/city");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The City is: " );
        System.out.println("------------------End of Test---------------------------");
    }
    @Test
    public void getCityAndStateInfo() {
        Response response = given()
                .log().all()
                .queryParam("format", "json")
                .queryParam("q", "{city name},{state code}")
                .queryParam("appid","API key" )
                .when()
                .get("/city");
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The City name and state code: " );
        System.out.println("------------------End of Test---------------------------");
    }

}


package feature.steps_definition;

import io.cucumber.java8.En;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;

public class AvailableCurrenciesSteps implements En {

    private RequestSpecBuilder reqSpecBuilder;
    private Response response;
    private String urlBase;
    private String endpointCurrencyList;
    private String paramKey;

    public AvailableCurrenciesSteps() {

        Given("that I have access to the Currency Converter API", () -> {
            urlBase = "https://api.getgeoapi.com/api/v2";
            endpointCurrencyList = "/currency/list";
            paramKey = "ded0170dc636edd946f0fb12766f22bcd402f04f";
            reqSpecBuilder = new RequestSpecBuilder();
            reqSpecBuilder.setContentType(JSON);
            reqSpecBuilder.addParam("api_key", paramKey);
            requestSpecification = reqSpecBuilder.build();
        });


        When("I send the correct request to Get the List of All Currencies Available", () -> {
             response =
                    when()
                    .get(urlBase+endpointCurrencyList)
                    ;
        });


        Then("I will receive the list properly", () -> {
            response
            .then()
                    .statusCode(200)
            ;
            response.prettyPrint();
        });

    }

}

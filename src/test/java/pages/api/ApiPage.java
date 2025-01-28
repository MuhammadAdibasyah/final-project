package pages.api;

import helper.api.Endpoint;
import helper.api.Utility;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;

import static helper.api.Models.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {

    String setURL , globalId;
    Response res;

    public void prepareValidUrl(String url){
        switch (url){
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;

            case "GET_LIST_USERS_INVALID":
                setURL = Endpoint.GET_LIST_USERS_INVALID;
                break;

            case "CREATE_USERS":
                setURL = Endpoint.CREATE_USERS;
                break;

            case "UPDATE_USERS":
                setURL = Endpoint.UPDATE_USERS;
                break;

            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;
        }
    }

    public void hitUrl() {
        res = hitToGetList(setURL);
    }

    public void hitUrlToCreateNewUser() {
        res = hitToCreateUser(setURL);
    }

    public void hitUrlToCreateNewUserWithEmptyData() {
        res = hitToCreateInvalidData(setURL);
    }

    public void getStatusCode(int status_code){
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyListUsers() {
        List<Object> id = res.jsonPath().getList("id");
        List<Object> name = res.jsonPath().getList("name");
        List<Object> email = res.jsonPath().getList("email");
        List<Object> gender = res.jsonPath().getList("gender");
        List<Object> status = res.jsonPath().getList("status");

        assertThat(id.get(0)).isNotNull();
        assertThat(name.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(gender.get(0)).isIn("female","male");
        assertThat(status.get(0)).isIn("active","inactive");
    }

    public void validationResponseBodyNewUsers() {
        JsonPath jsonPathEvaluator = res.jsonPath();

        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female","male");
        assertThat(status).isIn("active","inactive");

        globalId = Integer.toString(id);
    }

    public void validationResponseJsonWithJSONSchema(String fileName) {
        File JSONFile = Utility.getJSONSchemaFile(fileName);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void hitApiDeleteUser() {
        res = hitToDeleteUser(setURL,globalId);
    }

    public void hitApiUpdateUser() {
        res = hitToUpdateUser(setURL,globalId);
    }

    public void validationResponseBodyUpdateUsers() {
        JsonPath jsonPathEvaluator = res.jsonPath();

        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female","male");
        assertThat(status).isIn("active","inactive");
    }
}

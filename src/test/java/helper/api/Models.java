package helper.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.api.Utility.generateRandomEmail;

public class Models {

    private static RequestSpecification request;

    public static void setupHeaders(){
        request = RestAssured.given()
                .header("Accept","application/json")
                .header("Content-Type","application/json")
                .header("Authorization","Bearer c9fe830eda4f5630dfcc2f1c49def63c52ef6baa6f7dc2112c1a8155dc177846");
    }

    public static Response hitToGetList(String endpoint){
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response hitToCreateUser(String endpoint){

       String name = "martial";
       String gender = "male";
       String email = generateRandomEmail();
       String status = "active";

        JSONObject payload = new JSONObject();
        payload.put("name",name);
        payload.put("gender",gender);
        payload.put("email",email);
        payload.put("status",status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response hitToCreateInvalidData(String endpoint){

        String name = "";
        String gender = "male";
        String email = generateRandomEmail();
        String status = "active";

        JSONObject payload = new JSONObject();
        payload.put("name",name);
        payload.put("gender",gender);
        payload.put("email",email);
        payload.put("status",status);

        setupHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response hitToDeleteUser(String endpoint, String user_id){
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response hitToUpdateUser(String endpoint, String user_id){
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;

        String name = "martial";
        String email = generateRandomEmail();
        String status = "inactive";

        JSONObject payload = new JSONObject();
        payload.put("name",name);
        payload.put("email",email);
        payload.put("status",status);

        setupHeaders();
        return request.body(payload.toString()).when().patch(finalEndpoint);
    }
}

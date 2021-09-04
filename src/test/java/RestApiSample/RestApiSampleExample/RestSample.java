package RestApiSample.RestApiSampleExample;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestSample {
public static void main(String[] args) {
	Response rs =given().contentType(ContentType.JSON).when().get("http://localhost:3000/APIBatchStudetns");
	System.out.println(rs.statusCode());
	System.out.println(rs.asString());
	System.out.println(rs.sessionId());
	
}
}

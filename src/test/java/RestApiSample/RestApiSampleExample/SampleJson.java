package RestApiSample.RestApiSampleExample;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class SampleJson {

	public static void main(String[] args) {
		JSONObject outer=new JSONObject();
		outer.put("firstname", "raghava");
		outer.put("lastname", "vunikili");
		outer.put("Desigantion", "TL");
		outer.put("id", "109");
		
		JSONArray array=new JSONArray();
		
		JSONObject inner1=new JSONObject();
		inner1.put("Address type", "primary");
		inner1.put("Address line1", "plot no88");
		inner1.put("Address line 2", "miyapur");
		inner1.put("sector", "3");
		inner1.put("State", "tg");
		
		JSONObject inner2=new JSONObject();
		inner2.put("Address type", "seconadry");
		inner2.put("Address line1", "plot no89");
		inner2.put("Address line 2", "kphb");
		inner2.put("sector", "4");
		inner2.put("State", "tg");
		
		array.put(0, inner1);
		array.put(1, inner2);
		
		outer.put("Address", array);
		
		
		
		
		
		//Response rs =given().contentType(ContentType.JSON).body(outer.toString()).when().post("http://localhost:3000/APIBatchStudetns");
		Response rs1 =given().contentType(ContentType.JSON).body(outer.toString()).when().get("http://localhost:3000/APIBatchStudetns");
		//System.out.println(rs.statusCode());
		//System.out.println(rs1.statusCode());
		//System.out.println(rs.asString());
		System.out.println(rs1.asString());
		

	}

}

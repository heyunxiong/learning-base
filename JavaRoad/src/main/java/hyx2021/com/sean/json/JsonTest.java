package hyx2021.com.sean.json;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2021
 */
public class JsonTest {
    public static void main(String[] args) {

        String json = "{\"username\": \"sean\",\"id\": \"123\"}";
        JSONObject  jsonObject = null;
        try {
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.toString());
        }
        String username = jsonObject.getString("username");
        System.out.println(username);
        System.out.println(jsonObject);

    }
}

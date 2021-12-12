package hyx2021.com.sean.json;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 12/3/2021
 */
public class JsonTest {
    public static void main(String[] args) throws UnsupportedEncodingException {

     /*   String json = "{\"username\": \"sean\",\"id\": \"123\"}";
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
        System.out.println(jsonObject);*/
        System.out.println(System.getProperty("file.encoding"));
        String s = "test: 中国 \"Account\"";
        byte[] bytes = s.getBytes();
        byte[] bytes1 = s.getBytes("UTF-8");
        byte[] bytes2 = s.getBytes("ISO-8859-1");
        byte[] gbks = s.getBytes("GBK");

        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(bytes1));
        System.out.println(Arrays.toString(bytes2));
        System.out.println(Arrays.toString(gbks));



        System.out.println(new String(bytes, "GBK"));
        System.out.println(Charset.defaultCharset().name());

    }
}

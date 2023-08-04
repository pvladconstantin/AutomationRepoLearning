package starter.AutomationTests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

public class Util {

    public static JsonArray stringToJson(String jsonString) {
        JsonArray jsonArray = new Gson().fromJson(jsonString, JsonArray.class);
//        for (JsonElement je: jsonArray) {
//            System.out.println(je.toString());
//        }
        return jsonArray;
    }
}

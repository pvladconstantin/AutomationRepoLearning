package starter.AutomationTests;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Util {

    public static JsonArray stringToJson(String jsonString) {
        JsonArray jsonArray = new Gson().fromJson(jsonString, JsonArray.class);
//        for (JsonElement je: jsonArray) {
//            System.out.println(je.toString());
//        }
        return jsonArray;
    }

    //metoda care sa faca din string json object
    public static JsonObject stringToJsonObject(String jsonString) {
        JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);
        return jsonObject;
    }

}

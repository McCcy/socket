package Service.impl;

import Service.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by ccy
 * 2018/5/2 15:23
 */
public class MessageTemplate implements Message {
    private String templateStr;
    private List<String> paramsList; // ("restaurant_name","num","food_name","a");//Enum

    public MessageTemplate(String templateId) {
        this.templateStr = "my name is ${name}, my age is ${age}";
        this.paramsList = new ArrayList<String>(Arrays.asList("name", "age"));
    }

    @Override
    public String getText(Map<String, String> dataMap) {
        String Str = this.templateStr;
        for (int i = 0; i < paramsList.size(); i++) {
            Str = Str.replace("${" + paramsList.get(i) + "}", dataMap.get(paramsList.get(i)));
        }
        return Str;
    }
}

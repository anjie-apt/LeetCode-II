


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MyTest {
    public static void main(String[] args) {
        String interpreter = "python";
        String path = "C:\\Users\\10928\\Desktop\\TestGraphAutoBuild\\InforExtract\\TestGraphExtract\\ShowModel.py";
        String modelType = "金融";
        String modelName = "交通银行";
        String appType = "手机银行";
        String graphData = "苏州银行#中国工商银行3.1.0.8.0#南京银行5.0.1#南京银行4.3.9#南京银行4.4.3#上海银行5.2.0";
        String savePath = "C:/Users/10928/Desktop/TestGraphAutoBuild";
        String doTrain = "0";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("model_type", modelType);
        jsonObject.put("model_name", modelName);
        jsonObject.put("app_type", appType);
        jsonObject.put("graph_data", graphData);
        jsonObject.put("save_path", savePath);
        jsonObject.put("do_train", doTrain);
        jsonObject.put("model_id", 111);
        JSONObject object = new JSONObject();
        object.put("model_id", 111);
//      由于Java里面双引号和单引号是区分的，使用json传递字符串时，要先在Java端把双引号转为单引号，python端再将单引号转为双引号，再使用json.loads()
        String jsonString = jsonObject.toString().replace('\"', '\'');
        System.out.println(jsonString);
        String[] arguments = new String[]{interpreter, path, jsonString};
        try {
            Process process = Runtime.getRuntime().exec(arguments);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

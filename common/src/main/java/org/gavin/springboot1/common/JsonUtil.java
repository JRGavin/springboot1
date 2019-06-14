package org.gavin.springboot1.common;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Map;

/**
 * @author Linww
 * @version 1.0
 * @ClassName: JsonUtil
 * @Desc:
 * @date 2016/12/17
 * @history v1.0
 */
public class JsonUtil {
    /**
     * 对象装换成json字符串
     *
     * @param obj
     * @return str
     */
    public static String Object2Json(Object obj) {
//        Gson gson = new Gson();
//        //	JSONObject  jsonObject = JSONObject.fromObject(obj);
//        //	String s = jsonObject.toString();
//        String s = gson.toJson(obj);
        String s = JSON.toJSONString(obj);
        return s;
    }

    /**
     * json字符串转换成对象
     *
     * @param json
     * @param claz
     * @return
     */
    public static Object json2Object(String json, Class claz) {
/*		JSONObject jsonObject = JSONObject.fromObject(json);
        Object obj = JSONObject.toBean(jsonObject, claz);*/
//        Gson gson = new Gson();
//        Object obj = gson.fromJson(json, claz);
        Object obj = JSON.parseObject(json, claz);
        return obj;
    }

    /**
     * List转换成json字符串
     *
     * @param list
     * @return str
     */
    public static String list2Json(List list) {
        Gson gson = new Gson();
        //	JSONObject  jsonObject = JSONObject.fromObject(obj);
        //	String s = jsonObject.toString();
        String s = gson.toJson(list);
        return s;
    }
    /**
     * 将Map转化为Json
     *
     * @param map
     * @return String
     */
    public static <T> String mapToJson(Map<String, T> map) {
        //    Gson gson = new Gson();
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String jsonStr = gson.toJson(map);
        return jsonStr;
    }

//	/**
//	 *  复合Json串转java对象包含List
//	 * @param json 需要转换的Json串
//	 * @param claz 转成对象
//	 * @param listName 数组名字
//	 * @param listClass
//	 * @return
//	 */
///*	public static Object jsonToBeanHavaList(String json,Class claz,String listName, Class listClass){
//		JSONObject jsonobject = JSONObject.fromObject(json);
//		Map classMap = new HashMap();
//	    classMap.put(listName, listClass);
//	    Object obj = JSONObject.toBean(jsonobject,claz, classMap);
//	    return obj;
//	}*/
}
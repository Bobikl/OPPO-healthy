package com.heytap.msp.sdk.base.common.util;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONValidator;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.MspParseConfig;
import com.alibaba.fastjson.parser.deserializer.ParseProcess;
import com.alibaba.fastjson.serializer.MspSerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.heytap.msp.sdk.base.common.log.MspLog;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class JsonUtil {
    private static final String JSON_UTIL = "JsonUtil";
    static final SerializeFilter[] emptyFilters = new SerializeFilter[0];

    private JsonUtil() {
    }

    public static String beanToJson(Object obj) {
        return beanToJson(obj, emptyFilters);
    }

    public static <T> T json2Bean(String str, TypeReference<T> typeReference) {
        return (T) parseJson2Bean(str, typeReference.getType());
    }

    public static boolean jsonIsValidObject(String str) {
        if (!TextUtils.isEmpty(str) && str.charAt(0) == '{') {
            return JSONValidator.from(str).validate();
        }
        return false;
    }

    public static <T> T[] jsonToArray(String str, Class<T> cls) {
        try {
            List array = JSON.parseArray(str, cls);
            if (array != null) {
                return (T[]) array.toArray();
            }
            return null;
        } catch (Exception e2) {
            MspLog.e(JSON_UTIL, "jsonToList: " + e2.getMessage());
            return null;
        }
    }

    public static <T> ArrayList<T> jsonToArrayList(String str, Class cls) {
        try {
            return (ArrayList) JSON.parseArray(str, cls);
        } catch (Exception e2) {
            MspLog.e(JSON_UTIL, "jsonToArrayList: " + e2.getMessage());
            return null;
        }
    }

    public static <T> T jsonToBean(String str, Class<T> cls) {
        return (T) parseJson2Bean(str, cls);
    }

    public static JSONObject jsonToJsonObject(String str) {
        return JSON.parseObject(str);
    }

    public static <T> List<T> jsonToList(String str, Class cls) {
        try {
            return JSON.parseArray(str, cls);
        } catch (Exception e2) {
            MspLog.e(JSON_UTIL, "jsonToList: " + e2.getMessage());
            return null;
        }
    }

    public static Map<String, String> jsonToMap(String str) {
        return (Map) parseJson2Bean(str, HashMap.class);
    }

    public static String listToJson(Object obj) {
        return JSON.toJSONString(obj, true);
    }

    public static String mapToJson(Map<String, String> map) {
        return beanToJson(map);
    }

    public static <T> T parseJson2Bean(String str, Type type) {
        try {
            return (T) JSON.parseObject(str, type, MspParseConfig.global, (ParseProcess) null, JSON.DEFAULT_PARSER_FEATURE, new Feature[0]);
        } catch (Exception e2) {
            MspLog.e(JSON_UTIL, "json2Bean: " + e2.getMessage());
            return null;
        }
    }

    public static String beanToJson(Object obj, SerializeFilter serializeFilter) {
        return beanToJson(obj, new SerializeFilter[]{serializeFilter});
    }

    public static String beanToJson(Object obj, SerializeFilter[] serializeFilterArr) {
        if (obj instanceof String) {
            return (String) obj;
        }
        try {
            return JSON.toJSONString(obj, MspSerializeConfig.globalInstance, serializeFilterArr, null, JSON.DEFAULT_GENERATE_FEATURE, new SerializerFeature[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            MspLog.e(JSON_UTIL, "beanToJson: " + e2.getMessage());
            return null;
        }
    }

    public static JSONArray jsonToList(String str) {
        return JSON.parseArray(str);
    }
}

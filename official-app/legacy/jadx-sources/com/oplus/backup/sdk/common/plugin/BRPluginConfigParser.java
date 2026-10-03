package com.oplus.backup.sdk.common.plugin;

import android.os.Bundle;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.backup.sdk.common.utils.BRLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BRPluginConfigParser {
    public static final String JSON_ENCODE = "json";
    private static final String TAG = "BRPluginConfigParser";

    private static Bundle fromJson(JsonElement jsonElement) {
        Bundle bundle = new Bundle();
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonElement).entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            JsonArray jsonArray = value.isJsonArray() ? (JsonArray) value : null;
            JsonPrimitive jsonPrimitive = value.isJsonPrimitive() ? (JsonPrimitive) value : null;
            if (jsonArray != null && jsonArray.size() <= 0) {
                bundle.putStringArray(key, new String[0]);
            } else if (jsonArray != null && jsonArray.get(0).isJsonPrimitive()) {
                int size = jsonArray.size();
                String[] strArr = new String[size];
                for (int i = 0; i < size; i++) {
                    JsonPrimitive jsonPrimitive2 = (JsonPrimitive) jsonArray.get(i);
                    if (jsonPrimitive2.isString()) {
                        strArr[i] = jsonPrimitive2.getAsString();
                    }
                }
                bundle.putStringArray(key, strArr);
            } else if (jsonPrimitive != null) {
                if (jsonPrimitive.isBoolean()) {
                    bundle.putBoolean(key, jsonPrimitive.getAsBoolean());
                } else if (jsonPrimitive.isNumber()) {
                    bundle.putDouble(key, jsonPrimitive.getAsNumber().doubleValue());
                } else if (jsonPrimitive.isString()) {
                    bundle.putString(key, jsonPrimitive.getAsString());
                } else {
                    BRLog.d(TAG, "unable to transform json to bundle " + key);
                }
            }
        }
        return bundle;
    }

    private static String getValue(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return null;
        }
        int iIndexOf2 = str.indexOf(HttpUtils.EQUAL_SIGN, iIndexOf) + 1;
        int iIndexOf3 = str.indexOf(";", iIndexOf2);
        if (iIndexOf3 == -1) {
            iIndexOf3 = str.length();
        }
        return str.substring(iIndexOf2, iIndexOf3);
    }

    public static BRPluginConfig parse(InputStream inputStream) {
        String inputStream2 = readInputStream(inputStream);
        String value = getValue(inputStream2, "encode");
        String value2 = getValue(inputStream2, "version");
        String value3 = getValue(inputStream2, "context");
        if (value3 != null) {
            value3 = value3.replaceAll("\r|\n", "");
        }
        return parse(value, value2, value3);
    }

    private static String readFile(File file) {
        FileInputStream fileInputStream = null;
        if (file == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e2) {
            BRLog.e(TAG, "new FileInputStream failed, " + e2.getMessage());
        }
        return readInputStream(fileInputStream);
    }

    private static String readInputStream(InputStream inputStream) {
        StringBuilder sb;
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    stringBuffer.append(line);
                } catch (IOException e2) {
                    BRLog.e(TAG, "readInputStream, e =" + e2.getMessage());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                            e = e3;
                            sb = new StringBuilder();
                            sb.append("close failed, ");
                            sb.append(e.getMessage());
                            BRLog.w(TAG, sb.toString());
                        }
                    }
                    bufferedReader.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                        BRLog.w(TAG, "close failed, " + e4.getMessage());
                        throw th;
                    }
                }
                bufferedReader.close();
                throw th;
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e5) {
                e = e5;
                sb = new StringBuilder();
                sb.append("close failed, ");
                sb.append(e.getMessage());
                BRLog.w(TAG, sb.toString());
            }
        }
        bufferedReader.close();
        return stringBuffer.toString();
    }

    public static BRPluginConfig parse(File file) {
        String file2 = readFile(file);
        String value = getValue(file2, "encode");
        String value2 = getValue(file2, "version");
        String value3 = getValue(file2, "context");
        if (value3 != null) {
            return parse(value, value2, value3.replaceAll("\r|\n", ""));
        }
        return null;
    }

    public static BRPluginConfig parse(String str, String str2, String str3) {
        Bundle bundleFromJson;
        BRLog.d(TAG, str + ", " + str2 + ", " + str3);
        if (!"json".equals(str)) {
            return null;
        }
        try {
            bundleFromJson = fromJson(new JsonParser().parse(str3));
        } catch (Exception e2) {
            BRLog.w(TAG, "parse failed: " + e2.getMessage());
            bundleFromJson = null;
        }
        if (bundleFromJson != null) {
            return new BRPluginConfig(bundleFromJson);
        }
        return null;
    }
}

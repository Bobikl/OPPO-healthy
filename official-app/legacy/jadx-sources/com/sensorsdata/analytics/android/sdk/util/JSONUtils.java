package com.sensorsdata.analytics.android.sdk.util;

import android.text.TextUtils;
import com.oplus.aiunit.vision.n04;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.exceptions.InvalidDataException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class JSONUtils {
    private static void addIndentBlank(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            try {
                sb.append('\t');
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return;
            }
        }
    }

    public static JSONObject cloneJsonObject(JSONObject jSONObject) throws InvalidDataException {
        if (jSONObject == null) {
            return new JSONObject();
        }
        try {
            SADataHelper.assertPropertyTypes(jSONObject);
            JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Date) {
                    jSONObject2.put(next, new Date(((Date) obj).getTime()));
                }
            }
            return jSONObject2;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:18:0x0033, B:19:0x0036, B:33:0x006b, B:21:0x003c, B:22:0x0044, B:23:0x0048, B:25:0x004d, B:26:0x0056, B:29:0x005d, B:31:0x0066, B:32:0x0068, B:34:0x006f), top: B:39:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:18:0x0033, B:19:0x0036, B:33:0x006b, B:21:0x003c, B:22:0x0044, B:23:0x0048, B:25:0x004d, B:26:0x0056, B:29:0x005d, B:31:0x0066, B:32:0x0068, B:34:0x006f), top: B:39:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:4:0x0004, B:7:0x000c, B:8:0x0015, B:10:0x001b, B:18:0x0033, B:19:0x0036, B:33:0x006b, B:21:0x003c, B:22:0x0044, B:23:0x0048, B:25:0x004d, B:26:0x0056, B:29:0x005d, B:31:0x0066, B:32:0x0068, B:34:0x006f), top: B:39:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x006b A[SYNTHETIC] */
    public static String formatJson(String str) {
        if (str != null) {
            try {
                if (!"".equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    int i = 0;
                    char c2 = 0;
                    boolean z = false;
                    int i2 = 0;
                    while (i < str.length()) {
                        char cCharAt = str.charAt(i);
                        if (cCharAt == '\"') {
                            if (c2 != '\\') {
                                z = !z;
                            }
                            sb.append(cCharAt);
                        } else if (cCharAt == ',') {
                            sb.append(cCharAt);
                            if (c2 != '\\' && !z) {
                                sb.append('\n');
                                addIndentBlank(sb, i2);
                            }
                        } else if (cCharAt == '{') {
                            sb.append(cCharAt);
                            if (!z) {
                                sb.append('\n');
                                i2++;
                                addIndentBlank(sb, i2);
                            }
                        } else if (cCharAt != '}') {
                            switch (cCharAt) {
                                case '[':
                                    sb.append(cCharAt);
                                    if (!z) {
                                        sb.append('\n');
                                        i2++;
                                        addIndentBlank(sb, i2);
                                    }
                                    break;
                                case '\\':
                                    break;
                                case ']':
                                    if (!z) {
                                        sb.append('\n');
                                        i2--;
                                        addIndentBlank(sb, i2);
                                    }
                                    sb.append(cCharAt);
                                    break;
                                default:
                                    sb.append(cCharAt);
                                    break;
                            }
                        } else {
                            if (!z) {
                                sb.append('\n');
                                i2--;
                                addIndentBlank(sb, i2);
                            }
                            sb.append(cCharAt);
                        }
                        i++;
                        c2 = cCharAt;
                    }
                    return sb.toString();
                }
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
        return "";
    }

    public static boolean isJson(String str) {
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (strTrim.startsWith(n04.OPEN_BRACE_REGEX) && strTrim.endsWith("}")) {
                return true;
            }
            if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
                return true;
            }
        }
        return false;
    }

    public static Map<String, String> json2Map(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.optString(next));
        }
        return map;
    }

    public static void mergeDistinctProperty(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null || jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    Object obj = jSONObject.get(next);
                    if (!(obj instanceof Date) || "$time".equals(next)) {
                        jSONObject2.put(next, obj);
                    } else {
                        jSONObject2.put(next, TimeUtils.formatDate((Date) obj, TimeUtils.SDK_LOCALE));
                    }
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void mergeDuplicateProperty(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null || jSONObject == null) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject2.has(next)) {
                    Object obj = jSONObject.get(next);
                    if (!(obj instanceof Date) || "$time".equals(next)) {
                        jSONObject2.put(next, obj);
                    } else {
                        jSONObject2.put(next, TimeUtils.formatDate((Date) obj, TimeUtils.SDK_LOCALE));
                    }
                }
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void mergeJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return;
        }
        if (jSONObject2 == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
                return;
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (!(obj instanceof Date) || "$time".equals(next)) {
                jSONObject2.put(next, obj);
            } else {
                jSONObject2.put(next, TimeUtils.formatDate((Date) obj, TimeUtils.SDK_LOCALE));
            }
        }
    }

    public static JSONObject mergeSuperJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject2 == null) {
            return jSONObject;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!TextUtils.isEmpty(next) && next.equalsIgnoreCase(next2)) {
                        itKeys2.remove();
                    }
                }
            }
            mergeJSONObject(jSONObject, jSONObject2);
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return jSONObject2;
    }

    public static String optionalStringKey(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }
}

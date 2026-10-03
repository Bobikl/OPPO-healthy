package com.sensorsdata.analytics.android.sdk.util;

import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.exceptions.InvalidDataException;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SADataHelper {
    private static final Pattern KEY_PATTERN = Pattern.compile("^((?!^distinct_id$|^original_id$|^time$|^properties$|^id$|^first_id$|^second_id$|^users$|^events$|^event$|^user_id$|^date$|^datetime$|^user_tag.*|^user_group.*)[a-zA-Z_$][a-zA-Z\\d_$]*)$", 2);
    private static final int MAX_LENGTH_100 = 100;
    public static final int MAX_LENGTH_1024 = 1024;
    private static final String TAG = "SA.SADataHelper";

    public static void addTimeProperty(JSONObject jSONObject) {
        if (jSONObject.has("$time")) {
            return;
        }
        try {
            jSONObject.put("$time", new Date(System.currentTimeMillis()));
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static JSONObject appendLibMethodAutoTrack(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("$lib_method", "autoTrack");
        } catch (JSONException e2) {
            SALog.printStackTrace(e2);
        }
        return jSONObject;
    }

    public static void assertDistinctId(String str) throws InvalidDataException {
        if (TextUtils.isEmpty(str)) {
            throw new InvalidDataException("Id is empty or null");
        }
        if (str.length() > 1024) {
            SALog.i(TAG, str + "'s length is longer than 1024");
        }
    }

    public static void assertEventName(String str) {
        if (TextUtils.isEmpty(str)) {
            SALog.i(TAG, "EventName is empty or null");
            return;
        }
        if (str.length() > 100) {
            SALog.i(TAG, str + "'s length is longer than 100");
            return;
        }
        if (KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        SALog.i(TAG, str + " is invalid");
    }

    public static void assertItemId(String str) {
        if (str == null) {
            SALog.i(TAG, "ItemId is empty or null");
            return;
        }
        if (str.length() > 1024) {
            SALog.i(TAG, str + "'s length is longer than 1024");
        }
    }

    public static boolean assertPropertyKey(String str) {
        if (TextUtils.isEmpty(str)) {
            SALog.i(TAG, "Property key is empty or null");
            return false;
        }
        if (!KEY_PATTERN.matcher(str).matches()) {
            SALog.i(TAG, str + " is invalid");
            return false;
        }
        if (str.length() <= 100) {
            return true;
        }
        SALog.i(TAG, str + "'s length is longer than 100");
        return true;
    }

    public static void assertPropertyTypes(JSONObject jSONObject) throws InvalidDataException {
        if (jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (assertPropertyKey(next)) {
                    Object obj = jSONObject.get(next);
                    if (obj == JSONObject.NULL) {
                        SALog.i(TAG, "Property value is empty or null");
                        itKeys.remove();
                    } else {
                        int i = 0;
                        if (obj instanceof List) {
                            List list = (List) obj;
                            int size = list.size();
                            JSONArray jSONArray = new JSONArray();
                            while (i < size) {
                                jSONArray.put(formatString(list.get(i)));
                                i++;
                            }
                            jSONObject.put(next, jSONArray);
                        } else if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof JSONArray) && !(obj instanceof Boolean) && !(obj instanceof Date)) {
                            SALog.i(TAG, "The property value must be an instance of CharSequence/Number/Boolean/JSONArray/Date/List<String>. [key='" + next + "', value='" + obj.toString() + "', class='" + obj.getClass().getCanonicalName() + "']");
                            itKeys.remove();
                        } else if (obj instanceof JSONArray) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            while (i < jSONArray2.length()) {
                                jSONArray2.put(i, formatString(jSONArray2.opt(i)));
                                i++;
                            }
                        } else if ("app_crashed_reason".equals(next) && (obj instanceof String) && ((String) obj).length() > 16382) {
                            SALog.d(TAG, "The property value is too long. [key='" + next + "', value='" + obj + "']");
                            StringBuilder sb = new StringBuilder();
                            sb.append(((String) obj).substring(0, 16382));
                            sb.append("$");
                            jSONObject.put(next, sb.toString());
                        } else if ((obj instanceof String) && ((String) obj).length() > 8191) {
                            jSONObject.put(next, ((String) obj).substring(0, 8191) + "$");
                            SALog.d(TAG, "The property value is too long. [key='" + next + "', value='" + obj + "']");
                        }
                    }
                } else {
                    itKeys.remove();
                }
            } catch (Error e2) {
                SALog.i(TAG, e2);
            } catch (JSONException unused) {
                throw new InvalidDataException("Unexpected property key. [key='" + next + "']");
            }
        }
    }

    public static String assertPropertyValue(String str) {
        if (str == null) {
            SALog.i(TAG, "Property value is empty or null");
            return str;
        }
        if (str.length() > 1024) {
            SALog.i(TAG, str + "'s length is longer than 1024");
        }
        return str;
    }

    public static void closeStream(BufferedOutputStream bufferedOutputStream, OutputStream outputStream, InputStream inputStream, HttpURLConnection httpURLConnection) {
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (Exception e2) {
                SALog.i(TAG, e2.getMessage());
            }
        }
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception e3) {
                SALog.i(TAG, e3.getMessage());
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception e4) {
                SALog.i(TAG, e4.getMessage());
            }
        }
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e5) {
                SALog.i(TAG, e5.getMessage());
            }
        }
    }

    public static String formatString(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj instanceof Date ? TimeUtils.formatDate((Date) obj) : obj.toString();
    }

    public static String gzipData(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                byte[] bytes = str.getBytes("UTF-8");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bytes);
                    gZIPOutputStream2.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    String str2 = new String(Base64Coder.encode(byteArray));
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    return str2;
                } catch (IOException e2) {
                    e = e2;
                    throw new InvalidDataException(e);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static byte[] slurp(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr, 0, 8192);
            if (i == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}

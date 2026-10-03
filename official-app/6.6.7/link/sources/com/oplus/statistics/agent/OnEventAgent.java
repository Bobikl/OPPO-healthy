package com.oplus.statistics.agent;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.fsd;
import com.oplus.aiunit.vision.rde;
import com.oplus.statistics.data.AppLogBean;
import com.oplus.statistics.data.DynamicEventBean;
import com.oplus.statistics.data.StaticEventBean;
import com.oplus.statistics.record.ProxyRecorder;
import com.oplus.statistics.storage.PreferenceHandler;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.TimeInfoUtil;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class OnEventAgent {
    public static void a(JSONObject jSONObject, Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
    }

    public static void b(JSONObject jSONObject, Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject2.put(str, map.get(str));
            }
            String strReplaceAll = jSONObject2.toString().replaceAll("\"", "");
            jSONObject.put("eventInfo", strReplaceAll.substring(1, strReplaceAll.length() - 1));
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
    }

    public static void c(Context context, String str, JSONObject jSONObject) {
        ProxyRecorder.getInstance().addTrackEvent(context, new AppLogBean(context, str, jSONObject.toString()));
    }

    public static void d(Context context, int i, JSONObject jSONObject) {
        ProxyRecorder.getInstance().addTrackEvent(context, new DynamicEventBean(context, i, jSONObject.toString()));
    }

    public static void e(Context context, int i, JSONObject jSONObject) {
        ProxyRecorder.getInstance().addTrackEvent(context, new StaticEventBean(context, i, jSONObject.toString()));
    }

    public static JSONObject getDynamicEventObject(int i, String str, Map<String, String> map, Map<String, String> map2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("statID", i);
            jSONObject.put("clientTime", str);
            a(jSONObject, map);
            b(jSONObject, map2);
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
        return jSONObject;
    }

    public static JSONObject getEventObject(String str, String str2, int i, String str3, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventID", str);
            jSONObject.put("eventCount", i);
            jSONObject.put(rde.PAY_SDK_EVENT_TIME, str3);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("eventTag", str2);
            }
            if (j != 0) {
                jSONObject.put("duration", j);
            }
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
        return jSONObject;
    }

    public static JSONObject getKVEventObject(String str, Map<String, String> map, String str2, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventID", str);
            jSONObject.put(rde.PAY_SDK_EVENT_TIME, str2);
            if (j > 0) {
                jSONObject.put("duration", j);
            }
            if (map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    jSONObject.put(str3, map.get(str3));
                }
            }
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
        return jSONObject;
    }

    public static JSONObject getStaticLogObject(int i, String str, String str2, String str3, String str4, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("statID", i);
            jSONObject.put("clientTime", str);
            jSONObject.put("setID", str2);
            jSONObject.put("setValue", str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("remark", str4);
            }
            b(jSONObject, map);
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
        return jSONObject;
    }

    public static void onDynamicEvent(Context context, int i, int i2, Map<String, String> map, Map<String, String> map2) {
        recordDynamicEvent(context, i, i2, TimeInfoUtil.getFormatTime(), map, map2);
    }

    public static void onEvent(Context context, String str, String str2, int i, long j) {
        recordEvent(context, str, str2, i, TimeInfoUtil.getFormatTime(), j);
    }

    public static void onEventEnd(Context context, String str, String str2) {
        recordEventEnd(context, str, str2, TimeInfoUtil.getCurrentTime());
    }

    public static void onEventStart(Context context, String str, String str2) {
        PreferenceHandler.setEventStart(context, str, str2, TimeInfoUtil.getCurrentTime());
    }

    public static void onKVEvent(Context context, String str, Map<String, String> map, long j) {
        recordKVEvent(context, str, map, TimeInfoUtil.getFormatTime(), j);
    }

    public static void onKVEventEnd(Context context, String str, String str2) {
        recordKVEventEnd(context, str, str2, TimeInfoUtil.getCurrentTime());
    }

    public static void onKVEventStart(Context context, String str, Map<String, String> map, String str2) {
        long currentTime = TimeInfoUtil.getCurrentTime();
        PreferenceHandler.setKVEventStart(str, getKVEventObject(str, map, TimeInfoUtil.getFormatTime(currentTime), currentTime).toString(), str2);
    }

    public static void onStaticEvent(Context context, int i, int i2, String str, String str2, String str3, Map<String, String> map) {
        recordStaticLog(context, i, i2, TimeInfoUtil.getFormatTime(), str, str2, str3, map);
    }

    public static void recordDynamicEvent(Context context, int i, int i2, String str, Map<String, String> map, Map<String, String> map2) {
        d(context, i, getDynamicEventObject(i2, str, map, map2));
    }

    public static void recordEvent(Context context, String str, String str2, int i, String str3, long j) {
        c(context, "event", getEventObject(str, str2, i, str3, j));
    }

    public static void recordEventEnd(Context context, String str, String str2, long j) {
        try {
            long eventStart = PreferenceHandler.getEventStart(context, str, str2);
            String formatTime = TimeInfoUtil.getFormatTime(eventStart);
            long j2 = j - eventStart;
            if (j2 <= 604800000 && j2 >= 0) {
                c(context, "event", getEventObject(str, str2, 1, formatTime, j2));
                PreferenceHandler.setEventStart(context, str, str2, 0L);
                return;
            }
            PreferenceHandler.setEventStart(context, str, str2, 0L);
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
    }

    public static void recordKVEvent(Context context, String str, Map<String, String> map, String str2, long j) {
        c(context, "ekv", getKVEventObject(str, map, str2, j));
    }

    public static void recordKVEventEnd(Context context, String str, String str2, long j) {
        try {
            String kVEventStart = PreferenceHandler.getKVEventStart(context, str, str2);
            if (TextUtils.isEmpty(kVEventStart)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(kVEventStart);
            long j2 = j - jSONObject.getLong("duration");
            if (j2 > 604800000 || j2 < 0) {
                PreferenceHandler.setKVEventStart(str, "", str2);
                return;
            }
            jSONObject.put("duration", j2);
            c(context, "ekv", jSONObject);
            PreferenceHandler.setKVEventStart(str, "", str2);
        } catch (Exception e) {
            LogUtil.e("OnEventAgent", new fsd(e));
        }
    }

    public static void recordStaticLog(Context context, int i, int i2, String str, String str2, String str3, String str4, Map<String, String> map) {
        e(context, i, getStaticLogObject(i2, str, str2, str3, str4, map));
    }
}

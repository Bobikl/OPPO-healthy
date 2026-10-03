package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.drs.core.model.OTrackEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class v8d {
    public static int a(@NonNull OTrackEvent oTrackEvent) {
        return oTrackEvent.toJson().getBytes().length;
    }

    @NonNull
    public static List<Object> b(@NonNull JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add(c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    arrayList.add(b((JSONArray) obj));
                } else {
                    arrayList.add(obj);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    @NonNull
    public static Map<String, Object> c(@Nullable JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject == null) {
            return map;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    map.put(next, c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    map.put(next, b((JSONArray) obj));
                } else {
                    map.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    @NonNull
    public static JSONArray d(@NonNull List<?> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                jSONArray.put(e((Map) obj));
            } else if (obj instanceof List) {
                jSONArray.put(d((List) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    @NonNull
    public static JSONObject e(@NonNull Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                Object value = entry.getValue();
                if (value instanceof Map) {
                    jSONObject.put(entry.getKey(), e((Map) value));
                } else if (value instanceof List) {
                    jSONObject.put(entry.getKey(), d((List) value));
                } else {
                    jSONObject.put(entry.getKey(), value);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static boolean f(@NonNull OTrackEvent oTrackEvent) {
        return (oTrackEvent.getEventGroup() == null || oTrackEvent.getEventGroup().isEmpty() || oTrackEvent.getEventId() == null || oTrackEvent.getEventId().isEmpty() || TextUtils.isEmpty(oTrackEvent.getAppId()) || oTrackEvent.getEventTime() <= 0 || oTrackEvent.getSequenceId() == null || oTrackEvent.getSequenceId().isEmpty()) ? false : true;
    }
}

package com.heytap.speech.engine;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Majorword_JsonSerializer implements Serializable {
    public static JSONObject serialize(Majorword majorword) throws JSONException {
        if (majorword == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (majorword.getGreeting() != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = majorword.getGreeting().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObject.put("greeting", jSONArray);
        }
        jSONObject.put("name", majorword.getName());
        jSONObject.put("pinyin", majorword.getPinyin());
        jSONObject.put(EventType.EventAssociationExtra.THRESHOLD, majorword.getThreshold());
        return jSONObject;
    }
}

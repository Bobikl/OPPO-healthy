package com.heytap.speech.engine;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Majorword_JsonParser implements Serializable {
    public static Majorword parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Majorword majorword = new Majorword();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("greeting");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            majorword.setGreeting(arrayList);
        }
        if (jSONObject.optString("name") != null && !jSONObject.optString("name").toString().equalsIgnoreCase("null")) {
            majorword.setName(jSONObject.optString("name"));
        }
        if (jSONObject.optString("pinyin") != null && !jSONObject.optString("pinyin").toString().equalsIgnoreCase("null")) {
            majorword.setPinyin(jSONObject.optString("pinyin"));
        }
        try {
            if (!jSONObject.has(EventType.EventAssociationExtra.THRESHOLD) || jSONObject.get(EventType.EventAssociationExtra.THRESHOLD) == null || jSONObject.get(EventType.EventAssociationExtra.THRESHOLD).toString().equalsIgnoreCase("null")) {
                majorword.setThreshold(null);
            } else {
                majorword.setThreshold(Double.valueOf(jSONObject.optDouble(EventType.EventAssociationExtra.THRESHOLD)));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return majorword;
    }
}

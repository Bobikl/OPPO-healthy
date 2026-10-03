package com.oplus.drs.core.upload;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.oplus.aiunit.vision.co3;
import com.oplus.aiunit.vision.of5;
import com.oplus.aiunit.vision.pe4;
import com.oplus.aiunit.vision.skk;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.db.service.ConfigRepository;
import com.oplus.nearx.track.internal.storage.db.common.entity.AppConfig;
import com.oppo.obus.common.report.core.entity.v32.Body;
import com.oppo.obus.common.report.core.entity.v32.DataItem;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a implements skk {
    public final ConfigRepository a;
    public final Gson b;

    public a(ConfigRepository configRepository, Gson gson) {
        this.a = configRepository;
        this.b = gson;
    }

    public static Map<String, Object> e(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptyMap();
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(AppConfig.CUSTOM_HEAD);
            if (jSONObjectOptJSONObject == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.get(next));
            }
            return map;
        } catch (JSONException e2) {
            z6b.u("DRS-Upload", "Failed to extract custom_head from header json, err=" + e2);
            return Collections.emptyMap();
        }
    }

    public static String g(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String strOptString = new JSONObject(str).optString(str2, null);
                if (TextUtils.isEmpty(strOptString)) {
                    return null;
                }
                return strOptString;
            } catch (JSONException e2) {
                z6b.u("DRS-Upload", "Failed to parse header json for key=" + str2 + ", err=" + e2);
            }
        }
        return null;
    }

    public static boolean h(co3 co3Var) {
        if (co3Var == null || "149700".equals(co3Var.i) || co3Var.b != 0 || co3Var.q != 0) {
            return false;
        }
        int i = co3Var.t;
        return i == 1 || i == 2;
    }

    @Override // com.oplus.aiunit.vision.skk
    public DataItem b(String str, co3 co3Var, String str2) {
        return c(str, co3Var, str2);
    }

    public DataItem c(String str, co3 co3Var, String str2) {
        byte[] bArr = co3Var.g;
        if (bArr == null || bArr.length <= 16) {
            throw new CorruptedRecordException("Invalid encrypted body for recordId: " + co3Var.a);
        }
        try {
            String str3 = new String(pe4.a(bArr, str2), StandardCharsets.UTF_8);
            try {
                JsonObject jsonObject = (JsonObject) this.b.fromJson(str3, JsonObject.class);
                if (jsonObject == null) {
                    throw new CorruptedRecordException("Empty body json for recordId: " + co3Var.a);
                }
                Integer numValueOf = h(co3Var) ? null : Integer.valueOf((int) co3Var.b);
                long asLong = co3Var.p;
                if (jsonObject.has("event_time")) {
                    asLong = jsonObject.get("event_time").getAsLong();
                }
                long j2 = asLong;
                int asInt = jsonObject.has("event_time_type") ? jsonObject.get("event_time_type").getAsInt() : 0;
                String asString = co3Var.h;
                if (jsonObject.has("sequence_id")) {
                    asString = jsonObject.get("sequence_id").getAsString();
                }
                String str4 = asString;
                String asString2 = jsonObject.has("session_id") ? jsonObject.get("session_id").getAsString() : null;
                HashMap map = new HashMap();
                JsonObject asJsonObject = jsonObject.has("event_info") ? jsonObject.getAsJsonObject("event_info") : null;
                if (asJsonObject != null) {
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        String key = entry.getKey();
                        JsonElement value = entry.getValue();
                        if (value != null && !value.isJsonNull()) {
                            try {
                                map.put(key, this.b.fromJson(value, Object.class));
                            } catch (JsonParseException e2) {
                                z6b.u("DRS-Upload", "Failed to preserve raw type for event_info key=" + key + ", recordId=" + co3Var.a + ", fallbackToString=true, err=" + e2);
                                map.put(key, String.valueOf(value));
                            }
                            j2 = j2;
                        }
                    }
                }
                long j3 = j2;
                if (jsonObject.has("event_group")) {
                    map.put("event_group", jsonObject.get("event_group").getAsString());
                }
                if (jsonObject.has(of5.ARG_EVENT_ID)) {
                    map.put(of5.ARG_EVENT_ID, jsonObject.get(of5.ARG_EVENT_ID).getAsString());
                }
                if (jsonObject.has("event_access")) {
                    map.put("event_access", jsonObject.get("event_access").getAsString());
                }
                Map<String, Object> mapD = d(co3Var);
                HashMap map2 = (mapD == null || mapD.isEmpty()) ? new HashMap() : new HashMap(mapD);
                String strF = f(co3Var, "custom_client_id");
                if (TextUtils.isEmpty(strF)) {
                    strF = null;
                }
                return new DataItem(strF, map2, new Body(str4, asInt, j3, 0L, null, asString2, map, numValueOf, numValueOf == null ? co3Var.f10171j : null, numValueOf == null ? co3Var.k : null));
            } catch (JsonSyntaxException e3) {
                if (z6b.g()) {
                    z6b.p("DRS-Upload", "Failed to parse bodyJson for recordId: " + co3Var.a + ", appId=" + str + ", rawBody=" + str3, e3);
                } else {
                    z6b.p("DRS-Upload", "Failed to parse bodyJson for recordId: " + co3Var.a + ", appId=" + str + ", bodySize=" + str3.length(), e3);
                }
                throw new CorruptedRecordException("Invalid body json for recordId: " + co3Var.a, e3);
            }
        } catch (RuntimeException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new CorruptedRecordException("Failed to decrypt recordId: " + co3Var.a, e5);
        }
    }

    public Map<String, Object> d(co3 co3Var) {
        ConfigRepository configRepository;
        Map<String, Object> mapE;
        if (co3Var == null) {
            return Collections.emptyMap();
        }
        Map<String, Object> mapE2 = e(co3Var.f10170e);
        if (mapE2 != null && !mapE2.isEmpty()) {
            return mapE2;
        }
        long j2 = co3Var.f10169c;
        return (j2 <= 0 || (configRepository = this.a) == null || (mapE = e(configRepository.l(j2))) == null || mapE.isEmpty()) ? Collections.emptyMap() : mapE;
    }

    public String f(co3 co3Var, String str) {
        ConfigRepository configRepository;
        if (co3Var != null && !TextUtils.isEmpty(str)) {
            String strG = g(co3Var.f10170e, str);
            if (!TextUtils.isEmpty(strG)) {
                return strG;
            }
            long j2 = co3Var.f10169c;
            if (j2 > 0 && (configRepository = this.a) != null) {
                String strG2 = g(configRepository.l(j2), str);
                if (!TextUtils.isEmpty(strG2)) {
                    return strG2;
                }
            }
        }
        return null;
    }
}

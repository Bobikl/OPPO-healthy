package com.oplus.aiunit.vision;

import android.content.Context;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.oplus.ocs.OmsConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class xom extends usm {
    public static final String t = "log_v";

    @Override // com.oplus.aiunit.vision.usm
    public ygm b(qam qamVar, Context context, String str) throws Throwable {
        return d(qamVar, context, str, ham.d, true);
    }

    @Override // com.oplus.aiunit.vision.usm
    public String f(qam qamVar) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        map.put(usm.k, "/sdk/log");
        map.put(usm.f17593l, OmsConfig.VERSION_NAME);
        HashMap<String, String> map2 = new HashMap<>();
        map2.put(t, "1.0");
        return h(qamVar, map, map2);
    }

    @Override // com.oplus.aiunit.vision.usm
    public String g(qam qamVar, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.oplus.aiunit.vision.usm
    public Map<String, String> i(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(usm.f17590c, String.valueOf(z));
        map.put(usm.f, FileSyncModel.streamMime);
        map.put(usm.i, "CBC");
        return map;
    }

    @Override // com.oplus.aiunit.vision.usm
    public JSONObject j() throws JSONException {
        return null;
    }

    @Override // com.oplus.aiunit.vision.usm
    public boolean o() {
        return false;
    }
}

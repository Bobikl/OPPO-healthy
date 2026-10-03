package com.oplus.aiunit.vision;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ahm extends usm {
    @Override // com.oplus.aiunit.vision.usm
    public String h(qam qamVar, HashMap<String, String> map, HashMap<String, String> map2) throws JSONException {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        map2.putAll(sam.b(qamVar));
        qrm.h(ham.A, "cf " + map2);
        return super.h(qamVar, map, map2);
    }

    @Override // com.oplus.aiunit.vision.usm
    public JSONObject j() throws JSONException {
        return usm.k("sdkConfig", "obtain");
    }

    @Override // com.oplus.aiunit.vision.usm
    public String n() {
        return "5.0.0";
    }

    @Override // com.oplus.aiunit.vision.usm
    public boolean o() {
        return true;
    }
}

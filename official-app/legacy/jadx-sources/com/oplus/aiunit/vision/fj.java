package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class fj {
    @NonNull
    public static Map<String, String> a(@NonNull String str) {
        HashMap map = new HashMap(3);
        map.put("log_tag", "ac_sdk_fbe_mode");
        map.put(of5.ARG_EVENT_ID, "fbe_mode_provider_request");
        map.put("bizPackage", str);
        return Collections.unmodifiableMap(map);
    }
}

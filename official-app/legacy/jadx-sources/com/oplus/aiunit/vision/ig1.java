package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ig1 {
    @NonNull
    public static Map<String, String> a(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_js_get_token_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_js_get_token_result");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("result", str);
        return Collections.unmodifiableMap(map);
    }
}

package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class rj {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(4);
        map.put("log_tag", "ac_service_base");
        map.put(of5.ARG_EVENT_ID, "host_replace");
        map.put("last_host", str);
        map.put("new_host", str2);
        return Collections.unmodifiableMap(map);
    }
}

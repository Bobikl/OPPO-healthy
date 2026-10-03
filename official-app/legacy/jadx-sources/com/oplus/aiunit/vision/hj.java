package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.esim.nec.NecBrowserActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class hj {
    @NonNull
    public static Map<String, String> a(@NonNull String str) {
        HashMap map = new HashMap(3);
        map.put("log_tag", "ac_sdk_getToken");
        map.put(of5.ARG_EVENT_ID, "entry");
        map.put("login_status", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6) {
        HashMap map = new HashMap(8);
        map.put("log_tag", "ac_sdk_getToken");
        map.put(of5.ARG_EVENT_ID, "exit");
        map.put("login_status", str);
        map.put("has_cache", str2);
        map.put("is_token_change", str3);
        map.put("result_id", str4);
        map.put("error_code", str5);
        map.put(NecBrowserActivity.ERROR_MSG, str6);
        return Collections.unmodifiableMap(map);
    }
}

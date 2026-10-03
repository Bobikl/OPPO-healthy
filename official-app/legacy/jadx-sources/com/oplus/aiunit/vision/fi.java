package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.esim.nec.NecBrowserActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class fi {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        HashMap map = new HashMap(6);
        map.put("log_tag", "ac_opencore_login_web");
        map.put(of5.ARG_EVENT_ID, "login_process_end");
        map.put("scene", str);
        map.put("result_id", str2);
        map.put("error_code", str3);
        map.put(NecBrowserActivity.ERROR_MSG, str4);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str) {
        HashMap map = new HashMap(3);
        map.put("log_tag", "ac_opencore_login_web");
        map.put(of5.ARG_EVENT_ID, "login_process_start");
        map.put("scene", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> c(@NonNull String str) {
        HashMap map = new HashMap(3);
        map.put("log_tag", "ac_opencore_login_web");
        map.put(of5.ARG_EVENT_ID, "open");
        map.put("scene", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> d(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(5);
        map.put("log_tag", "ac_opencore_login_web");
        map.put(of5.ARG_EVENT_ID, "result");
        map.put("result_id", str);
        map.put("error_code", str2);
        map.put(NecBrowserActivity.ERROR_MSG, str3);
        return Collections.unmodifiableMap(map);
    }
}

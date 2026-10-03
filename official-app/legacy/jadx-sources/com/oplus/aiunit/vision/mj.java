package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.esim.nec.NecBrowserActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class mj {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(4);
        map.put("log_tag", "ac_sdk_login");
        map.put(of5.ARG_EVENT_ID, "entry");
        map.put("login_status", str);
        map.put("request", str2);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6) {
        HashMap map = new HashMap(8);
        map.put("log_tag", "ac_sdk_login");
        map.put(of5.ARG_EVENT_ID, "exit");
        map.put("login_status", str);
        map.put("is_mulPage", str2);
        map.put("is_refreshv1_bg", str3);
        map.put("result_id", str4);
        map.put("error_code", str5);
        map.put(NecBrowserActivity.ERROR_MSG, str6);
        return Collections.unmodifiableMap(map);
    }
}

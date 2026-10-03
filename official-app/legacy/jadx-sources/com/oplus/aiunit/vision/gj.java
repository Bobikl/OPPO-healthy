package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.esim.nec.NecBrowserActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class gj {
    @NonNull
    public static Map<String, String> a() {
        HashMap map = new HashMap(2);
        map.put("log_tag", "ac_sdk_getInfo");
        map.put(of5.ARG_EVENT_ID, "entry");
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5) {
        HashMap map = new HashMap(7);
        map.put("log_tag", "ac_sdk_getInfo");
        map.put(of5.ARG_EVENT_ID, "exit");
        map.put("is_info_changed", str);
        map.put("login_status", str2);
        map.put("result_id", str3);
        map.put("error_code", str4);
        map.put(NecBrowserActivity.ERROR_MSG, str5);
        return Collections.unmodifiableMap(map);
    }
}

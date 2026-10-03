package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.esim.nec.NecBrowserActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class pj {
    @NonNull
    public static Map<String, String> a(@NonNull String str) {
        HashMap map = new HashMap(3);
        map.put("log_tag", "ac_sdk_refreshv1_ipc");
        map.put(of5.ARG_EVENT_ID, "entry");
        map.put("request_api_type", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(5);
        map.put("log_tag", "ac_sdk_refreshv1_ipc");
        map.put(of5.ARG_EVENT_ID, "exit");
        map.put("result_id", str);
        map.put("error_code", str2);
        map.put(NecBrowserActivity.ERROR_MSG, str3);
        return Collections.unmodifiableMap(map);
    }
}

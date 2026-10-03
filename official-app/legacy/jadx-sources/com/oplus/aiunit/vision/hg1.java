package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.webview.extension.protocol.Const;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class hg1 {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_js_method_entrance");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_js_method_entrance");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        map.put("methodName", str2);
        map.put(Const.Batch.ARGUMENTS, str3);
        return Collections.unmodifiableMap(map);
    }
}

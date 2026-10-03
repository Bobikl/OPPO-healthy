package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class bi {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(5);
        map.put("log_tag", "avatar_modification");
        map.put(of5.ARG_EVENT_ID, "avatar_camera_permission_result");
        map.put("type", "view");
        map.put("reqpkg", str);
        map.put("result", str2);
        return Collections.unmodifiableMap(map);
    }
}

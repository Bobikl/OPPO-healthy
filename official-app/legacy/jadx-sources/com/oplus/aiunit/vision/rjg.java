package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class rjg {
    public static final Map<String, String[]> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("package::detector_version", new String[]{"package::detector_usage"});
    }

    public static void a(Map<String, Object> map) {
        for (Map.Entry<String, String[]> entry : a.entrySet()) {
            Object obj = map.get(entry.getKey());
            if (obj != null) {
                for (String str : entry.getValue()) {
                    map.put(str, obj);
                }
            }
        }
    }
}

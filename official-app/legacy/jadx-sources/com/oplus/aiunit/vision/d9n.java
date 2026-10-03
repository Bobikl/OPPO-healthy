package com.oplus.aiunit.vision;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class d9n {
    public Map<String, Boolean> a;
    public AtomicBoolean b;

    public static class a {
        public static d9n a = new d9n(0);
    }

    public /* synthetic */ d9n(byte b) {
        this();
    }

    public static d9n a() {
        return a.a;
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("mvt_able");
        com.amap.api.col.p0003sl.e0.x(strOptString, true);
        this.a.put("feature_mvt", Boolean.valueOf(com.amap.api.col.p0003sl.e0.x(strOptString, true)));
        this.a.put("feature_gltf", Boolean.valueOf(com.amap.api.col.p0003sl.e0.x(jSONObject.optString("gltf_able"), false)));
        this.a.put("feature_terrain", Boolean.valueOf(com.amap.api.col.p0003sl.e0.x(jSONObject.optString("terrain_able"), false)));
        this.b.set(true);
    }

    public final boolean c(String str) {
        if (this.a.containsKey(str)) {
            return this.a.get(str).booleanValue();
        }
        return false;
    }

    public final boolean d() {
        return this.b.get();
    }

    public final void e() {
        this.a.put("feature_mvt", Boolean.TRUE);
        Map<String, Boolean> map = this.a;
        Boolean bool = Boolean.FALSE;
        map.put("feature_gltf", bool);
        this.a.put("feature_terrain", bool);
    }

    public d9n() {
        this.a = new ConcurrentHashMap();
        this.b = new AtomicBoolean(false);
        e();
    }
}

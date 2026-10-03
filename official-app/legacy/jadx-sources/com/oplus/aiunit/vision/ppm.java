package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ppm {
    public final JSONObject a;
    public final JSONObject b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15444c;

    public ppm(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        this.a = jSONObject;
        this.b = jSONObject2;
        this.f15444c = z;
    }

    public boolean a() {
        return this.f15444c;
    }

    public JSONObject b() {
        return this.b;
    }

    public JSONObject c() {
        return this.a;
    }
}

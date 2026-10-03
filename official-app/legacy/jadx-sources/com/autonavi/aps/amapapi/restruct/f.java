package com.autonavi.aps.amapapi.restruct;

import com.amap.api.maps.model.MyLocationStyle;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class f {
    public int a = 0;
    public double b = 0.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f1133c = 0.0d;
    public long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1134e = 0;
    public int f = 0;
    public int g = 63;
    public int h = 0;

    public final String a() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put(ClickApiEntity.TIME, this.d);
            jSONObject.put("lon", this.f1133c);
            jSONObject.put("lat", this.b);
            jSONObject.put("radius", this.f1134e);
            jSONObject.put(MyLocationStyle.LOCATION_TYPE, this.a);
            jSONObject.put("reType", this.g);
            jSONObject.put("reSubType", this.h);
        } catch (Throwable unused) {
            jSONObject = null;
        }
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.a == fVar.a && Double.compare(fVar.b, this.b) == 0 && Double.compare(fVar.f1133c, this.f1133c) == 0 && this.d == fVar.d && this.f1134e == fVar.f1134e && this.f == fVar.f && this.g == fVar.g && this.h == fVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.f1133c), Long.valueOf(this.d), Integer.valueOf(this.f1134e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    public final void a(JSONObject jSONObject) {
        try {
            this.b = jSONObject.optDouble("lat", this.b);
            this.f1133c = jSONObject.optDouble("lon", this.f1133c);
            this.a = jSONObject.optInt(MyLocationStyle.LOCATION_TYPE, this.a);
            this.g = jSONObject.optInt("reType", this.g);
            this.h = jSONObject.optInt("reSubType", this.h);
            this.f1134e = jSONObject.optInt("radius", this.f1134e);
            this.d = jSONObject.optLong(ClickApiEntity.TIME, this.d);
        } catch (Throwable th) {
            com.autonavi.aps.amapapi.utils.c.a(th, "CoreUtil", "transformLocation");
        }
    }
}

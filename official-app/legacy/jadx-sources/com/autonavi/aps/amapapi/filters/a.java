package com.autonavi.aps.amapapi.filters;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.utils.b;
import com.autonavi.aps.amapapi.utils.k;
import com.oplus.aiunit.vision.f58;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    com.autonavi.aps.amapapi.model.a a = null;
    long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f1109c = 0;
    private boolean h = true;
    int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f1110e = 0;
    AMapLocation f = null;
    long g = 0;

    private com.autonavi.aps.amapapi.model.a b(com.autonavi.aps.amapapi.model.a aVar) {
        if (k.a(aVar)) {
            if (!this.h || !b.a(aVar.getTime())) {
                aVar.setLocationType(this.d);
            } else if (aVar.getLocationType() == 5 || aVar.getLocationType() == 6) {
                aVar.setLocationType(4);
            }
        }
        return aVar;
    }

    public final void a() {
        this.a = null;
        this.b = 0L;
        this.f1109c = 0L;
        this.f = null;
        this.g = 0L;
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a aVar) {
        if (k.b() - this.f1110e > 30000) {
            this.a = aVar;
            this.f1110e = k.b();
            return this.a;
        }
        this.f1110e = k.b();
        if (!k.a(this.a) || !k.a(aVar)) {
            this.b = k.b();
            this.a = aVar;
            return aVar;
        }
        if (aVar.getTime() == this.a.getTime() && aVar.getAccuracy() < 300.0f) {
            return aVar;
        }
        if (f58.GPS.equals(aVar.getProvider())) {
            this.b = k.b();
            this.a = aVar;
            return aVar;
        }
        if (aVar.c() != this.a.c()) {
            this.b = k.b();
            this.a = aVar;
            return aVar;
        }
        if (aVar.getBuildingId() != null && !aVar.getBuildingId().equals(this.a.getBuildingId()) && !TextUtils.isEmpty(aVar.getBuildingId())) {
            this.b = k.b();
            this.a = aVar;
            return aVar;
        }
        this.d = aVar.getLocationType();
        float fA = k.a(aVar, this.a);
        float accuracy = this.a.getAccuracy();
        float accuracy2 = aVar.getAccuracy();
        float f = accuracy2 - accuracy;
        long jB = k.b();
        long j2 = jB - this.b;
        boolean z = accuracy <= 100.0f && accuracy2 > 299.0f;
        boolean z2 = accuracy > 299.0f && accuracy2 > 299.0f;
        if (z || z2) {
            long j3 = this.f1109c;
            if (j3 == 0) {
                this.f1109c = jB;
            } else if (jB - j3 > 30000) {
                this.b = jB;
                this.a = aVar;
                this.f1109c = 0L;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a aVarB = b(this.a);
            this.a = aVarB;
            return aVarB;
        }
        if (accuracy2 < 100.0f && accuracy > 299.0f) {
            this.b = jB;
            this.a = aVar;
            this.f1109c = 0L;
            return aVar;
        }
        if (accuracy2 <= 299.0f) {
            this.f1109c = 0L;
        }
        if (fA >= 10.0f || fA <= 0.1d || accuracy2 <= 5.0f) {
            if (f < 300.0f) {
                this.b = k.b();
                this.a = aVar;
                return aVar;
            }
            if (j2 >= 30000) {
                this.b = k.b();
                this.a = aVar;
                return aVar;
            }
            com.autonavi.aps.amapapi.model.a aVarB2 = b(this.a);
            this.a = aVarB2;
            return aVarB2;
        }
        if (f >= -300.0f) {
            com.autonavi.aps.amapapi.model.a aVarB3 = b(this.a);
            this.a = aVarB3;
            return aVarB3;
        }
        if (accuracy / accuracy2 >= 2.0f) {
            this.b = jB;
            this.a = aVar;
            return aVar;
        }
        com.autonavi.aps.amapapi.model.a aVarB4 = b(this.a);
        this.a = aVarB4;
        return aVarB4;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final AMapLocation a(AMapLocation aMapLocation) {
        if (!k.a(aMapLocation)) {
            return aMapLocation;
        }
        long jB = k.b() - this.g;
        this.g = k.b();
        if (jB > 5000) {
            return aMapLocation;
        }
        AMapLocation aMapLocation2 = this.f;
        if (aMapLocation2 == null) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (1 != aMapLocation2.getLocationType() && !f58.GPS.equalsIgnoreCase(this.f.getProvider())) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (this.f.getAltitude() == aMapLocation.getAltitude() && this.f.getLongitude() == aMapLocation.getLongitude()) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        long jAbs = Math.abs(aMapLocation.getTime() - this.f.getTime());
        if (30000 < jAbs) {
            this.f = aMapLocation;
            return aMapLocation;
        }
        if (k.a(aMapLocation, this.f) > (((this.f.getSpeed() + aMapLocation.getSpeed()) * jAbs) / 2000.0f) + ((this.f.getAccuracy() + aMapLocation.getAccuracy()) * 2.0f) + 3000.0f) {
            return this.f;
        }
        this.f = aMapLocation;
        return aMapLocation;
    }
}

package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.bloodPressure.BloodPressure;

/* JADX INFO: loaded from: classes15.dex */
public class zq1 {
    public static int VIEW_DATA = 1;
    public static int VIEW_TITLE;
    public BloodPressure a;
    public int b = VIEW_DATA;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19514c;

    public zq1(BloodPressure bloodPressure) {
        this.a = bloodPressure;
    }

    public BloodPressure a() {
        return this.a;
    }

    public long b() {
        return this.f19514c;
    }

    public int c() {
        return this.b;
    }

    public void d(long j2) {
        this.f19514c = j2;
    }

    public void e(int i) {
        this.b = i;
    }

    public zq1() {
    }
}

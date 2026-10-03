package com.oplus.aiunit.vision;

import com.heytap.health.base.oplus.power.HealthPowerManger;

/* JADX INFO: loaded from: classes15.dex */
public class gx4 implements Runnable {
    public final String i = "Data-Sync";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ys f11932j;

    public static class a {
        public static final gx4 a = new gx4();
    }

    public gx4() {
        ys ysVar = new ys(b78.a(), "Data-Sync", 7200000L);
        this.f11932j = ysVar;
        ysVar.j(this);
    }

    public static gx4 a() {
        return a.a;
    }

    public synchronized void b() {
        a7b.f("Data-Sync", "Update data sync alarm");
        this.f11932j.m();
        this.f11932j.l();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (HealthPowerManger.INSTANCE.a().q()) {
            a7b.f("Data-Sync", "run skip, health power controlled");
            b();
        } else {
            a7b.f("Data-Sync", "On data sync scheduler call, call data sync...");
            yc5.j(true, 4);
        }
    }
}

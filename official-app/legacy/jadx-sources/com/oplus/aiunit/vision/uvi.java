package com.oplus.aiunit.vision;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes16.dex */
@Deprecated
public abstract class uvi implements sta {
    public final String i = "StoreRealize";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xm3<rvi> f17622j;

    public <T extends uvi> void a(LifecycleOwner lifecycleOwner, T t, xm3<rvi> xm3Var) {
        this.f17622j = xm3Var;
        t.b(lifecycleOwner, this);
    }

    public abstract void b(LifecycleOwner lifecycleOwner, sta staVar);

    @Override // com.oplus.aiunit.vision.sta
    public void callBack(Long l2, Object obj) {
        a7b.f("StoreRealize", "fetchLastDataTime callback:" + l2);
        this.f17622j.onResult(new rvi(l2.longValue(), obj));
    }

    @Override // com.oplus.aiunit.vision.sta
    public void callBack(Long l2) {
        a7b.f("StoreRealize", "fetchLastDataTime callback:" + l2);
        this.f17622j.onResult(new rvi(l2.longValue(), null));
    }
}

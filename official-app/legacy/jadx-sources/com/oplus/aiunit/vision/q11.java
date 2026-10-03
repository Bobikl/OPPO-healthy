package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.utils.GenerateAdaptUtil;

/* JADX INFO: loaded from: classes19.dex */
public abstract class q11<V> extends ja1<V> {
    public final String k = getClass().getSimpleName();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Proto$DeviceInfo f15580l;

    @Override // com.oplus.aiunit.vision.ja1
    public void k(Intent intent) {
        this.f15580l = GenerateAdaptUtil.INSTANCE.d();
        ltl.a(this.k, "[initArguments]  mDeviceInfo " + this.f15580l);
        q();
    }

    public void q() {
        if (this.f15580l == null) {
            r();
        }
    }

    public void r() {
        Context contextI = i();
        if (contextI != null) {
            ((AppCompatActivity) contextI).finish();
        }
    }

    public Proto$DeviceInfo s() {
        return this.f15580l;
    }
}

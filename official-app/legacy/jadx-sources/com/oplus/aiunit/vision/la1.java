package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.utils.GenerateAdaptUtil;
import com.oplus.aiunit.vision.lm9;

/* JADX INFO: loaded from: classes19.dex */
public abstract class la1<V extends lm9> extends q11<V> {
    public os4 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f13600n;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Bundle bundle) {
        V vJ = j();
        if (vJ != null) {
            v(bundle);
            vJ.O(bundle);
            u(bundle);
        }
    }

    public String getDeviceMac() {
        return this.f13600n;
    }

    @Override // com.oplus.aiunit.vision.q11, com.oplus.aiunit.vision.ja1
    public void k(Intent intent) {
        super.k(intent);
        this.f13600n = vda.k(intent, "currentMac");
        ltl.a(this.k, "[initArguments]  mDeviceMac " + this.f13600n);
        this.f15580l = GenerateAdaptUtil.INSTANCE.d();
        if (TextUtils.isEmpty(this.f13600n)) {
            this.f13600n = this.f15580l.getDeviceMac();
        }
        if (this.f15580l == null && TextUtils.isEmpty(this.f13600n)) {
            r();
            ltl.i(this.k, "[initArguments]  mDeviceInfo == null &&  mDeviceMac =null.and return.");
        }
    }

    @Override // com.oplus.aiunit.vision.ja1
    public void l(Bundle bundle) {
        if (rpc.c()) {
            y(bundle);
        } else {
            ltl.i(this.k, "[startSyncDeviceData] --> not network and sync failed. ");
            j().x();
        }
    }

    @Override // com.oplus.aiunit.vision.q11
    public Proto$DeviceInfo s() {
        return this.f15580l;
    }

    public abstract void u(Bundle bundle);

    public void v(Bundle bundle) {
    }

    public void x() {
        if (this.m != null) {
            this.m = null;
        }
    }

    public final void y(final Bundle bundle) {
        Context contextI = i();
        if (contextI != null) {
            ((AppCompatActivity) contextI).runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ka1
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.w(bundle);
                }
            });
        }
    }
}

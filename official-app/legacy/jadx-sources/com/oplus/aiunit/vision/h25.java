package com.oplus.aiunit.vision;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes15.dex */
public class h25 extends a8a {
    public void a() {
    }

    public final void b() {
        if (qe0.s()) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedSqlLiteObjects().detectLeakedClosableObjects().detectActivityLeaks().detectLeakedRegistrationObjects().penaltyLog().penaltyDeath().build());
        }
    }

    @Override // com.oplus.aiunit.vision.a8a
    public boolean configDebugType() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return a8a.PROCESS_ALL;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public String getTag() {
        return "DebugInitializer";
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        b();
        a();
    }
}

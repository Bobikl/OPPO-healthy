package com.oplus.aiunit.vision;

import android.content.Context;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class s7n implements Runnable {
    public final /* synthetic */ Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y7n f16499j;

    public s7n(y7n y7nVar, Context context) {
        this.f16499j = y7nVar;
        this.i = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k8n.a("2050");
        ArrayList arrayList = new ArrayList();
        arrayList.add(OpenIDHelper.OUID);
        this.f16499j.c(this.i, arrayList, true);
        this.f16499j.a.remove(OpenIDHelper.OUID);
    }
}

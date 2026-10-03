package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;

/* JADX INFO: loaded from: classes8.dex */
public class lgf implements yv9 {
    @Override // com.oplus.aiunit.vision.yv9
    public int a(long j2, int i, int i2, int i3) {
        Context context = GlobalConfigHelper.context;
        return k15.d(context, context.getPackageName()).a(j2, i, i2, i3);
    }

    @Override // com.oplus.aiunit.vision.yv9
    public void b(long j2, int i, int i2) {
        Context context = GlobalConfigHelper.context;
        k15.d(context, context.getPackageName()).e(j2, i, i2);
    }
}

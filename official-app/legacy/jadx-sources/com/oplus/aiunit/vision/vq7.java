package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class vq7 implements nlk {
    @Override // com.oplus.aiunit.vision.nlk
    public long a(Context context, long j2) {
        if (j2 <= 0) {
            j2 = 180000;
        }
        return Math.max(nlk.MIN_DELAY_MS, j2);
    }
}

package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class ngm implements cam {
    public static cam a;
    public static x9m b;

    public static cam b(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (a == null) {
            b = iqm.a(context, str);
            a = new ngm();
        }
        return a;
    }

    @Override // com.oplus.aiunit.vision.cam
    public qkm a(kqm kqmVar) {
        return mgm.b(b.a(mgm.a(kqmVar)));
    }

    @Override // com.oplus.aiunit.vision.cam
    public boolean logCollect(String str) {
        return b.logCollect(str);
    }
}

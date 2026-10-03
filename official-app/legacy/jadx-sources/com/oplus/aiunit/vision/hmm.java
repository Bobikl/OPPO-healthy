package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes10.dex */
public final class hmm implements fl9 {
    @Override // com.oplus.aiunit.vision.fl9
    public final void a(int i, Bundle bundle) {
        if (kfk.Q == null) {
            Handler unused = kfk.Q = new Handler(kfk.V);
        }
        kfk.Q.sendMessage(kfk.Q.obtainMessage(1003, Integer.valueOf(i)));
    }
}

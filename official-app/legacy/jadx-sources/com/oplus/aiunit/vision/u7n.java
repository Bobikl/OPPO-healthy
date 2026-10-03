package com.oplus.aiunit.vision;

import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public final class u7n implements IBinder.DeathRecipient {
    public final /* synthetic */ a8n a;

    public u7n(a8n a8nVar) {
        this.a = a8nVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        Log.e("IDHelper", "1029");
        if (this.a.a != null) {
            this.a.a.asBinder().unlinkToDeath(this.a.k, 0);
            this.a.a = null;
        }
    }
}

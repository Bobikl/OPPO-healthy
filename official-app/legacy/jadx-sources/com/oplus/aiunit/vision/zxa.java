package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.health.linkage.watch.LinkageConnectManagerImpl;

/* JADX INFO: loaded from: classes16.dex */
public class zxa implements wr9 {
    public final wr9 i;

    public static class a {
        public static final zxa a = new zxa();
    }

    public static zxa c() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.wr9
    public void a(fa5 fa5Var) {
        this.i.a(fa5Var);
    }

    @Override // com.oplus.aiunit.vision.wr9
    public void b(boolean z) {
        this.i.b(z);
    }

    @Override // com.oplus.aiunit.vision.wr9
    public Bundle call(int i, Bundle bundle) {
        return this.i.call(i, bundle);
    }

    @Override // com.oplus.aiunit.vision.wr9
    public void init(Context context) {
        this.i.init(context);
    }

    public zxa() {
        this.i = new LinkageConnectManagerImpl();
    }
}

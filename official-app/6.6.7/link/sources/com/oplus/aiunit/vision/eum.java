package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class eum extends mgm {
    public eum(nmm nmmVar) {
        super(nmmVar);
    }

    @Override // com.oplus.aiunit.vision.jaf.c
    public void a(Context context) {
        if (this.d == null) {
            this.d = new HashMap(1);
        }
        z5n.i(context, this.f, this.a, this.b, this.c, this.d, this.e);
    }

    @Override // com.oplus.aiunit.vision.jaf.c
    public void b(Context context) {
        if (this.d == null) {
            this.d = new HashMap(1);
        }
        z5n.t(context, this.f, this.a, this.b, this.c, this.d, this.e);
    }
}

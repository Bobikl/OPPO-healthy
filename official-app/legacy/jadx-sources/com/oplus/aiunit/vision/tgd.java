package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class tgd implements d8i {
    public final Context a;

    public tgd(Context context) {
        this.a = context;
    }

    @Override // com.oplus.aiunit.vision.d8i
    public void a(String str, f8i f8iVar) {
        ylm.b.a.a(this.a, str, f8iVar);
    }

    @Override // com.oplus.aiunit.vision.d8i
    public void b(String str, List<f8i> list) {
        w7i.a("OmsSplitReporter", "onBatchHandleInfo tag:" + str + ",list:" + list, new Object[0]);
        ylm.b.a.b(this.a, str, list);
    }
}

package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class nqc extends l81 {
    public nqc(int i, String str, String str2, String str3) {
        super(i, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ccd ccdVar) throws Throwable {
        if (TextUtils.isEmpty(this.d)) {
            x0.d().b("/watch_face/main/WatchFaceStoreHomeActivity").withString("currentMac", this.b).addFlags(268435456).navigation();
        } else {
            x0.d().b("/watch_face/main/WatchFaceStoreDetailActivity").withString("currentMac", this.b).withString("store_url", this.d).addFlags(268435456).navigation();
        }
        ccdVar.onNext(Boolean.TRUE);
        ccdVar.onComplete();
    }

    @Override // com.oplus.aiunit.vision.l81
    public boolean a() {
        return grl.a(gl4.managerApi.getCurrentConnectId()).c7(this.a);
    }

    @Override // com.oplus.aiunit.vision.l81
    public lbd<Boolean> b() {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.mqc
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.d(ccdVar);
            }
        });
    }
}

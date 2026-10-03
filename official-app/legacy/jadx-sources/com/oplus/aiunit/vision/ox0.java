package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class ox0 extends l81 {
    public ox0(int i, String str, String str2, String str3) {
        super(i, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(ccd ccdVar) throws Throwable {
        x0.d().b("/bandfaceapi/BandOnlineActivity").withString("currentMac", this.b).addFlags(268435456).navigation();
        ccdVar.onNext(Boolean.TRUE);
        ccdVar.onComplete();
    }

    @Override // com.oplus.aiunit.vision.l81
    public boolean a() {
        return grl.a(gl4.managerApi.getCurrentConnectId()).c7(this.a);
    }

    @Override // com.oplus.aiunit.vision.l81
    public lbd<Boolean> b() {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.nx0
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                this.a.d(ccdVar);
            }
        });
    }
}

package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qh1 extends ltc {
    @Override // com.oplus.aiunit.vision.ltc
    public void j(ltc ltcVar) {
        if (!(ltcVar instanceof qh1)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.j(ltcVar);
    }

    @Override // com.oplus.aiunit.vision.ltc
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public qh1 f() {
        return (qh1) super.f();
    }
}

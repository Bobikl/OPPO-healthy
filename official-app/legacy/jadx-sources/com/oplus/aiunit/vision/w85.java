package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public abstract class w85 implements zyl {
    public abstract void a();

    public abstract void b();

    @Override // com.oplus.aiunit.vision.zyl
    public void onFail(String str) {
        a();
    }

    @Override // com.oplus.aiunit.vision.zyl
    public void onSuccess() {
        b();
    }
}

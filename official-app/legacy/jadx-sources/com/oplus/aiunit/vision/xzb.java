package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public abstract class xzb implements zyl {
    public abstract void a(String str);

    public abstract void b();

    @Override // com.oplus.aiunit.vision.zyl
    public void onFail(String str) {
        a(str);
    }

    @Override // com.oplus.aiunit.vision.zyl
    public void onSuccess() {
        b();
    }
}

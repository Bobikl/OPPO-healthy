package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class skm extends ogm {
    public final String f;

    public skm(String str) {
        this.f = str;
    }

    @Override // com.oplus.aiunit.vision.ogm
    public void a() throws Exception {
        this.a = (byte) 1;
        byte[] bytes = this.f.getBytes("UTF-8");
        this.f14936c = bytes;
        this.b = (byte) bytes.length;
    }
}

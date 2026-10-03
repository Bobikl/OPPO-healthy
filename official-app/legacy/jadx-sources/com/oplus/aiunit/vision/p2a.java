package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class p2a extends ltc {
    public String f;
    public String g;

    public p2a() {
    }

    @Override // com.oplus.aiunit.vision.ltc
    public void a(v1l v1lVar) {
        v1lVar.t(this);
    }

    @Override // com.oplus.aiunit.vision.ltc
    public String k() {
        return "destination=" + this.f + ", title=" + this.g;
    }

    public String m() {
        return this.f;
    }

    public p2a(String str, String str2) {
        this.f = str;
        this.g = str2;
    }
}

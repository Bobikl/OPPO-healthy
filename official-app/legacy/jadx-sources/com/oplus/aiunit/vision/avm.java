package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class avm {
    public boolean a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9505c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f9506e;

    public static avm a(int i, Throwable th) {
        avm avmVar = new avm();
        avmVar.a = i >= 200 && i < 300;
        avmVar.b = i;
        avmVar.f9505c = th.getMessage();
        avmVar.d = th.getClass().getSimpleName();
        avmVar.f9506e = th;
        return avmVar;
    }

    public final String toString() {
        return "UploadResult{success=" + this.a + ", code=" + this.b + ", errorMessage='" + this.f9505c + "', errorName='" + this.d + "', throwable=" + this.f9506e + '}';
    }
}

package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class d4n extends g4n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f10387e;
    public boolean f;

    public d4n(g4n g4nVar) {
        super(g4nVar);
        this.f10387e = new StringBuilder();
        this.f = true;
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final byte[] b(byte[] bArr) {
        byte[] bArrN = w0n.n(this.f10387e.toString());
        this.d = bArrN;
        this.f = true;
        StringBuilder sb = this.f10387e;
        sb.delete(0, sb.length());
        return bArrN;
    }

    @Override // com.oplus.aiunit.vision.g4n
    public final void c(byte[] bArr) {
        String strG = w0n.g(bArr);
        if (this.f) {
            this.f = false;
        } else {
            this.f10387e.append(",");
        }
        StringBuilder sb = this.f10387e;
        sb.append("{\"log\":\"");
        sb.append(strG);
        sb.append("\"}");
    }
}

package org.spongycastle.jce;

/* JADX INFO: loaded from: classes11.dex */
class ECKeyUtil$UnexpectedException extends RuntimeException {
    private Throwable cause;

    public ECKeyUtil$UnexpectedException(Throwable th) {
        super(th.toString());
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}

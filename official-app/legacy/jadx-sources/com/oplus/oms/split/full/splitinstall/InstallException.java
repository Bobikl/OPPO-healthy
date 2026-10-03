package com.oplus.oms.split.full.splitinstall;

/* JADX INFO: loaded from: classes8.dex */
public final class InstallException extends Exception {
    private final int a;

    public InstallException(int i, Throwable th) {
        super("Split Install Error: " + i, th);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}

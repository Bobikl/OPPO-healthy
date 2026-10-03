package com.oplus.oms.split.full.splitload;

/* JADX INFO: loaded from: classes8.dex */
final class SplitLoadException extends Exception {
    private final int a;

    public SplitLoadException(int i, Throwable th) {
        super("Split Load Error: " + i, th);
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}

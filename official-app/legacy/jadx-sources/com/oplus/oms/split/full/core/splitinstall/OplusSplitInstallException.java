package com.oplus.oms.split.full.core.splitinstall;

/* JADX INFO: loaded from: classes8.dex */
public class OplusSplitInstallException extends RuntimeException {
    private final int a;

    public OplusSplitInstallException(int i) {
        super("Split Install Error: " + i);
        this.a = i;
    }

    public int getErrorCode() {
        return this.a;
    }
}

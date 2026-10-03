package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class PreAllocateException extends IOException {
    private final long freeSpace;
    private final long requireSpace;

    public PreAllocateException(long j2, long j3) {
        super("There is Free space less than Require space: " + j3 + " < " + j2);
        this.requireSpace = j2;
        this.freeSpace = j3;
    }

    public long getFreeSpace() {
        return this.freeSpace;
    }

    public long getRequireSpace() {
        return this.requireSpace;
    }
}

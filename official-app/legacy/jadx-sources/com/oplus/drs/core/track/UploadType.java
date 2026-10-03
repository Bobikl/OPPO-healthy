package com.oplus.drs.core.track;

/* JADX INFO: loaded from: classes6.dex */
public enum UploadType {
    TIMING(1),
    REALTIME(2),
    HASH(3);

    private final int uploadType;

    UploadType(int i) {
        this.uploadType = i;
    }

    public int value() {
        return this.uploadType;
    }
}

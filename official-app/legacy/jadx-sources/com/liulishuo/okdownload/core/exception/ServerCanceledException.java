package com.liulishuo.okdownload.core.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class ServerCanceledException extends IOException {
    private final int responseCode;

    public ServerCanceledException(int i, long j2) {
        super("Response code can't handled on internal " + i + " with current offset " + j2);
        this.responseCode = i;
    }

    public int getResponseCode() {
        return this.responseCode;
    }
}

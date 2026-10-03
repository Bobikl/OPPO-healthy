package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: classes14.dex */
public class SplitInstallException extends RuntimeException {

    @SplitInstallErrorCode
    public final int a;

    public SplitInstallException(int i) {
        super("Split Install Error: " + i);
        this.a = i;
    }

    @SplitInstallErrorCode
    public int getErrorCode() {
        return this.a;
    }
}

package com.platform.usercenter.tools.algorithm.disperse;

/* JADX INFO: loaded from: classes9.dex */
public class DisperseResponse {
    public boolean isTrigger;
    public long nextTriggerTime;

    private DisperseResponse(boolean z, long j2) {
        this.isTrigger = z;
        this.nextTriggerTime = j2;
    }

    public static DisperseResponse create(boolean z, long j2) {
        return new DisperseResponse(z, j2);
    }
}

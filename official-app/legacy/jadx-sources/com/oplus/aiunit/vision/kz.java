package com.oplus.aiunit.vision;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/kz;", "", "", "a", "J", "b", "()J", "d", "(J)V", "timestamp", "", "I", "()I", "c", "(I)V", yif.RECOVERY_HR, "<init>", "(JI)V", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class kz {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int recoveryHeartRate;

    public kz(long j2, int i) {
        this.timestamp = j2;
        this.recoveryHeartRate = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRecoveryHeartRate() {
        return this.recoveryHeartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void c(int i) {
        this.recoveryHeartRate = i;
    }

    public final void d(long j2) {
        this.timestamp = j2;
    }

    public kz() {
        this(0L, 0);
    }
}

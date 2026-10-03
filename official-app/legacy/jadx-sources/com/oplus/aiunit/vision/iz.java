package com.oplus.aiunit.vision;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB\t\b\u0016¢\u0006\u0004\b\f\u0010\u000eR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/iz;", "", "", "a", "I", "()I", "c", "(I)V", "restHeartRate", "b", "d", "sleepBaseHeartRate", "<init>", "(II)V", "()V", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class iz {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int restHeartRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int sleepBaseHeartRate;

    public iz(int i, int i2) {
        this.restHeartRate = i;
        this.sleepBaseHeartRate = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRestHeartRate() {
        return this.restHeartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSleepBaseHeartRate() {
        return this.sleepBaseHeartRate;
    }

    public final void c(int i) {
        this.restHeartRate = i;
    }

    public final void d(int i) {
        this.sleepBaseHeartRate = i;
    }

    public iz() {
        this(0, 0);
    }
}

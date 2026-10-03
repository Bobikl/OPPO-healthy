package com.oplus.aiunit.vision;

import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/xf8;", "", "", "a", "I", "()I", "d", "(I)V", "retryTime", "", "b", "Z", "()Z", "c", "(Z)V", "isRetryStatus", "<init>", "(IZ)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class xf8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int retryTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isRetryStatus;

    public xf8(int i, boolean z) {
        this.retryTime = i;
        this.isRetryStatus = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getRetryTime() {
        return this.retryTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsRetryStatus() {
        return this.isRetryStatus;
    }

    public final void c(boolean z) {
        this.isRetryStatus = z;
    }

    public final void d(int i) {
        this.retryTime = i;
    }

    public /* synthetic */ xf8(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }
}

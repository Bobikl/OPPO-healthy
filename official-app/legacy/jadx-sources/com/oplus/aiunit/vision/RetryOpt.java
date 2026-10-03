package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wvf, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u000fJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/wvf;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "I", "()I", "mMaxRetry", "b", "c", "(I)V", "mRemainRetry", "<init>", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RetryOpt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int mMaxRetry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int mRemainRetry;

    public RetryOpt(int i) {
        this.mMaxRetry = i;
        this.mRemainRetry = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMMaxRetry() {
        return this.mMaxRetry;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMRemainRetry() {
        return this.mRemainRetry;
    }

    public final void c(int i) {
        this.mRemainRetry = i;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RetryOpt) && this.mMaxRetry == ((RetryOpt) other).mMaxRetry;
    }

    public int hashCode() {
        return this.mMaxRetry;
    }

    @NotNull
    public String toString() {
        return "RetryOpt(mMaxRetry=" + this.mMaxRetry + ")";
    }
}

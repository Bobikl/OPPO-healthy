package com.heytap.weather.service;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/heytap/weather/service/RequestRetryInfo;", "", "retryTimes", "", "isComplete", "", "(IZ)V", "()Z", "setComplete", "(Z)V", "getRetryTimes", "()I", "setRetryTimes", "(I)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RequestRetryInfo {
    private boolean isComplete;
    private int retryTimes;

    public RequestRetryInfo(int i, boolean z) {
        this.retryTimes = i;
        this.isComplete = z;
    }

    public static /* synthetic */ RequestRetryInfo copy$default(RequestRetryInfo requestRetryInfo, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = requestRetryInfo.retryTimes;
        }
        if ((i2 & 2) != 0) {
            z = requestRetryInfo.isComplete;
        }
        return requestRetryInfo.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRetryTimes() {
        return this.retryTimes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    @NotNull
    public final RequestRetryInfo copy(int retryTimes, boolean isComplete) {
        return new RequestRetryInfo(retryTimes, isComplete);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestRetryInfo)) {
            return false;
        }
        RequestRetryInfo requestRetryInfo = (RequestRetryInfo) other;
        return this.retryTimes == requestRetryInfo.retryTimes && this.isComplete == requestRetryInfo.isComplete;
    }

    public final int getRetryTimes() {
        return this.retryTimes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.retryTimes) * 31;
        boolean z = this.isComplete;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    public final void setRetryTimes(int i) {
        this.retryTimes = i;
    }

    @NotNull
    public String toString() {
        return "RequestRetryInfo(retryTimes=" + this.retryTimes + ", isComplete=" + this.isComplete + ")";
    }
}

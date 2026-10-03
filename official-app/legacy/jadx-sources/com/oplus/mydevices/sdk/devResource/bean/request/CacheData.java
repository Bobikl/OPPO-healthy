package com.oplus.mydevices.sdk.devResource.bean.request;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/request/CacheData;", "", "data", "", ClickApiEntity.TIME, "", "(Ljava/lang/String;J)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class CacheData {

    @NotNull
    private String data;
    private long time;

    public CacheData(@NotNull String data, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.time = j2;
    }

    public static /* synthetic */ CacheData copy$default(CacheData cacheData, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cacheData.data;
        }
        if ((i & 2) != 0) {
            j2 = cacheData.time;
        }
        return cacheData.copy(str, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final CacheData copy(@NotNull String data, long time) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new CacheData(data, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheData)) {
            return false;
        }
        CacheData cacheData = (CacheData) other;
        return Intrinsics.areEqual(this.data, cacheData.data) && this.time == cacheData.time;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.data;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j2 = this.time;
        return (iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    @NotNull
    public String toString() {
        return "CacheData(data=" + this.data + ", time=" + this.time + ")";
    }
}

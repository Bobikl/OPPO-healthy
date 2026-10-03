package com.heytap.health.core.provider.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/core/provider/bean/SportRecordResult;", "", "code", "", "subCode", "dataStr", "", "(IILjava/lang/String;)V", "getCode", "()I", "getDataStr", "()Ljava/lang/String;", "getSubCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportRecordResult {
    private final int code;

    @NotNull
    private final String dataStr;
    private final int subCode;

    public SportRecordResult(int i, int i2, @NotNull String dataStr) {
        Intrinsics.checkNotNullParameter(dataStr, "dataStr");
        this.code = i;
        this.subCode = i2;
        this.dataStr = dataStr;
    }

    public static /* synthetic */ SportRecordResult copy$default(SportRecordResult sportRecordResult, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sportRecordResult.code;
        }
        if ((i3 & 2) != 0) {
            i2 = sportRecordResult.subCode;
        }
        if ((i3 & 4) != 0) {
            str = sportRecordResult.dataStr;
        }
        return sportRecordResult.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSubCode() {
        return this.subCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataStr() {
        return this.dataStr;
    }

    @NotNull
    public final SportRecordResult copy(int code, int subCode, @NotNull String dataStr) {
        Intrinsics.checkNotNullParameter(dataStr, "dataStr");
        return new SportRecordResult(code, subCode, dataStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordResult)) {
            return false;
        }
        SportRecordResult sportRecordResult = (SportRecordResult) other;
        return this.code == sportRecordResult.code && this.subCode == sportRecordResult.subCode && Intrinsics.areEqual(this.dataStr, sportRecordResult.dataStr);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDataStr() {
        return this.dataStr;
    }

    public final int getSubCode() {
        return this.subCode;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + Integer.hashCode(this.subCode)) * 31) + this.dataStr.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportRecordResult(code=" + this.code + ", subCode=" + this.subCode + ", dataStr=" + this.dataStr + ")";
    }
}

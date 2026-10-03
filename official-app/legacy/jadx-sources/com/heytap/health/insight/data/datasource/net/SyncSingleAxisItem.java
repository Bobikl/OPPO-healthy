package com.heytap.health.insight.data.datasource.net;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/data/datasource/net/SyncSingleAxisItem;", "", "date", "", "type", "code", "", "(IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDate", "()I", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncSingleAxisItem {
    public static final int $stable = 0;

    @NotNull
    private final String code;
    private final int date;
    private final int type;

    public SyncSingleAxisItem(int i, int i2, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.date = i;
        this.type = i2;
        this.code = code;
    }

    public static /* synthetic */ SyncSingleAxisItem copy$default(SyncSingleAxisItem syncSingleAxisItem, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = syncSingleAxisItem.date;
        }
        if ((i3 & 2) != 0) {
            i2 = syncSingleAxisItem.type;
        }
        if ((i3 & 4) != 0) {
            str = syncSingleAxisItem.code;
        }
        return syncSingleAxisItem.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final SyncSingleAxisItem copy(int date, int type, @NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new SyncSingleAxisItem(date, type, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncSingleAxisItem)) {
            return false;
        }
        SyncSingleAxisItem syncSingleAxisItem = (SyncSingleAxisItem) other;
        return this.date == syncSingleAxisItem.date && this.type == syncSingleAxisItem.type && Intrinsics.areEqual(this.code, syncSingleAxisItem.code);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.type)) * 31) + this.code.hashCode();
    }

    @NotNull
    public String toString() {
        return "SyncSingleAxisItem(date=" + this.date + ", type=" + this.type + ", code=" + this.code + ")";
    }
}

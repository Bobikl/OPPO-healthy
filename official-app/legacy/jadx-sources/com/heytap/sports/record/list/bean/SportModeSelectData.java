package com.heytap.sports.record.list.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/heytap/sports/record/list/bean/SportModeSelectData;", "", "type", "", "name", "", "startTimestamp", "", "hasSecondType", "", "(ILjava/lang/String;JZ)V", "getHasSecondType", "()Z", "getName", "()Ljava/lang/String;", "getStartTimestamp", "()J", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportModeSelectData {
    public static final int $stable = 0;
    private final boolean hasSecondType;

    @NotNull
    private final String name;
    private final long startTimestamp;
    private final int type;

    public SportModeSelectData(int i, @NotNull String name, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.type = i;
        this.name = name;
        this.startTimestamp = j2;
        this.hasSecondType = z;
    }

    public static /* synthetic */ SportModeSelectData copy$default(SportModeSelectData sportModeSelectData, int i, String str, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportModeSelectData.type;
        }
        if ((i2 & 2) != 0) {
            str = sportModeSelectData.name;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            j2 = sportModeSelectData.startTimestamp;
        }
        long j3 = j2;
        if ((i2 & 8) != 0) {
            z = sportModeSelectData.hasSecondType;
        }
        return sportModeSelectData.copy(i, str2, j3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasSecondType() {
        return this.hasSecondType;
    }

    @NotNull
    public final SportModeSelectData copy(int type, @NotNull String name, long startTimestamp, boolean hasSecondType) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SportModeSelectData(type, name, startTimestamp, hasSecondType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportModeSelectData)) {
            return false;
        }
        SportModeSelectData sportModeSelectData = (SportModeSelectData) other;
        return this.type == sportModeSelectData.type && Intrinsics.areEqual(this.name, sportModeSelectData.name) && this.startTimestamp == sportModeSelectData.startTimestamp && this.hasSecondType == sportModeSelectData.hasSecondType;
    }

    public final boolean getHasSecondType() {
        return this.hasSecondType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.type) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.startTimestamp)) * 31;
        boolean z = this.hasSecondType;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode + r3;
    }

    @NotNull
    public String toString() {
        return "SportModeSelectData(type=" + this.type + ", name=" + this.name + ", startTimestamp=" + this.startTimestamp + ", hasSecondType=" + this.hasSecondType + ")";
    }

    public /* synthetic */ SportModeSelectData(int i, String str, long j2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, j2, (i2 & 8) != 0 ? false : z);
    }
}

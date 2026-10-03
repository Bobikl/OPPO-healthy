package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/cardiovascular/model/SingleOsaInfo;", "", "state", "", "osaLevel", "osaName", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getOsaLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOsaName", "getState", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/heytap/health/cardiovascular/model/SingleOsaInfo;", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SingleOsaInfo {
    public static final int $stable = 0;

    @Nullable
    private final Integer osaLevel;

    @Nullable
    private final Integer osaName;

    @Nullable
    private final Integer state;

    public SingleOsaInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SingleOsaInfo copy$default(SingleOsaInfo singleOsaInfo, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = singleOsaInfo.state;
        }
        if ((i & 2) != 0) {
            num2 = singleOsaInfo.osaLevel;
        }
        if ((i & 4) != 0) {
            num3 = singleOsaInfo.osaName;
        }
        return singleOsaInfo.copy(num, num2, num3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOsaLevel() {
        return this.osaLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getOsaName() {
        return this.osaName;
    }

    @NotNull
    public final SingleOsaInfo copy(@Nullable Integer state, @Nullable Integer osaLevel, @Nullable Integer osaName) {
        return new SingleOsaInfo(state, osaLevel, osaName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleOsaInfo)) {
            return false;
        }
        SingleOsaInfo singleOsaInfo = (SingleOsaInfo) other;
        return Intrinsics.areEqual(this.state, singleOsaInfo.state) && Intrinsics.areEqual(this.osaLevel, singleOsaInfo.osaLevel) && Intrinsics.areEqual(this.osaName, singleOsaInfo.osaName);
    }

    @Nullable
    public final Integer getOsaLevel() {
        return this.osaLevel;
    }

    @Nullable
    public final Integer getOsaName() {
        return this.osaName;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    public int hashCode() {
        Integer num = this.state;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.osaLevel;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.osaName;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SingleOsaInfo(state=" + this.state + ", osaLevel=" + this.osaLevel + ", osaName=" + this.osaName + ")";
    }

    public SingleOsaInfo(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.state = num;
        this.osaLevel = num2;
        this.osaName = num3;
    }

    public /* synthetic */ SingleOsaInfo(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}

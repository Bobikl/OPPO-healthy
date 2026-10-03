package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/menstrual/data/SentCycleDataInfo;", "", "cycleDataBase64", "", "macAddress", "cycleDays", "", "periodDays", "(Ljava/lang/String;Ljava/lang/String;II)V", "getCycleDataBase64", "()Ljava/lang/String;", "getCycleDays", "()I", "getMacAddress", "getPeriodDays", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SentCycleDataInfo {

    @NotNull
    private final String cycleDataBase64;
    private final int cycleDays;

    @NotNull
    private final String macAddress;
    private final int periodDays;

    public SentCycleDataInfo(@NotNull String cycleDataBase64, @NotNull String macAddress, int i, int i2) {
        Intrinsics.checkNotNullParameter(cycleDataBase64, "cycleDataBase64");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        this.cycleDataBase64 = cycleDataBase64;
        this.macAddress = macAddress;
        this.cycleDays = i;
        this.periodDays = i2;
    }

    public static /* synthetic */ SentCycleDataInfo copy$default(SentCycleDataInfo sentCycleDataInfo, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sentCycleDataInfo.cycleDataBase64;
        }
        if ((i3 & 2) != 0) {
            str2 = sentCycleDataInfo.macAddress;
        }
        if ((i3 & 4) != 0) {
            i = sentCycleDataInfo.cycleDays;
        }
        if ((i3 & 8) != 0) {
            i2 = sentCycleDataInfo.periodDays;
        }
        return sentCycleDataInfo.copy(str, str2, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCycleDataBase64() {
        return this.cycleDataBase64;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMacAddress() {
        return this.macAddress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCycleDays() {
        return this.cycleDays;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPeriodDays() {
        return this.periodDays;
    }

    @NotNull
    public final SentCycleDataInfo copy(@NotNull String cycleDataBase64, @NotNull String macAddress, int cycleDays, int periodDays) {
        Intrinsics.checkNotNullParameter(cycleDataBase64, "cycleDataBase64");
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        return new SentCycleDataInfo(cycleDataBase64, macAddress, cycleDays, periodDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SentCycleDataInfo)) {
            return false;
        }
        SentCycleDataInfo sentCycleDataInfo = (SentCycleDataInfo) other;
        return Intrinsics.areEqual(this.cycleDataBase64, sentCycleDataInfo.cycleDataBase64) && Intrinsics.areEqual(this.macAddress, sentCycleDataInfo.macAddress) && this.cycleDays == sentCycleDataInfo.cycleDays && this.periodDays == sentCycleDataInfo.periodDays;
    }

    @NotNull
    public final String getCycleDataBase64() {
        return this.cycleDataBase64;
    }

    public final int getCycleDays() {
        return this.cycleDays;
    }

    @NotNull
    public final String getMacAddress() {
        return this.macAddress;
    }

    public final int getPeriodDays() {
        return this.periodDays;
    }

    public int hashCode() {
        return (((((this.cycleDataBase64.hashCode() * 31) + this.macAddress.hashCode()) * 31) + Integer.hashCode(this.cycleDays)) * 31) + Integer.hashCode(this.periodDays);
    }

    @NotNull
    public String toString() {
        return "SentCycleDataInfo(cycleDataBase64=" + this.cycleDataBase64 + ", macAddress=" + this.macAddress + ", cycleDays=" + this.cycleDays + ", periodDays=" + this.periodDays + ")";
    }
}

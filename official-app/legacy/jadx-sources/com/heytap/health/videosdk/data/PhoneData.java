package com.heytap.health.videosdk.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/heytap/health/videosdk/data/PhoneData;", "", "model", "", "cpuv8", "", "androidVersion", "processorsCount", "", "(Ljava/lang/String;ZLjava/lang/String;I)V", "getAndroidVersion", "()Ljava/lang/String;", "setAndroidVersion", "(Ljava/lang/String;)V", "getCpuv8", "()Z", "setCpuv8", "(Z)V", "getModel", "setModel", "getProcessorsCount", "()I", "setProcessorsCount", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PhoneData {

    @NotNull
    private String androidVersion;
    private boolean cpuv8;

    @NotNull
    private String model;
    private int processorsCount;

    public PhoneData(@NotNull String model, boolean z, @NotNull String androidVersion, int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.model = model;
        this.cpuv8 = z;
        this.androidVersion = androidVersion;
        this.processorsCount = i;
    }

    public static /* synthetic */ PhoneData copy$default(PhoneData phoneData, String str, boolean z, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneData.model;
        }
        if ((i2 & 2) != 0) {
            z = phoneData.cpuv8;
        }
        if ((i2 & 4) != 0) {
            str2 = phoneData.androidVersion;
        }
        if ((i2 & 8) != 0) {
            i = phoneData.processorsCount;
        }
        return phoneData.copy(str, z, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCpuv8() {
        return this.cpuv8;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProcessorsCount() {
        return this.processorsCount;
    }

    @NotNull
    public final PhoneData copy(@NotNull String model, boolean cpuv8, @NotNull String androidVersion, int processorsCount) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        return new PhoneData(model, cpuv8, androidVersion, processorsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneData)) {
            return false;
        }
        PhoneData phoneData = (PhoneData) other;
        return Intrinsics.areEqual(this.model, phoneData.model) && this.cpuv8 == phoneData.cpuv8 && Intrinsics.areEqual(this.androidVersion, phoneData.androidVersion) && this.processorsCount == phoneData.processorsCount;
    }

    @NotNull
    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    public final boolean getCpuv8() {
        return this.cpuv8;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    public final int getProcessorsCount() {
        return this.processorsCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = this.model.hashCode() * 31;
        boolean z = this.cpuv8;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((iHashCode + r1) * 31) + this.androidVersion.hashCode()) * 31) + Integer.hashCode(this.processorsCount);
    }

    public final void setAndroidVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.androidVersion = str;
    }

    public final void setCpuv8(boolean z) {
        this.cpuv8 = z;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setProcessorsCount(int i) {
        this.processorsCount = i;
    }

    @NotNull
    public String toString() {
        return "PhoneData(model=" + this.model + ", cpuv8=" + this.cpuv8 + ", androidVersion=" + this.androidVersion + ", processorsCount=" + this.processorsCount + ')';
    }

    public /* synthetic */ PhoneData(String str, boolean z, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i2 & 8) != 0 ? 0 : i);
    }
}

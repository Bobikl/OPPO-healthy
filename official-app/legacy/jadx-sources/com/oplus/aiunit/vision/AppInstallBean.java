package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.db0, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/db0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "isDailyActivitiesInstall", "b", b2n.g, "isSportsInstall", "c", "isHeartRateInstall", "d", b2n.f, "isSpo2Install", MapSchema.FIELD_NAME_ENTRY, "f", "isSleepInstall", "isPressureInstall", "i", "isWristTemperatureInstall", "isMenstrualCycleInstall", "isOsaInstall", "<init>", "(ZZZZZZZZZ)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AppInstallBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isDailyActivitiesInstall;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isSportsInstall;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isHeartRateInstall;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isSpo2Install;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isSleepInstall;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean isPressureInstall;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final boolean isWristTemperatureInstall;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final boolean isMenstrualCycleInstall;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public final boolean isOsaInstall;

    public AppInstallBean() {
        this(false, false, false, false, false, false, false, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsDailyActivitiesInstall() {
        return this.isDailyActivitiesInstall;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsHeartRateInstall() {
        return this.isHeartRateInstall;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsMenstrualCycleInstall() {
        return this.isMenstrualCycleInstall;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsOsaInstall() {
        return this.isOsaInstall;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsPressureInstall() {
        return this.isPressureInstall;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInstallBean)) {
            return false;
        }
        AppInstallBean appInstallBean = (AppInstallBean) other;
        return this.isDailyActivitiesInstall == appInstallBean.isDailyActivitiesInstall && this.isSportsInstall == appInstallBean.isSportsInstall && this.isHeartRateInstall == appInstallBean.isHeartRateInstall && this.isSpo2Install == appInstallBean.isSpo2Install && this.isSleepInstall == appInstallBean.isSleepInstall && this.isPressureInstall == appInstallBean.isPressureInstall && this.isWristTemperatureInstall == appInstallBean.isWristTemperatureInstall && this.isMenstrualCycleInstall == appInstallBean.isMenstrualCycleInstall && this.isOsaInstall == appInstallBean.isOsaInstall;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSleepInstall() {
        return this.isSleepInstall;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsSpo2Install() {
        return this.isSpo2Install;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsSportsInstall() {
        return this.isSportsInstall;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        boolean z = this.isDailyActivitiesInstall;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isSportsInstall;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isHeartRateInstall;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.isSpo2Install;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.isSleepInstall;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i5 = (i4 + r5) * 31;
        boolean z6 = this.isPressureInstall;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i6 = (i5 + r6) * 31;
        boolean z7 = this.isWristTemperatureInstall;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i7 = (i6 + r7) * 31;
        boolean z8 = this.isMenstrualCycleInstall;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i8 = (i7 + r8) * 31;
        boolean z9 = this.isOsaInstall;
        return i8 + (z9 ? 1 : z9);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsWristTemperatureInstall() {
        return this.isWristTemperatureInstall;
    }

    @NotNull
    public String toString() {
        return "AppInstallBean(isDailyActivitiesInstall=" + this.isDailyActivitiesInstall + ", isSportsInstall=" + this.isSportsInstall + ", isHeartRateInstall=" + this.isHeartRateInstall + ", isSpo2Install=" + this.isSpo2Install + ", isSleepInstall=" + this.isSleepInstall + ", isPressureInstall=" + this.isPressureInstall + ", isWristTemperatureInstall=" + this.isWristTemperatureInstall + ", isMenstrualCycleInstall=" + this.isMenstrualCycleInstall + ", isOsaInstall=" + this.isOsaInstall + ")";
    }

    public AppInstallBean(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.isDailyActivitiesInstall = z;
        this.isSportsInstall = z2;
        this.isHeartRateInstall = z3;
        this.isSpo2Install = z4;
        this.isSleepInstall = z5;
        this.isPressureInstall = z6;
        this.isWristTemperatureInstall = z7;
        this.isMenstrualCycleInstall = z8;
        this.isOsaInstall = z9;
    }

    public /* synthetic */ AppInstallBean(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? true : z7, (i & 128) != 0 ? true : z8, (i & 256) != 0 ? true : z9);
    }
}

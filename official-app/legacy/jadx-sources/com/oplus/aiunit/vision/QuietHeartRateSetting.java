package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.s8f, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/s8f;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "c", "()Z", "quietSwitch", "b", "I", "()I", "highValue", "lowValue", "<init>", "(ZII)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class QuietHeartRateSetting {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean quietSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int highValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int lowValue;

    public QuietHeartRateSetting(boolean z, int i, int i2) {
        this.quietSwitch = z;
        this.highValue = i;
        this.lowValue = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHighValue() {
        return this.highValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLowValue() {
        return this.lowValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getQuietSwitch() {
        return this.quietSwitch;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuietHeartRateSetting)) {
            return false;
        }
        QuietHeartRateSetting quietHeartRateSetting = (QuietHeartRateSetting) other;
        return this.quietSwitch == quietHeartRateSetting.quietSwitch && this.highValue == quietHeartRateSetting.highValue && this.lowValue == quietHeartRateSetting.lowValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.quietSwitch;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.highValue)) * 31) + Integer.hashCode(this.lowValue);
    }

    @NotNull
    public String toString() {
        return "QuietHeartRateSetting(quietSwitch=" + this.quietSwitch + ", highValue=" + this.highValue + ", lowValue=" + this.lowValue + ")";
    }
}

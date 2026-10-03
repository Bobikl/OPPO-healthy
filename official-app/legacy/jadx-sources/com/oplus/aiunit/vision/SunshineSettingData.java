package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.x3j, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/x3j;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getSunshineMinutes", "()I", "sunshineMinutes", "b", "getVitaminDIU", "vitaminDIU", "c", "getSkinType", "skinType", "<init>", "(III)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SunshineSettingData {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int sunshineMinutes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int vitaminDIU;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int skinType;

    public SunshineSettingData(int i, int i2, int i3) {
        this.sunshineMinutes = i;
        this.vitaminDIU = i2;
        this.skinType = i3;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SunshineSettingData)) {
            return false;
        }
        SunshineSettingData sunshineSettingData = (SunshineSettingData) other;
        return this.sunshineMinutes == sunshineSettingData.sunshineMinutes && this.vitaminDIU == sunshineSettingData.vitaminDIU && this.skinType == sunshineSettingData.skinType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.sunshineMinutes) * 31) + Integer.hashCode(this.vitaminDIU)) * 31) + Integer.hashCode(this.skinType);
    }

    @NotNull
    public String toString() {
        return "SunshineSettingData(sunshineMinutes=" + this.sunshineMinutes + ", vitaminDIU=" + this.vitaminDIU + ", skinType=" + this.skinType + ")";
    }
}

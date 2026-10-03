package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.ScreenType;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wz6, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\n\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/wz6;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/heytap/health/device_manager_base/ScreenType;", "a", "Lcom/heytap/health/device_manager_base/ScreenType;", "d", "()Lcom/heytap/health/device_manager_base/ScreenType;", "screenType", "", "b", "S", MapSchema.FIELD_NAME_ENTRY, "()S", "widthPixel", "c", "heightPixel", "screenRadius", "Ljava/lang/String;", "()Ljava/lang/String;", "h5DeviceType", "<init>", "(Lcom/heytap/health/device_manager_base/ScreenType;SSSLjava/lang/String;)V", "device_manager_base"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ExtraInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final ScreenType screenType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final short widthPixel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final short heightPixel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final short screenRadius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String h5DeviceType;

    public ExtraInfo(@NotNull ScreenType screenType, short s, short s2, short s3, @NotNull String h5DeviceType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(h5DeviceType, "h5DeviceType");
        this.screenType = screenType;
        this.widthPixel = s;
        this.heightPixel = s2;
        this.screenRadius = s3;
        this.h5DeviceType = h5DeviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getH5DeviceType() {
        return this.h5DeviceType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final short getHeightPixel() {
        return this.heightPixel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final short getScreenRadius() {
        return this.screenRadius;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final ScreenType getScreenType() {
        return this.screenType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final short getWidthPixel() {
        return this.widthPixel;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraInfo)) {
            return false;
        }
        ExtraInfo extraInfo = (ExtraInfo) other;
        return this.screenType == extraInfo.screenType && this.widthPixel == extraInfo.widthPixel && this.heightPixel == extraInfo.heightPixel && this.screenRadius == extraInfo.screenRadius && Intrinsics.areEqual(this.h5DeviceType, extraInfo.h5DeviceType);
    }

    public int hashCode() {
        return (((((((this.screenType.hashCode() * 31) + Short.hashCode(this.widthPixel)) * 31) + Short.hashCode(this.heightPixel)) * 31) + Short.hashCode(this.screenRadius)) * 31) + this.h5DeviceType.hashCode();
    }

    @NotNull
    public String toString() {
        ScreenType screenType = this.screenType;
        short s = this.widthPixel;
        short s2 = this.heightPixel;
        short s3 = this.screenRadius;
        return "ExtraInfo(screenType=" + screenType + ", widthPixel=" + ((int) s) + ", heightPixel=" + ((int) s2) + ", screenRadius=" + ((int) s3) + ", h5DeviceType=" + this.h5DeviceType + ")";
    }

    public /* synthetic */ ExtraInfo(ScreenType screenType, short s, short s2, short s3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(screenType, s, s2, s3, (i & 16) != 0 ? "" : str);
    }
}

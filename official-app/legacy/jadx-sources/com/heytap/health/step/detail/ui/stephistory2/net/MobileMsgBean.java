package com.heytap.health.step.detail.ui.stephistory2.net;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\b\u0010 \u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/net/MobileMsgBean;", "", "date", "", "manufacturer", "", "mobileUniqueId", "deviceType", "displayName", "step", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getDate", "()I", "getDeviceType", "getDisplayName", "()Ljava/lang/String;", "getManufacturer", "getMobileUniqueId", "setMobileUniqueId", "(Ljava/lang/String;)V", "getStep", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "step_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MobileMsgBean {
    private final int date;
    private final int deviceType;

    @Nullable
    private final String displayName;

    @Nullable
    private final String manufacturer;

    @Nullable
    private String mobileUniqueId;
    private final int step;

    public MobileMsgBean(int i, @Nullable String str, @Nullable String str2, int i2, @Nullable String str3, int i3) {
        this.date = i;
        this.manufacturer = str;
        this.mobileUniqueId = str2;
        this.deviceType = i2;
        this.displayName = str3;
        this.step = i3;
    }

    public static /* synthetic */ MobileMsgBean copy$default(MobileMsgBean mobileMsgBean, int i, String str, String str2, int i2, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mobileMsgBean.date;
        }
        if ((i4 & 2) != 0) {
            str = mobileMsgBean.manufacturer;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            str2 = mobileMsgBean.mobileUniqueId;
        }
        String str5 = str2;
        if ((i4 & 8) != 0) {
            i2 = mobileMsgBean.deviceType;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            str3 = mobileMsgBean.displayName;
        }
        String str6 = str3;
        if ((i4 & 32) != 0) {
            i3 = mobileMsgBean.step;
        }
        return mobileMsgBean.copy(i, str4, str5, i5, str6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobileUniqueId() {
        return this.mobileUniqueId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @NotNull
    public final MobileMsgBean copy(int date, @Nullable String manufacturer, @Nullable String mobileUniqueId, int deviceType, @Nullable String displayName, int step) {
        return new MobileMsgBean(date, manufacturer, mobileUniqueId, deviceType, displayName, step);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileMsgBean)) {
            return false;
        }
        MobileMsgBean mobileMsgBean = (MobileMsgBean) other;
        return this.date == mobileMsgBean.date && Intrinsics.areEqual(this.manufacturer, mobileMsgBean.manufacturer) && Intrinsics.areEqual(this.mobileUniqueId, mobileMsgBean.mobileUniqueId) && this.deviceType == mobileMsgBean.deviceType && Intrinsics.areEqual(this.displayName, mobileMsgBean.displayName) && this.step == mobileMsgBean.step;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final String getMobileUniqueId() {
        return this.mobileUniqueId;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.date) * 31;
        String str = this.manufacturer;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mobileUniqueId;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.deviceType)) * 31;
        String str3 = this.displayName;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.step);
    }

    public final void setMobileUniqueId(@Nullable String str) {
        this.mobileUniqueId = str;
    }

    @NotNull
    public String toString() {
        return "displayName:" + this.displayName + "," + this.step;
    }
}

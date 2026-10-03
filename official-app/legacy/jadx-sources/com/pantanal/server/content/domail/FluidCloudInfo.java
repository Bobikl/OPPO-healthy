package com.pantanal.server.content.domail;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.constants.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JU\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0006\u0010!\u001a\u00020\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/pantanal/server/content/domail/FluidCloudInfo;", "", "serviceId", "", "supportEntry", "", "serviceType", "icon", "name", "closeEntry", Constants.KEY_SERVICE_SWITCH, "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;II)V", "getCloseEntry", "()I", "getIcon", "()Ljava/lang/String;", "getName", "getServiceId", "getServiceSwitch", "getServiceType", "getSupportEntry", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toLog", "toString", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FluidCloudInfo {
    private final int closeEntry;

    @Nullable
    private final String icon;

    @Nullable
    private final String name;

    @Nullable
    private final String serviceId;
    private final int serviceSwitch;
    private final int serviceType;
    private final int supportEntry;

    public FluidCloudInfo() {
        this(null, 0, 0, null, null, 0, 0, 127, null);
    }

    public static /* synthetic */ FluidCloudInfo copy$default(FluidCloudInfo fluidCloudInfo, String str, int i, int i2, String str2, String str3, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = fluidCloudInfo.serviceId;
        }
        if ((i5 & 2) != 0) {
            i = fluidCloudInfo.supportEntry;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = fluidCloudInfo.serviceType;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            str2 = fluidCloudInfo.icon;
        }
        String str4 = str2;
        if ((i5 & 16) != 0) {
            str3 = fluidCloudInfo.name;
        }
        String str5 = str3;
        if ((i5 & 32) != 0) {
            i3 = fluidCloudInfo.closeEntry;
        }
        int i8 = i3;
        if ((i5 & 64) != 0) {
            i4 = fluidCloudInfo.serviceSwitch;
        }
        return fluidCloudInfo.copy(str, i6, i7, str4, str5, i8, i4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSupportEntry() {
        return this.supportEntry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getServiceType() {
        return this.serviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCloseEntry() {
        return this.closeEntry;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getServiceSwitch() {
        return this.serviceSwitch;
    }

    @NotNull
    public final FluidCloudInfo copy(@Nullable String serviceId, int supportEntry, int serviceType, @Nullable String icon, @Nullable String name, int closeEntry, int serviceSwitch) {
        return new FluidCloudInfo(serviceId, supportEntry, serviceType, icon, name, closeEntry, serviceSwitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FluidCloudInfo)) {
            return false;
        }
        FluidCloudInfo fluidCloudInfo = (FluidCloudInfo) other;
        return Intrinsics.areEqual(this.serviceId, fluidCloudInfo.serviceId) && this.supportEntry == fluidCloudInfo.supportEntry && this.serviceType == fluidCloudInfo.serviceType && Intrinsics.areEqual(this.icon, fluidCloudInfo.icon) && Intrinsics.areEqual(this.name, fluidCloudInfo.name) && this.closeEntry == fluidCloudInfo.closeEntry && this.serviceSwitch == fluidCloudInfo.serviceSwitch;
    }

    public final int getCloseEntry() {
        return this.closeEntry;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    public final int getServiceSwitch() {
        return this.serviceSwitch;
    }

    public final int getServiceType() {
        return this.serviceType;
    }

    public final int getSupportEntry() {
        return this.supportEntry;
    }

    public int hashCode() {
        String str = this.serviceId;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.supportEntry)) * 31) + Integer.hashCode(this.serviceType)) * 31;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.closeEntry)) * 31) + Integer.hashCode(this.serviceSwitch);
    }

    @NotNull
    public final String toLog() {
        return "FluidCloudInfo(serviceId=" + ((Object) this.serviceId) + ", supportEntry=" + this.supportEntry + ", serviceType=" + this.serviceType + ", icon=" + ((Object) this.icon) + ", name=" + ((Object) this.name) + ", closeEntry=" + this.closeEntry + ", serviceSwitch=" + this.serviceSwitch + ')';
    }

    @NotNull
    public String toString() {
        return "FluidCloudInfo(serviceId=" + ((Object) this.serviceId) + ", supportEntry=" + this.supportEntry + ", serviceType=" + this.serviceType + ", icon=" + ((Object) this.icon) + ", name=" + ((Object) this.name) + ", closeEntry=" + this.closeEntry + ", serviceSwitch=" + this.serviceSwitch + ')';
    }

    public FluidCloudInfo(@Nullable String str, int i, int i2, @Nullable String str2, @Nullable String str3, int i3, int i4) {
        this.serviceId = str;
        this.supportEntry = i;
        this.serviceType = i2;
        this.icon = str2;
        this.name = str3;
        this.closeEntry = i3;
        this.serviceSwitch = i4;
    }

    public /* synthetic */ FluidCloudInfo(String str, int i, int i2, String str2, String str3, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? -1 : i, (i5 & 4) != 0 ? -1 : i2, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? -1 : i3, (i5 & 64) != 0 ? -1 : i4);
    }
}

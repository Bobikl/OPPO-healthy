package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/NormalPinBean;", "", "lightResUrl", "", "nightResUrl", "lightResMD5", "nightResMD5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLightResMD5", "()Ljava/lang/String;", "getLightResUrl", "getNightResMD5", "getNightResUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NormalPinBean {

    @Nullable
    private final String lightResMD5;

    @NotNull
    private final String lightResUrl;

    @Nullable
    private final String nightResMD5;

    @NotNull
    private final String nightResUrl;

    public NormalPinBean(@NotNull String lightResUrl, @NotNull String nightResUrl, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(lightResUrl, "lightResUrl");
        Intrinsics.checkNotNullParameter(nightResUrl, "nightResUrl");
        this.lightResUrl = lightResUrl;
        this.nightResUrl = nightResUrl;
        this.lightResMD5 = str;
        this.nightResMD5 = str2;
    }

    public static /* synthetic */ NormalPinBean copy$default(NormalPinBean normalPinBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = normalPinBean.lightResUrl;
        }
        if ((i & 2) != 0) {
            str2 = normalPinBean.nightResUrl;
        }
        if ((i & 4) != 0) {
            str3 = normalPinBean.lightResMD5;
        }
        if ((i & 8) != 0) {
            str4 = normalPinBean.nightResMD5;
        }
        return normalPinBean.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLightResUrl() {
        return this.lightResUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNightResUrl() {
        return this.nightResUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLightResMD5() {
        return this.lightResMD5;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNightResMD5() {
        return this.nightResMD5;
    }

    @NotNull
    public final NormalPinBean copy(@NotNull String lightResUrl, @NotNull String nightResUrl, @Nullable String lightResMD5, @Nullable String nightResMD5) {
        Intrinsics.checkNotNullParameter(lightResUrl, "lightResUrl");
        Intrinsics.checkNotNullParameter(nightResUrl, "nightResUrl");
        return new NormalPinBean(lightResUrl, nightResUrl, lightResMD5, nightResMD5);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NormalPinBean)) {
            return false;
        }
        NormalPinBean normalPinBean = (NormalPinBean) other;
        return Intrinsics.areEqual(this.lightResUrl, normalPinBean.lightResUrl) && Intrinsics.areEqual(this.nightResUrl, normalPinBean.nightResUrl) && Intrinsics.areEqual(this.lightResMD5, normalPinBean.lightResMD5) && Intrinsics.areEqual(this.nightResMD5, normalPinBean.nightResMD5);
    }

    @Nullable
    public final String getLightResMD5() {
        return this.lightResMD5;
    }

    @NotNull
    public final String getLightResUrl() {
        return this.lightResUrl;
    }

    @Nullable
    public final String getNightResMD5() {
        return this.nightResMD5;
    }

    @NotNull
    public final String getNightResUrl() {
        return this.nightResUrl;
    }

    public int hashCode() {
        int iHashCode = ((this.lightResUrl.hashCode() * 31) + this.nightResUrl.hashCode()) * 31;
        String str = this.lightResMD5;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nightResMD5;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "NormalPinBean(lightResUrl=" + this.lightResUrl + ", nightResUrl=" + this.nightResUrl + ", lightResMD5=" + this.lightResMD5 + ", nightResMD5=" + this.nightResMD5 + ")";
    }
}

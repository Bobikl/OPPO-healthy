package com.heytap.health.esim.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/health/esim/bean/Switch84ConfigBean;", "", "minVersion", "", "showContent", "", "contentTop", "", "contentWatch", "contentPhone", "contentBottom", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentBottom", "()Ljava/lang/String;", "getContentPhone", "getContentTop", "getContentWatch", "getMinVersion", "()I", "getShowContent", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Switch84ConfigBean {
    public static final int $stable = 0;

    @NotNull
    private final String contentBottom;

    @NotNull
    private final String contentPhone;

    @NotNull
    private final String contentTop;

    @NotNull
    private final String contentWatch;
    private final int minVersion;
    private final boolean showContent;

    public Switch84ConfigBean(int i, boolean z, @NotNull String contentTop, @NotNull String contentWatch, @NotNull String contentPhone, @NotNull String contentBottom) {
        Intrinsics.checkNotNullParameter(contentTop, "contentTop");
        Intrinsics.checkNotNullParameter(contentWatch, "contentWatch");
        Intrinsics.checkNotNullParameter(contentPhone, "contentPhone");
        Intrinsics.checkNotNullParameter(contentBottom, "contentBottom");
        this.minVersion = i;
        this.showContent = z;
        this.contentTop = contentTop;
        this.contentWatch = contentWatch;
        this.contentPhone = contentPhone;
        this.contentBottom = contentBottom;
    }

    public static /* synthetic */ Switch84ConfigBean copy$default(Switch84ConfigBean switch84ConfigBean, int i, boolean z, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = switch84ConfigBean.minVersion;
        }
        if ((i2 & 2) != 0) {
            z = switch84ConfigBean.showContent;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            str = switch84ConfigBean.contentTop;
        }
        String str5 = str;
        if ((i2 & 8) != 0) {
            str2 = switch84ConfigBean.contentWatch;
        }
        String str6 = str2;
        if ((i2 & 16) != 0) {
            str3 = switch84ConfigBean.contentPhone;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = switch84ConfigBean.contentBottom;
        }
        return switch84ConfigBean.copy(i, z2, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMinVersion() {
        return this.minVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowContent() {
        return this.showContent;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContentTop() {
        return this.contentTop;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentWatch() {
        return this.contentWatch;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContentPhone() {
        return this.contentPhone;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getContentBottom() {
        return this.contentBottom;
    }

    @NotNull
    public final Switch84ConfigBean copy(int minVersion, boolean showContent, @NotNull String contentTop, @NotNull String contentWatch, @NotNull String contentPhone, @NotNull String contentBottom) {
        Intrinsics.checkNotNullParameter(contentTop, "contentTop");
        Intrinsics.checkNotNullParameter(contentWatch, "contentWatch");
        Intrinsics.checkNotNullParameter(contentPhone, "contentPhone");
        Intrinsics.checkNotNullParameter(contentBottom, "contentBottom");
        return new Switch84ConfigBean(minVersion, showContent, contentTop, contentWatch, contentPhone, contentBottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Switch84ConfigBean)) {
            return false;
        }
        Switch84ConfigBean switch84ConfigBean = (Switch84ConfigBean) other;
        return this.minVersion == switch84ConfigBean.minVersion && this.showContent == switch84ConfigBean.showContent && Intrinsics.areEqual(this.contentTop, switch84ConfigBean.contentTop) && Intrinsics.areEqual(this.contentWatch, switch84ConfigBean.contentWatch) && Intrinsics.areEqual(this.contentPhone, switch84ConfigBean.contentPhone) && Intrinsics.areEqual(this.contentBottom, switch84ConfigBean.contentBottom);
    }

    @NotNull
    public final String getContentBottom() {
        return this.contentBottom;
    }

    @NotNull
    public final String getContentPhone() {
        return this.contentPhone;
    }

    @NotNull
    public final String getContentTop() {
        return this.contentTop;
    }

    @NotNull
    public final String getContentWatch() {
        return this.contentWatch;
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    public final boolean getShowContent() {
        return this.showContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.minVersion) * 31;
        boolean z = this.showContent;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + this.contentTop.hashCode()) * 31) + this.contentWatch.hashCode()) * 31) + this.contentPhone.hashCode()) * 31) + this.contentBottom.hashCode();
    }

    @NotNull
    public String toString() {
        return "Switch84ConfigBean(minVersion=" + this.minVersion + ", showContent=" + this.showContent + ", contentTop=" + this.contentTop + ", contentWatch=" + this.contentWatch + ", contentPhone=" + this.contentPhone + ", contentBottom=" + this.contentBottom + ")";
    }
}

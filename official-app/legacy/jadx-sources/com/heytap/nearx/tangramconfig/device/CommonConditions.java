package com.heytap.nearx.tangramconfig.device;

import android.os.Build;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/device/CommonConditions;", "", "resolutionWidth", "", "resolutionHeight", Fields.ANDROID_VERSION_FIELD, "", "(IILjava/lang/String;)V", "getAndroid_version", "()Ljava/lang/String;", "setAndroid_version", "(Ljava/lang/String;)V", "getResolutionHeight", "()I", "setResolutionHeight", "(I)V", "getResolutionWidth", "setResolutionWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CommonConditions {

    @NotNull
    private String android_version;
    private int resolutionHeight;
    private int resolutionWidth;

    public CommonConditions() {
        this(0, 0, null, 7, null);
    }

    public static /* synthetic */ CommonConditions copy$default(CommonConditions commonConditions, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = commonConditions.resolutionWidth;
        }
        if ((i3 & 2) != 0) {
            i2 = commonConditions.resolutionHeight;
        }
        if ((i3 & 4) != 0) {
            str = commonConditions.android_version;
        }
        return commonConditions.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResolutionWidth() {
        return this.resolutionWidth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResolutionHeight() {
        return this.resolutionHeight;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAndroid_version() {
        return this.android_version;
    }

    @NotNull
    public final CommonConditions copy(int resolutionWidth, int resolutionHeight, @NotNull String android_version) {
        Intrinsics.checkNotNullParameter(android_version, "android_version");
        return new CommonConditions(resolutionWidth, resolutionHeight, android_version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonConditions)) {
            return false;
        }
        CommonConditions commonConditions = (CommonConditions) other;
        return this.resolutionWidth == commonConditions.resolutionWidth && this.resolutionHeight == commonConditions.resolutionHeight && Intrinsics.areEqual(this.android_version, commonConditions.android_version);
    }

    @NotNull
    public final String getAndroid_version() {
        return this.android_version;
    }

    public final int getResolutionHeight() {
        return this.resolutionHeight;
    }

    public final int getResolutionWidth() {
        return this.resolutionWidth;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.resolutionWidth) * 31) + Integer.hashCode(this.resolutionHeight)) * 31) + this.android_version.hashCode();
    }

    public final void setAndroid_version(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.android_version = str;
    }

    public final void setResolutionHeight(int i) {
        this.resolutionHeight = i;
    }

    public final void setResolutionWidth(int i) {
        this.resolutionWidth = i;
    }

    @NotNull
    public String toString() {
        return "CommonConditions(resolutionWidth=" + this.resolutionWidth + ", resolutionHeight=" + this.resolutionHeight + ", android_version=" + this.android_version + ')';
    }

    public CommonConditions(int i, int i2, @NotNull String android_version) {
        Intrinsics.checkNotNullParameter(android_version, "android_version");
        this.resolutionWidth = i;
        this.resolutionHeight = i2;
        this.android_version = android_version;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommonConditions(int i, int i2, String RELEASE, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        if ((i3 & 4) != 0) {
            RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        }
        this(i, i2, RELEASE);
    }
}

package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/AppInfo;", "", "appName", "", "pkg", "versionCode", "versionName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "getPkg", "setPkg", "getVersionCode", "setVersionCode", "getVersionName", "setVersionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppInfo {

    @Nullable
    private String appName;

    @Nullable
    private String pkg;

    @Nullable
    private String versionCode;

    @Nullable
    private String versionName;

    public AppInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.appName;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.pkg;
        }
        if ((i & 4) != 0) {
            str3 = appInfo.versionCode;
        }
        if ((i & 8) != 0) {
            str4 = appInfo.versionName;
        }
        return appInfo.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPkg() {
        return this.pkg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    public final AppInfo copy(@Nullable String appName, @Nullable String pkg, @Nullable String versionCode, @Nullable String versionName) {
        return new AppInfo(appName, pkg, versionCode, versionName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return Intrinsics.areEqual(this.appName, appInfo.appName) && Intrinsics.areEqual(this.pkg, appInfo.pkg) && Intrinsics.areEqual(this.versionCode, appInfo.versionCode) && Intrinsics.areEqual(this.versionName, appInfo.versionName);
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getPkg() {
        return this.pkg;
    }

    @Nullable
    public final String getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        String str = this.appName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pkg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.versionCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.versionName;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setPkg(@Nullable String str) {
        this.pkg = str;
    }

    public final void setVersionCode(@Nullable String str) {
        this.versionCode = str;
    }

    public final void setVersionName(@Nullable String str) {
        this.versionName = str;
    }

    @NotNull
    public String toString() {
        return "AppInfo(appName=" + this.appName + ", pkg=" + this.pkg + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ")";
    }

    public AppInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.appName = str;
        this.pkg = str2;
        this.versionCode = str3;
        this.versionName = str4;
    }

    public /* synthetic */ AppInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

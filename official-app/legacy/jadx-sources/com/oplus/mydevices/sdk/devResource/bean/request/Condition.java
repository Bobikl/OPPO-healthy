package com.oplus.mydevices.sdk.devResource.bean.request;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/bean/request/Condition;", "", "appPackage", "", SpeechConstant.KEY_APP_VERSION, "(Ljava/lang/String;Ljava/lang/String;)V", "getAppPackage", "()Ljava/lang/String;", "setAppPackage", "(Ljava/lang/String;)V", "getAppVersion", "setAppVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Condition {

    @NotNull
    private String appPackage;

    @NotNull
    private String appVersion;

    public Condition(@NotNull String appPackage, @NotNull String appVersion) {
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        this.appPackage = appPackage;
        this.appVersion = appVersion;
    }

    public static /* synthetic */ Condition copy$default(Condition condition, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = condition.appPackage;
        }
        if ((i & 2) != 0) {
            str2 = condition.appVersion;
        }
        return condition.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final Condition copy(@NotNull String appPackage, @NotNull String appVersion) {
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        return new Condition(appPackage, appVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) other;
        return Intrinsics.areEqual(this.appPackage, condition.appPackage) && Intrinsics.areEqual(this.appVersion, condition.appVersion);
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public int hashCode() {
        String str = this.appPackage;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.appVersion;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAppPackage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appPackage = str;
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    @NotNull
    public String toString() {
        return "Condition(appPackage=" + this.appPackage + ", appVersion=" + this.appVersion + ")";
    }
}

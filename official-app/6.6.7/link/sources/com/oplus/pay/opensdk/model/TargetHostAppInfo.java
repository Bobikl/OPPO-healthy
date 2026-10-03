package com.oplus.pay.opensdk.model;

import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.o38;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0006\u0010!\u001a\u00020\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006#"}, d2 = {"Lcom/oplus/pay/opensdk/model/TargetHostAppInfo;", "Ljava/io/Serializable;", "targetCashierType", "", "targetHost", dde.TARGET_PACKAGE_NAME, dde.TARGET_ACTION, "noPreAction", "preAction", "targetCashierLinkUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNoPreAction", "()Ljava/lang/String;", "getPreAction", "getTargetAction", "getTargetCashierLinkUrl", "getTargetCashierType", "getTargetHost", "getTargetPackageName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toJson", "toString", "paysdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TargetHostAppInfo implements Serializable {

    @Nullable
    private final String noPreAction;

    @Nullable
    private final String preAction;

    @Nullable
    private final String targetAction;

    @Nullable
    private final String targetCashierLinkUrl;

    @Nullable
    private final String targetCashierType;

    @Nullable
    private final String targetHost;

    @Nullable
    private final String targetPackageName;

    public TargetHostAppInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.targetCashierType = str;
        this.targetHost = str2;
        this.targetPackageName = str3;
        this.targetAction = str4;
        this.noPreAction = str5;
        this.preAction = str6;
        this.targetCashierLinkUrl = str7;
    }

    public static /* synthetic */ TargetHostAppInfo copy$default(TargetHostAppInfo targetHostAppInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = targetHostAppInfo.targetCashierType;
        }
        if ((i & 2) != 0) {
            str2 = targetHostAppInfo.targetHost;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = targetHostAppInfo.targetPackageName;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = targetHostAppInfo.targetAction;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = targetHostAppInfo.noPreAction;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = targetHostAppInfo.preAction;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = targetHostAppInfo.targetCashierLinkUrl;
        }
        return targetHostAppInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTargetCashierType() {
        return this.targetCashierType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTargetHost() {
        return this.targetHost;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTargetPackageName() {
        return this.targetPackageName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTargetAction() {
        return this.targetAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNoPreAction() {
        return this.noPreAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPreAction() {
        return this.preAction;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTargetCashierLinkUrl() {
        return this.targetCashierLinkUrl;
    }

    @NotNull
    public final TargetHostAppInfo copy(@Nullable String targetCashierType, @Nullable String targetHost, @Nullable String targetPackageName, @Nullable String targetAction, @Nullable String noPreAction, @Nullable String preAction, @Nullable String targetCashierLinkUrl) {
        return new TargetHostAppInfo(targetCashierType, targetHost, targetPackageName, targetAction, noPreAction, preAction, targetCashierLinkUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetHostAppInfo)) {
            return false;
        }
        TargetHostAppInfo targetHostAppInfo = (TargetHostAppInfo) other;
        return Intrinsics.areEqual(this.targetCashierType, targetHostAppInfo.targetCashierType) && Intrinsics.areEqual(this.targetHost, targetHostAppInfo.targetHost) && Intrinsics.areEqual(this.targetPackageName, targetHostAppInfo.targetPackageName) && Intrinsics.areEqual(this.targetAction, targetHostAppInfo.targetAction) && Intrinsics.areEqual(this.noPreAction, targetHostAppInfo.noPreAction) && Intrinsics.areEqual(this.preAction, targetHostAppInfo.preAction) && Intrinsics.areEqual(this.targetCashierLinkUrl, targetHostAppInfo.targetCashierLinkUrl);
    }

    @Nullable
    public final String getNoPreAction() {
        return this.noPreAction;
    }

    @Nullable
    public final String getPreAction() {
        return this.preAction;
    }

    @Nullable
    public final String getTargetAction() {
        return this.targetAction;
    }

    @Nullable
    public final String getTargetCashierLinkUrl() {
        return this.targetCashierLinkUrl;
    }

    @Nullable
    public final String getTargetCashierType() {
        return this.targetCashierType;
    }

    @Nullable
    public final String getTargetHost() {
        return this.targetHost;
    }

    @Nullable
    public final String getTargetPackageName() {
        return this.targetPackageName;
    }

    public int hashCode() {
        String str = this.targetCashierType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.targetHost;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetPackageName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.targetAction;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.noPreAction;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.preAction;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.targetCashierLinkUrl;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public final String toJson() {
        return o38.a(this);
    }

    @NotNull
    public String toString() {
        return "TargetHostAppInfo(targetCashierType=" + this.targetCashierType + ", targetHost=" + this.targetHost + ", targetPackageName=" + this.targetPackageName + ", targetAction=" + this.targetAction + ", noPreAction=" + this.noPreAction + ", preAction=" + this.preAction + ", targetCashierLinkUrl=" + this.targetCashierLinkUrl + ')';
    }
}

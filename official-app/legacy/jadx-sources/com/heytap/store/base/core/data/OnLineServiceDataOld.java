package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/base/core/data/OnLineServiceDataOld;", "", "token", "", "userIdStr", "url", "customerServiceType", "groupId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerServiceType", "()Ljava/lang/String;", "getGroupId", AcCommonApiMethod.GET_TOKEN, "getUrl", "getUserIdStr", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OnLineServiceDataOld {

    @Nullable
    private final String customerServiceType;

    @Nullable
    private final String groupId;

    @Nullable
    private final String token;

    @Nullable
    private final String url;

    @Nullable
    private final String userIdStr;

    public OnLineServiceDataOld(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.token = str;
        this.userIdStr = str2;
        this.url = str3;
        this.customerServiceType = str4;
        this.groupId = str5;
    }

    public static /* synthetic */ OnLineServiceDataOld copy$default(OnLineServiceDataOld onLineServiceDataOld, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onLineServiceDataOld.token;
        }
        if ((i & 2) != 0) {
            str2 = onLineServiceDataOld.userIdStr;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onLineServiceDataOld.url;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onLineServiceDataOld.customerServiceType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = onLineServiceDataOld.groupId;
        }
        return onLineServiceDataOld.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserIdStr() {
        return this.userIdStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCustomerServiceType() {
        return this.customerServiceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final OnLineServiceDataOld copy(@Nullable String token, @Nullable String userIdStr, @Nullable String url, @Nullable String customerServiceType, @Nullable String groupId) {
        return new OnLineServiceDataOld(token, userIdStr, url, customerServiceType, groupId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLineServiceDataOld)) {
            return false;
        }
        OnLineServiceDataOld onLineServiceDataOld = (OnLineServiceDataOld) other;
        return Intrinsics.areEqual(this.token, onLineServiceDataOld.token) && Intrinsics.areEqual(this.userIdStr, onLineServiceDataOld.userIdStr) && Intrinsics.areEqual(this.url, onLineServiceDataOld.url) && Intrinsics.areEqual(this.customerServiceType, onLineServiceDataOld.customerServiceType) && Intrinsics.areEqual(this.groupId, onLineServiceDataOld.groupId);
    }

    @Nullable
    public final String getCustomerServiceType() {
        return this.customerServiceType;
    }

    @Nullable
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getUserIdStr() {
        return this.userIdStr;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userIdStr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerServiceType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OnLineServiceDataOld(token=" + ((Object) this.token) + ", userIdStr=" + ((Object) this.userIdStr) + ", url=" + ((Object) this.url) + ", customerServiceType=" + ((Object) this.customerServiceType) + ", groupId=" + ((Object) this.groupId) + ')';
    }
}

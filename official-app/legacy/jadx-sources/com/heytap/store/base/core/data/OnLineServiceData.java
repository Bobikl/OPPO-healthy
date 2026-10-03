package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0012Jz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006*"}, d2 = {"Lcom/heytap/store/base/core/data/OnLineServiceData;", "", "token", "", "userIdStr", "realname", "type", "groupid", "sign", "uname", "zhiChiOrderListURL", "serviceMode", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getGroupid", "()Ljava/lang/String;", "getRealname", "getServiceMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSign", AcCommonApiMethod.GET_TOKEN, "getType", "getUname", "getUserIdStr", "getZhiChiOrderListURL", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/heytap/store/base/core/data/OnLineServiceData;", "equals", "", "other", "hashCode", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OnLineServiceData {

    @Nullable
    private final String groupid;

    @Nullable
    private final String realname;

    @Nullable
    private final Integer serviceMode;

    @Nullable
    private final String sign;

    @Nullable
    private final String token;

    @Nullable
    private final String type;

    @Nullable
    private final String uname;

    @Nullable
    private final String userIdStr;

    @Nullable
    private final String zhiChiOrderListURL;

    public OnLineServiceData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num) {
        this.token = str;
        this.userIdStr = str2;
        this.realname = str3;
        this.type = str4;
        this.groupid = str5;
        this.sign = str6;
        this.uname = str7;
        this.zhiChiOrderListURL = str8;
        this.serviceMode = num;
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
    public final String getRealname() {
        return this.realname;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupid() {
        return this.groupid;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUname() {
        return this.uname;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getZhiChiOrderListURL() {
        return this.zhiChiOrderListURL;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getServiceMode() {
        return this.serviceMode;
    }

    @NotNull
    public final OnLineServiceData copy(@Nullable String token, @Nullable String userIdStr, @Nullable String realname, @Nullable String type, @Nullable String groupid, @Nullable String sign, @Nullable String uname, @Nullable String zhiChiOrderListURL, @Nullable Integer serviceMode) {
        return new OnLineServiceData(token, userIdStr, realname, type, groupid, sign, uname, zhiChiOrderListURL, serviceMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLineServiceData)) {
            return false;
        }
        OnLineServiceData onLineServiceData = (OnLineServiceData) other;
        return Intrinsics.areEqual(this.token, onLineServiceData.token) && Intrinsics.areEqual(this.userIdStr, onLineServiceData.userIdStr) && Intrinsics.areEqual(this.realname, onLineServiceData.realname) && Intrinsics.areEqual(this.type, onLineServiceData.type) && Intrinsics.areEqual(this.groupid, onLineServiceData.groupid) && Intrinsics.areEqual(this.sign, onLineServiceData.sign) && Intrinsics.areEqual(this.uname, onLineServiceData.uname) && Intrinsics.areEqual(this.zhiChiOrderListURL, onLineServiceData.zhiChiOrderListURL) && Intrinsics.areEqual(this.serviceMode, onLineServiceData.serviceMode);
    }

    @Nullable
    public final String getGroupid() {
        return this.groupid;
    }

    @Nullable
    public final String getRealname() {
        return this.realname;
    }

    @Nullable
    public final Integer getServiceMode() {
        return this.serviceMode;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUname() {
        return this.uname;
    }

    @Nullable
    public final String getUserIdStr() {
        return this.userIdStr;
    }

    @Nullable
    public final String getZhiChiOrderListURL() {
        return this.zhiChiOrderListURL;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userIdStr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.realname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupid;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sign;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.uname;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.zhiChiOrderListURL;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.serviceMode;
        return iHashCode8 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OnLineServiceData(token=" + ((Object) this.token) + ", userIdStr=" + ((Object) this.userIdStr) + ", realname=" + ((Object) this.realname) + ", type=" + ((Object) this.type) + ", groupid=" + ((Object) this.groupid) + ", sign=" + ((Object) this.sign) + ", uname=" + ((Object) this.uname) + ", zhiChiOrderListURL=" + ((Object) this.zhiChiOrderListURL) + ", serviceMode=" + this.serviceMode + ')';
    }
}

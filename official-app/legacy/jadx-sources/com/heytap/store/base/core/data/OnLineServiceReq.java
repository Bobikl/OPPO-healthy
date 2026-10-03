package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import com.heytap.store.message.service.MessageConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006$"}, d2 = {"Lcom/heytap/store/base/core/data/OnLineServiceReq;", "", "skuId", "", MessageConst.CUST_SOURCE, MessageConst.CUST_MEDIUM, "orderNo", "isSdkForm", "extra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCust_medium", "()Ljava/lang/String;", "setCust_medium", "(Ljava/lang/String;)V", "getCust_source", "setCust_source", "getExtra", "setExtra", "setSdkForm", "getOrderNo", "setOrderNo", "getSkuId", "setSkuId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OnLineServiceReq {

    @Nullable
    private String cust_medium;

    @Nullable
    private String cust_source;

    @Nullable
    private String extra;

    @Nullable
    private String isSdkForm;

    @Nullable
    private String orderNo;

    @Nullable
    private String skuId;

    public OnLineServiceReq() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ OnLineServiceReq copy$default(OnLineServiceReq onLineServiceReq, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onLineServiceReq.skuId;
        }
        if ((i & 2) != 0) {
            str2 = onLineServiceReq.cust_source;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onLineServiceReq.cust_medium;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onLineServiceReq.orderNo;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onLineServiceReq.isSdkForm;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onLineServiceReq.extra;
        }
        return onLineServiceReq.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSkuId() {
        return this.skuId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCust_source() {
        return this.cust_source;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCust_medium() {
        return this.cust_medium;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsSdkForm() {
        return this.isSdkForm;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final OnLineServiceReq copy(@Nullable String skuId, @Nullable String cust_source, @Nullable String cust_medium, @Nullable String orderNo, @Nullable String isSdkForm, @Nullable String extra) {
        return new OnLineServiceReq(skuId, cust_source, cust_medium, orderNo, isSdkForm, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLineServiceReq)) {
            return false;
        }
        OnLineServiceReq onLineServiceReq = (OnLineServiceReq) other;
        return Intrinsics.areEqual(this.skuId, onLineServiceReq.skuId) && Intrinsics.areEqual(this.cust_source, onLineServiceReq.cust_source) && Intrinsics.areEqual(this.cust_medium, onLineServiceReq.cust_medium) && Intrinsics.areEqual(this.orderNo, onLineServiceReq.orderNo) && Intrinsics.areEqual(this.isSdkForm, onLineServiceReq.isSdkForm) && Intrinsics.areEqual(this.extra, onLineServiceReq.extra);
    }

    @Nullable
    public final String getCust_medium() {
        return this.cust_medium;
    }

    @Nullable
    public final String getCust_source() {
        return this.cust_source;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Nullable
    public final String getSkuId() {
        return this.skuId;
    }

    public int hashCode() {
        String str = this.skuId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cust_source;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cust_medium;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.orderNo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.isSdkForm;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extra;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Nullable
    public final String isSdkForm() {
        return this.isSdkForm;
    }

    public final void setCust_medium(@Nullable String str) {
        this.cust_medium = str;
    }

    public final void setCust_source(@Nullable String str) {
        this.cust_source = str;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setOrderNo(@Nullable String str) {
        this.orderNo = str;
    }

    public final void setSdkForm(@Nullable String str) {
        this.isSdkForm = str;
    }

    public final void setSkuId(@Nullable String str) {
        this.skuId = str;
    }

    @NotNull
    public String toString() {
        return "OnLineServiceReq(skuId=" + ((Object) this.skuId) + ", cust_source=" + ((Object) this.cust_source) + ", cust_medium=" + ((Object) this.cust_medium) + ", orderNo=" + ((Object) this.orderNo) + ", isSdkForm=" + ((Object) this.isSdkForm) + ", extra=" + ((Object) this.extra) + ')';
    }

    public OnLineServiceReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.skuId = str;
        this.cust_source = str2;
        this.cust_medium = str3;
        this.orderNo = str4;
        this.isSdkForm = str5;
        this.extra = str6;
    }

    public /* synthetic */ OnLineServiceReq(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}

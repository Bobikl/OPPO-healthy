package com.heytap.health.watchface.business.store.pay.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watchface/business/store/pay/bean/Data;", "", "payStatus", "", "signStatus", "partnerReturnUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPartnerReturnUrl", "()Ljava/lang/String;", "setPartnerReturnUrl", "(Ljava/lang/String;)V", "getPayStatus", "setPayStatus", "getSignStatus", "setSignStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Data {

    @Nullable
    private String partnerReturnUrl;

    @Nullable
    private String payStatus;

    @Nullable
    private String signStatus;

    public Data(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.payStatus = str;
        this.signStatus = str2;
        this.partnerReturnUrl = str3;
    }

    public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.payStatus;
        }
        if ((i & 2) != 0) {
            str2 = data.signStatus;
        }
        if ((i & 4) != 0) {
            str3 = data.partnerReturnUrl;
        }
        return data.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignStatus() {
        return this.signStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPartnerReturnUrl() {
        return this.partnerReturnUrl;
    }

    @NotNull
    public final Data copy(@Nullable String payStatus, @Nullable String signStatus, @Nullable String partnerReturnUrl) {
        return new Data(payStatus, signStatus, partnerReturnUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(this.payStatus, data.payStatus) && Intrinsics.areEqual(this.signStatus, data.signStatus) && Intrinsics.areEqual(this.partnerReturnUrl, data.partnerReturnUrl);
    }

    @Nullable
    public final String getPartnerReturnUrl() {
        return this.partnerReturnUrl;
    }

    @Nullable
    public final String getPayStatus() {
        return this.payStatus;
    }

    @Nullable
    public final String getSignStatus() {
        return this.signStatus;
    }

    public int hashCode() {
        String str = this.payStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerReturnUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setPartnerReturnUrl(@Nullable String str) {
        this.partnerReturnUrl = str;
    }

    public final void setPayStatus(@Nullable String str) {
        this.payStatus = str;
    }

    public final void setSignStatus(@Nullable String str) {
        this.signStatus = str;
    }

    @NotNull
    public String toString() {
        return "Data(payStatus=" + this.payStatus + ", signStatus=" + this.signStatus + ", partnerReturnUrl=" + this.partnerReturnUrl + ")";
    }
}

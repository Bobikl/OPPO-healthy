package com.heytap.store.pay;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/pay/PayCheckDataBean;", "", "paymentType", "", "paymentChannel", "status", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPaymentChannel", "()Ljava/lang/String;", "setPaymentChannel", "(Ljava/lang/String;)V", "getPaymentType", "setPaymentType", "getStatus", "()Z", "setStatus", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "pay-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PayCheckDataBean {

    @Nullable
    private String paymentChannel;

    @Nullable
    private String paymentType;
    private boolean status;

    public PayCheckDataBean() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ PayCheckDataBean copy$default(PayCheckDataBean payCheckDataBean, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payCheckDataBean.paymentType;
        }
        if ((i & 2) != 0) {
            str2 = payCheckDataBean.paymentChannel;
        }
        if ((i & 4) != 0) {
            z = payCheckDataBean.status;
        }
        return payCheckDataBean.copy(str, str2, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    @NotNull
    public final PayCheckDataBean copy(@Nullable String paymentType, @Nullable String paymentChannel, boolean status) {
        return new PayCheckDataBean(paymentType, paymentChannel, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayCheckDataBean)) {
            return false;
        }
        PayCheckDataBean payCheckDataBean = (PayCheckDataBean) other;
        return Intrinsics.areEqual(this.paymentType, payCheckDataBean.paymentType) && Intrinsics.areEqual(this.paymentChannel, payCheckDataBean.paymentChannel) && this.status == payCheckDataBean.status;
    }

    @Nullable
    public final String getPaymentChannel() {
        return this.paymentChannel;
    }

    @Nullable
    public final String getPaymentType() {
        return this.paymentType;
    }

    public final boolean getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        String str = this.paymentType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentChannel;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.status;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode2 + r3;
    }

    public final void setPaymentChannel(@Nullable String str) {
        this.paymentChannel = str;
    }

    public final void setPaymentType(@Nullable String str) {
        this.paymentType = str;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    @NotNull
    public String toString() {
        return "PayCheckDataBean(paymentType=" + ((Object) this.paymentType) + ", paymentChannel=" + ((Object) this.paymentChannel) + ", status=" + this.status + ')';
    }

    public PayCheckDataBean(@Nullable String str, @Nullable String str2, boolean z) {
        this.paymentType = str;
        this.paymentChannel = str2;
        this.status = z;
    }

    public /* synthetic */ PayCheckDataBean(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}

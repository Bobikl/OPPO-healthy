package com.heytap.health.watchface.business.store.pay.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/watchface/business/store/pay/bean/PayResponse;", "", "success", "", "error", "", "data", "Lcom/heytap/health/watchface/business/store/pay/bean/Data;", "(ZLjava/lang/String;Lcom/heytap/health/watchface/business/store/pay/bean/Data;)V", "getData", "()Lcom/heytap/health/watchface/business/store/pay/bean/Data;", "setData", "(Lcom/heytap/health/watchface/business/store/pay/bean/Data;)V", "getError", "()Ljava/lang/String;", "setError", "(Ljava/lang/String;)V", "getSuccess", "()Z", "setSuccess", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PayResponse {

    @NotNull
    private Data data;

    @Nullable
    private String error;
    private boolean success;

    public PayResponse(boolean z, @Nullable String str, @NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.success = z;
        this.error = str;
        this.data = data;
    }

    public static /* synthetic */ PayResponse copy$default(PayResponse payResponse, boolean z, String str, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            z = payResponse.success;
        }
        if ((i & 2) != 0) {
            str = payResponse.error;
        }
        if ((i & 4) != 0) {
            data = payResponse.data;
        }
        return payResponse.copy(z, str, data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final PayResponse copy(boolean success, @Nullable String error, @NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new PayResponse(success, error, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayResponse)) {
            return false;
        }
        PayResponse payResponse = (PayResponse) other;
        return this.success == payResponse.success && Intrinsics.areEqual(this.error, payResponse.error) && Intrinsics.areEqual(this.data, payResponse.data);
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.error;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.data.hashCode();
    }

    public final void setData(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "<set-?>");
        this.data = data;
    }

    public final void setError(@Nullable String str) {
        this.error = str;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    @NotNull
    public String toString() {
        return "PayResponse(success=" + this.success + ", error=" + this.error + ", data=" + this.data + ")";
    }
}

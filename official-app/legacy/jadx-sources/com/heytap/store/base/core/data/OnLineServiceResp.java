package com.heytap.store.base.core.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/base/core/data/OnLineServiceResp;", "", "zhichi", "Lcom/heytap/store/base/core/data/OnLineServiceDataOld;", "zhichiSDK", "Lcom/heytap/store/base/core/data/OnLineServiceData;", "ccp", "Lcom/heytap/store/base/core/data/OnLineServiceDataCcp;", "(Lcom/heytap/store/base/core/data/OnLineServiceDataOld;Lcom/heytap/store/base/core/data/OnLineServiceData;Lcom/heytap/store/base/core/data/OnLineServiceDataCcp;)V", "getCcp", "()Lcom/heytap/store/base/core/data/OnLineServiceDataCcp;", "getZhichi", "()Lcom/heytap/store/base/core/data/OnLineServiceDataOld;", "getZhichiSDK", "()Lcom/heytap/store/base/core/data/OnLineServiceData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OnLineServiceResp {

    @Nullable
    private final OnLineServiceDataCcp ccp;

    @Nullable
    private final OnLineServiceDataOld zhichi;

    @Nullable
    private final OnLineServiceData zhichiSDK;

    public OnLineServiceResp(@Nullable OnLineServiceDataOld onLineServiceDataOld, @Nullable OnLineServiceData onLineServiceData, @Nullable OnLineServiceDataCcp onLineServiceDataCcp) {
        this.zhichi = onLineServiceDataOld;
        this.zhichiSDK = onLineServiceData;
        this.ccp = onLineServiceDataCcp;
    }

    public static /* synthetic */ OnLineServiceResp copy$default(OnLineServiceResp onLineServiceResp, OnLineServiceDataOld onLineServiceDataOld, OnLineServiceData onLineServiceData, OnLineServiceDataCcp onLineServiceDataCcp, int i, Object obj) {
        if ((i & 1) != 0) {
            onLineServiceDataOld = onLineServiceResp.zhichi;
        }
        if ((i & 2) != 0) {
            onLineServiceData = onLineServiceResp.zhichiSDK;
        }
        if ((i & 4) != 0) {
            onLineServiceDataCcp = onLineServiceResp.ccp;
        }
        return onLineServiceResp.copy(onLineServiceDataOld, onLineServiceData, onLineServiceDataCcp);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OnLineServiceDataOld getZhichi() {
        return this.zhichi;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OnLineServiceData getZhichiSDK() {
        return this.zhichiSDK;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OnLineServiceDataCcp getCcp() {
        return this.ccp;
    }

    @NotNull
    public final OnLineServiceResp copy(@Nullable OnLineServiceDataOld zhichi, @Nullable OnLineServiceData zhichiSDK, @Nullable OnLineServiceDataCcp ccp) {
        return new OnLineServiceResp(zhichi, zhichiSDK, ccp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnLineServiceResp)) {
            return false;
        }
        OnLineServiceResp onLineServiceResp = (OnLineServiceResp) other;
        return Intrinsics.areEqual(this.zhichi, onLineServiceResp.zhichi) && Intrinsics.areEqual(this.zhichiSDK, onLineServiceResp.zhichiSDK) && Intrinsics.areEqual(this.ccp, onLineServiceResp.ccp);
    }

    @Nullable
    public final OnLineServiceDataCcp getCcp() {
        return this.ccp;
    }

    @Nullable
    public final OnLineServiceDataOld getZhichi() {
        return this.zhichi;
    }

    @Nullable
    public final OnLineServiceData getZhichiSDK() {
        return this.zhichiSDK;
    }

    public int hashCode() {
        OnLineServiceDataOld onLineServiceDataOld = this.zhichi;
        int iHashCode = (onLineServiceDataOld == null ? 0 : onLineServiceDataOld.hashCode()) * 31;
        OnLineServiceData onLineServiceData = this.zhichiSDK;
        int iHashCode2 = (iHashCode + (onLineServiceData == null ? 0 : onLineServiceData.hashCode())) * 31;
        OnLineServiceDataCcp onLineServiceDataCcp = this.ccp;
        return iHashCode2 + (onLineServiceDataCcp != null ? onLineServiceDataCcp.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OnLineServiceResp(zhichi=" + this.zhichi + ", zhichiSDK=" + this.zhichiSDK + ", ccp=" + this.ccp + ')';
    }
}

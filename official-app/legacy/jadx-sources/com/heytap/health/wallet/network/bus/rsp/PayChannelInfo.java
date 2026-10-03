package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import com.heytap.health.wallet.model.response.PayChannelDTO;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R$\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/PayChannelInfo;", "", "payChannelDTOList", "", "Lcom/heytap/health/wallet/model/response/PayChannelDTO;", "(Ljava/util/List;)V", "getPayChannelDTOList", "()Ljava/util/List;", "setPayChannelDTOList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PayChannelInfo {

    @Nullable
    private List<? extends PayChannelDTO> payChannelDTOList;

    /* JADX WARN: Multi-variable type inference failed */
    public PayChannelInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayChannelInfo copy$default(PayChannelInfo payChannelInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = payChannelInfo.payChannelDTOList;
        }
        return payChannelInfo.copy(list);
    }

    @Nullable
    public final List<PayChannelDTO> component1() {
        return this.payChannelDTOList;
    }

    @NotNull
    public final PayChannelInfo copy(@Nullable List<? extends PayChannelDTO> payChannelDTOList) {
        return new PayChannelInfo(payChannelDTOList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PayChannelInfo) && Intrinsics.areEqual(this.payChannelDTOList, ((PayChannelInfo) other).payChannelDTOList);
    }

    @Nullable
    public final List<PayChannelDTO> getPayChannelDTOList() {
        return this.payChannelDTOList;
    }

    public int hashCode() {
        List<? extends PayChannelDTO> list = this.payChannelDTOList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setPayChannelDTOList(@Nullable List<? extends PayChannelDTO> list) {
        this.payChannelDTOList = list;
    }

    @NotNull
    public String toString() {
        return "PayChannelInfo(payChannelDTOList=" + this.payChannelDTOList + ")";
    }

    public PayChannelInfo(@Nullable List<? extends PayChannelDTO> list) {
        this.payChannelDTOList = list;
    }

    public /* synthetic */ PayChannelInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}

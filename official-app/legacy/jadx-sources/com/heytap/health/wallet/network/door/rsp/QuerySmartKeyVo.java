package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006 "}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/QuerySmartKeyVo;", "", "", "Lcom/heytap/health/wallet/network/door/rsp/SrvKeysDto;", "component1", "", "component2", "component3", "srvKeyList", "inverseKeyStatus", "inverseId", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getSrvKeyList", "()Ljava/util/List;", "Ljava/lang/String;", "getInverseKeyStatus", "()Ljava/lang/String;", "setInverseKeyStatus", "(Ljava/lang/String;)V", "getInverseId", "setInverseId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "commonlib_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class QuerySmartKeyVo {

    @NotNull
    public static final String STATUS_INI = "INIT";

    @NotNull
    public static final String STATUS_PROCESSING = "PROCESSING";

    @NotNull
    public static final String STATUS_PROCESSING_SUC = "PROCESSING_SUC";

    @NotNull
    public static final String STATUS_SUC = "SUC";

    @Nullable
    private String inverseId;

    @Nullable
    private String inverseKeyStatus;

    @NotNull
    private final List<SrvKeysDto> srvKeyList;

    public QuerySmartKeyVo(@NotNull List<SrvKeysDto> srvKeyList, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(srvKeyList, "srvKeyList");
        this.srvKeyList = srvKeyList;
        this.inverseKeyStatus = str;
        this.inverseId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuerySmartKeyVo copy$default(QuerySmartKeyVo querySmartKeyVo, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = querySmartKeyVo.srvKeyList;
        }
        if ((i & 2) != 0) {
            str = querySmartKeyVo.inverseKeyStatus;
        }
        if ((i & 4) != 0) {
            str2 = querySmartKeyVo.inverseId;
        }
        return querySmartKeyVo.copy(list, str, str2);
    }

    @NotNull
    public final List<SrvKeysDto> component1() {
        return this.srvKeyList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInverseKeyStatus() {
        return this.inverseKeyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInverseId() {
        return this.inverseId;
    }

    @NotNull
    public final QuerySmartKeyVo copy(@NotNull List<SrvKeysDto> srvKeyList, @Nullable String inverseKeyStatus, @Nullable String inverseId) {
        Intrinsics.checkNotNullParameter(srvKeyList, "srvKeyList");
        return new QuerySmartKeyVo(srvKeyList, inverseKeyStatus, inverseId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuerySmartKeyVo)) {
            return false;
        }
        QuerySmartKeyVo querySmartKeyVo = (QuerySmartKeyVo) other;
        return Intrinsics.areEqual(this.srvKeyList, querySmartKeyVo.srvKeyList) && Intrinsics.areEqual(this.inverseKeyStatus, querySmartKeyVo.inverseKeyStatus) && Intrinsics.areEqual(this.inverseId, querySmartKeyVo.inverseId);
    }

    @Nullable
    public final String getInverseId() {
        return this.inverseId;
    }

    @Nullable
    public final String getInverseKeyStatus() {
        return this.inverseKeyStatus;
    }

    @NotNull
    public final List<SrvKeysDto> getSrvKeyList() {
        return this.srvKeyList;
    }

    public int hashCode() {
        int iHashCode = this.srvKeyList.hashCode() * 31;
        String str = this.inverseKeyStatus;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inverseId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setInverseId(@Nullable String str) {
        this.inverseId = str;
    }

    public final void setInverseKeyStatus(@Nullable String str) {
        this.inverseKeyStatus = str;
    }

    @NotNull
    public String toString() {
        return "QuerySmartKeyVo(srvKeyList=" + this.srvKeyList + ", inverseKeyStatus=" + this.inverseKeyStatus + ", inverseId=" + this.inverseId + ")";
    }
}

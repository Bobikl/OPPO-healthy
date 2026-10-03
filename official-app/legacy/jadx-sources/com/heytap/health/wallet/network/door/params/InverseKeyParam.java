package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.heytap.health.wallet.bean.ProbeDataDto;
import com.oplus.aiunit.vision.j7l;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/heytap/health/wallet/network/door/params/InverseKeyParam;", "", "authuid", "", "probeDataList", "", "Lcom/heytap/health/wallet/bean/ProbeDataDto;", j7l.KEY_CPLC, "", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "getAuthuid", "()Ljava/lang/Long;", "setAuthuid", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCplc", "()Ljava/lang/String;", "setCplc", "(Ljava/lang/String;)V", "getProbeDataList", "()Ljava/util/List;", "setProbeDataList", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)Lcom/heytap/health/wallet/network/door/params/InverseKeyParam;", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InverseKeyParam {

    @Nullable
    private Long authuid;

    @Nullable
    private String cplc;

    @Nullable
    private List<? extends ProbeDataDto> probeDataList;

    public InverseKeyParam(@Nullable Long l2, @Nullable List<? extends ProbeDataDto> list, @Nullable String str) {
        this.authuid = l2;
        this.probeDataList = list;
        this.cplc = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InverseKeyParam copy$default(InverseKeyParam inverseKeyParam, Long l2, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l2 = inverseKeyParam.authuid;
        }
        if ((i & 2) != 0) {
            list = inverseKeyParam.probeDataList;
        }
        if ((i & 4) != 0) {
            str = inverseKeyParam.cplc;
        }
        return inverseKeyParam.copy(l2, list, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getAuthuid() {
        return this.authuid;
    }

    @Nullable
    public final List<ProbeDataDto> component2() {
        return this.probeDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final InverseKeyParam copy(@Nullable Long authuid, @Nullable List<? extends ProbeDataDto> probeDataList, @Nullable String cplc) {
        return new InverseKeyParam(authuid, probeDataList, cplc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InverseKeyParam)) {
            return false;
        }
        InverseKeyParam inverseKeyParam = (InverseKeyParam) other;
        return Intrinsics.areEqual(this.authuid, inverseKeyParam.authuid) && Intrinsics.areEqual(this.probeDataList, inverseKeyParam.probeDataList) && Intrinsics.areEqual(this.cplc, inverseKeyParam.cplc);
    }

    @Nullable
    public final Long getAuthuid() {
        return this.authuid;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final List<ProbeDataDto> getProbeDataList() {
        return this.probeDataList;
    }

    public int hashCode() {
        Long l2 = this.authuid;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        List<? extends ProbeDataDto> list = this.probeDataList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.cplc;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setAuthuid(@Nullable Long l2) {
        this.authuid = l2;
    }

    public final void setCplc(@Nullable String str) {
        this.cplc = str;
    }

    public final void setProbeDataList(@Nullable List<? extends ProbeDataDto> list) {
        this.probeDataList = list;
    }

    @NotNull
    public String toString() {
        return "InverseKeyParam(authuid=" + this.authuid + ", probeDataList=" + this.probeDataList + ", cplc=" + this.cplc + ")";
    }
}

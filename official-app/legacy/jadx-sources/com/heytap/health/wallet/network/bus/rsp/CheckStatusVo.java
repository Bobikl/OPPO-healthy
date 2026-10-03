package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/CheckStatusVo;", "", "prepare", "", "delayTime", "", "status", "aid", "", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAid", "()Ljava/lang/String;", "getDelayTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrepare", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStatus", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/health/wallet/network/bus/rsp/CheckStatusVo;", "equals", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CheckStatusVo {

    @Nullable
    private final String aid;

    @Nullable
    private final Integer delayTime;

    @Nullable
    private final Boolean prepare;

    @Nullable
    private final Integer status;

    public CheckStatusVo(@Nullable Boolean bool, @Nullable Integer num, @Nullable Integer num2, @Nullable String str) {
        this.prepare = bool;
        this.delayTime = num;
        this.status = num2;
        this.aid = str;
    }

    public static /* synthetic */ CheckStatusVo copy$default(CheckStatusVo checkStatusVo, Boolean bool, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = checkStatusVo.prepare;
        }
        if ((i & 2) != 0) {
            num = checkStatusVo.delayTime;
        }
        if ((i & 4) != 0) {
            num2 = checkStatusVo.status;
        }
        if ((i & 8) != 0) {
            str = checkStatusVo.aid;
        }
        return checkStatusVo.copy(bool, num, num2, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getPrepare() {
        return this.prepare;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDelayTime() {
        return this.delayTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final CheckStatusVo copy(@Nullable Boolean prepare, @Nullable Integer delayTime, @Nullable Integer status, @Nullable String aid) {
        return new CheckStatusVo(prepare, delayTime, status, aid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckStatusVo)) {
            return false;
        }
        CheckStatusVo checkStatusVo = (CheckStatusVo) other;
        return Intrinsics.areEqual(this.prepare, checkStatusVo.prepare) && Intrinsics.areEqual(this.delayTime, checkStatusVo.delayTime) && Intrinsics.areEqual(this.status, checkStatusVo.status) && Intrinsics.areEqual(this.aid, checkStatusVo.aid);
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final Integer getDelayTime() {
        return this.delayTime;
    }

    @Nullable
    public final Boolean getPrepare() {
        return this.prepare;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Boolean bool = this.prepare;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.delayTime;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.aid;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CheckStatusVo(prepare=" + this.prepare + ", delayTime=" + this.delayTime + ", status=" + this.status + ", aid=" + this.aid + ")";
    }
}

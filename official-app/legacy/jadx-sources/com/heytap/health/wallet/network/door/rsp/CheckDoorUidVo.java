package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CheckDoorUidVo;", "", "cardInfoDto", "Lcom/heytap/health/wallet/network/door/rsp/UidInfoDTO;", "isPass", "", "(Lcom/heytap/health/wallet/network/door/rsp/UidInfoDTO;Z)V", "getCardInfoDto", "()Lcom/heytap/health/wallet/network/door/rsp/UidInfoDTO;", "()Z", "setPass", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CheckDoorUidVo {

    @NotNull
    private final UidInfoDTO cardInfoDto;
    private boolean isPass;

    public CheckDoorUidVo(@NotNull UidInfoDTO cardInfoDto, boolean z) {
        Intrinsics.checkNotNullParameter(cardInfoDto, "cardInfoDto");
        this.cardInfoDto = cardInfoDto;
        this.isPass = z;
    }

    public static /* synthetic */ CheckDoorUidVo copy$default(CheckDoorUidVo checkDoorUidVo, UidInfoDTO uidInfoDTO, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uidInfoDTO = checkDoorUidVo.cardInfoDto;
        }
        if ((i & 2) != 0) {
            z = checkDoorUidVo.isPass;
        }
        return checkDoorUidVo.copy(uidInfoDTO, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UidInfoDTO getCardInfoDto() {
        return this.cardInfoDto;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPass() {
        return this.isPass;
    }

    @NotNull
    public final CheckDoorUidVo copy(@NotNull UidInfoDTO cardInfoDto, boolean isPass) {
        Intrinsics.checkNotNullParameter(cardInfoDto, "cardInfoDto");
        return new CheckDoorUidVo(cardInfoDto, isPass);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckDoorUidVo)) {
            return false;
        }
        CheckDoorUidVo checkDoorUidVo = (CheckDoorUidVo) other;
        return Intrinsics.areEqual(this.cardInfoDto, checkDoorUidVo.cardInfoDto) && this.isPass == checkDoorUidVo.isPass;
    }

    @NotNull
    public final UidInfoDTO getCardInfoDto() {
        return this.cardInfoDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iHashCode = this.cardInfoDto.hashCode() * 31;
        boolean z = this.isPass;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isPass() {
        return this.isPass;
    }

    public final void setPass(boolean z) {
        this.isPass = z;
    }

    @NotNull
    public String toString() {
        return "CheckDoorUidVo(cardInfoDto=" + this.cardInfoDto + ", isPass=" + this.isPass + ")";
    }

    public /* synthetic */ CheckDoorUidVo(UidInfoDTO uidInfoDTO, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uidInfoDTO, (i & 2) != 0 ? false : z);
    }
}

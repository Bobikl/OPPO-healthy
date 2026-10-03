package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/UidInfoDTO;", "", "aid", "", "appCode", "cardImg", "cardName", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAid", "()Ljava/lang/String;", "getAppCode", "getCardImg", "getCardName", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UidInfoDTO {

    @NotNull
    private final String aid;

    @NotNull
    private final String appCode;

    @NotNull
    private final String cardImg;

    @NotNull
    private final String cardName;

    @NotNull
    private final String status;

    public UidInfoDTO(@NotNull String aid, @NotNull String appCode, @NotNull String cardImg, @NotNull String cardName, @NotNull String status) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cardImg, "cardImg");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.aid = aid;
        this.appCode = appCode;
        this.cardImg = cardImg;
        this.cardName = cardName;
        this.status = status;
    }

    public static /* synthetic */ UidInfoDTO copy$default(UidInfoDTO uidInfoDTO, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uidInfoDTO.aid;
        }
        if ((i & 2) != 0) {
            str2 = uidInfoDTO.appCode;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = uidInfoDTO.cardImg;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = uidInfoDTO.cardName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = uidInfoDTO.status;
        }
        return uidInfoDTO.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardImg() {
        return this.cardImg;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final UidInfoDTO copy(@NotNull String aid, @NotNull String appCode, @NotNull String cardImg, @NotNull String cardName, @NotNull String status) {
        Intrinsics.checkNotNullParameter(aid, "aid");
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cardImg, "cardImg");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new UidInfoDTO(aid, appCode, cardImg, cardName, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UidInfoDTO)) {
            return false;
        }
        UidInfoDTO uidInfoDTO = (UidInfoDTO) other;
        return Intrinsics.areEqual(this.aid, uidInfoDTO.aid) && Intrinsics.areEqual(this.appCode, uidInfoDTO.appCode) && Intrinsics.areEqual(this.cardImg, uidInfoDTO.cardImg) && Intrinsics.areEqual(this.cardName, uidInfoDTO.cardName) && Intrinsics.areEqual(this.status, uidInfoDTO.status);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final String getCardImg() {
        return this.cardImg;
    }

    @NotNull
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.aid.hashCode() * 31) + this.appCode.hashCode()) * 31) + this.cardImg.hashCode()) * 31) + this.cardName.hashCode()) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "UidInfoDTO(aid=" + this.aid + ", appCode=" + this.appCode + ", cardImg=" + this.cardImg + ", cardName=" + this.cardName + ", status=" + this.status + ")";
    }
}

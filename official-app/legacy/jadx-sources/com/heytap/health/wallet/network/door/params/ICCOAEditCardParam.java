package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/ICCOAEditCardParam;", "", j7l.KEY_CPLC, "", "cardId", "cardName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardId", "()Ljava/lang/String;", "getCardName", "getCplc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ICCOAEditCardParam {

    @Nullable
    private final String cardId;

    @Nullable
    private final String cardName;

    @Nullable
    private final String cplc;

    public ICCOAEditCardParam(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.cplc = str;
        this.cardId = str2;
        this.cardName = str3;
    }

    public static /* synthetic */ ICCOAEditCardParam copy$default(ICCOAEditCardParam iCCOAEditCardParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iCCOAEditCardParam.cplc;
        }
        if ((i & 2) != 0) {
            str2 = iCCOAEditCardParam.cardId;
        }
        if ((i & 4) != 0) {
            str3 = iCCOAEditCardParam.cardName;
        }
        return iCCOAEditCardParam.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final ICCOAEditCardParam copy(@Nullable String cplc, @Nullable String cardId, @Nullable String cardName) {
        return new ICCOAEditCardParam(cplc, cardId, cardName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ICCOAEditCardParam)) {
            return false;
        }
        ICCOAEditCardParam iCCOAEditCardParam = (ICCOAEditCardParam) other;
        return Intrinsics.areEqual(this.cplc, iCCOAEditCardParam.cplc) && Intrinsics.areEqual(this.cardId, iCCOAEditCardParam.cardId) && Intrinsics.areEqual(this.cardName, iCCOAEditCardParam.cardName);
    }

    @Nullable
    public final String getCardId() {
        return this.cardId;
    }

    @Nullable
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public int hashCode() {
        String str = this.cplc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardName;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ICCOAEditCardParam(cplc=" + this.cplc + ", cardId=" + this.cardId + ", cardName=" + this.cardName + ")";
    }
}

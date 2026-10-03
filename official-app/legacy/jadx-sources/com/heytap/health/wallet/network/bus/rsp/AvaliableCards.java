package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import com.heytap.health.wallet.model.NfcCardDetail;
import com.oplus.aiunit.vision.lf8;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/AvaliableCards;", "", "cardList", "", "Lcom/heytap/health/wallet/model/NfcCardDetail;", lf8.API_PATH_RECOMMEND, "", "shiftCourseUrl", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCardList", "()Ljava/util/List;", "setCardList", "(Ljava/util/List;)V", "getRecommend", "()Ljava/lang/String;", "getShiftCourseUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AvaliableCards {

    @Nullable
    private List<? extends NfcCardDetail> cardList;

    @Nullable
    private final String recommend;

    @Nullable
    private final String shiftCourseUrl;

    public AvaliableCards(@Nullable List<? extends NfcCardDetail> list, @Nullable String str, @Nullable String str2) {
        this.cardList = list;
        this.recommend = str;
        this.shiftCourseUrl = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvaliableCards copy$default(AvaliableCards avaliableCards, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = avaliableCards.cardList;
        }
        if ((i & 2) != 0) {
            str = avaliableCards.recommend;
        }
        if ((i & 4) != 0) {
            str2 = avaliableCards.shiftCourseUrl;
        }
        return avaliableCards.copy(list, str, str2);
    }

    @Nullable
    public final List<NfcCardDetail> component1() {
        return this.cardList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecommend() {
        return this.recommend;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShiftCourseUrl() {
        return this.shiftCourseUrl;
    }

    @NotNull
    public final AvaliableCards copy(@Nullable List<? extends NfcCardDetail> cardList, @Nullable String recommend, @Nullable String shiftCourseUrl) {
        return new AvaliableCards(cardList, recommend, shiftCourseUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvaliableCards)) {
            return false;
        }
        AvaliableCards avaliableCards = (AvaliableCards) other;
        return Intrinsics.areEqual(this.cardList, avaliableCards.cardList) && Intrinsics.areEqual(this.recommend, avaliableCards.recommend) && Intrinsics.areEqual(this.shiftCourseUrl, avaliableCards.shiftCourseUrl);
    }

    @Nullable
    public final List<NfcCardDetail> getCardList() {
        return this.cardList;
    }

    @Nullable
    public final String getRecommend() {
        return this.recommend;
    }

    @Nullable
    public final String getShiftCourseUrl() {
        return this.shiftCourseUrl;
    }

    public int hashCode() {
        List<? extends NfcCardDetail> list = this.cardList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.recommend;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shiftCourseUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCardList(@Nullable List<? extends NfcCardDetail> list) {
        this.cardList = list;
    }

    @NotNull
    public String toString() {
        return "AvaliableCards(cardList=" + this.cardList + ", recommend=" + this.recommend + ", shiftCourseUrl=" + this.shiftCourseUrl + ")";
    }
}

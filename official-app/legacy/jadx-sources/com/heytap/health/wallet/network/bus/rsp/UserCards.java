package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import com.heytap.health.wallet.model.NfcCardDetail;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/UserCards;", "", "myCardList", "", "Lcom/heytap/health/wallet/model/NfcCardDetail;", "useCourseUrl", "", "(Ljava/util/List;Ljava/lang/String;)V", "getMyCardList", "()Ljava/util/List;", "getUseCourseUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserCards {

    @Nullable
    private final List<NfcCardDetail> myCardList;

    @Nullable
    private final String useCourseUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public UserCards(@Nullable List<? extends NfcCardDetail> list, @Nullable String str) {
        this.myCardList = list;
        this.useCourseUrl = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserCards copy$default(UserCards userCards, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = userCards.myCardList;
        }
        if ((i & 2) != 0) {
            str = userCards.useCourseUrl;
        }
        return userCards.copy(list, str);
    }

    @Nullable
    public final List<NfcCardDetail> component1() {
        return this.myCardList;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUseCourseUrl() {
        return this.useCourseUrl;
    }

    @NotNull
    public final UserCards copy(@Nullable List<? extends NfcCardDetail> myCardList, @Nullable String useCourseUrl) {
        return new UserCards(myCardList, useCourseUrl);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserCards)) {
            return false;
        }
        UserCards userCards = (UserCards) other;
        return Intrinsics.areEqual(this.myCardList, userCards.myCardList) && Intrinsics.areEqual(this.useCourseUrl, userCards.useCourseUrl);
    }

    @Nullable
    public final List<NfcCardDetail> getMyCardList() {
        return this.myCardList;
    }

    @Nullable
    public final String getUseCourseUrl() {
        return this.useCourseUrl;
    }

    public int hashCode() {
        List<NfcCardDetail> list = this.myCardList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.useCourseUrl;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserCards(myCardList=" + this.myCardList + ", useCourseUrl=" + this.useCourseUrl + ")";
    }
}

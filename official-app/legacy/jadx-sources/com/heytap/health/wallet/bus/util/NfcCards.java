package com.heytap.health.wallet.bus.util;

import androidx.annotation.Keep;
import com.heytap.health.wallet.model.NfcCardDetail;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\t¨\u0006!"}, d2 = {"Lcom/heytap/health/wallet/bus/util/NfcCards;", "", "()V", "allowOpen", "", "Lcom/heytap/health/wallet/model/NfcCardDetail;", "getAllowOpen", "()Ljava/util/List;", "setAllowOpen", "(Ljava/util/List;)V", "defaultItem", "getDefaultItem", "()Lcom/heytap/health/wallet/model/NfcCardDetail;", "setDefaultItem", "(Lcom/heytap/health/wallet/model/NfcCardDetail;)V", "opened", "getOpened", "setOpened", "openings", "getOpenings", "setOpenings", "others", "getOthers", "setOthers", "othersList", "getOthersList", "setOthersList", "reCommend", "getReCommend", "setReCommend", "recommendList", "getRecommendList", "setRecommendList", "bus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NfcCards {
    public List<? extends NfcCardDetail> allowOpen;
    public NfcCardDetail defaultItem;
    public List<? extends NfcCardDetail> opened;
    public List<? extends NfcCardDetail> openings;
    public List<? extends NfcCardDetail> others;
    public List<? extends NfcCardDetail> othersList;
    public NfcCardDetail reCommend;
    public List<? extends NfcCardDetail> recommendList;

    @NotNull
    public final List<NfcCardDetail> getAllowOpen() {
        List list = this.allowOpen;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("allowOpen");
        return null;
    }

    @NotNull
    public final NfcCardDetail getDefaultItem() {
        NfcCardDetail nfcCardDetail = this.defaultItem;
        if (nfcCardDetail != null) {
            return nfcCardDetail;
        }
        Intrinsics.throwUninitializedPropertyAccessException("defaultItem");
        return null;
    }

    @NotNull
    public final List<NfcCardDetail> getOpened() {
        List list = this.opened;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("opened");
        return null;
    }

    @NotNull
    public final List<NfcCardDetail> getOpenings() {
        List list = this.openings;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("openings");
        return null;
    }

    @NotNull
    public final List<NfcCardDetail> getOthers() {
        List list = this.others;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("others");
        return null;
    }

    @NotNull
    public final List<NfcCardDetail> getOthersList() {
        List list = this.othersList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("othersList");
        return null;
    }

    @NotNull
    public final NfcCardDetail getReCommend() {
        NfcCardDetail nfcCardDetail = this.reCommend;
        if (nfcCardDetail != null) {
            return nfcCardDetail;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reCommend");
        return null;
    }

    @NotNull
    public final List<NfcCardDetail> getRecommendList() {
        List list = this.recommendList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recommendList");
        return null;
    }

    public final void setAllowOpen(@NotNull List<? extends NfcCardDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.allowOpen = list;
    }

    public final void setDefaultItem(@NotNull NfcCardDetail nfcCardDetail) {
        Intrinsics.checkNotNullParameter(nfcCardDetail, "<set-?>");
        this.defaultItem = nfcCardDetail;
    }

    public final void setOpened(@NotNull List<? extends NfcCardDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.opened = list;
    }

    public final void setOpenings(@NotNull List<? extends NfcCardDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.openings = list;
    }

    public final void setOthers(@NotNull List<? extends NfcCardDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.others = list;
    }

    public final void setOthersList(@NotNull List<? extends NfcCardDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.othersList = list;
    }

    public final void setReCommend(@NotNull NfcCardDetail nfcCardDetail) {
        Intrinsics.checkNotNullParameter(nfcCardDetail, "<set-?>");
        this.reCommend = nfcCardDetail;
    }

    public final void setRecommendList(@NotNull List<? extends NfcCardDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.recommendList = list;
    }
}

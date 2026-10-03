package com.oplus.aiunit.vision;

import com.heytap.health.wallet.model.NfcCardDetail;
import com.heytap.health.wallet.model.db.DatabaseCard;
import com.heytap.health.wallet.model.db.EntranceCard;
import com.heytap.health.wallet.model.response.PayCardInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/wallet/model/NfcCardDetail;", "Lcom/heytap/health/wallet/model/db/DatabaseCard;", "a", "Lcom/heytap/health/wallet/model/response/PayCardInfo;", "c", "Lcom/heytap/health/wallet/model/db/EntranceCard;", "b", "commonlib_release"}, k = 2, mv = {1, 8, 0})
public final class nz4 {
    @NotNull
    public static final DatabaseCard a(@NotNull NfcCardDetail nfcCardDetail) {
        Intrinsics.checkNotNullParameter(nfcCardDetail, "<this>");
        String strO = aec.o();
        Intrinsics.checkNotNullExpressionValue(strO, "getcplc()");
        String aid = nfcCardDetail.getAid();
        Intrinsics.checkNotNullExpressionValue(aid, "aid");
        return new DatabaseCard(strO, aid, nfcCardDetail.getStatus(), nfcCardDetail.getCardNo(), String.valueOf(nfcCardDetail.getBalance()), nfcCardDetail.isDefault(), nfcCardDetail.getAppCode(), nfcCardDetail.getOrderNo(), System.currentTimeMillis(), "5", nfcCardDetail.getCardName(), nfcCardDetail.getCardImg());
    }

    @NotNull
    public static final DatabaseCard b(@NotNull EntranceCard entranceCard) {
        Intrinsics.checkNotNullParameter(entranceCard, "<this>");
        String strO = aec.o();
        Intrinsics.checkNotNullExpressionValue(strO, "getcplc()");
        String aid = entranceCard.getAid();
        Intrinsics.checkNotNullExpressionValue(aid, "aid");
        return new DatabaseCard(strO, aid, entranceCard.getStatus(), "", "", entranceCard.getIsDefault(), entranceCard.getAppCode(), "", System.currentTimeMillis(), "6", entranceCard.getCardName(), entranceCard.getCardImgUrl());
    }

    @NotNull
    public static final DatabaseCard c(@NotNull PayCardInfo payCardInfo) {
        Intrinsics.checkNotNullParameter(payCardInfo, "<this>");
        String strO = aec.o();
        Intrinsics.checkNotNullExpressionValue(strO, "getcplc()");
        String aid = payCardInfo.getAid();
        Intrinsics.checkNotNullExpressionValue(aid, "aid");
        String cardStatus = payCardInfo.getCardStatus();
        String strValueOf = payCardInfo.getAcctAmount() == null ? "" : String.valueOf(payCardInfo.getAcctAmount());
        boolean zIsDefaultCard = payCardInfo.isDefaultCard();
        String appCode = payCardInfo.getAppCode();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String cardType = payCardInfo.getCardType();
        Intrinsics.checkNotNullExpressionValue(cardType, "cardType");
        return new DatabaseCard(strO, aid, cardStatus, "", strValueOf, zIsDefaultCard, appCode, "", jCurrentTimeMillis, cardType, payCardInfo.getDisplayName(), payCardInfo.getCardImg());
    }
}

package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.wallet.bean.CardPackageRspVo;
import com.heytap.health.wallet.model.response.PayCardInfo;
import com.heytap.health.wallet.nfc.bean.CardPackageListBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/a13;", "", "Companion", "a", "walletmain_release"}, k = 1, mv = {1, 8, 0})
public final class a13 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ITEM_TYPE_BOTTOM_CARD = 7;
    public static final int ITEM_TYPE_BOTTOM_TITLE = 6;
    public static final int ITEM_TYPE_CARD_TITLE = 5;
    public static final int ITEM_TYPE_HEADER_CARD = 4;
    public static final int ITEM_TYPE_HEADER_TITLE = 3;
    public static final int TYPE_EMPTY_VIEW = 1;
    public static final int TYPE_RECYCLER_VIEW = 2;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.a13$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/a13$a;", "", "", "Lcom/heytap/health/wallet/bean/CardPackageRspVo;", "originalList", "Lcom/heytap/health/wallet/nfc/bean/CardPackageListBean;", "a", "", "ITEM_TYPE_BOTTOM_CARD", "I", "ITEM_TYPE_BOTTOM_TITLE", "ITEM_TYPE_CARD_TITLE", "ITEM_TYPE_HEADER_CARD", "ITEM_TYPE_HEADER_TITLE", "TYPE_EMPTY_VIEW", "TYPE_RECYCLER_VIEW", "<init>", "()V", "walletmain_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x006e  */
        @JvmStatic
        @NotNull
        public final List<CardPackageListBean> a(@NotNull List<? extends CardPackageRspVo> originalList) {
            Intrinsics.checkNotNullParameter(originalList, "originalList");
            ArrayList arrayList = new ArrayList();
            for (CardPackageRspVo cardPackageRspVo : originalList) {
                CardPackageListBean cardPackageListBean = new CardPackageListBean();
                cardPackageListBean.setName(cardPackageRspVo.getName());
                cardPackageListBean.setSubName(cardPackageRspVo.getSubName());
                cardPackageListBean.setIconUrl(cardPackageRspVo.getIconUrl());
                cardPackageListBean.setBizId(cardPackageRspVo.getBizId());
                cardPackageListBean.setCardType(cardPackageRspVo.getCardType());
                cardPackageListBean.setSubNameColor(cardPackageRspVo.getSubNameColor());
                cardPackageListBean.setPayCardInfos(cardPackageRspVo.getPayCardInfos());
                if (cardPackageRspVo.getPayCardInfos() != null) {
                    List<PayCardInfo> payCardInfos = cardPackageRspVo.getPayCardInfos();
                    Intrinsics.checkNotNullExpressionValue(payCardInfos, "item.payCardInfos");
                    if (!payCardInfos.isEmpty()) {
                        cardPackageListBean.setViewType(2);
                    } else {
                        cardPackageListBean.setViewType(1);
                    }
                } else {
                    cardPackageListBean.setViewType(1);
                }
                arrayList.add(cardPackageListBean);
            }
            return arrayList;
        }
    }

    @JvmStatic
    @NotNull
    public static final List<CardPackageListBean> a(@NotNull List<? extends CardPackageRspVo> list) {
        return INSTANCE.a(list);
    }
}

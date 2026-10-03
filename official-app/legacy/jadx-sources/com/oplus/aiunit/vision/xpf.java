package com.oplus.aiunit.vision;

import com.heytap.health.wallet.bean.CardPackageListRspVo;
import com.heytap.health.wallet.bean.CardPackageRspVo;
import com.heytap.health.wallet.model.response.PayCardInfo;
import com.heytap.wallet.business.usecases.TrackingCardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/wallet/bean/CardPackageListRspVo;", "", "Lcom/oplus/aiunit/vision/i8k;", "b", "business_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportCardsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportCardsUC.kt\ncom/heytap/wallet/business/usecases/ReportCardsUCKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1360#2:104\n1446#2,2:105\n1549#2:107\n1620#2,3:108\n1448#2,3:111\n*S KotlinDebug\n*F\n+ 1 ReportCardsUC.kt\ncom/heytap/wallet/business/usecases/ReportCardsUCKt\n*L\n79#1:104\n79#1:105,2\n80#1:107\n80#1:108,3\n79#1:111,3\n*E\n"})
public final class xpf {
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00b1, please report this as an issue */
    public static final List<TrackingCardData> b(CardPackageListRspVo cardPackageListRspVo) {
        String strValueOf;
        if (cardPackageListRspVo != null) {
            List<CardPackageRspVo> cardPackageRspVoList = cardPackageListRspVo.getCardPackageRspVoList();
            if (!(cardPackageRspVoList == null || cardPackageRspVoList.isEmpty())) {
                List<CardPackageRspVo> cardPackageRspVoList2 = cardPackageListRspVo.getCardPackageRspVoList();
                Intrinsics.checkNotNullExpressionValue(cardPackageRspVoList2, "cardPackageRspVoList");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = cardPackageRspVoList2.iterator();
                while (it.hasNext()) {
                    List<PayCardInfo> payCardInfos = ((CardPackageRspVo) it.next()).getPayCardInfos();
                    Intrinsics.checkNotNullExpressionValue(payCardInfos, "cardPackageRspVo.payCardInfos");
                    List<PayCardInfo> list = payCardInfos;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (PayCardInfo payCardInfo : list) {
                        String cardType = payCardInfo.getCardType();
                        if (cardType == null) {
                            t6b.i("ReportCardsUC", "asTrackingData, unknown type: " + payCardInfo.getCardType());
                            strValueOf = "";
                        } else {
                            int iHashCode = cardType.hashCode();
                            if (iHashCode != 53) {
                                if (iHashCode != 54) {
                                    if (iHashCode == 57 && cardType.equals("9")) {
                                        strValueOf = String.valueOf(TrackingCardType.CAR_KEY.ordinal());
                                    } else {
                                        t6b.i("ReportCardsUC", "asTrackingData, unknown type: " + payCardInfo.getCardType());
                                        strValueOf = "";
                                    }
                                } else if (cardType.equals("6")) {
                                    strValueOf = String.valueOf(TrackingCardType.DOOR.ordinal());
                                } else {
                                    t6b.i("ReportCardsUC", "asTrackingData, unknown type: " + payCardInfo.getCardType());
                                    strValueOf = "";
                                }
                            } else if (cardType.equals("5")) {
                                strValueOf = String.valueOf(TrackingCardType.TRAFFIC.ordinal());
                            } else {
                                t6b.i("ReportCardsUC", "asTrackingData, unknown type: " + payCardInfo.getCardType());
                                strValueOf = "";
                            }
                        }
                        String aid = payCardInfo.getAid();
                        Intrinsics.checkNotNullExpressionValue(aid, "it.aid");
                        String cardStatus = payCardInfo.getCardStatus();
                        Intrinsics.checkNotNullExpressionValue(cardStatus, "it.cardStatus");
                        arrayList2.add(new TrackingCardData(aid, strValueOf, cardStatus));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
                }
                return arrayList;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }
}

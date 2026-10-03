package com.heytap.wallet.business.usecases;

import com.heytap.health.base.track.a;
import com.heytap.health.wallet.bean.CardPackageListRspVo;
import com.heytap.health.wallet.bean.CardPackageRspVo;
import com.heytap.health.wallet.repository.CardPkgRepository;
import com.oplus.aiunit.vision.TrackingCardData;
import com.oplus.aiunit.vision.WalletDevInfo;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dj8;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.xpf;
import com.oplus.aiunit.vision.yj5;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/wallet/business/usecases/ReportCardsUC;", "", "", "f", "Lcom/heytap/health/wallet/bean/CardPackageListRspVo;", "cardPkgListRspVo", b2n.g, "", "enAid", b2n.f, "", "Lcom/oplus/aiunit/vision/i8k;", "trackingCardData", MapSchema.FIELD_NAME_ENTRY, "c", "(Lcom/heytap/health/wallet/bean/CardPackageListRspVo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "business_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportCardsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportCardsUC.kt\ncom/heytap/wallet/business/usecases/ReportCardsUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1864#2,3:104\n*S KotlinDebug\n*F\n+ 1 ReportCardsUC.kt\ncom/heytap/wallet/business/usecases/ReportCardsUC\n*L\n35#1:104,3\n*E\n"})
public final class ReportCardsUC {
    public static /* synthetic */ Object d(ReportCardsUC reportCardsUC, CardPackageListRspVo cardPackageListRspVo, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            cardPackageListRspVo = null;
        }
        return reportCardsUC.c(cardPackageListRspVo, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if ((r4 == null || r4.isEmpty()) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(CardPackageListRspVo cardPackageListRspVo, Continuation<? super List<TrackingCardData>> continuation) {
        ReportCardsUC$getTrackingData$1 reportCardsUC$getTrackingData$1;
        if (continuation instanceof ReportCardsUC$getTrackingData$1) {
            reportCardsUC$getTrackingData$1 = (ReportCardsUC$getTrackingData$1) continuation;
            int i = reportCardsUC$getTrackingData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportCardsUC$getTrackingData$1.label = i - Integer.MIN_VALUE;
            } else {
                reportCardsUC$getTrackingData$1 = new ReportCardsUC$getTrackingData$1(this, continuation);
            }
        } else {
            reportCardsUC$getTrackingData$1 = new ReportCardsUC$getTrackingData$1(this, continuation);
        }
        Object objE = reportCardsUC$getTrackingData$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = reportCardsUC$getTrackingData$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objE);
            if (cardPackageListRspVo != null) {
                List<CardPackageRspVo> cardPackageRspVoList = cardPackageListRspVo.getCardPackageRspVoList();
            }
            CardPkgRepository cardPkgRepository = new CardPkgRepository();
            reportCardsUC$getTrackingData$1.label = 1;
            objE = cardPkgRepository.E(reportCardsUC$getTrackingData$1);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objE);
        }
        cardPackageListRspVo = (CardPackageListRspVo) objE;
        return xpf.b(cardPackageListRspVo);
    }

    public final void e(List<TrackingCardData> trackingCardData) {
        WalletDevInfo walletDevInfoB = yj5.c().b();
        a.b bVarA = a.D().a(ClickApiEntity.TIME, Long.valueOf(System.currentTimeMillis())).a("watch_type", walletDevInfoB.getModel()).a(dj8.KEY_SN, walletDevInfoB.getDeviceSn()).a("card_num", Integer.valueOf(trackingCardData.size()));
        int i = 0;
        for (Object obj : trackingCardData) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TrackingCardData trackingCardData2 = (TrackingCardData) obj;
            bVarA.a("aid_" + i, trackingCardData2.getAid());
            bVarA.a("card_type_" + i, trackingCardData2.getCard_type());
            bVarA.a("card_state_" + i, trackingCardData2.getCard_state());
            i = i2;
        }
        bVarA.b();
    }

    public final void f() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new ReportCardsUC$tracking$1(this, null), 3, null);
    }

    public final void g(@NotNull String enAid) {
        Intrinsics.checkNotNullParameter(enAid, "enAid");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new ReportCardsUC$trackingEncryptDoor$1(this, enAid, null), 3, null);
    }

    public final void h(@Nullable CardPackageListRspVo cardPkgListRspVo) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new ReportCardsUC$trackingWithCardPkg$1(this, cardPkgListRspVo, null), 3, null);
    }
}

package com.oplus.pantanal.seedling.cache;

import android.content.Context;
import android.os.Bundle;
import com.oplus.aiunit.vision.d14;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle;
import com.oplus.pantanal.seedling.update.SeedlingUpdateManager;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.UtilsKt;
import com.oplus.pantanal.seedling.utrace.ITraceNode;
import com.oplus.pantanal.seedling.utrace.TraceNodeHelper;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B\u0005¢\u0006\u0002\u0010\u0003J5\u0010\n\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000bj\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f`\rH\u0000¢\u0006\u0002\b\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J(\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J \u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020!H\u0016J.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001cH\u0016J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0#2\u0006\u0010$\u001a\u00020\u0006J.\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0#2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001cH\u0002J\u000e\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0006J\u0010\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\bH\u0002J\u0010\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\bH\u0002J\"\u00101\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020'H\u0002J#\u00104\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0#H\u0000¢\u0006\u0002\b7R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/oplus/pantanal/seedling/cache/SeedlingCardCache;", "Lcom/oplus/pantanal/seedling/cache/ISeedlingCardCache;", "Lcom/oplus/pantanal/seedling/lifecycle/ISeedlingCardLifecycle;", "()V", "mCardObserveMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "mSeedlingCardMap", "getSeedlingCardMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getSeedlingCardMap$seedling_support_manualRelease", "onCardCreate", "", "context", "Landroid/content/Context;", "card", "onDestroy", "onHide", "onHostChange", "data", "Lorg/json/JSONObject;", "onShow", "onSizeChanged", "oldSize", "", "newSize", "onSubscribed", "onUnSubscribed", "onUpdateData", "Landroid/os/Bundle;", "querySeedlingCardList", "", "serviceId", "serviceInstanceId", "isSupportInstanceId", "", "instanceIdMatchType", "querySeedlingCardListByServiceId", "querySeedlingCardListInternal", "isSupportInstance", "removeCardByWidgetCode", "widgetCode", "removeSeedlingCard", "seedlingCard", "saveSeedlingCard", "startTrace", UTraceSQLiteHelperKt.COL_SPAN_NAME, "isComplete", "updateCardObserveList", "clientName", "cardList", "updateCardObserveList$seedling_support_manualRelease", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingCardCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingCardCache.kt\ncom/oplus/pantanal/seedling/cache/SeedlingCardCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,274:1\n766#2:275\n857#2,2:276\n1855#2:278\n1855#2,2:279\n1856#2:281\n766#2:282\n857#2,2:283\n1855#2,2:286\n1855#2,2:290\n215#3:285\n216#3:288\n215#3:289\n216#3:292\n*S KotlinDebug\n*F\n+ 1 SeedlingCardCache.kt\ncom/oplus/pantanal/seedling/cache/SeedlingCardCache\n*L\n145#1:275\n145#1:276,2\n157#1:278\n158#1:279,2\n157#1:281\n186#1:282\n186#1:283,2\n208#1:286,2\n226#1:290,2\n207#1:285\n207#1:288\n225#1:289\n225#1:292\n*E\n"})
public final class SeedlingCardCache implements ISeedlingCardCache, ISeedlingCardLifecycle {

    @NotNull
    private static final String TAG = "SEEDLING_SUPPORT_SDK(3000007)_SeedlingCardCache";

    @NotNull
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<SeedlingCard>> mSeedlingCardMap = new ConcurrentHashMap<>();

    @NotNull
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<SeedlingCard>> mCardObserveMap = new ConcurrentHashMap<>();

    private final List<SeedlingCard> querySeedlingCardListInternal(String serviceId, String serviceInstanceId, boolean isSupportInstance, int instanceIdMatchType) {
        List<SeedlingCard> listQuerySeedlingCardListByServiceId = querySeedlingCardListByServiceId(serviceId);
        Logger.INSTANCE.i(TAG, "querySeedlingCardListInternal, size: " + listQuerySeedlingCardListByServiceId.size() + ", caCheSameServiceIdList: " + listQuerySeedlingCardListByServiceId);
        if (isSupportInstance) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQuerySeedlingCardListByServiceId) {
                SeedlingCard seedlingCard = (SeedlingCard) obj;
                if (instanceIdMatchType == 2) {
                    if (Intrinsics.areEqual(seedlingCard.getServiceInstanceId(), serviceInstanceId)) {
                        arrayList.add(obj);
                    }
                } else if (Intrinsics.areEqual(seedlingCard.getServiceInstanceId(), serviceInstanceId) || seedlingCard.getServiceInstanceId().length() == 0) {
                    arrayList.add(obj);
                }
            }
            listQuerySeedlingCardListByServiceId = TypeIntrinsics.asMutableList(arrayList);
        }
        Logger.INSTANCE.i(TAG, "querySeedlingCardListInternal serviceId=" + serviceId + ",serviceInstanceId=" + serviceInstanceId + ",size=" + listQuerySeedlingCardListByServiceId.size() + d14.COMMA_REGEX + listQuerySeedlingCardListByServiceId);
        return listQuerySeedlingCardListByServiceId;
    }

    private final void removeSeedlingCard(SeedlingCard seedlingCard) {
        String serviceId = seedlingCard.getServiceId();
        CopyOnWriteArrayList<SeedlingCard> copyOnWriteArrayList = this.mSeedlingCardMap.get(serviceId);
        Logger logger = Logger.INSTANCE;
        logger.i(TAG, "unObserveSeedlingCard size=" + (copyOnWriteArrayList != null ? Integer.valueOf(copyOnWriteArrayList.size()) : null) + ",seedlingCard:" + seedlingCard);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(seedlingCard);
        }
        if (copyOnWriteArrayList != null) {
            this.mSeedlingCardMap.put(serviceId, copyOnWriteArrayList);
            logger.i(TAG, "unObserveSeedlingCard cardList size=" + copyOnWriteArrayList.size() + d14.COMMA_REGEX + copyOnWriteArrayList);
        }
        CopyOnWriteArrayList<SeedlingCard> copyOnWriteArrayList2 = this.mCardObserveMap.get(seedlingCard.getClientName());
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.remove(seedlingCard);
        }
        List<SeedlingCard> listQuerySeedlingCardListByServiceId = querySeedlingCardListByServiceId(serviceId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQuerySeedlingCardListByServiceId) {
            if (((SeedlingCard) obj).getServiceInstanceId().length() == 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            SeedlingUpdateManager.INSTANCE.getINSTANCE().removeDisableEntryIfNoInstance();
        }
    }

    private final void saveSeedlingCard(SeedlingCard seedlingCard) {
        String serviceId = seedlingCard.getServiceId();
        CopyOnWriteArrayList<SeedlingCard> copyOnWriteArrayList = this.mSeedlingCardMap.get(serviceId);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        int size = copyOnWriteArrayList.size();
        if (!copyOnWriteArrayList.contains(seedlingCard)) {
            copyOnWriteArrayList.add(seedlingCard);
        }
        this.mSeedlingCardMap.put(serviceId, copyOnWriteArrayList);
        Logger.INSTANCE.i(TAG, "saveSeedlingCard,seedlingCard:" + seedlingCard + ",originSize=" + size + ", resultSize=" + copyOnWriteArrayList.size() + d14.COMMA_REGEX + copyOnWriteArrayList);
    }

    private final void startTrace(SeedlingCard card, String spanName, boolean isComplete) {
        String strOptString = card.getExtraData().optString("SecondTermTraceContext");
        TraceNodeHelper traceNodeHelper = TraceNodeHelper.INSTANCE;
        Intrinsics.checkNotNull(strOptString);
        traceNodeHelper.endNodeTrace(ITraceNode.startNodeTrace$default(traceNodeHelper, strOptString, spanName, (Map) null, 4, (Object) null), isComplete);
    }

    public static /* synthetic */ void startTrace$default(SeedlingCardCache seedlingCardCache, SeedlingCard seedlingCard, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        seedlingCardCache.startTrace(seedlingCard, str, z);
    }

    @NotNull
    public final HashMap<String, List<SeedlingCard>> getSeedlingCardMap$seedling_support_manualRelease() {
        HashMap<String, List<SeedlingCard>> mapDeepCopySeedlingCard = UtilsKt.deepCopySeedlingCard(this.mSeedlingCardMap);
        Iterator<Map.Entry<String, CopyOnWriteArrayList<SeedlingCard>>> it = this.mCardObserveMap.entrySet().iterator();
        while (it.hasNext()) {
            for (SeedlingCard seedlingCard : it.next().getValue()) {
                List<SeedlingCard> arrayList = mapDeepCopySeedlingCard.get(seedlingCard.getServiceId());
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    mapDeepCopySeedlingCard.put(seedlingCard.getServiceId(), arrayList);
                }
                if (!arrayList.contains(seedlingCard)) {
                    Intrinsics.checkNotNull(seedlingCard);
                    arrayList.add(seedlingCard);
                }
            }
        }
        Logger.INSTANCE.i(TAG, "SeedlingCardMap size=" + this.mSeedlingCardMap.size() + d14.COMMA_REGEX + this.mSeedlingCardMap + "  CardObserveMap size= " + this.mCardObserveMap.size() + d14.COMMA_REGEX + this.mCardObserveMap + "  resultMap size= " + mapDeepCopySeedlingCard.size() + d14.COMMA_REGEX + mapDeepCopySeedlingCard);
        return mapDeepCopySeedlingCard;
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onCardCreate(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onCardCreate instanceId=" + card.getServiceInstanceId());
        saveSeedlingCard(card);
        startTrace$default(this, card, TraceConstants.NODE_CARD_ON_CREATE, false, 4, null);
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onDestroy(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onDestroy instanceId=" + card.getServiceInstanceId());
        removeSeedlingCard(card);
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onHide(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onHide instanceId=" + card.getServiceInstanceId());
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onHostChange(@NotNull Context context, @NotNull SeedlingCard card, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onHostChange instanceId=" + card.getServiceInstanceId());
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onShow(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onShow instanceId=" + card.getServiceInstanceId());
        startTrace$default(this, card, TraceConstants.NODE_CARD_ON_SHOW, false, 4, null);
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onSizeChanged(@NotNull Context context, @NotNull SeedlingCard card, int oldSize, int newSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onSizeChange instanceId=" + card.getServiceInstanceId());
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onSubscribed instanceId=" + card.getServiceInstanceId());
        startTrace$default(this, card, TraceConstants.NODE_CARD_ON_SUBSCRIBED, false, 4, null);
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onUnSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onUnSubscribed instanceId=" + card.getServiceInstanceId());
        startTrace(card, TraceConstants.NODE_CARD_ON_UNSUBSCRIBED, true);
    }

    @Override // com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle
    public void onUpdateData(@NotNull Context context, @NotNull SeedlingCard card, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.INSTANCE.i(TAG, card.getPrintKey$seedling_support_manualRelease(true) + " onUpdateData instanceId=" + card.getServiceInstanceId());
        startTrace$default(this, card, TraceConstants.NODE_CARD_ON_UPDATE_DATA, false, 4, null);
    }

    @Override // com.oplus.pantanal.seedling.cache.ISeedlingCardCache
    @NotNull
    public List<SeedlingCard> querySeedlingCardList(@NotNull String serviceId, @NotNull String serviceInstanceId, boolean isSupportInstanceId, int instanceIdMatchType) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        return querySeedlingCardListInternal(serviceId, serviceInstanceId, isSupportInstanceId, instanceIdMatchType);
    }

    @NotNull
    public final List<SeedlingCard> querySeedlingCardListByServiceId(@NotNull String serviceId) {
        List<SeedlingCard> arrayList;
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        CopyOnWriteArrayList<SeedlingCard> copyOnWriteArrayList = this.mSeedlingCardMap.get(serviceId);
        if (copyOnWriteArrayList == null || (arrayList = CollectionsKt.toMutableList(copyOnWriteArrayList)) == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<Map.Entry<String, CopyOnWriteArrayList<SeedlingCard>>> it = this.mCardObserveMap.entrySet().iterator();
        while (it.hasNext()) {
            for (SeedlingCard seedlingCard : it.next().getValue()) {
                if (Intrinsics.areEqual(seedlingCard.getServiceId(), serviceId) && !arrayList.contains(seedlingCard)) {
                    arrayList.add(seedlingCard);
                }
            }
        }
        return arrayList;
    }

    public final void removeCardByWidgetCode(@NotNull String widgetCode) {
        Object obj;
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        try {
            Result.Companion companion = Result.Companion;
            Collection<CopyOnWriteArrayList<SeedlingCard>> collectionValues = this.mSeedlingCardMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            Iterator<T> it = collectionValues.iterator();
            Unit unit = null;
            SeedlingCard seedlingCard = null;
            while (it.hasNext()) {
                CopyOnWriteArrayList<SeedlingCard> copyOnWriteArrayList = (CopyOnWriteArrayList) it.next();
                Intrinsics.checkNotNull(copyOnWriteArrayList);
                for (SeedlingCard seedlingCard2 : copyOnWriteArrayList) {
                    if (Intrinsics.areEqual(seedlingCard2.getWidgetCode(), widgetCode)) {
                        seedlingCard = seedlingCard2;
                    }
                }
            }
            Logger.INSTANCE.i(TAG, "removeCardByWidgetCode widgetCode=" + widgetCode + " seedlingCard=" + seedlingCard);
            if (seedlingCard != null) {
                removeSeedlingCard(seedlingCard);
                unit = Unit.INSTANCE;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(TAG, "removeCardByWidgetCode widgetCode=" + widgetCode + " error=" + th2.getMessage());
        }
    }

    public final void updateCardObserveList$seedling_support_manualRelease(@NotNull String clientName, @NotNull List<SeedlingCard> cardList) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        CopyOnWriteArrayList<SeedlingCard> copyOnWriteArrayList = this.mCardObserveMap.get(clientName);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(cardList);
        this.mCardObserveMap.put(clientName, copyOnWriteArrayList);
    }
}

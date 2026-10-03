package com.oplus.pantanal.seedling.update;

import com.oplus.aiunit.vision.d14;
import com.oplus.channel.client.ClientChannel;
import com.oplus.channel.client.IBatchClientProxy;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.cache.SeedlingCardCache;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.NamePrefixedThreadFactory;
import com.oplus.pantanal.seedling.util.SharePreferencesUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020\rJ\u0015\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u001cH\u0000¢\u0006\u0002\b%J\u0018\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J8\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00062!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000fH\u0000¢\u0006\u0002\b.J8\u0010/\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00062!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000fH\u0000¢\u0006\u0002\b0J\r\u00101\u001a\u00020\u0014H\u0000¢\u0006\u0002\b2J\u0006\u00103\u001a\u00020\u0014J\u001e\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0006J\u0015\u00107\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0002\b:J6\u0010;\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00062\f\u0010<\u001a\b\u0012\u0004\u0012\u00020(0=2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010AH\u0002J>\u0010B\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\u0006\u0010C\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010EH\u0016J$\u0010B\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J>\u0010F\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\u0006\u0010C\u001a\u00020\u00062\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010EH\u0016J$\u0010F\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016JR\u0010G\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010A2\b\b\u0002\u0010H\u001a\u00020!2\b\b\u0002\u0010C\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010EH\u0002J\u0018\u0010I\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0010H\u0002J\u0018\u0010K\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0010H\u0002J\u0018\u0010L\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0010H\u0002J$\u0010M\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002R3\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u000e\u001a)\u0012\u0004\u0012\u00020\u0006\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u001f\u001a)\u0012\u0004\u0012\u00020\u0006\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/oplus/pantanal/seedling/update/SeedlingUpdateManager;", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataUpdate;", "()V", "disableEntryMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "", "getDisableEntryMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "disableEntryMap$delegate", "Lkotlin/Lazy;", "mCardCache", "Lcom/oplus/pantanal/seedling/cache/SeedlingCardCache;", "mChannelMap", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "observeData", "", "mDataExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getMDataExecutor", "()Ljava/util/concurrent/ExecutorService;", "mDataExecutor$delegate", "mDataProcessor", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataProcessor;", "mInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mSuperChannelMap", "checkInit", "", "getSeedlingCardCache", "init", "dataProcessor", "init$seedling_support_manualRelease", "isCardEntryDisable", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "disableEntry", "isSupportSuperChannel", "observe", "observeResStr", "callback", "observe$seedling_support_manualRelease", "observeSuperChannel", "observeSuperChannel$seedling_support_manualRelease", "onDestroy", "onDestroy$seedling_support_manualRelease", "removeDisableEntryIfNoInstance", "saveDisableEntry", "serviceId", "serviceInstanceId", "unObserve", "unObserve$seedling_support_manualRelease", "unObserveSuperChannel", "unObserveSuperChannel$seedling_support_manualRelease", "updateAllBatch", "cardList", "", "businessData", "Lorg/json/JSONObject;", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "updateAllCardData", "instanceId", "instanceIdMatchType", "Lcom/oplus/pantanal/seedling/update/INegativeFeedbackCallback;", "updateData", "updateDataByCard", "isSupportInstance", "updateDataByChannel", "data", "updateDataBySuperChannel", "updateDataInternal", "updateDataSingle", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingUpdateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingUpdateManager.kt\ncom/oplus/pantanal/seedling/update/SeedlingUpdateManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,525:1\n1549#2:526\n1620#2,3:527\n766#2:530\n857#2,2:531\n819#2:533\n847#2,2:534\n1855#2,2:536\n*S KotlinDebug\n*F\n+ 1 SeedlingUpdateManager.kt\ncom/oplus/pantanal/seedling/update/SeedlingUpdateManager\n*L\n387#1:526\n387#1:527,3\n387#1:530\n387#1:531,2\n417#1:533\n417#1:534,2\n418#1:536,2\n*E\n"})
public final class SeedlingUpdateManager implements ISeedlingDataUpdate {

    @NotNull
    private static final String CARD_EXECUTOR_NAME = "SeedlingSupportDataExecutor";

    @NotNull
    private static final String DISABLE_ENTRY_PREFIX = "disableEntry:";

    @NotNull
    private static final String DISABLE_ENTRY_SPLIT = "&";
    private static final int KEY_SERVICE_ID_INDEX = 0;
    private static final int KEY_SERVICE_INSTANCE_ID_INDEX = 1;

    @NotNull
    private final Lazy disableEntryMap$delegate;

    @NotNull
    private final SeedlingCardCache mCardCache;

    @NotNull
    private final ConcurrentHashMap<String, Function1<byte[], Unit>> mChannelMap;

    @NotNull
    private final Lazy mDataExecutor$delegate;
    private ISeedlingDataProcessor mDataProcessor;

    @NotNull
    private final AtomicBoolean mInit;

    @NotNull
    private final ConcurrentHashMap<String, Function1<byte[], Unit>> mSuperChannelMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SeedlingUpdateManager> INSTANCE$delegate = LazyKt.lazy(new Function0<SeedlingUpdateManager>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager$Companion$INSTANCE$2
        @NotNull
        public final SeedlingUpdateManager invoke() {
            return new SeedlingUpdateManager(null);
        }
    });

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/oplus/pantanal/seedling/update/SeedlingUpdateManager$Companion;", "", "()V", "CARD_EXECUTOR_NAME", "", "DISABLE_ENTRY_PREFIX", "DISABLE_ENTRY_SPLIT", "INSTANCE", "Lcom/oplus/pantanal/seedling/update/SeedlingUpdateManager;", "getINSTANCE", "()Lcom/oplus/pantanal/seedling/update/SeedlingUpdateManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "KEY_SERVICE_ID_INDEX", "", "KEY_SERVICE_INSTANCE_ID_INDEX", "getDisableEntryMapKey", "Lkotlin/Pair;", "spKey", "getDisableEntrySPKey", "serviceId", "serviceInstanceId", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<String, String> getDisableEntryMapKey(String spKey) {
            List listSplit$default;
            if (!StringsKt.startsWith$default(spKey, SeedlingUpdateManager.DISABLE_ENTRY_PREFIX, false, 2, (Object) null)) {
                spKey = null;
            }
            if (spKey == null) {
                return null;
            }
            String strSubstring = spKey.substring(13);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring == null || (listSplit$default = StringsKt.split$default(strSubstring, new String[]{"&"}, false, 0, 6, (Object) null)) == null) {
                return null;
            }
            String str = (String) CollectionsKt.getOrNull(listSplit$default, 0);
            String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
            if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
                return null;
            }
            return new Pair<>(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getDisableEntrySPKey(String serviceId, String serviceInstanceId) {
            return SeedlingUpdateManager.DISABLE_ENTRY_PREFIX + serviceId + "&" + serviceInstanceId;
        }

        @NotNull
        public final SeedlingUpdateManager getINSTANCE() {
            return (SeedlingUpdateManager) SeedlingUpdateManager.INSTANCE$delegate.getValue();
        }
    }

    private SeedlingUpdateManager() {
        this.mChannelMap = new ConcurrentHashMap<>();
        this.mSuperChannelMap = new ConcurrentHashMap<>();
        this.disableEntryMap$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<ConcurrentHashMap<Pair<? extends String, ? extends String>, Integer>>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager$disableEntryMap$2
            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            public final ConcurrentHashMap<Pair<String, String>, Integer> invoke() {
                Object obj;
                ConcurrentHashMap<Pair<String, String>, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    Result.Companion companion = Result.Companion;
                    Map<String, ?> all = SharePreferencesUtil.getAll();
                    if (all != null) {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            Pair disableEntryMapKey = SeedlingUpdateManager.INSTANCE.getDisableEntryMapKey(key);
                            if (disableEntryMapKey != null && (value instanceof Integer)) {
                                concurrentHashMap.put(disableEntryMapKey, value);
                            }
                        }
                    }
                    Logger.INSTANCE.i(Constants.TAG, "SeedlingUpdateManager init disableEntryMap " + concurrentHashMap);
                    obj = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (Result.exceptionOrNull-impl(obj) != null) {
                    Logger.INSTANCE.e(Constants.TAG, "SeedlingUpdateManager init disableEntryMap error");
                }
                return concurrentHashMap;
            }
        });
        this.mDataExecutor$delegate = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager$mDataExecutor$2
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor(new NamePrefixedThreadFactory("SeedlingSupportDataExecutor"));
            }
        });
        this.mInit = new AtomicBoolean(false);
        this.mCardCache = new SeedlingCardCache();
    }

    private final boolean checkInit() {
        boolean z = this.mInit.get();
        if (!z) {
            Logger.INSTANCE.i(Constants.TAG, "SeedlingUpdateManager please init");
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConcurrentHashMap<Pair<String, String>, Integer> getDisableEntryMap() {
        return (ConcurrentHashMap) this.disableEntryMap$delegate.getValue();
    }

    private final ExecutorService getMDataExecutor() {
        return (ExecutorService) this.mDataExecutor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCardEntryDisable(SeedlingCard card, int disableEntry) {
        return (card.getHost().getHostId() & disableEntry) != 0;
    }

    private final boolean isSupportSuperChannel(SeedlingCard card) {
        return this.mSuperChannelMap.containsKey(card.getWidgetCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0171  */
    public final void updateAllBatch(String serviceId, List<SeedlingCard> cardList, JSONObject businessData, SeedlingCardOptions cardOptions) {
        Object obj;
        List<SeedlingCard> arrayList;
        Object obj2;
        Set<String> setKeySet = this.mChannelMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        Set<String> setKeySet2 = this.mSuperChannelMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet2, "<get-keys>(...)");
        Set setMinus = SetsKt.minus(setKeySet, setKeySet2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cardList, 10));
        Iterator<T> it = cardList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SeedlingCard) it.next()).getWidgetCode());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (setMinus.contains((String) obj3)) {
                arrayList3.add(obj3);
            }
        }
        if (arrayList3.size() > 1) {
            try {
                Result.Companion companion = Result.Companion;
                SeedlingCard seedlingCard = (SeedlingCard) CollectionsKt.first(cardList);
                seedlingCard.initRandomKey$seedling_support_manualRelease();
                SeedlingCard seedlingCardCopy = seedlingCard.copy((1021 & 1) != 0 ? seedlingCard.serviceId : null, (1021 & 2) != 0 ? seedlingCard.cardId : -1, (1021 & 4) != 0 ? seedlingCard.cardIndex : 0, (1021 & 8) != 0 ? seedlingCard.hostId : 0, (1021 & 16) != 0 ? seedlingCard.host : null, (1021 & 32) != 0 ? seedlingCard.subscribeType : null, (1021 & 64) != 0 ? seedlingCard.size : null, (1021 & 128) != 0 ? seedlingCard.pageId : null, (1021 & 256) != 0 ? seedlingCard.upkVersionCode : 0L, (1021 & 512) != 0 ? seedlingCard.serviceInstanceId : null);
                seedlingCardCopy.setUpdateRandomKey$seedling_support_manualRelease(seedlingCard.getUpdateRandomKey());
                seedlingCardCopy.setCardUniqueKey$seedling_support_manualRelease(seedlingCard.getCardUniqueKey());
                IBatchClientProxy batchClientProxy = ClientChannel.INSTANCE.getBatchClientProxy();
                String clientName = seedlingCard.getClientName();
                ISeedlingDataProcessor iSeedlingDataProcessor = this.mDataProcessor;
                if (iSeedlingDataProcessor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataProcessor");
                    iSeedlingDataProcessor = null;
                }
                boolean zBatchCallback = batchClientProxy.batchCallback(clientName, arrayList3, iSeedlingDataProcessor.processData(seedlingCardCopy, businessData, cardOptions));
                Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(seedlingCardCopy, false, 1, null) + " updateAllBatch: widgetCodeList=" + arrayList3 + " serviceId:" + serviceId + " batchCallResult:" + zBatchCallback + "  clientName:" + seedlingCard.getClientName());
                obj = Result.constructor-impl(Boolean.valueOf(zBatchCallback));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, "updateAllBatch serviceId:" + serviceId + " widgetCodeList:" + arrayList3 + " error:" + th2.getMessage());
            }
            Boolean bool = Boolean.FALSE;
            if (Result.isFailure-impl(obj)) {
                obj = bool;
            }
            if (((Boolean) obj).booleanValue()) {
                arrayList = new ArrayList();
                for (Object obj4 : cardList) {
                    if (!arrayList3.contains(((SeedlingCard) obj4).getWidgetCode())) {
                        arrayList.add(obj4);
                    }
                }
            } else {
                arrayList = cardList;
            }
        } else {
            arrayList = cardList;
        }
        for (SeedlingCard seedlingCard2 : arrayList) {
            try {
                Result.Companion companion3 = Result.Companion;
                seedlingCard2.initRandomKey$seedling_support_manualRelease();
                ISeedlingDataProcessor iSeedlingDataProcessor2 = this.mDataProcessor;
                if (iSeedlingDataProcessor2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataProcessor");
                    iSeedlingDataProcessor2 = null;
                }
                obj2 = Result.constructor-impl(Boolean.valueOf(updateDataInternal(seedlingCard2, iSeedlingDataProcessor2.processData(seedlingCard2, businessData, cardOptions))));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.Companion;
                obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
            }
            Throwable th4 = Result.exceptionOrNull-impl(obj2);
            if (th4 != null) {
                Logger.INSTANCE.e(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(seedlingCard2, false, 1, null) + " updateAllBatch error:" + th4.getMessage());
            }
        }
    }

    public static /* synthetic */ void updateAllBatch$default(SeedlingUpdateManager seedlingUpdateManager, String str, List list, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, int i, Object obj) {
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        if ((i & 8) != 0) {
            seedlingCardOptions = null;
        }
        seedlingUpdateManager.updateAllBatch(str, list, jSONObject, seedlingCardOptions);
    }

    private final void updateDataByCard(final SeedlingCard card, final JSONObject businessData, final SeedlingCardOptions cardOptions, final boolean isSupportInstance, final String instanceId, final int instanceIdMatchType, final INegativeFeedbackCallback callback) {
        if (cardOptions != null || businessData != null) {
            if (checkInit()) {
                ExecutorService mDataExecutor = getMDataExecutor();
                Intrinsics.checkNotNullExpressionValue(mDataExecutor, "<get-mDataExecutor>(...)");
                ExtsKt.runOnThread(this, mDataExecutor, new Function1<SeedlingUpdateManager, Unit>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager.updateDataByCard.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((SeedlingUpdateManager) obj);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:38:0x0166  */
                    public final void invoke(@NotNull SeedlingUpdateManager seedlingUpdateManager) {
                        String serviceInstanceId;
                        Object obj;
                        Pair<JSONObject, SeedlingCardOptions> pairRequestDataOnDisableEntry;
                        Intrinsics.checkNotNullParameter(seedlingUpdateManager, "$this$runOnThread");
                        String serviceId = card.getServiceId();
                        if (isSupportInstance) {
                            Logger.INSTANCE.e(Constants.TAG, "updateAllCardData, updateDataByCard:Multi-instance instanceId:" + instanceId + d14.POINT_REGEX);
                            serviceInstanceId = instanceId;
                        } else {
                            serviceInstanceId = card.getServiceInstanceId();
                        }
                        Integer num = (Integer) seedlingUpdateManager.getDisableEntryMap().get(new Pair(serviceId, serviceInstanceId));
                        Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataByCard:serviceId=" + serviceId + " serviceInstanceId=" + serviceInstanceId + " disableEntryMap=" + seedlingUpdateManager.getDisableEntryMap() + "  disableEntry=" + num);
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        List<SeedlingCard> listQuerySeedlingCardList = seedlingUpdateManager.getMCardCache().querySeedlingCardList(serviceId, serviceInstanceId, isSupportInstance, instanceIdMatchType);
                        INegativeFeedbackCallback iNegativeFeedbackCallback = callback;
                        int i = 0;
                        for (SeedlingCard seedlingCard : listQuerySeedlingCardList) {
                            if (num != null && seedlingUpdateManager.isCardEntryDisable(seedlingCard, num.intValue()) && seedlingCard.getServiceInstanceId().length() == 0) {
                                Logger logger = Logger.INSTANCE;
                                logger.i(Constants.TAG, "updateDataByCard widgetCode=" + seedlingCard.getWidgetCode() + " disableEntry=" + num);
                                arrayList.add(seedlingCard);
                                if (i < 1) {
                                    logger.i(Constants.TAG, "updateDataByCard  need callback disableEntry once callback==" + iNegativeFeedbackCallback);
                                    if (iNegativeFeedbackCallback != null) {
                                        ConcurrentHashMap disableEntryMap = seedlingUpdateManager.getDisableEntryMap();
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry entry : disableEntryMap.entrySet()) {
                                            if (Intrinsics.areEqual(((Pair) entry.getKey()).getFirst(), serviceId)) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        pairRequestDataOnDisableEntry = iNegativeFeedbackCallback.requestDataOnDisableEntry(serviceId, linkedHashMap);
                                        if (pairRequestDataOnDisableEntry == null) {
                                            pairRequestDataOnDisableEntry = null;
                                        } else if (!Boolean.valueOf((pairRequestDataOnDisableEntry.getFirst() == null && pairRequestDataOnDisableEntry.getSecond() == null) ? false : true).booleanValue()) {
                                            pairRequestDataOnDisableEntry = null;
                                        }
                                    } else {
                                        pairRequestDataOnDisableEntry = null;
                                    }
                                    objectRef.element = pairRequestDataOnDisableEntry;
                                }
                                i++;
                            } else {
                                arrayList2.add(seedlingCard);
                            }
                        }
                        seedlingUpdateManager.updateAllBatch(serviceId, arrayList2, businessData, cardOptions);
                        if (!(!arrayList.isEmpty()) || (obj = objectRef.element) == null) {
                            return;
                        }
                        JSONObject jSONObject = (JSONObject) ((Pair) obj).getFirst();
                        Pair pair = (Pair) objectRef.element;
                        seedlingUpdateManager.updateAllBatch(serviceId, arrayList, jSONObject, pair != null ? (SeedlingCardOptions) pair.getSecond() : null);
                    }
                });
                return;
            }
            return;
        }
        Logger.INSTANCE.e(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataByCard error:cardOptions and businessData can't be null at the same time.");
    }

    public static /* synthetic */ void updateDataByCard$default(SeedlingUpdateManager seedlingUpdateManager, SeedlingCard seedlingCard, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, boolean z, String str, int i, INegativeFeedbackCallback iNegativeFeedbackCallback, int i2, Object obj) {
        seedlingUpdateManager.updateDataByCard(seedlingCard, (i2 & 2) != 0 ? null : jSONObject, (i2 & 4) != 0 ? null : seedlingCardOptions, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? "" : str, (i2 & 32) != 0 ? 1 : i, (i2 & 64) == 0 ? iNegativeFeedbackCallback : null);
    }

    private final boolean updateDataByChannel(SeedlingCard card, byte[] data) {
        String widgetCode = card.getWidgetCode();
        if (this.mChannelMap.get(widgetCode) == null) {
            Logger.INSTANCE.e(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataByChannel: widgetCode error: not find channel");
            return false;
        }
        Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataByChannel: widgetCode");
        Function1<byte[], Unit> function1 = this.mChannelMap.get(widgetCode);
        if (function1 == null) {
            return true;
        }
        function1.invoke(data);
        return true;
    }

    private final boolean updateDataBySuperChannel(SeedlingCard card, byte[] data) {
        String widgetCode = card.getWidgetCode();
        Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataBySuperChannel: widgetCode by superChannel");
        Function1<byte[], Unit> function1 = this.mSuperChannelMap.get(widgetCode);
        if (function1 != null) {
            function1.invoke(data);
        }
        return true;
    }

    private final boolean updateDataInternal(SeedlingCard card, byte[] data) {
        return isSupportSuperChannel(card) ? updateDataBySuperChannel(card, data) : updateDataByChannel(card, data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDataSingle(SeedlingCard card, JSONObject businessData, SeedlingCardOptions cardOptions) {
        Object obj;
        if (cardOptions == null && businessData == null) {
            Logger.INSTANCE.e(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataSingle error:cardOptions and businessData can't be null at the same time.");
            return;
        }
        if (checkInit()) {
            Logger logger = Logger.INSTANCE;
            String printKey$seedling_support_manualRelease$default = SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null);
            boolean z = businessData == null;
            logger.i(Constants.TAG, printKey$seedling_support_manualRelease$default + " updateDataSingle,card=" + card + ", businessData is null=" + z + ", instanceId=" + card.getServiceInstanceId() + ".cardOptions=" + cardOptions);
            try {
                Result.Companion companion = Result.Companion;
                card.initRandomKey$seedling_support_manualRelease();
                ISeedlingDataProcessor iSeedlingDataProcessor = this.mDataProcessor;
                if (iSeedlingDataProcessor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDataProcessor");
                    iSeedlingDataProcessor = null;
                }
                obj = Result.constructor-impl(Boolean.valueOf(updateDataInternal(card, iSeedlingDataProcessor.processData(card, businessData, cardOptions))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
            Throwable th2 = Result.exceptionOrNull-impl(obj);
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateDataSingle error:" + th2.getMessage());
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: getSeedlingCardCache, reason: from getter */
    public final SeedlingCardCache getMCardCache() {
        return this.mCardCache;
    }

    public final void init$seedling_support_manualRelease(@NotNull ISeedlingDataProcessor dataProcessor) {
        Intrinsics.checkNotNullParameter(dataProcessor, "dataProcessor");
        Logger logger = Logger.INSTANCE;
        logger.i(Constants.TAG, "SeedlingUpdateManager start init");
        if (this.mInit.get()) {
            logger.i(Constants.TAG, "SeedlingUpdateManager has already init");
        } else {
            this.mDataProcessor = dataProcessor;
            this.mInit.set(true);
        }
    }

    public final void observe$seedling_support_manualRelease(@NotNull String observeResStr, @NotNull Function1<? super byte[], Unit> callback) {
        Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mChannelMap.put(observeResStr, callback);
        Logger.INSTANCE.i(Constants.TAG, "收到observe指令 = " + observeResStr);
    }

    public final void observeSuperChannel$seedling_support_manualRelease(@NotNull String observeResStr, @NotNull Function1<? super byte[], Unit> callback) {
        Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mSuperChannelMap.put(observeResStr, callback);
        Logger.INSTANCE.i(Constants.TAG, "快速通道收到observe指令 = " + observeResStr);
    }

    public final void onDestroy$seedling_support_manualRelease() {
        if (checkInit()) {
            this.mChannelMap.clear();
            if (!getMDataExecutor().isShutdown()) {
                getMDataExecutor().shutdown();
            }
            this.mInit.set(false);
        }
    }

    public final void removeDisableEntryIfNoInstance() {
        ExecutorService mDataExecutor = getMDataExecutor();
        Intrinsics.checkNotNullExpressionValue(mDataExecutor, "<get-mDataExecutor>(...)");
        ExtsKt.runOnThread(this, mDataExecutor, new Function1<SeedlingUpdateManager, Unit>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager.removeDisableEntryIfNoInstance.1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SeedlingUpdateManager) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingUpdateManager seedlingUpdateManager) {
                Intrinsics.checkNotNullParameter(seedlingUpdateManager, "$this$runOnThread");
                Iterator it = seedlingUpdateManager.getDisableEntryMap().entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    Map.Entry entry = (Map.Entry) next;
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                    Pair pair = (Pair) key;
                    if (seedlingUpdateManager.mCardCache.querySeedlingCardListByServiceId((String) pair.getFirst()).isEmpty()) {
                        it.remove();
                        Logger.INSTANCE.i(Constants.TAG, "removeDisableEntryIfNoInstance serviceId:" + pair.getFirst() + " serviceInstanceId:" + pair.getSecond() + " entry:" + entry.getValue());
                        SharePreferencesUtil.remove(SeedlingUpdateManager.INSTANCE.getDisableEntrySPKey((String) pair.getFirst(), (String) pair.getSecond()));
                    }
                }
            }
        });
    }

    public final void saveDisableEntry(@NotNull final String serviceId, final int disableEntry, @NotNull final String serviceInstanceId) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(serviceInstanceId, "serviceInstanceId");
        ExecutorService mDataExecutor = getMDataExecutor();
        Intrinsics.checkNotNullExpressionValue(mDataExecutor, "<get-mDataExecutor>(...)");
        ExtsKt.runOnThread(this, mDataExecutor, new Function1<SeedlingUpdateManager, Unit>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager.saveDisableEntry.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SeedlingUpdateManager) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingUpdateManager seedlingUpdateManager) {
                Intrinsics.checkNotNullParameter(seedlingUpdateManager, "$this$runOnThread");
                seedlingUpdateManager.getDisableEntryMap().put(new Pair(serviceId, serviceInstanceId), Integer.valueOf(disableEntry));
                Logger.INSTANCE.i(Constants.TAG, "saveDisableEntry disableEntryMap=" + seedlingUpdateManager.getDisableEntryMap());
                SharePreferencesUtil.putInt(SeedlingUpdateManager.INSTANCE.getDisableEntrySPKey(serviceId, serviceInstanceId), disableEntry);
            }
        });
    }

    public final void unObserve$seedling_support_manualRelease(@NotNull String observeResStr) {
        Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
        this.mChannelMap.remove(observeResStr);
        Logger.INSTANCE.i(Constants.TAG, "收到unObserve指令 = " + observeResStr);
    }

    public final void unObserveSuperChannel$seedling_support_manualRelease(@NotNull String observeResStr) {
        Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
        if (this.mSuperChannelMap.remove(observeResStr) != null) {
            Logger.INSTANCE.i(Constants.TAG, "快速通道收到unObserve指令 = " + observeResStr);
        }
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateAllCardData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " SeedlingTool updateAllCardData instance=" + instanceId + " cardOptions=" + cardOptions + " matchType=" + instanceIdMatchType + " callback=" + callback);
        updateDataByCard(card, businessData, cardOptions, true, instanceId, instanceIdMatchType, callback);
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateData(@NotNull final SeedlingCard card, @NotNull final String instanceId, @Nullable final JSONObject businessData, @Nullable final SeedlingCardOptions cardOptions, final int instanceIdMatchType, @Nullable final INegativeFeedbackCallback callback) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        ExecutorService mDataExecutor = getMDataExecutor();
        Intrinsics.checkNotNullExpressionValue(mDataExecutor, "<get-mDataExecutor>(...)");
        ExtsKt.runOnThread(this, mDataExecutor, new Function1<SeedlingUpdateManager, Unit>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager.updateData.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SeedlingUpdateManager) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingUpdateManager seedlingUpdateManager) {
                Intrinsics.checkNotNullParameter(seedlingUpdateManager, "$this$runOnThread");
                if (instanceIdMatchType == 2) {
                    if (Intrinsics.areEqual(card.getServiceInstanceId(), instanceId)) {
                        return;
                    }
                    Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateData strong match fail: CardServiceInstanceId= " + card.getServiceInstanceId() + " not match param instanceId=" + instanceId);
                    return;
                }
                Integer num = (Integer) seedlingUpdateManager.getDisableEntryMap().get(new Pair(card.getServiceId(), instanceId));
                Logger logger = Logger.INSTANCE;
                logger.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " updateData instanceId=" + instanceId + " disableEntryMap=" + seedlingUpdateManager.getDisableEntryMap() + " disableEntry=" + num + " callback=" + callback);
                if (num == null || card.getServiceInstanceId().length() != 0 || !seedlingUpdateManager.isCardEntryDisable(card, num.intValue())) {
                    seedlingUpdateManager.updateDataSingle(card, businessData, cardOptions);
                    return;
                }
                logger.i(Constants.TAG, "updateData disableEntry=" + num + " callback=" + callback);
                INegativeFeedbackCallback iNegativeFeedbackCallback = callback;
                if (iNegativeFeedbackCallback != null) {
                    String serviceId = card.getServiceId();
                    ConcurrentHashMap disableEntryMap = seedlingUpdateManager.getDisableEntryMap();
                    SeedlingCard seedlingCard = card;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : disableEntryMap.entrySet()) {
                        if (Intrinsics.areEqual(((Pair) entry.getKey()).getFirst(), seedlingCard.getServiceId())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Pair<JSONObject, SeedlingCardOptions> pairRequestDataOnDisableEntry = iNegativeFeedbackCallback.requestDataOnDisableEntry(serviceId, linkedHashMap);
                    if (pairRequestDataOnDisableEntry != null) {
                        seedlingUpdateManager.updateDataSingle(card, (JSONObject) pairRequestDataOnDisableEntry.getFirst(), (SeedlingCardOptions) pairRequestDataOnDisableEntry.getSecond());
                    }
                }
            }
        });
    }

    public /* synthetic */ SeedlingUpdateManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateAllCardData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " SeedlingTool updateAllCardData cardOptions=" + cardOptions);
        updateDataByCard$default(this, card, businessData, cardOptions, false, null, 0, null, 112, null);
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateData(@NotNull final SeedlingCard card, @Nullable final JSONObject businessData, @Nullable final SeedlingCardOptions cardOptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        ExecutorService mDataExecutor = getMDataExecutor();
        Intrinsics.checkNotNullExpressionValue(mDataExecutor, "<get-mDataExecutor>(...)");
        ExtsKt.runOnThread(this, mDataExecutor, new Function1<SeedlingUpdateManager, Unit>() { // from class: com.oplus.pantanal.seedling.update.SeedlingUpdateManager.updateData.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SeedlingUpdateManager) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingUpdateManager seedlingUpdateManager) {
                Intrinsics.checkNotNullParameter(seedlingUpdateManager, "$this$runOnThread");
                seedlingUpdateManager.updateDataSingle(card, businessData, cardOptions);
            }
        });
    }
}

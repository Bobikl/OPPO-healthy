package com.oplus.cardwidget.dataLayer;

import android.content.Context;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.aiunit.vision.igm;
import com.oplus.aiunit.vision.k9m;
import com.oplus.aiunit.vision.nkm;
import com.oplus.cardwidget.dataLayer.cache.CardParamCache;
import com.oplus.cardwidget.dataLayer.repo.ICardLayout;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import com.oplus.cardwidget.file.util.FileSourceHelperKt;
import com.oplus.cardwidget.interfaceLayer.DataConvertHelperKt;
import com.oplus.cardwidget.util.Logger;
import com.oplus.channel.client.utils.ClientDI;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\fJ!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u001f\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b!\u0010\"J%\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0004\u0018\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:²\u0006\u000e\u00107\u001a\u0004\u0018\u00010/8\nX\u008a\u0084\u0002²\u0006\u000e\u00107\u001a\u0004\u0018\u0001028\nX\u008a\u0084\u0002²\u0006\u000e\u00109\u001a\u0004\u0018\u0001088\nX\u008a\u0084\u0002"}, d2 = {"Lcom/oplus/cardwidget/dataLayer/CardDataRepository;", "", "", "widgetCode", "getLayNameActive", "", "getLayoutData", BaseDataPack.KEY_LAYOUT_NAME, "Lkotlin/Pair;", "", "onGetPairError", "getLayoutName$com_oplus_card_widget_cardwidget", "(Ljava/lang/String;)Ljava/lang/String;", "getLayoutName", "getLayoutUpdateTime$com_oplus_card_widget_cardwidget", "getLayoutUpdateTime", ClickApiEntity.TIME, "", "setLayoutUpdateTime$com_oplus_card_widget_cardwidget", "(Ljava/lang/String;Ljava/lang/String;)V", "setLayoutUpdateTime", "layoutData", "updateLayoutData$com_oplus_card_widget_cardwidget", "(Ljava/lang/String;[B)V", "updateLayoutData", "updateLayoutName$com_oplus_card_widget_cardwidget", "updateLayoutName", "key", "Lcom/oplus/cardwidget/dataLayer/repo/ICardLayout;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "registerLayoutHolder$com_oplus_card_widget_cardwidget", "(Ljava/lang/String;Lcom/oplus/cardwidget/dataLayer/repo/ICardLayout;)V", "registerLayoutHolder", "unregisterLayoutHolder$com_oplus_card_widget_cardwidget", "(Ljava/lang/String;)V", "unregisterLayoutHolder", "getWidgetCardLayoutData$com_oplus_card_widget_cardwidget", "(Ljava/lang/String;)Lkotlin/Pair;", "getWidgetCardLayoutData", "TAG", "Ljava/lang/String;", "TAG_LAYOUT_DATA", "TAG_LAYOUT_NAME", "TAG_UPDATE_TIME", "Ljava/util/concurrent/ConcurrentHashMap;", "layoutNameHolder", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/oplus/aiunit/vision/k9m;", "layoutDataSource", "Lcom/oplus/aiunit/vision/k9m;", "Lcom/oplus/aiunit/vision/igm;", "paramCache", "Lcom/oplus/aiunit/vision/igm;", "<init>", "()V", "instance", "Landroid/content/Context;", "context", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCardDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDataRepository.kt\ncom/oplus/cardwidget/dataLayer/CardDataRepository\n+ 2 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI\n*L\n1#1,171:1\n37#2,12:172\n*S KotlinDebug\n*F\n+ 1 CardDataRepository.kt\ncom/oplus/cardwidget/dataLayer/CardDataRepository\n*L\n137#1:172,12\n*E\n"})
public final class CardDataRepository {

    @NotNull
    private static final String TAG_LAYOUT_DATA = "layoutData:";

    @NotNull
    private static final String TAG_LAYOUT_NAME = "layoutName:";

    @NotNull
    private static final String TAG_UPDATE_TIME = "updateTime:";

    @NotNull
    public static final CardDataRepository INSTANCE = new CardDataRepository();

    @NotNull
    private static final ConcurrentHashMap<String, ICardLayout> layoutNameHolder = new ConcurrentHashMap<>();

    @NotNull
    private static final String TAG = "CardDataRepository";

    @Nullable
    private static final k9m layoutDataSource = (k9m) n.b.a(TAG, b.a);

    @Nullable
    private static final igm paramCache = (igm) n.b.a(TAG, c.a);

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/oplus/channel/client/utils/ClientDI$injectSingle$1", "Lkotlin/Lazy;", "", "isInitialized", "getValue", "()Ljava/lang/Object;", "value", "client_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nClientDI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI$injectSingle$1\n*L\n1#1,105:1\n*E\n"})
    public static final class a implements Lazy<Context> {
        @Override // p010kotlin.Lazy
        @Nullable
        public Context getValue() {
            return null;
        }

        @Override // p010kotlin.Lazy
        public boolean isInitialized() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/k9m;", "a", "()Lcom/oplus/aiunit/vision/k9m;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCardDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDataRepository.kt\ncom/oplus/cardwidget/dataLayer/CardDataRepository$layoutDataSource$1\n+ 2 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI\n*L\n1#1,171:1\n37#2,12:172\n*S KotlinDebug\n*F\n+ 1 CardDataRepository.kt\ncom/oplus/cardwidget/dataLayer/CardDataRepository$layoutDataSource$1\n*L\n39#1:172,12\n*E\n"})
    public static final class b extends Lambda implements Function0<k9m> {
        public static final b a = new b();

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/oplus/channel/client/utils/ClientDI$injectSingle$1", "Lkotlin/Lazy;", "", "isInitialized", "getValue", "()Ljava/lang/Object;", "value", "client_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nClientDI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI$injectSingle$1\n*L\n1#1,105:1\n*E\n"})
        public static final class a implements Lazy<k9m> {
            @Override // p010kotlin.Lazy
            @Nullable
            public k9m getValue() {
                return null;
            }

            @Override // p010kotlin.Lazy
            public boolean isInitialized() {
                return false;
            }
        }

        public b() {
            super(0);
        }

        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k9m invoke() {
            Lazy<?> aVar;
            ClientDI clientDI = ClientDI.INSTANCE;
            if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(k9m.class)) == null) {
                clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(k9m.class).getSimpleName()) + "] are not injected");
                aVar = new a();
            } else {
                Lazy<?> lazy = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(k9m.class));
                if (lazy == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
                }
                aVar = lazy;
            }
            return a(aVar) == null ? new nkm() : a(aVar);
        }

        private static final k9m a(Lazy<? extends k9m> lazy) {
            return lazy.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/igm;", "a", "()Lcom/oplus/aiunit/vision/igm;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCardDataRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardDataRepository.kt\ncom/oplus/cardwidget/dataLayer/CardDataRepository$paramCache$1\n+ 2 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI\n*L\n1#1,171:1\n37#2,12:172\n*S KotlinDebug\n*F\n+ 1 CardDataRepository.kt\ncom/oplus/cardwidget/dataLayer/CardDataRepository$paramCache$1\n*L\n48#1:172,12\n*E\n"})
    public static final class c extends Lambda implements Function0<igm> {
        public static final c a = new c();

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007¸\u0006\u0000"}, d2 = {"com/oplus/channel/client/utils/ClientDI$injectSingle$1", "Lkotlin/Lazy;", "", "isInitialized", "getValue", "()Ljava/lang/Object;", "value", "client_release"}, k = 1, mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nClientDI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientDI.kt\ncom/oplus/channel/client/utils/ClientDI$injectSingle$1\n*L\n1#1,105:1\n*E\n"})
        public static final class a implements Lazy<igm> {
            @Override // p010kotlin.Lazy
            @Nullable
            public igm getValue() {
                return null;
            }

            @Override // p010kotlin.Lazy
            public boolean isInitialized() {
                return false;
            }
        }

        public c() {
            super(0);
        }

        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final igm invoke() {
            Lazy<?> aVar;
            ClientDI clientDI = ClientDI.INSTANCE;
            if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(igm.class)) == null) {
                clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(igm.class).getSimpleName()) + "] are not injected");
                aVar = new a();
            } else {
                Lazy<?> lazy = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(igm.class));
                if (lazy == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
                }
                aVar = lazy;
            }
            return a(aVar) == null ? new CardParamCache() : a(aVar);
        }

        private static final igm a(Lazy<? extends igm> lazy) {
            return lazy.getValue();
        }
    }

    private CardDataRepository() {
    }

    private final String getLayNameActive(String widgetCode) {
        Logger.INSTANCE.d(TAG, "get layout name active widgetCode:" + widgetCode);
        ICardLayout iCardLayout = layoutNameHolder.get(widgetCode);
        if (iCardLayout != null) {
            return iCardLayout.getCardLayoutName(widgetCode);
        }
        return null;
    }

    private final byte[] getLayoutData(String widgetCode) {
        Logger logger = Logger.INSTANCE;
        k9m k9mVar = layoutDataSource;
        logger.d(TAG, "getLayoutData key:" + widgetCode + ".layoutDataSource=" + k9mVar);
        if (k9mVar == null) {
            return null;
        }
        return k9mVar.get(TAG_LAYOUT_DATA + widgetCode);
    }

    private static final Context getWidgetCardLayoutData$lambda$5(Lazy<? extends Context> lazy) {
        return lazy.getValue();
    }

    private final Pair<byte[], Boolean> onGetPairError(String widgetCode, String layoutName) {
        Logger.INSTANCE.e(TAG, "card layout is invalid widgetCode: " + widgetCode + ", layoutName: " + layoutName);
        return new Pair<>(null, Boolean.FALSE);
    }

    @Nullable
    public final String getLayoutName$com_oplus_card_widget_cardwidget(@NotNull String widgetCode) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        igm igmVar = paramCache;
        if (igmVar != null) {
            String str = igmVar.get(TAG_LAYOUT_NAME + widgetCode);
            if (str != null && DataConvertHelperKt.isEffectLayoutName(str)) {
                Logger.INSTANCE.d(TAG, "getLayoutName key:" + widgetCode + " layoutName: " + str);
                return str;
            }
        }
        Logger.INSTANCE.debug(TAG, widgetCode, "getLayoutName: return null.paramCache=" + igmVar);
        return null;
    }

    @Nullable
    public final String getLayoutUpdateTime$com_oplus_card_widget_cardwidget(@NotNull String widgetCode) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Logger logger = Logger.INSTANCE;
        igm igmVar = paramCache;
        logger.d(TAG, "getLayoutUpdateTime key:" + widgetCode + ",paramCache=" + igmVar);
        if (igmVar == null) {
            return null;
        }
        return igmVar.get(TAG_UPDATE_TIME + widgetCode);
    }

    @NotNull
    public final Pair<byte[], Boolean> getWidgetCardLayoutData$com_oplus_card_widget_cardwidget(@NotNull String widgetCode) {
        Unit unit;
        Lazy<?> aVar;
        String strCheckIsEffectJsonData;
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        byte[] layoutData = getLayoutData(widgetCode);
        boolean z = true;
        if (layoutData != null) {
            Logger logger = Logger.INSTANCE;
            logger.d(TAG, widgetCode + " getWidgetCardLayoutData size=" + layoutData.length);
            String strCheckIsEffectJsonData2 = DataConvertHelperKt.checkIsEffectJsonData(layoutData);
            if (strCheckIsEffectJsonData2 != null) {
                CardDataRepository cardDataRepository = INSTANCE;
                if (cardDataRepository.getLayoutUpdateTime$com_oplus_card_widget_cardwidget(widgetCode) == null) {
                    cardDataRepository.setLayoutUpdateTime$com_oplus_card_widget_cardwidget(widgetCode, String.valueOf(System.currentTimeMillis()));
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    z = false;
                }
                logger.debug(TAG, widgetCode, "getWidgetCardLayoutData data size:" + strCheckIsEffectJsonData2.length() + ", forceUpdate: " + z);
                return new Pair<>(layoutData, Boolean.valueOf(z));
            }
            logger.d(TAG, "current layout data is invalid: " + layoutData);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Logger.INSTANCE.d(TAG, "get local layoutData is null");
        }
        String layoutName$com_oplus_card_widget_cardwidget = getLayoutName$com_oplus_card_widget_cardwidget(widgetCode);
        if (layoutName$com_oplus_card_widget_cardwidget == null) {
            layoutName$com_oplus_card_widget_cardwidget = getLayNameActive(widgetCode);
        }
        ClientDI clientDI = ClientDI.INSTANCE;
        if (clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class)) == null) {
            clientDI.onError("the class of [" + ((Object) Reflection.getOrCreateKotlinClass(Context.class).getSimpleName()) + "] are not injected");
            aVar = new a();
        } else {
            Lazy<?> lazy = clientDI.getSingleInstanceMap().get(Reflection.getOrCreateKotlinClass(Context.class));
            if (lazy == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Lazy<T of com.oplus.channel.client.utils.ClientDI.injectSingle>");
            }
            aVar = lazy;
        }
        Context widgetCardLayoutData$lambda$5 = getWidgetCardLayoutData$lambda$5(aVar);
        if (widgetCardLayoutData$lambda$5 == null) {
            return onGetPairError(widgetCode, layoutName$com_oplus_card_widget_cardwidget);
        }
        if (layoutName$com_oplus_card_widget_cardwidget == null) {
            return INSTANCE.onGetPairError(widgetCode, null);
        }
        byte[] bArrLoadFromAsset = FileSourceHelperKt.loadFromAsset(layoutName$com_oplus_card_widget_cardwidget, widgetCardLayoutData$lambda$5);
        if (bArrLoadFromAsset != null && (strCheckIsEffectJsonData = DataConvertHelperKt.checkIsEffectJsonData(bArrLoadFromAsset)) != null) {
            Logger.INSTANCE.debug(TAG, widgetCode, "getCardLayoutInfo: create data size is:" + strCheckIsEffectJsonData.length() + " layoutName is: " + layoutName$com_oplus_card_widget_cardwidget);
            CardDataRepository cardDataRepository2 = INSTANCE;
            z = cardDataRepository2.getLayoutUpdateTime$com_oplus_card_widget_cardwidget(widgetCode) == null;
            cardDataRepository2.setLayoutUpdateTime$com_oplus_card_widget_cardwidget(widgetCode, String.valueOf(System.currentTimeMillis()));
            cardDataRepository2.updateLayoutName$com_oplus_card_widget_cardwidget(widgetCode, layoutName$com_oplus_card_widget_cardwidget);
            cardDataRepository2.updateLayoutData$com_oplus_card_widget_cardwidget(widgetCode, bArrLoadFromAsset);
            return new Pair<>(bArrLoadFromAsset, Boolean.valueOf(z));
        }
        return INSTANCE.onGetPairError(widgetCode, layoutName$com_oplus_card_widget_cardwidget);
    }

    public final void registerLayoutHolder$com_oplus_card_widget_cardwidget(@NotNull String key, @NotNull ICardLayout holder) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Logger.INSTANCE.d(TAG, "registerLayoutHolder key:" + key + " holder is " + holder);
        layoutNameHolder.put(key, holder);
    }

    public final void setLayoutUpdateTime$com_oplus_card_widget_cardwidget(@NotNull String widgetCode, @Nullable String time) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Logger logger = Logger.INSTANCE;
        igm igmVar = paramCache;
        logger.d(TAG, "setLayoutUpdateTime key:" + widgetCode + " time is:" + time + ".paramCache=" + igmVar);
        if (igmVar != null) {
            igmVar.update(TAG_UPDATE_TIME + widgetCode, time);
        }
    }

    public final void unregisterLayoutHolder$com_oplus_card_widget_cardwidget(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Logger.INSTANCE.d(TAG, "unregisterLayoutHolder key:" + key);
        layoutNameHolder.remove(key);
    }

    public final void updateLayoutData$com_oplus_card_widget_cardwidget(@NotNull String widgetCode, @Nullable byte[] layoutData) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Logger logger = Logger.INSTANCE;
        Integer numValueOf = layoutData != null ? Integer.valueOf(layoutData.length) : null;
        k9m k9mVar = layoutDataSource;
        logger.d(TAG, "updateLayoutData key:" + widgetCode + " layoutDataSize:" + numValueOf + ".layoutDataSource=" + k9mVar);
        if (k9mVar != null) {
            k9mVar.update(TAG_LAYOUT_DATA + widgetCode, layoutData);
        }
    }

    public final void updateLayoutName$com_oplus_card_widget_cardwidget(@NotNull String widgetCode, @NotNull String layoutName) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        Logger logger = Logger.INSTANCE;
        igm igmVar = paramCache;
        logger.d(TAG, "updateLayoutName key:" + widgetCode + " $ name:" + layoutName + ".paramCache=" + igmVar);
        if (igmVar != null) {
            igmVar.update(TAG_LAYOUT_NAME + widgetCode, layoutName);
        }
    }
}

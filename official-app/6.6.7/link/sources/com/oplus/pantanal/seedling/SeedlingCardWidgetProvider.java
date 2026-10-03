package com.oplus.pantanal.seedling;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.oplus.pantanal.seedling.SeedlingCardWidgetProvider;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingHostEnum;
import com.oplus.pantanal.seedling.client.SeedlingClient;
import com.oplus.pantanal.seedling.event.SeedlingLifecycleProcessor;
import com.oplus.pantanal.seedling.lifecycle.ISeedlingCardLifecycle;
import com.oplus.pantanal.seedling.observer.ISeedlingCardObserver;
import com.oplus.pantanal.seedling.observer.SeedlingCardObserver;
import com.oplus.pantanal.seedling.serviceLayer.BaseSeedlingCardStrategyProvider;
import com.oplus.pantanal.seedling.update.INegativeFeedbackCallback;
import com.oplus.pantanal.seedling.update.ISeedlingDataUpdate;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.update.SeedlingDataProcessor;
import com.oplus.pantanal.seedling.update.SeedlingUpdateManager;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import com.oplus.pantanal.seedling.util.SharePreferencesUtil;
import com.oplus.pantanal.seedling.util.UtilsKt;
import com.oplus.smartenginehelper.ParserTag;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001/B\u0005¢\u0006\u0002\u0010\u0005J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016J>\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J$\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J>\u0010.\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00112\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J$\u0010.\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/oplus/pantanal/seedling/SeedlingCardWidgetProvider;", "Lcom/oplus/pantanal/seedling/serviceLayer/BaseSeedlingCardStrategyProvider;", "Lcom/oplus/pantanal/seedling/lifecycle/ISeedlingCardLifecycle;", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataUpdate;", "Lcom/oplus/pantanal/seedling/observer/ISeedlingCardObserver;", "()V", "hasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "latch", "Ljava/util/concurrent/CountDownLatch;", "seedlingCardObserver", "Lcom/oplus/pantanal/seedling/observer/SeedlingCardObserver;", "seedlingClient", "Lcom/oplus/pantanal/seedling/client/SeedlingClient;", "call", "Landroid/os/Bundle;", ParserTag.TAG_METHOD, "", "arg", BridgeConstant.KEY_EXTRAS, "createLifecycleProcessor", "Lcom/oplus/pantanal/seedling/event/SeedlingLifecycleProcessor;", "getSuperChannelHost", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "initChannel", "", "onCreate", "", "update", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "values", "Landroid/content/ContentValues;", "updateAllCardData", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "instanceId", "businessData", "Lorg/json/JSONObject;", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "instanceIdMatchType", "callback", "Lcom/oplus/pantanal/seedling/update/INegativeFeedbackCallback;", "updateData", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SeedlingCardWidgetProvider extends BaseSeedlingCardStrategyProvider implements ISeedlingCardLifecycle, ISeedlingDataUpdate, ISeedlingCardObserver {
    private static final long MAX_WAIT_TIME = 1;

    @NotNull
    private static final String TAG = "SeedlingCardWidgetProvider";

    @NotNull
    private AtomicBoolean hasInit = new AtomicBoolean(false);

    @NotNull
    private CountDownLatch latch = new CountDownLatch(1);

    @Nullable
    private SeedlingCardObserver seedlingCardObserver;

    @Nullable
    private SeedlingClient seedlingClient;

    private final SeedlingLifecycleProcessor createLifecycleProcessor() {
        SeedlingLifecycleProcessor seedlingLifecycleProcessor = new SeedlingLifecycleProcessor();
        seedlingLifecycleProcessor.register(SeedlingUpdateManager.INSTANCE.getINSTANCE().getMCardCache());
        seedlingLifecycleProcessor.register(this);
        return seedlingLifecycleProcessor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initChannel() {
        if (this.hasInit.get()) {
            Logger.INSTANCE.e(TAG, "SeedlingCardWidgetProvider has init");
            return;
        }
        Logger logger = Logger.INSTANCE;
        logger.i(TAG, "SeedlingCardWidgetProvider initChannel start.context=" + getContext());
        Context context = getContext();
        Unit unit = null;
        if (context != null) {
            String canonicalName = getClass().getCanonicalName();
            if (canonicalName != null) {
                Intrinsics.checkNotNull(canonicalName);
                SeedlingCardObserver seedlingCardObserver = new SeedlingCardObserver();
                this.seedlingCardObserver = seedlingCardObserver;
                Intrinsics.checkNotNull(seedlingCardObserver);
                seedlingCardObserver.addObserver(this);
                SeedlingClient.Builder seedlingDataProcessor = new SeedlingClient.Builder(context, canonicalName).setSeedlingEventProcessor(createLifecycleProcessor()).setSeedlingDataProcessor(new SeedlingDataProcessor());
                SeedlingCardObserver seedlingCardObserver2 = this.seedlingCardObserver;
                Intrinsics.checkNotNull(seedlingCardObserver2);
                this.seedlingClient = seedlingDataProcessor.setSeedlingCardObserver(seedlingCardObserver2).setSuperChannelHost(getSuperChannelHost()).build();
                this.latch.countDown();
                this.hasInit.set(true);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                logger.i(TAG, "SeedlingCardWidgetProvider#initChannel canonicalName is null");
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            logger.i(TAG, "SeedlingCardWidgetProvider#initChannel context is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(SeedlingCardWidgetProvider seedlingCardWidgetProvider) {
        Intrinsics.checkNotNullParameter(seedlingCardWidgetProvider, "this$0");
        seedlingCardWidgetProvider.initChannel();
    }

    @Override // com.oplus.pantanal.seedling.serviceLayer.BaseSeedlingCardStrategyProvider
    @Nullable
    public Bundle call(@NotNull String method, @Nullable String arg, @Nullable Bundle extras) throws InterruptedException {
        Intrinsics.checkNotNullParameter(method, ParserTag.TAG_METHOD);
        if (!this.hasInit.get()) {
            Logger logger = Logger.INSTANCE;
            SeedlingTool seedlingTool = SeedlingTool.INSTANCE;
            logger.d(TAG, method + " call await start.hasInit=false,initSdkOnCreate=" + seedlingTool + ".initSdkOnCreate");
            if (seedlingTool.getInitSdkOnCreate$seedling_support_manualRelease()) {
                this.latch.await(1L, TimeUnit.SECONDS);
                logger.d(TAG, method + " call await end");
            }
        }
        return super.call(method, arg, extras);
    }

    @NotNull
    public Set<SeedlingHostEnum> getSuperChannelHost() {
        return SetsKt.emptySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.pantanal.seedling.serviceLayer.BaseSeedlingCardStrategyProvider
    public boolean onCreate() {
        Logger logger = Logger.INSTANCE;
        SeedlingTool seedlingTool = SeedlingTool.INSTANCE;
        logger.i(TAG, this + " onCreate initSdkOnCreate=" + seedlingTool.getInitSdkOnCreate$seedling_support_manualRelease());
        Context context = getContext();
        if (context != null) {
            SharePreferencesUtil.initSP(context);
        }
        if (seedlingTool.getInitSdkOnCreate$seedling_support_manualRelease()) {
            UtilsKt.executeFixedTask(new Runnable() { // from class: com.oplus.aiunit.vision.lug
                @Override // java.lang.Runnable
                public final void run() {
                    SeedlingCardWidgetProvider.onCreate$lambda$1(this.i);
                }
            });
        }
        return super.onCreate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int update(@NotNull Uri uri, @Nullable ContentValues values, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        Context context = getContext();
        if (!Intrinsics.areEqual(getCallingPackage(), context != null ? context.getPackageName() : null)) {
            return super/*android.content.ContentProvider*/.update(uri, values, extras);
        }
        initChannel();
        return 0;
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateAllCardData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        SeedlingTool.INSTANCE.updateAllCardData(card, instanceId, businessData, cardOptions, instanceIdMatchType, callback);
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        SeedlingTool.INSTANCE.updateData(card, instanceId, businessData, cardOptions, instanceIdMatchType, callback);
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateAllCardData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        SeedlingTool.INSTANCE.updateAllCardData(card, businessData, cardOptions);
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions) {
        Intrinsics.checkNotNullParameter(card, "card");
        SeedlingTool.INSTANCE.updateData(card, businessData, cardOptions);
    }
}

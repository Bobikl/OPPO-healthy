package com.nearme.instant.xcard;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import androidx.annotation.NonNull;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.nearme.instant.xcard.CardClient;
import com.nearme.instant.xcard.provider.HostLocationAsyncProvider;
import com.nearme.instant.xcard.provider.HostLocationProvider;
import com.nearme.instant.xcard.statitics.StatConfig;
import com.nearme.instant.xcard.utils.PublicPrefUtil;
import java.io.File;
import java.io.FileFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hapjs.card.api.AppInfo;
import org.hapjs.card.api.Card;
import org.hapjs.card.api.CardInfo;
import org.hapjs.card.api.DownloadListener;
import org.hapjs.card.api.InstallListener;
import org.hapjs.card.api.StatisticsListener;
import org.hapjs.card.api.debug.CardDebugController;
import org.hapjs.card.api.debug.CardDebugHost;
import org.hapjs.card.sdk.BuildConfig;
import org.hapjs.card.sdk.CardDelegator;
import org.hapjs.card.sdk.CardPluginInfo;
import org.hapjs.card.sdk.CardServiceDelegator;
import org.hapjs.card.sdk.CardServiceLoader;
import org.hapjs.card.sdk.MockActivity;
import org.hapjs.card.sdk.debug.SdkCardDebugReceiver;
import org.hapjs.card.sdk.utils.CardConfigHelper;
import org.hapjs.card.sdk.utils.CardExt;
import org.hapjs.card.sdk.utils.CardSdkTrace;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes5.dex */
public class CardClient {
    public static final String CFG_FORCE_UPDATE_ENGINE = "forceUpdateEngine";
    public static final String CFG_RESET_DEFAULT_ENV = "resetDefaultEnv";
    private static final String TAG = "CardClient";
    private static SdkCardDebugReceiver sDebugReceiver;
    private static volatile CardClient sInstance;
    private CardServiceLoader mCardServiceLoader;
    private Context mContext;
    private ICardEngineCallback mEngineCallback;
    private OnPackageChangeListener mPkgListener;
    private Context mResContext;
    private CardServiceDelegator mService;
    private volatile InitStatus mInitStatus = InitStatus.NONE;
    private final List<WeakReference<CardDelegator>> mCards = Collections.synchronizedList(new ArrayList());
    private final Set<ICardEngineCallback> mCallbacks = Collections.synchronizedSet(new HashSet());
    private boolean supportHotReload = true;
    private final Set<String> mLoadedEngineHash = new HashSet();
    private final CardDelegator.DestroyListener mDestroyListener = new CardDelegator.DestroyListener() { // from class: com.oplus.aiunit.vision.iz2
        @Override // org.hapjs.card.sdk.CardDelegator.DestroyListener
        public final void onCardDestroy(CardDelegator cardDelegator) {
            this.a.lambda$new$0(cardDelegator);
        }
    };

    public enum InitStatus {
        NONE,
        SUCCESS,
        FAIL
    }

    private CardClient() {
    }

    private boolean checkNotNull(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        Log.e(TAG, str);
        return false;
    }

    private boolean checkServiceNotNull() {
        return checkNotNull(this.mService, "CardService is null, call init first");
    }

    private void checkSoloaderDir(Context context) {
        File file = new File(context.getFilesDir().getParent(), "lib-main");
        if (file.exists() && !file.canWrite() && file.setWritable(true)) {
            Log.d(TAG, "Fixed permission: " + file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.oplus.aiunit.vision.gz2
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return CardClient.lambda$checkSoloaderDir$2(file2);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (!file2.canRead() && file2.setReadable(true)) {
                        Log.d(TAG, "Fixed read permission: " + file2.getName());
                    }
                    if (!file2.canWrite() && file2.setWritable(true)) {
                        Log.d(TAG, "Fixed write permission: " + file2.getName());
                    }
                }
            }
        }
    }

    public static int getCardPlatformVersion(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(CardConfigHelper.getPlatform(context, getInstance().mResContext), 128).metaData.getInt("cardPlatformVersion");
        } catch (PackageManager.NameNotFoundException | NullPointerException | NumberFormatException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static CardClient getInstance() {
        if (sInstance == null) {
            synchronized (CardClient.class) {
                if (sInstance == null) {
                    sInstance = new CardClient();
                }
            }
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleServiceHotUpdate(String str, int i, String str2, int i2, String str3) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            final CardServiceDelegator cardServiceDelegatorCreateCardService = this.mCardServiceLoader.createCardService(false);
            CardSdkTrace cardSdkTrace = CardSdkTrace.INSTANCE;
            cardSdkTrace.addTrace("create_service", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            if (cardServiceDelegatorCreateCardService == null || this.mLoadedEngineHash.contains(cardServiceDelegatorCreateCardService.getInfo().getSourceDir())) {
                Log.d(TAG, String.format("found new engine(%s, %d, %s, %d, %s), current env not support repeat load same engine, need restart.", str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3));
                return;
            }
            final CardServiceDelegator cardServiceDelegator = this.mService;
            Log.d(TAG, String.format("found new engine(%s, %d, %s, %d, %s), current env support hot load", str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3));
            try {
                cardSdkTrace.addTrace("engine_change", SpeechConstant.TRUE_STR);
                Bundle bundle = new Bundle();
                bundle.putLong("PARAM_SDK_INIT_START_TIME", jUptimeMillis);
                cardSdkTrace.putTrace(bundle);
                cardServiceDelegatorCreateCardService.setSdkInitTimeParams(bundle);
                ICardEngineCallback iCardEngineCallback = new ICardEngineCallback() { // from class: com.nearme.instant.xcard.CardClient.3
                    @Override // com.nearme.instant.xcard.ICardEngineCallback
                    public void onInitFailure(int i3, Throwable th) {
                        Log.e(CardClient.TAG, "hot reload engine, init fail, " + th.getMessage());
                    }

                    @Override // com.nearme.instant.xcard.ICardEngineCallback
                    public void onInitSuccess() {
                        cardServiceDelegatorCreateCardService.applyServiceConfig(CardClient.this.mContext, cardServiceDelegator.getMConfig());
                        try {
                            CardClient.this.mService = cardServiceDelegatorCreateCardService;
                            CardClient.this.notifyCardEngineChange();
                            cardServiceDelegator.release();
                            CardClient.this.mLoadedEngineHash.add(cardServiceDelegatorCreateCardService.getInfo().getSourceDir());
                        } catch (Throwable th) {
                            CardExt.reportHotLoadEngineError(CardClient.this.mContext, 0, th);
                        }
                    }
                };
                Context context = this.mContext;
                cardServiceDelegatorCreateCardService.init(context, CardConfigHelper.getPlatform(context, this.mResContext), iCardEngineCallback);
            } catch (Throwable th) {
                Log.e(TAG, "Fail to init service", th);
                CardExt.reportEngineInitError(this.mContext, 0, th, true, false, false);
            }
        } catch (CardServiceLoader.LoadException e2) {
            CardExt.reportEngineInitError(this.mContext, e2.getCode(), e2, true, false, false);
        }
    }

    public static synchronized boolean init(Context context, ICardEngineCallback iCardEngineCallback) {
        return init(context, context, iCardEngineCallback, null);
    }

    public static void initAsync(Context context, ICardEngineCallback iCardEngineCallback) {
        initAsync(context, iCardEngineCallback, false);
    }

    private void initInternal(Context context, Context context2, Bundle bundle, long j2) {
        boolean z;
        CardServiceDelegator cardServiceDelegator;
        if (this.mService != null) {
            Log.w(TAG, "client has init");
            if (this.mInitStatus == InitStatus.SUCCESS) {
                notifySuccess();
                return;
            }
        }
        boolean z2 = bundle != null ? bundle.getBoolean(CFG_FORCE_UPDATE_ENGINE, false) : false;
        boolean z3 = bundle != null ? bundle.getBoolean(CFG_RESET_DEFAULT_ENV, false) : false;
        Log.d(TAG, String.format("init forceUpdateEngine : %b, resetDefaultEnv %b", Boolean.valueOf(z2), Boolean.valueOf(z3)));
        if (z3) {
            CardServiceLoader.INSTANCE.resetDefaultEnv(context);
        }
        CardExt.initEventTrackerIfNeeded(context);
        Process.setThreadPriority(-1);
        long jUptimeMillis = SystemClock.uptimeMillis();
        PublicPrefUtil.init(context);
        if (z2 || PublicPrefUtil.getCardInitStatus() != 1) {
            PublicPrefUtil.setCardInitStatus(1);
            z = z2;
        } else {
            Log.w(TAG, "Initialization terminated abnormally last time, try forceUpdate");
            CardSdkTrace.INSTANCE.addTrace("lastInitFail", SpeechConstant.TRUE_STR);
            z = true;
        }
        CardSdkTrace cardSdkTrace = CardSdkTrace.INSTANCE;
        cardSdkTrace.addTrace(CardAction.EXTRA_FORCE_UPDATE, String.valueOf(z));
        cardSdkTrace.addTrace("reset_default", String.valueOf(z3));
        cardSdkTrace.addTrace("pref_init", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        this.mContext = context.getApplicationContext();
        this.mResContext = context2;
        this.mCardServiceLoader = new CardServiceLoader(context, CardConfigHelper.getPlatform(this.mContext, context2));
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        try {
            CardServiceDelegator cardServiceDelegatorCreateCardService = this.mCardServiceLoader.createCardService(z);
            this.mService = cardServiceDelegatorCreateCardService;
            if (cardServiceDelegatorCreateCardService == null) {
                notifyFailed(8, new CardServiceLoader.LoadException(8, "Create CardService fail", null));
                return;
            }
            cardSdkTrace.addTrace("create_service", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis2));
            try {
                this.mEngineCallback = new ICardEngineCallback() { // from class: com.nearme.instant.xcard.CardClient.1
                    @Override // com.nearme.instant.xcard.ICardEngineCallback
                    public void onInitFailure(int i, Throwable th) {
                        CardClient.this.notifyFailed(i, th);
                    }

                    @Override // com.nearme.instant.xcard.ICardEngineCallback
                    public void onInitSuccess() {
                        CardPluginInfo info;
                        CardClient.this.notifySuccess();
                        if (CardClient.this.mService == null || (info = CardClient.this.mService.getInfo()) == null) {
                            return;
                        }
                        CardClient.this.mLoadedEngineHash.add(info.getSourceDir());
                    }
                };
                Bundle bundle2 = new Bundle();
                bundle2.putLong("PARAM_SDK_INIT_START_TIME", j2);
                cardSdkTrace.putTrace(bundle2);
                this.mService.setSdkInitTimeParams(bundle2);
                if (BuildConfig.LITE_MODE.booleanValue() && (cardServiceDelegator = this.mService) != null && cardServiceDelegator.needInjectResource()) {
                    this.mService.injectResource(context, context2);
                }
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                if (this.mResContext != null) {
                    this.mService.setResContext(context2);
                }
                checkSoloaderDir(context);
                this.mService.init(context, CardConfigHelper.getPlatform(context, context2), this.mEngineCallback);
                Log.w(TAG, "engine init use " + (SystemClock.uptimeMillis() - jUptimeMillis3));
            } catch (Throwable th) {
                Log.e(TAG, "Fail to init service", th);
                notifyFailed(0, th);
                CardExt.reportEngineInitError(context, 0, th, false, z, z3);
            }
            PublicPrefUtil.setCardInitStatus(2);
        } catch (CardServiceLoader.LoadException e2) {
            notifyFailed(e2.getCode(), e2);
            CardExt.reportEngineInitError(context, e2.getCode(), e2, false, z, z3);
        } catch (Throwable th2) {
            notifyFailed(0, th2);
            CardExt.reportEngineInitError(context, 0, th2, false, z, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$checkSoloaderDir$2(File file) {
        return file.getName().startsWith("dso_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(CardDelegator cardDelegator) {
        synchronized (this.mCards) {
            Iterator<WeakReference<CardDelegator>> it = this.mCards.iterator();
            while (it.hasNext()) {
                WeakReference<CardDelegator> next = it.next();
                if (next != null && next.get() == cardDelegator) {
                    next.clear();
                    it.remove();
                    break;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyCardEngineChange() {
        CardDelegator cardDelegator;
        synchronized (this.mCards) {
            for (WeakReference<CardDelegator> weakReference : this.mCards) {
                if (weakReference != null && (cardDelegator = weakReference.get()) != null && !cardDelegator.isDestroyed()) {
                    cardDelegator.setCardService(this.mService);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyFailed(int i, Throwable th) {
        this.mInitStatus = InitStatus.FAIL;
        synchronized (this.mCallbacks) {
            for (ICardEngineCallback iCardEngineCallback : this.mCallbacks) {
                if (iCardEngineCallback != null) {
                    iCardEngineCallback.onInitFailure(i, th);
                }
            }
            this.mCallbacks.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifySuccess() {
        this.mInitStatus = InitStatus.SUCCESS;
        synchronized (this.mCallbacks) {
            for (ICardEngineCallback iCardEngineCallback : this.mCallbacks) {
                if (iCardEngineCallback != null) {
                    iCardEngineCallback.onInitSuccess();
                }
            }
        }
        this.mCallbacks.clear();
        if (BuildConfig.LITE_MODE.booleanValue()) {
            registerEngineChangeListener();
        }
    }

    public static synchronized void registerDebugReceiver(Context context) {
        Log.d(TAG, "registerDebugReceiver: ");
        if (sDebugReceiver == null) {
            sDebugReceiver = new SdkCardDebugReceiver();
        }
        CardExt.registerReceiverExt(context, sDebugReceiver, new IntentFilter(CardDebugController.ACTION_DEBUG_CARD), 2);
    }

    private void registerEngineChangeListener() {
        CardServiceLoader cardServiceLoader = this.mCardServiceLoader;
        if (cardServiceLoader != null) {
            cardServiceLoader.observeEngineChanges(new CardServiceLoader.OnCardEngineUpdateListener() { // from class: com.nearme.instant.xcard.CardClient.2
                @Override // org.hapjs.card.sdk.CardServiceLoader.OnCardEngineUpdateListener
                public void onEngineChange(@NonNull String str, int i, @NonNull String str2, int i2, @NonNull String str3) {
                    if (CardClient.this.isSupportHotReload() && (CardClient.this.mService instanceof CardServiceDelegator) && CardClient.this.mService.supportHotReload() && i2 > 0) {
                        CardClient.this.handleServiceHotUpdate(str, i, str2, i2, str3);
                    } else {
                        Log.d(CardClient.TAG, String.format("found new engine(%s, %d, %s, %d, %s), current env not support hot load, need restart.", str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3));
                    }
                }

                @Override // org.hapjs.card.sdk.CardServiceLoader.OnCardEngineUpdateListener
                public void onPlatformChange(@NonNull String str, int i, @NonNull String str2, int i2) {
                    if (CardClient.this.mPkgListener != null) {
                        CardClient.this.mPkgListener.onPackageChanged(str, i, str2);
                    }
                }
            });
            this.mCardServiceLoader.checkEngineUpdateAsync(false, 30000L);
        }
    }

    public static void reset() {
        synchronized (CardClient.class) {
            if (sInstance != null) {
                sInstance.removeAllCard();
            }
            sInstance = null;
        }
    }

    public static synchronized void unregisterDebugReceiver(Context context) {
        Log.d(TAG, "unregisterDebugReceiver: ");
        SdkCardDebugReceiver sdkCardDebugReceiver = sDebugReceiver;
        if (sdkCardDebugReceiver != null) {
            context.unregisterReceiver(sdkCardDebugReceiver);
            sDebugReceiver = null;
        }
    }

    public void clearImageCache() {
        if (checkServiceNotNull()) {
            try {
                this.mService.clearImageCache();
            } catch (AbstractMethodError unused) {
            }
        }
    }

    @Deprecated
    public Card createCard(Context context, String str) {
        if (this.mService == null) {
            Log.e(TAG, "CardService is null, call init first");
            return null;
        }
        CardDelegator cardDelegator = new CardDelegator(context, this.mResContext, this.mService, this.mDestroyListener, str);
        this.mCards.add(new WeakReference<>(cardDelegator));
        return cardDelegator;
    }

    public Card createCardOnActivity(Activity activity, String str) {
        return createCard(activity, str);
    }

    public Card createCardOnWindow(Context context) {
        return createCardOnWindow(context, null, null);
    }

    public void destroy() {
        if (this.mService != null) {
            removeAllCard();
        }
    }

    public void download(String str, int i, DownloadListener downloadListener) {
        if (!checkServiceNotNull()) {
            downloadListener.onDownloadResult(str, 1, 106);
        } else {
            try {
                this.mService.download(str, i, downloadListener);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    @Deprecated
    public boolean executeAnima(boolean z) {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            return this.mService.executeAnima(z);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    public AppInfo getAppInfo(String str) {
        if (checkServiceNotNull()) {
            return this.mService.getAppInfo(str);
        }
        return null;
    }

    public CardDebugController getCardDebugController() {
        CardServiceDelegator cardServiceDelegator = this.mService;
        if (cardServiceDelegator != null) {
            return cardServiceDelegator.getCardDebugController();
        }
        return null;
    }

    public String getCardEngineVersion() {
        if (!checkServiceNotNull()) {
            return null;
        }
        try {
            return this.mService.getCardEngineVersion();
        } catch (AbstractMethodError unused) {
            return "";
        }
    }

    public int getCardEngineVersionCode() {
        if (!checkServiceNotNull()) {
            return -1;
        }
        try {
            int cardEngineVersionCode = this.mService.getCardEngineVersionCode();
            if (cardEngineVersionCode > 0) {
                return cardEngineVersionCode;
            }
        } catch (AbstractMethodError unused) {
        }
        String cardEngineVersion = getCardEngineVersion();
        if (TextUtils.isEmpty(cardEngineVersion)) {
            return -1;
        }
        return CardExt.extractVersion(this, cardEngineVersion);
    }

    public CardInfo getCardInfo(String str) {
        if (checkServiceNotNull()) {
            return this.mService.getCardInfo(str);
        }
        return null;
    }

    public Collection<String> getPermissionDescriptions(String str) {
        if (checkServiceNotNull()) {
            return this.mService.getPermissionDescriptions(str);
        }
        return null;
    }

    public int getPlatformVersion() {
        if (checkServiceNotNull()) {
            return this.mService.getPlatformVersion();
        }
        return -1;
    }

    public boolean grantPermissions(String str) {
        CardServiceDelegator cardServiceDelegator = this.mService;
        if (cardServiceDelegator != null) {
            return cardServiceDelegator.grantPermissions(str);
        }
        Log.e(TAG, "CardService is null, call init first");
        return false;
    }

    public void initOaps(String str, String str2) {
        if (checkServiceNotNull()) {
            this.mService.initOaps(str, str2);
        }
    }

    public void install(String str, String str2, InstallListener installListener) {
        if (checkServiceNotNull()) {
            this.mService.install(str, str2, installListener);
        }
    }

    public boolean isInitIdentifier(int i, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                return this.mService.isInitIdentifier(i, bundle);
            } catch (AbstractMethodError unused) {
                return false;
            }
        }
        Log.w(TAG, "service is null");
        return false;
    }

    public boolean isSetStatConfig() {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            return this.mService.isSetStatConfig();
        } catch (AbstractMethodError unused) {
            return true;
        }
    }

    public boolean isSupport(int i) {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            return this.mService.isSupport(i);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    public boolean isSupportHotReload() {
        return this.supportHotReload;
    }

    public void queryStatus(Context context, ICardStatusListener iCardStatusListener, String... strArr) {
        if (checkServiceNotNull()) {
            this.mService.queryStatus(context, iCardStatusListener, strArr);
        }
    }

    public void registerEnginePackageListener(OnPackageChangeListener onPackageChangeListener) {
        this.mPkgListener = onPackageChangeListener;
    }

    public void registerIdentifier(int i, boolean z, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.registerIdentifier(i, z, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void removeAllCard() {
        synchronized (this.mCards) {
            for (int size = this.mCards.size() - 1; size >= 0; size--) {
                WeakReference<CardDelegator> weakReference = this.mCards.get(size);
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().destroy();
                }
            }
        }
    }

    public void resumeWindowBlur(int i) {
        if (checkServiceNotNull()) {
            try {
                this.mService.resumeWindowBlur(i);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void setCardDebugHost(CardDebugHost cardDebugHost) {
        SdkCardDebugReceiver.setCardDebugHost(cardDebugHost);
    }

    public boolean setCardInterceptor(IInterceptor iInterceptor) {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            this.mService.setCardInterceptor(iInterceptor);
            return true;
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    public void setCardMemoryInfoCallback(ICardMessageCallback iCardMessageCallback) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setCardMemoryInfoCallback(iCardMessageCallback);
            } catch (Throwable unused) {
                Log.e(TAG, "Current card engine not support CardMessageManager");
            }
        }
    }

    public Bundle setDynamicConfig(Bundle bundle) {
        if (checkServiceNotNull()) {
            return this.mService.setDynamicConfig(bundle);
        }
        Log.w(TAG, "service is null");
        return null;
    }

    public void setLaunchInterceptor(ILaunchInterceptor iLaunchInterceptor) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setLaunchInterceptor(iLaunchInterceptor);
            } catch (AbstractMethodError e2) {
                Log.e(TAG, "Current card engine not support setLaunchInterceptor. " + e2.getMessage());
            }
        }
    }

    public void setLaunchInterceptorV1(ILaunchInterceptorV1 iLaunchInterceptorV1) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setLaunchInterceptorV1(iLaunchInterceptorV1);
            } catch (AbstractMethodError e2) {
                Log.e(TAG, "Current card engine not support setLaunchInterceptorV1. " + e2.getMessage());
            }
        }
    }

    @Deprecated
    public void setLocationProvider(HostLocationProvider hostLocationProvider) {
        if (checkServiceNotNull()) {
            this.mService.setLocationProvider(hostLocationProvider);
        }
    }

    public void setMaxFontScale(float f) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setMaxFontScale(f);
            } catch (Throwable unused) {
                Log.e(TAG, "Current card engine not support setMaxFontScale");
            }
        }
    }

    public void setMinFontScale(float f) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setMinFontScale(f);
            } catch (Throwable unused) {
                Log.e(TAG, "Current card engine not support setMinFontScale");
            }
        }
    }

    public void setStatConfig(StatConfig statConfig) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setStatConfig(statConfig);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void setStatisticListener(StatisticsListener statisticsListener) {
        if (checkServiceNotNull()) {
            try {
                this.mService.setStatisticsListener(statisticsListener);
            } catch (AbstractMethodError e2) {
                Log.e(TAG, "Current card engine not support StatisticsListener. " + e2.getMessage());
            }
        }
    }

    public void setSupportBlurBackground(boolean z, Map<String, Object> map) {
        if (checkNotNull(this.mService, "CardService is null, call init first")) {
            try {
                this.mService.setSupportBlurBackground(z, map);
            } catch (Throwable unused) {
                Log.e(TAG, "Current card engine not support setSupportBlurBackground");
            }
        }
    }

    public void setSupportHotReload(boolean z) {
        this.supportHotReload = z;
    }

    public void setTheme(Context context, String str) {
        if (checkServiceNotNull()) {
            this.mService.setTheme(context, str);
        }
    }

    public void startDebug(Context context) {
        SdkCardDebugReceiver.register(context);
    }

    public void stopDebug(Context context) {
        SdkCardDebugReceiver.unregister(context);
    }

    public void suppressPermissionDialog(boolean z) {
        if (checkServiceNotNull()) {
            this.mService.suppressPermissionDialog(z);
        }
    }

    public void unRegisterIdentifier(int i, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.unRegisterIdentifier(i, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void unregisterEnginePackageListener() {
        this.mPkgListener = null;
    }

    public void updateToInverseColorMode(boolean z) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToInverseColorMode(z);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToMaterialMode(boolean z) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToMaterialMode(z);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToNormalMode(boolean z) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToNormalMode(z);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToSingleClockMode(int i) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToSingleClockMode(i);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToSingleColorMode(Bitmap bitmap, boolean z) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToSingleColorMode(bitmap, z);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToSingleColorModeWithSeedColor(int i, int i2, boolean z, String str, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToSingleColorModeWithSeedColor(i, i2, z, str, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public static synchronized boolean init(Context context, ICardEngineCallback iCardEngineCallback, boolean z) {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putBoolean(CFG_FORCE_UPDATE_ENGINE, z);
        return init(context, context, iCardEngineCallback, bundle);
    }

    public static void initAsync(Context context, ICardEngineCallback iCardEngineCallback, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CFG_FORCE_UPDATE_ENGINE, z);
        initAsync(context, context, iCardEngineCallback, bundle);
    }

    public Card createCardOnActivity(Activity activity) {
        return createCardOnActivity(activity, null);
    }

    public Card createCardOnWindow(Context context, String str, Window window) {
        return createCardOnActivity(new MockActivity(context, window), str);
    }

    public boolean executeAnima(boolean z, Bundle bundle) {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            return this.mService.executeAnima(z, bundle);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    @Deprecated
    public boolean setLocationProvider(HostLocationAsyncProvider hostLocationAsyncProvider) {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            this.mService.setLocationAsyncProvider(hostLocationAsyncProvider);
            return true;
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    public void updateToInverseColorMode(int i, boolean z, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToInverseColorMode(i, z, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToMaterialMode(int i, boolean z, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToMaterialMode(i, z, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToNormalMode(int i, boolean z, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToNormalMode(i, z, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToSingleClockMode(int i, int i2, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToSingleClockMode(i, i2, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void updateToSingleColorMode(int i, Bitmap bitmap, boolean z, Bundle bundle) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToSingleColorMode(i, bitmap, z, bundle);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public void download(String str, String str2, DownloadListener downloadListener) {
        if (!checkServiceNotNull()) {
            downloadListener.onDownloadResult(str, 1, 106);
        } else {
            try {
                this.mService.download(str, str2, downloadListener);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public static synchronized boolean init(Context context, Context context2, ICardEngineCallback iCardEngineCallback, Bundle bundle) {
        if (context == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        CardClient cardClient = getInstance();
        if (iCardEngineCallback != null) {
            cardClient.mCallbacks.add(iCardEngineCallback);
        }
        cardClient.initInternal(context, context2, bundle, jElapsedRealtime);
        Log.d(TAG, String.format("init duration : %d", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime)));
        return cardClient.mInitStatus == InitStatus.SUCCESS;
    }

    public static void initAsync(Context context, ICardEngineCallback iCardEngineCallback, Bundle bundle) {
        initAsync(context, context, iCardEngineCallback, bundle);
    }

    public Card createCard(Context context) {
        return createCard(context, null);
    }

    public boolean executeAnima(int i, boolean z, Bundle bundle) {
        if (!checkServiceNotNull()) {
            return false;
        }
        try {
            return this.mService.executeAnima(i, z, bundle);
        } catch (AbstractMethodError unused) {
            return false;
        }
    }

    public void updateToSingleColorMode(int i, boolean z) {
        if (checkServiceNotNull()) {
            try {
                this.mService.updateToSingleColorMode(i, z);
            } catch (AbstractMethodError unused) {
            }
        }
    }

    public static void initAsync(final Context context, final Context context2, final ICardEngineCallback iCardEngineCallback, final Bundle bundle) {
        new Thread(new Runnable() { // from class: com.oplus.aiunit.vision.hz2
            @Override // java.lang.Runnable
            public final void run() {
                CardClient.init(context, context2, iCardEngineCallback, bundle);
            }
        }).start();
    }
}

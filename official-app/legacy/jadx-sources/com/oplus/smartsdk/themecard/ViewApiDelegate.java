package com.oplus.smartsdk.themecard;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.oea;
import com.oplus.smartsdk.CardUICallback;
import com.oplus.smartsdk.ErrorCallback;
import com.oplus.smartsdk.ISmartViewApi;
import com.oplus.smartsdk.InterceptStartActivityCallback;
import com.oplus.smartsdk.R;
import com.oplus.smartsdk.SmartApiInfo;
import com.oplus.smartsdk.SmartEngineManager;
import com.oplus.smartsdk.themecard.ViewApiDelegate;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 A2\u00020\u0001:\u0002@AB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020\u0015H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u001a\u0010)\u001a\u00020!2\u0006\u0010&\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0005H\u0016J\u0012\u0010-\u001a\u00020!2\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0016J\u0018\u0010/\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000fH\u0016J\u0010\u00100\u001a\u00020!2\u0006\u0010&\u001a\u00020\u0005H\u0016J*\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u00020\u0019H\u0017J\u001a\u00104\u001a\u00020!2\u0006\u00105\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0005H\u0017J \u00106\u001a\u00020!2\u0006\u00107\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0016J\u0010\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020\u0006H\u0016J\u0010\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020\u0006H\u0016J\u0010\u0010>\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J\u0012\u0010?\u001a\u00020!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0016\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00190\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/oplus/smartsdk/themecard/ViewApiDelegate;", "Lcom/oplus/smartsdk/ISmartViewApi;", "()V", "allowRefreshCardMaps", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/view/View;", "", "bindInfoList", "", "Lcom/oplus/smartsdk/themecard/ViewApiDelegate$BindInfo;", "cardApiManager", "Lcom/oplus/smartsdk/themecard/CardApiManager;", "cardUICallbackMap", "", "", "Lcom/oplus/smartsdk/CardUICallback;", "enableImageThread", "enableLog", "errorCallback", "Lcom/oplus/smartsdk/ErrorCallback;", "interceptStartActivityCallback", "Lcom/oplus/smartsdk/InterceptStartActivityCallback;", "refreshCardDataMaps", "Lkotlin/Triple;", "Landroid/content/Context;", "Lcom/oplus/smartsdk/SmartApiInfo;", "smartCardApi", "themeCardApi", "getSupportedMorphSize", "", "", "cardName", "initApiCommon", "", oea.FEATURE_API_REQUEST, "interceptStartActivity", "ca", "isThemeCard", "view", "onInVisible", "onRelease", "onSizeChange", "data", "Landroid/os/Bundle;", "onVisible", "registerErrorCallback", "callback", "registerUiCallback", "releaseOldViewSource", "sendCardData", "hostContext", "smartApiInfo", "setAllowCardRefreshable", "ifAllowRefresh", "setBindServiceToCPData", "cardIdentify", "packageName", "className", "setCanLog", "canLog", "setUseImageThread", "useImageThread", "unRegisterUiCallback", "unsubscribe", "BindInfo", "Companion", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ViewApiDelegate implements ISmartViewApi {

    @NotNull
    private static final String TAG = "ViewApiDelegate";

    @Nullable
    private List<BindInfo> bindInfoList;
    private boolean enableImageThread;
    private boolean enableLog;

    @Nullable
    private ErrorCallback errorCallback;

    @Nullable
    private InterceptStartActivityCallback interceptStartActivityCallback;

    @Nullable
    private ISmartViewApi smartCardApi;

    @Nullable
    private ISmartViewApi themeCardApi;

    @NotNull
    private final CardApiManager cardApiManager = new CardApiManager();

    @NotNull
    private final Map<String, CardUICallback> cardUICallbackMap = new HashMap();

    @NotNull
    private final ConcurrentHashMap<View, Boolean> allowRefreshCardMaps = new ConcurrentHashMap<>();

    @NotNull
    private final ConcurrentHashMap<View, Triple<Context, String, SmartApiInfo>> refreshCardDataMaps = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/smartsdk/themecard/ViewApiDelegate$BindInfo;", "", "cardIdentify", "", "packageName", "className", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardIdentify", "()Ljava/lang/String;", "getClassName", "getPackageName", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class BindInfo {

        @NotNull
        private final String cardIdentify;

        @NotNull
        private final String className;

        @NotNull
        private final String packageName;

        public BindInfo(@NotNull String cardIdentify, @NotNull String packageName, @NotNull String className) {
            Intrinsics.checkNotNullParameter(cardIdentify, "cardIdentify");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(className, "className");
            this.cardIdentify = cardIdentify;
            this.packageName = packageName;
            this.className = className;
        }

        @NotNull
        public final String getCardIdentify() {
            return this.cardIdentify;
        }

        @NotNull
        public final String getClassName() {
            return this.className;
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }
    }

    /* JADX INFO: renamed from: com.oplus.smartsdk.themecard.ViewApiDelegate$sendCardData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/oplus/smartsdk/themecard/ViewApiDelegate$sendCardData$1", "Lcom/oplus/smartsdk/themecard/CardApiManager$Callback;", "onError", "", MapSchema.FIELD_NAME_ENTRY, "", "onLoad", oea.FEATURE_API_REQUEST, "Lcom/oplus/smartsdk/ISmartViewApi;", "cardContext", "Landroid/content/Context;", "isThemeCard", "", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AnonymousClass1 implements CardApiManager.Callback {
        final /* synthetic */ String $cardName;
        final /* synthetic */ SmartApiInfo $smartApiInfo;
        final /* synthetic */ View $view;

        public AnonymousClass1(String str, View view, SmartApiInfo smartApiInfo) {
            this.$cardName = str;
            this.$view = view;
            this.$smartApiInfo = smartApiInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onError$lambda-0, reason: not valid java name */
        public static final void m5218onError$lambda0(ViewApiDelegate this$0, String cardName) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(cardName, "$cardName");
            ErrorCallback errorCallback = this$0.errorCallback;
            if (errorCallback == null) {
                return;
            }
            errorCallback.onCall(cardName, 0);
        }

        @Override // com.oplus.smartsdk.themecard.CardApiManager.Callback
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Log.e(ViewApiDelegate.TAG, "loadCardApi onError cardName=" + this.$cardName + " e=" + ((Object) e2.getMessage()));
            Handler handler = SmartEngineManager.MAIN_HANDLER;
            final ViewApiDelegate viewApiDelegate = ViewApiDelegate.this;
            final String str = this.$cardName;
            handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.uzk
                @Override // java.lang.Runnable
                public final void run() {
                    ViewApiDelegate.AnonymousClass1.m5218onError$lambda0(viewApiDelegate, str);
                }
            });
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        @Override // com.oplus.smartsdk.themecard.CardApiManager.Callback
        public void onLoad(@NotNull ISmartViewApi api, @NotNull Context cardContext, boolean isThemeCard) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(cardContext, "cardContext");
            boolean z = true;
            if (isThemeCard) {
                if (ViewApiDelegate.this.themeCardApi != api) {
                    ViewApiDelegate.this.themeCardApi = api;
                } else {
                    z = false;
                }
            } else if (ViewApiDelegate.this.smartCardApi != api) {
                ViewApiDelegate.this.smartCardApi = api;
            } else {
                z = false;
            }
            Log.d(ViewApiDelegate.TAG, "loadCardApi onLoad cardName=" + this.$cardName + " isThemeCard=" + isThemeCard + " shouldInit=" + z);
            if (z) {
                ViewApiDelegate.this.initApiCommon(api);
                if (!isThemeCard) {
                    api.setUseImageThread(ViewApiDelegate.this.enableImageThread);
                    List<BindInfo> list = ViewApiDelegate.this.bindInfoList;
                    ViewApiDelegate.this.bindInfoList = null;
                    if (list != null) {
                        for (BindInfo bindInfo : list) {
                            api.setBindServiceToCPData(bindInfo.getCardIdentify(), bindInfo.getPackageName(), bindInfo.getClassName());
                        }
                        list.clear();
                    }
                }
            }
            api.sendCardData(cardContext, this.$cardName, this.$view, this.$smartApiInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initApiCommon(ISmartViewApi api) {
        api.setCanLog(this.enableLog);
        ErrorCallback errorCallback = this.errorCallback;
        if (errorCallback != null) {
            api.registerErrorCallback(errorCallback);
        }
        InterceptStartActivityCallback interceptStartActivityCallback = this.interceptStartActivityCallback;
        if (interceptStartActivityCallback != null) {
            api.interceptStartActivity(interceptStartActivityCallback);
        }
        synchronized (this.cardUICallbackMap) {
            if (!this.cardUICallbackMap.isEmpty()) {
                for (Map.Entry<String, CardUICallback> entry : this.cardUICallbackMap.entrySet()) {
                    api.registerUiCallback(entry.getKey(), entry.getValue());
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final boolean isThemeCard(View view) {
        return view.getTag(R.id.tag_theme_card_name) != null;
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    @NotNull
    public List<Integer> getSupportedMorphSize(@NotNull String cardName) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        ISmartViewApi iSmartViewApi = this.themeCardApi;
        if (iSmartViewApi instanceof ThemeCardViewImpl) {
            ThemeCardViewImpl themeCardViewImpl = (ThemeCardViewImpl) iSmartViewApi;
            if (themeCardViewImpl.isThemeCard(cardName)) {
                return themeCardViewImpl.getSupportedMorphSize(cardName);
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void interceptStartActivity(@NotNull InterceptStartActivityCallback ca) {
        Intrinsics.checkNotNullParameter(ca, "ca");
        this.interceptStartActivityCallback = ca;
        ISmartViewApi iSmartViewApi = this.themeCardApi;
        if (iSmartViewApi != null) {
            iSmartViewApi.interceptStartActivity(ca);
        }
        ISmartViewApi iSmartViewApi2 = this.smartCardApi;
        if (iSmartViewApi2 == null) {
            return;
        }
        iSmartViewApi2.interceptStartActivity(ca);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onInVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Log.d(TAG, "onInVisible, view=" + view + ", isThemeCard=" + isThemeCard(view));
        if (isThemeCard(view)) {
            ISmartViewApi iSmartViewApi = this.themeCardApi;
            if (iSmartViewApi == null) {
                return;
            }
            iSmartViewApi.onInVisible(view);
            return;
        }
        ISmartViewApi iSmartViewApi2 = this.smartCardApi;
        if (iSmartViewApi2 == null) {
            return;
        }
        iSmartViewApi2.onInVisible(view);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onRelease(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (isThemeCard(view)) {
            ISmartViewApi iSmartViewApi = this.themeCardApi;
            if (iSmartViewApi != null) {
                iSmartViewApi.onRelease(view);
            }
        } else {
            ISmartViewApi iSmartViewApi2 = this.smartCardApi;
            if (iSmartViewApi2 != null) {
                iSmartViewApi2.onRelease(view);
            }
        }
        this.allowRefreshCardMaps.remove(view);
        this.refreshCardDataMaps.remove(view);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onSizeChange(@NotNull View view, @Nullable Bundle data) {
        Intrinsics.checkNotNullParameter(view, "view");
        Log.d(TAG, "onSizeChange isThemeCard?=" + isThemeCard(view) + ", view =" + view + " data =" + data);
        if (isThemeCard(view)) {
            ISmartViewApi iSmartViewApi = this.themeCardApi;
            if (iSmartViewApi == null) {
                return;
            }
            iSmartViewApi.onSizeChange(view, data);
            return;
        }
        ISmartViewApi iSmartViewApi2 = this.smartCardApi;
        if (iSmartViewApi2 == null) {
            return;
        }
        iSmartViewApi2.onSizeChange(view, data);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Boolean bool = this.allowRefreshCardMaps.get(view);
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        boolean zBooleanValue = bool.booleanValue();
        Log.d(TAG, "onVisible, view=" + view + ", isThemeCard=" + isThemeCard(view) + ", ifAllowCardRefresh=" + zBooleanValue);
        if (zBooleanValue) {
            if (isThemeCard(view)) {
                ISmartViewApi iSmartViewApi = this.themeCardApi;
                if (iSmartViewApi == null) {
                    return;
                }
                iSmartViewApi.onVisible(view);
                return;
            }
            ISmartViewApi iSmartViewApi2 = this.smartCardApi;
            if (iSmartViewApi2 == null) {
                return;
            }
            iSmartViewApi2.onVisible(view);
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void registerErrorCallback(@Nullable ErrorCallback callback) {
        this.errorCallback = callback;
        ISmartViewApi iSmartViewApi = this.themeCardApi;
        if (iSmartViewApi != null) {
            iSmartViewApi.registerErrorCallback(callback);
        }
        ISmartViewApi iSmartViewApi2 = this.smartCardApi;
        if (iSmartViewApi2 == null) {
            return;
        }
        iSmartViewApi2.registerErrorCallback(callback);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void registerUiCallback(@NotNull String cardName, @NotNull CardUICallback callback) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.cardUICallbackMap) {
            this.cardUICallbackMap.put(cardName, callback);
            ISmartViewApi iSmartViewApi = this.themeCardApi;
            if (iSmartViewApi != null) {
                iSmartViewApi.registerUiCallback(cardName, callback);
            }
            ISmartViewApi iSmartViewApi2 = this.smartCardApi;
            if (iSmartViewApi2 != null) {
                iSmartViewApi2.registerUiCallback(cardName, callback);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void releaseOldViewSource(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ISmartViewApi iSmartViewApi = this.smartCardApi;
        if (iSmartViewApi == null) {
            return;
        }
        iSmartViewApi.releaseOldViewSource(view);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    @RequiresApi(24)
    public void sendCardData(@NotNull Context hostContext, @NotNull String cardName, @Nullable View view, @NotNull SmartApiInfo smartApiInfo) {
        Intrinsics.checkNotNullParameter(hostContext, "hostContext");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(smartApiInfo, "smartApiInfo");
        if (view == null || this.allowRefreshCardMaps.getOrDefault(view, Boolean.TRUE).booleanValue()) {
            this.cardApiManager.loadCardApi(hostContext, smartApiInfo, new AnonymousClass1(cardName, view, smartApiInfo));
            return;
        }
        Log.d(TAG, "sendCardData be intercepted, cardName = " + cardName + ", view = " + view + ", smartApiInfo = " + smartApiInfo);
        this.refreshCardDataMaps.put(view, new Triple<>(hostContext, cardName, smartApiInfo));
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    @RequiresApi(24)
    public void setAllowCardRefreshable(boolean ifAllowRefresh, @Nullable View view) {
        Log.d(TAG, "setAllowCardRefreshable ifAllowRefresh =" + ifAllowRefresh + ", view=" + view);
        if (view == null) {
            return;
        }
        this.allowRefreshCardMaps.put(view, Boolean.valueOf(ifAllowRefresh));
        if (!ifAllowRefresh) {
            onInVisible(view);
            return;
        }
        Triple<Context, String, SmartApiInfo> triple = this.refreshCardDataMaps.get(view);
        if (triple != null) {
            Log.d(TAG, Intrinsics.stringPlus("ifAllowRefresh = true, sendCardData again, view=", view));
            sendCardData(triple.getFirst(), triple.getSecond(), view, triple.getThird());
            this.refreshCardDataMaps.remove(view);
        }
        onVisible(view);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void setBindServiceToCPData(@NotNull String cardIdentify, @NotNull String packageName, @NotNull String className) {
        Unit unit;
        Intrinsics.checkNotNullParameter(cardIdentify, "cardIdentify");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(className, "className");
        ISmartViewApi iSmartViewApi = this.smartCardApi;
        if (iSmartViewApi == null) {
            unit = null;
        } else {
            iSmartViewApi.setBindServiceToCPData(cardIdentify, packageName, className);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            if (this.bindInfoList == null) {
                this.bindInfoList = new ArrayList();
            }
            List<BindInfo> list = this.bindInfoList;
            if (list == null) {
                return;
            }
            list.add(new BindInfo(cardIdentify, packageName, className));
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void setCanLog(boolean canLog) {
        this.enableLog = canLog;
        ISmartViewApi iSmartViewApi = this.themeCardApi;
        if (iSmartViewApi != null) {
            iSmartViewApi.setCanLog(canLog);
        }
        ISmartViewApi iSmartViewApi2 = this.smartCardApi;
        if (iSmartViewApi2 == null) {
            return;
        }
        iSmartViewApi2.setCanLog(canLog);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void setUseImageThread(boolean useImageThread) {
        this.enableImageThread = useImageThread;
        ISmartViewApi iSmartViewApi = this.smartCardApi;
        if (iSmartViewApi == null) {
            return;
        }
        iSmartViewApi.setUseImageThread(useImageThread);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void unRegisterUiCallback(@NotNull String cardName) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        synchronized (this.cardUICallbackMap) {
            this.cardUICallbackMap.remove(cardName);
            ISmartViewApi iSmartViewApi = this.themeCardApi;
            if (iSmartViewApi != null) {
                iSmartViewApi.unRegisterUiCallback(cardName);
            }
            ISmartViewApi iSmartViewApi2 = this.smartCardApi;
            if (iSmartViewApi2 != null) {
                iSmartViewApi2.unRegisterUiCallback(cardName);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void unsubscribe(@Nullable String cardName) {
        if (cardName == null) {
            return;
        }
        ISmartViewApi iSmartViewApi = this.themeCardApi;
        if (iSmartViewApi instanceof ThemeCardViewImpl) {
            ThemeCardViewImpl themeCardViewImpl = (ThemeCardViewImpl) iSmartViewApi;
            if (themeCardViewImpl.isThemeCard(cardName)) {
                themeCardViewImpl.unsubscribe(cardName);
                return;
            }
        }
        ISmartViewApi iSmartViewApi2 = this.smartCardApi;
        if (iSmartViewApi2 == null) {
            return;
        }
        iSmartViewApi2.unsubscribe(cardName);
    }
}

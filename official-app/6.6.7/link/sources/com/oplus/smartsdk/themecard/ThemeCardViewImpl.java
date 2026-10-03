package com.oplus.smartsdk.themecard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.annotation.UiThread;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartsdk.CardUICallback;
import com.oplus.smartsdk.ErrorCallback;
import com.oplus.smartsdk.ISmartViewApi;
import com.oplus.smartsdk.InterceptStartActivityCallback;
import com.oplus.smartsdk.R;
import com.oplus.smartsdk.SmartApiInfo;
import com.oplus.smartsdk.SmartEngineManager;
import com.oplus.smartsdk.themecard.ThemeCardViewImpl;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u000212B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010 \u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J*\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\nH\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u00100\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/oplus/smartsdk/themecard/ThemeCardViewImpl;", "Lcom/oplus/smartsdk/ISmartViewApi;", "ctrlFactory", "Lcom/oplus/smartsdk/themecard/ThemeCardViewImpl$KeyguardCtrlFactory;", "(Lcom/oplus/smartsdk/themecard/ThemeCardViewImpl$KeyguardCtrlFactory;)V", "cardUICallbackMap", "", "", "Lcom/oplus/smartsdk/CardUICallback;", "debug", "", "errorCallback", "Lcom/oplus/smartsdk/ErrorCallback;", "interceptStartActivityCallback", "Lcom/oplus/smartsdk/InterceptStartActivityCallback;", "keyguardCtrlMap", "Lcom/oplus/smartsdk/themecard/OplusKeyguardCtrl;", "getCardName", "view", "Landroid/view/View;", "getSupportedMorphSize", "", "", "cardName", "interceptStartActivity", "", "ca", "isThemeCard", "onError", "code", "onInVisible", "onRelease", "onSizeChange", "data", "Landroid/os/Bundle;", "onVisible", "registerErrorCallback", "callback", "registerUiCallback", "removeKeyguardCtrl", "sendCardData", "context", "Landroid/content/Context;", "smartApiInfo", "Lcom/oplus/smartsdk/SmartApiInfo;", "setCanLog", "canLog", "unRegisterUiCallback", "unsubscribe", "Companion", "KeyguardCtrlFactory", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ThemeCardViewImpl implements ISmartViewApi {

    @NotNull
    private static final String TAG = "ThemeCardViewImpl";

    @NotNull
    private final Map<String, CardUICallback> cardUICallbackMap;

    @NotNull
    private final KeyguardCtrlFactory ctrlFactory;
    private boolean debug;

    @Nullable
    private ErrorCallback errorCallback;

    @Nullable
    private InterceptStartActivityCallback interceptStartActivityCallback;

    @NotNull
    private final Map<String, OplusKeyguardCtrl> keyguardCtrlMap;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/smartsdk/themecard/ThemeCardViewImpl$KeyguardCtrlFactory;", "", "createKeyguardCtrl", "Lcom/oplus/smartsdk/themecard/OplusKeyguardCtrl;", "cardName", "", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface KeyguardCtrlFactory {
        @Nullable
        OplusKeyguardCtrl createKeyguardCtrl(@NotNull String cardName);
    }

    public ThemeCardViewImpl(@NotNull KeyguardCtrlFactory keyguardCtrlFactory) {
        Intrinsics.checkNotNullParameter(keyguardCtrlFactory, "ctrlFactory");
        this.ctrlFactory = keyguardCtrlFactory;
        this.cardUICallbackMap = new HashMap();
        this.keyguardCtrlMap = new HashMap();
    }

    private final String getCardName(View view) {
        Object tag = view.getTag(R.id.tag_theme_card_name);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(final String cardName, final int code) {
        Log.e(TAG, "onError cardName=" + cardName + " code=" + code);
        removeKeyguardCtrl(cardName);
        final ErrorCallback errorCallback = this.errorCallback;
        if (errorCallback == null) {
            return;
        }
        SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.gyj
            @Override // java.lang.Runnable
            public final void run() {
                ThemeCardViewImpl.onError$lambda-9$lambda-8(errorCallback, cardName, code);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda-9$lambda-8(ErrorCallback errorCallback, String str, int i) {
        Intrinsics.checkNotNullParameter(errorCallback, "$it");
        Intrinsics.checkNotNullParameter(str, "$cardName");
        errorCallback.onCall(str, i);
    }

    private final void removeKeyguardCtrl(String cardName) {
        Unit unit;
        Log.d(TAG, Intrinsics.stringPlus("removeKeyguardCtrl cardName=", cardName));
        if (cardName.length() == 0) {
            return;
        }
        OplusKeyguardCtrl oplusKeyguardCtrlRemove = this.keyguardCtrlMap.remove(cardName);
        if (oplusKeyguardCtrlRemove == null) {
            unit = null;
        } else {
            oplusKeyguardCtrlRemove.destroy(true);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Log.d(TAG, Intrinsics.stringPlus("removeKeyguardCtrl keyguardCtrl not found! cardName=", cardName));
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    @NotNull
    public List<Integer> getSupportedMorphSize(@Nullable String cardName) {
        Log.d(TAG, Intrinsics.stringPlus("getSupportedMorphSize cardName=", cardName));
        OplusKeyguardCtrl oplusKeyguardCtrl = this.keyguardCtrlMap.get(cardName);
        List<Integer> supportedMorphSize = oplusKeyguardCtrl == null ? null : oplusKeyguardCtrl.getSupportedMorphSize();
        return supportedMorphSize == null ? CollectionsKt.emptyList() : supportedMorphSize;
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void interceptStartActivity(@NotNull InterceptStartActivityCallback ca) {
        Intrinsics.checkNotNullParameter(ca, "ca");
        this.interceptStartActivityCallback = ca;
    }

    public final boolean isThemeCard(@NotNull String cardName) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        return this.keyguardCtrlMap.containsKey(cardName);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onInVisible(@NotNull View view) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "view");
        String cardName = getCardName(view);
        Log.d(TAG, Intrinsics.stringPlus("onInVisible cardName=", cardName));
        OplusKeyguardCtrl oplusKeyguardCtrl = this.keyguardCtrlMap.get(cardName);
        if (oplusKeyguardCtrl == null) {
            unit = null;
        } else {
            oplusKeyguardCtrl.hide();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Log.d(TAG, Intrinsics.stringPlus("onInVisible keyguardCtrl not found! cardName=", cardName));
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onRelease(@NotNull View view) {
        OplusKeyguardCtrl oplusKeyguardCtrl;
        Intrinsics.checkNotNullParameter(view, "view");
        String cardName = getCardName(view);
        Log.d(TAG, Intrinsics.stringPlus("onRelease cardName=", cardName));
        if (cardName == null || (oplusKeyguardCtrl = this.keyguardCtrlMap.get(cardName)) == null || !oplusKeyguardCtrl.release(view)) {
            return;
        }
        Log.d(TAG, Intrinsics.stringPlus("onRelease remove keyguardCtrl cardName=", cardName));
        this.keyguardCtrlMap.remove(cardName);
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onSizeChange(@NotNull View view, @Nullable Bundle data) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "view");
        String cardName = getCardName(view);
        Log.d(TAG, "onSizeChange cardName=" + ((Object) cardName) + ", data " + data);
        OplusKeyguardCtrl oplusKeyguardCtrl = this.keyguardCtrlMap.get(cardName);
        if (oplusKeyguardCtrl == null) {
            unit = null;
        } else {
            oplusKeyguardCtrl.onSizeChange(view, data);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Log.d(TAG, Intrinsics.stringPlus("onSizeChange keyguardCtrl not found! cardName=", cardName));
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void onVisible(@NotNull View view) {
        Unit unit;
        Intrinsics.checkNotNullParameter(view, "view");
        String cardName = getCardName(view);
        Log.d(TAG, Intrinsics.stringPlus("onVisible cardName=", cardName));
        OplusKeyguardCtrl oplusKeyguardCtrl = this.keyguardCtrlMap.get(cardName);
        if (oplusKeyguardCtrl == null) {
            unit = null;
        } else {
            oplusKeyguardCtrl.show();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            Log.d(TAG, Intrinsics.stringPlus("onVisible keyguardCtrl not found! cardName=", cardName));
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void registerErrorCallback(@Nullable ErrorCallback callback) {
        this.errorCallback = callback;
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void registerUiCallback(@NotNull String cardName, @NotNull CardUICallback callback) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.d(TAG, "registerUiCallback cardName=" + cardName + " callback=" + callback);
        synchronized (this.cardUICallbackMap) {
            this.cardUICallbackMap.put(cardName, callback);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void sendCardData(@NotNull Context context, @NotNull final String cardName, @Nullable View view, @NotNull SmartApiInfo smartApiInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(smartApiInfo, "smartApiInfo");
        Log.d(TAG, Intrinsics.stringPlus("sendCardData cardName=", cardName));
        OplusKeyguardCtrl oplusKeyguardCtrlCreateKeyguardCtrl = this.keyguardCtrlMap.get(cardName);
        if (oplusKeyguardCtrlCreateKeyguardCtrl == null && (oplusKeyguardCtrlCreateKeyguardCtrl = this.ctrlFactory.createKeyguardCtrl(cardName)) != null) {
            this.keyguardCtrlMap.put(cardName, oplusKeyguardCtrlCreateKeyguardCtrl);
        }
        if (oplusKeyguardCtrlCreateKeyguardCtrl == null) {
            onError(cardName, 1);
            return;
        }
        Bundle bundle = new Bundle();
        try {
            Bundle extras = smartApiInfo.getExtras();
            if (extras != null) {
                bundle.putAll(extras);
                Object obj = extras.get(Tags.CARD_URI);
                if (obj != null) {
                    if (obj instanceof Parcelable) {
                        bundle.putParcelable(Tags.CARD_URI, (Parcelable) obj);
                    } else if (obj instanceof String) {
                        bundle.putParcelable(Tags.CARD_URI, Uri.parse((String) obj));
                    } else {
                        Log.w(TAG, Intrinsics.stringPlus("sendCardData invalidate uri=", obj));
                    }
                }
            }
            String str = new String(smartApiInfo.getData(), Charsets.UTF_8);
            Log.d(TAG, "sendCardData cardName=" + cardName + " data=" + str + " bundle=" + smartApiInfo.getExtras());
            if (str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(itKeys, "jsonObject.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (Intrinsics.areEqual(Tags.CARD_URI, next)) {
                        bundle.putParcelable(Tags.CARD_URI, Uri.parse(jSONObject.optString(Tags.CARD_URI)));
                    } else {
                        Object objOpt = jSONObject.opt(next);
                        if (objOpt instanceof String) {
                            bundle.putString(next, (String) objOpt);
                        } else if (objOpt instanceof Integer) {
                            bundle.putInt(next, ((Number) objOpt).intValue());
                        } else if (objOpt instanceof Boolean) {
                            bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                        } else if (objOpt instanceof Float) {
                            bundle.putFloat(next, ((Number) objOpt).floatValue());
                        } else if (objOpt instanceof Double) {
                            bundle.putDouble(next, ((Number) objOpt).doubleValue());
                        } else if (objOpt instanceof Long) {
                            bundle.putLong(next, ((Number) objOpt).longValue());
                        }
                    }
                }
            }
            oplusKeyguardCtrlCreateKeyguardCtrl.beInflate(context, bundle, this.debug, new OplusKeyguardCtrl.IKeyguardCallback() { // from class: com.oplus.smartsdk.themecard.ThemeCardViewImpl.sendCardData.3
                @Override // com.oplus.smartsdk.themecard.OplusKeyguardCtrl.IKeyguardCallback
                @UiThread
                public void onLoadFailed(@NotNull String errorMsg) {
                    Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                    Log.e(ThemeCardViewImpl.TAG, "onLoadFailed cardName=" + cardName + ", errorMsg=" + errorMsg);
                    ThemeCardViewImpl.this.onError(cardName, 1);
                }

                @Override // com.oplus.smartsdk.themecard.OplusKeyguardCtrl.IKeyguardCallback
                @UiThread
                public void onLoadView(@NotNull View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Map map = ThemeCardViewImpl.this.cardUICallbackMap;
                    ThemeCardViewImpl themeCardViewImpl = ThemeCardViewImpl.this;
                    String str2 = cardName;
                    synchronized (map) {
                        CardUICallback cardUICallback = (CardUICallback) themeCardViewImpl.cardUICallbackMap.get(str2);
                        Log.d(ThemeCardViewImpl.TAG, "onLoadSuccess cardName=" + str2 + " callback=" + cardUICallback);
                        if (cardUICallback != null) {
                            cardUICallback.onCall(view2, 0, str2);
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                }

                @Override // com.oplus.smartsdk.themecard.OplusKeyguardCtrl.IKeyguardCallback
                @UiThread
                public boolean startActivity(@Nullable View view2, @NotNull Intent intent) {
                    Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
                    Log.d(ThemeCardViewImpl.TAG, "startActivity intent=" + intent + ", callback=" + ThemeCardViewImpl.this.interceptStartActivityCallback);
                    InterceptStartActivityCallback interceptStartActivityCallback = ThemeCardViewImpl.this.interceptStartActivityCallback;
                    if (interceptStartActivityCallback == null) {
                        return false;
                    }
                    interceptStartActivityCallback.onCall(view2, CollectionsKt.listOf(intent), cardName);
                    return true;
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(TAG, Intrinsics.stringPlus("sendCardData json to bundle failed! e: ", th.getMessage()));
            onError(cardName, 1);
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void setCanLog(boolean canLog) {
        this.debug = canLog;
        if (!this.keyguardCtrlMap.isEmpty()) {
            Iterator<OplusKeyguardCtrl> it = this.keyguardCtrlMap.values().iterator();
            while (it.hasNext()) {
                it.next().setDebug(canLog);
            }
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void unRegisterUiCallback(@NotNull String cardName) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Log.d(TAG, Intrinsics.stringPlus("unRegisterUiCallback cardName=", cardName));
        synchronized (this.cardUICallbackMap) {
            this.cardUICallbackMap.remove(cardName);
        }
    }

    @Override // com.oplus.smartsdk.ISmartViewApi
    public void unsubscribe(@Nullable String cardName) {
        Log.d(TAG, Intrinsics.stringPlus("unsubscribe cardName=", cardName));
        if (cardName == null) {
            return;
        }
        removeKeyguardCtrl(cardName);
    }
}

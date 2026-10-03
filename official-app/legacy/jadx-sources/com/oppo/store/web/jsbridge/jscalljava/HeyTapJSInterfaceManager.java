package com.oppo.store.web.jsbridge.jscalljava;

import android.text.TextUtils;
import android.webkit.WebView;
import com.heytap.store.base.core.util.thread.MainLooper;
import com.oppo.store.web.WebBrowserFragment;
import com.oppo.store.web.jsbridge.jscalljava.HeyTapJSInterfaceManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ$\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0016J.\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J.\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u001c\u001a\u00020\u0011J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0006\u0010 \u001a\u00020\u0011J\u0010\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004¨\u0006$"}, d2 = {"Lcom/oppo/store/web/jsbridge/jscalljava/HeyTapJSInterfaceManager;", "Lcom/oppo/store/web/jsbridge/jscalljava/IJSManagerInterface;", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "mJavaScriptInterfaceMap", "", "", "", "sWeakFragmentHandler", "Ljava/lang/ref/WeakReference;", "Lcom/oppo/store/web/WebBrowserFragment;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "getWebFragment", "invokeJavaScriptCallback", "", "jsCallbackMethodName", "code", "", "message", "data", "Lorg/json/JSONObject;", "invokeJavaScriptCallbackInternal", "isHaveBridgeMethod", "", "methodName", "onDestory", "queryJavaScriptInterface", "register", "javaScriptInterface", "registerJavaScriptInterface", "setFragment", "webBrowserFragment", "Companion", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HeyTapJSInterfaceManager implements IJSManagerInterface {

    @NotNull
    private static final String CALLBACK_JS_CODE_NAME = "code";

    @NotNull
    private static final String CALLBACK_JS_DATA_NAME = "data";

    @NotNull
    private static final String CALLBACK_JS_FORMAT = "javascript:%s(%s);";

    @NotNull
    private static final String CALLBACK_JS_MSG_NAME = "msg";

    @NotNull
    private static final String CALLBACK_JS_STATUS_NAME = "status";
    public static final int JS_CALL_JAVA_FAIL = 1;
    public static final int JS_CALL_JAVA_METHOD_FAIL = -999;

    @NotNull
    public static final String JS_CALL_JAVA_METHOD_FAIL_MESSAGE = "不支持的桥接方法";
    public static final int JS_CALL_JAVA_SUCCESS = 0;

    @NotNull
    public static final String JS_INTERFACE_NAME = "oppo_store_native";

    @NotNull
    private final Map<String, Object> mJavaScriptInterfaceMap;

    @Nullable
    private WeakReference<WebBrowserFragment> sWeakFragmentHandler;

    @Nullable
    private WebView webView;
    private static final String TAG = HeyTapJSInterfaceManager.class.getSimpleName();

    /* JADX WARN: Multi-variable type inference failed */
    public HeyTapJSInterfaceManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeJavaScriptCallback$lambda-0, reason: not valid java name */
    public static final void m5258invokeJavaScriptCallback$lambda0(HeyTapJSInterfaceManager this$0, String str, int i, String str2, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invokeJavaScriptCallbackInternal(str, i, str2, jSONObject);
    }

    private final void invokeJavaScriptCallbackInternal(String jsCallbackMethodName, int code, String message, JSONObject data) {
        if (TextUtils.isEmpty(jsCallbackMethodName)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", code);
            jSONObject2.put("msg", message);
            if (data == null) {
                data = new JSONObject();
            }
            jSONObject.put("data", data);
            jSONObject.put("status", jSONObject2);
        } catch (JSONException unused) {
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(CALLBACK_JS_FORMAT, Arrays.copyOf(new Object[]{jsCallbackMethodName, jSONObject.toString()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        WebView webView = getWebView();
        if (webView != null) {
            webView.evaluateJavascript(str, null);
        }
    }

    private final void register(Object javaScriptInterface) {
        Method[] methods = javaScriptInterface.getClass().getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        for (Method method : methods) {
            if (((JSBridgeInterface) method.getAnnotation(JSBridgeInterface.class)) != null) {
                Map<String, Object> map = this.mJavaScriptInterfaceMap;
                String name = method.getName();
                Intrinsics.checkNotNullExpressionValue(name, "method.name");
                map.put(name, javaScriptInterface);
            }
        }
    }

    @Nullable
    public final WebBrowserFragment getWebFragment() {
        WeakReference<WebBrowserFragment> weakReference = this.sWeakFragmentHandler;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.oppo.store.web.jsbridge.jscalljava.IJSManagerInterface
    @Nullable
    public WebView getWebView() {
        return this.webView;
    }

    @Override // com.oppo.store.web.jsbridge.jscalljava.IJSManagerInterface
    public void invokeJavaScriptCallback(@Nullable String jsCallbackMethodName, int code, @Nullable String message) {
        invokeJavaScriptCallback(jsCallbackMethodName, code, message, new JSONObject());
    }

    public final boolean isHaveBridgeMethod(@Nullable String methodName) {
        if (methodName == null || methodName.length() == 0) {
            return false;
        }
        return this.mJavaScriptInterfaceMap.containsKey(methodName);
    }

    public final void onDestory() {
        setWebView(null);
    }

    @Override // com.oppo.store.web.jsbridge.jscalljava.IJSManagerInterface
    @Nullable
    public Object queryJavaScriptInterface(@Nullable String methodName) {
        return this.mJavaScriptInterfaceMap.get(methodName);
    }

    public final void registerJavaScriptInterface() {
        register(new HeyTapUIJSInterface(this));
        register(new HeyTapBusinessJSInterface(this));
    }

    public final void setFragment(@Nullable WebBrowserFragment webBrowserFragment) {
        if (webBrowserFragment != null) {
            this.sWeakFragmentHandler = new WeakReference<>(webBrowserFragment);
        }
    }

    @Override // com.oppo.store.web.jsbridge.jscalljava.IJSManagerInterface
    public void setWebView(@Nullable WebView webView) {
        this.webView = webView;
    }

    public HeyTapJSInterfaceManager(@Nullable WebView webView) {
        this.webView = webView;
        this.mJavaScriptInterfaceMap = new HashMap();
    }

    @Override // com.oppo.store.web.jsbridge.jscalljava.IJSManagerInterface
    public void invokeJavaScriptCallback(@Nullable final String jsCallbackMethodName, final int code, @Nullable final String message, @Nullable final JSONObject data) {
        MainLooper.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.o89
            @Override // java.lang.Runnable
            public final void run() {
                HeyTapJSInterfaceManager.m5258invokeJavaScriptCallback$lambda0(this.i, jsCallbackMethodName, code, message, data);
            }
        });
    }

    public /* synthetic */ HeyTapJSInterfaceManager(WebView webView, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : webView);
    }
}

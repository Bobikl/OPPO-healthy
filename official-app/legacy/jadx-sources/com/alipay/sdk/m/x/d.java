package com.alipay.sdk.m.x;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.eum;
import com.oplus.aiunit.vision.ggm;
import com.oplus.aiunit.vision.ham;
import com.oplus.aiunit.vision.l9m;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.qam;
import com.oplus.aiunit.vision.qgm;
import com.oplus.aiunit.vision.rom;
import com.oplus.aiunit.vision.sgm;
import com.oplus.smartenginehelper.entity.ViewEntity;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes12.dex */
public class d extends com.alipay.sdk.m.x.c implements com.alipay.sdk.m.x.e.f, com.alipay.sdk.m.x.e.g, com.alipay.sdk.m.x.e.h {
    public static final String A = "action";
    public static final String B = "pushWindow";
    public static final String C = "h5JsFuncCallback";
    public static final String D = "sdkInfo";
    public static final String E = "canUseTaoLogin";
    public static final String F = "taoLogin";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f628l = "sdk_result_code:";
    public static final String m = "alipayjsbridge://";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f629n = "onBack";
    public static final String o = "setTitle";
    public static final String p = "onRefresh";
    public static final String q = "showBackButton";
    public static final String r = "onExit";
    public static final String s = "onLoadJs";
    public static final String t = "callNativeFunc";
    public static final String u = "back";
    public static final String v = "title";
    public static final String w = "refresh";
    public static final String x = "backButton";
    public static final String y = "refreshButton";
    public static final String z = "exit";
    public String G;
    public boolean H;
    public final qam I;
    public boolean J;
    public com.alipay.sdk.m.x.e K;
    public eum L;
    public boolean k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.i.finish();
        }
    }

    public class b extends e {
        public final /* synthetic */ com.alipay.sdk.m.x.e i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.alipay.sdk.m.x.e eVar) {
            super(null);
            this.i = eVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.i.c();
            d.this.H = false;
        }
    }

    public class c extends e {
        public final /* synthetic */ com.alipay.sdk.m.x.e i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f631j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.alipay.sdk.m.x.e eVar, String str) {
            super(null);
            this.i = eVar;
            this.f631j = str;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.i);
            d.this.K.f(this.f631j);
            d.this.H = false;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$d, reason: collision with other inner class name */
    public class RunnableC0155d implements Runnable {
        public final /* synthetic */ Activity i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ SslErrorHandler f632j;

        /* JADX INFO: renamed from: com.alipay.sdk.m.x.d$d$a */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            @SensorsDataInstrumented
            public void onClick(DialogInterface dialogInterface, int i) {
                RunnableC0155d.this.f632j.cancel();
                l9m.h(d.this.I, "net", sgm.A, "2");
                qgm.c(qgm.a());
                RunnableC0155d.this.i.finish();
                SensorsDataAutoTrackHelper.trackDialog(dialogInterface, i);
            }
        }

        public RunnableC0155d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.i = activity;
            this.f632j = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            ggm.b(this.i, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    public static abstract class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static class f {
        public final WeakReference<com.alipay.sdk.m.x.e> a;
        public final String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f633c;
        public final JSONObject d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f634e = false;

        public f(com.alipay.sdk.m.x.e eVar, String str, String str2, JSONObject jSONObject) {
            this.a = new WeakReference<>(eVar);
            this.b = str;
            this.f633c = str2;
            this.d = jSONObject;
        }

        public static String a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }

        public void b(JSONObject jSONObject) {
            com.alipay.sdk.m.x.e eVar;
            if (this.f634e || (eVar = (com.alipay.sdk.m.x.e) com.alipay.sdk.m.u.a.i(this.a)) == null) {
                return;
            }
            this.f634e = true;
            eVar.f(String.format("javascript:window.AlipayJSBridge.callBackFromNativeFunc('%s','%s');", a(this.f633c), a(jSONObject.toString())));
        }
    }

    public static class g implements rom.a {
        public final f a;
        public final String b;

        public g(f fVar, String str) {
            this.a = fVar;
            this.b = str;
        }

        @Override // com.oplus.aiunit.vision.rom.a
        public void a(boolean z, JSONObject jSONObject, String str) {
            try {
                this.a.b(new JSONObject().put("success", z).put("random", this.b).put("code", jSONObject).put("status", str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, qam qamVar, String str) {
        super(activity, str);
        this.k = true;
        this.G = "GET";
        this.H = false;
        this.K = null;
        this.L = new eum();
        this.I = qamVar;
        A();
    }

    public final synchronized boolean A() {
        try {
            com.alipay.sdk.m.x.e eVar = new com.alipay.sdk.m.x.e(this.i, this.I, new com.alipay.sdk.m.x.e.C0157e(!l(), !l()));
            this.K = eVar;
            eVar.setChromeProxy(this);
            this.K.setWebClientProxy(this);
            this.K.setWebEventProxy(this);
            addView(this.K);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    public final void B() {
        com.alipay.sdk.m.x.e eVar = this.K;
        if (eVar != null) {
            WebView webView = eVar.getWebView();
            webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
            JSHookAop.loadUrl(webView, "javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    public final synchronized void C() {
        WebView webView = this.K.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            eum eumVar = this.L;
            if (eumVar == null || eumVar.c()) {
                s(false);
            } else {
                y();
            }
        }
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized boolean a(com.alipay.sdk.m.x.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains(f628l)) {
            this.i.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean b(com.alipay.sdk.m.x.e eVar, String str) {
        l9m.c(this.I, sgm.f16581l, "h5ldd", SystemClock.elapsedRealtime() + "|" + com.alipay.sdk.m.u.a.a0(str));
        B();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean c(com.alipay.sdk.m.x.e eVar, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Activity activity = this.i;
            if (activity == null) {
                return true;
            }
            if (com.alipay.sdk.m.u.a.z(this.I, str, activity)) {
                return true;
            }
            if (str.startsWith(m)) {
                v(str.substring(17));
            } else if (TextUtils.equals(str, ham.q)) {
                s(false);
            } else if (str.startsWith("http://") || str.startsWith("https://")) {
                this.K.f(str);
            } else {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    activity.startActivity(intent);
                } catch (Throwable th) {
                    l9m.f(this.I, sgm.f16581l, th);
                }
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean d(com.alipay.sdk.m.x.e eVar, String str) {
        l9m.c(this.I, sgm.f16581l, "h5ld", SystemClock.elapsedRealtime() + "|" + com.alipay.sdk.m.u.a.a0(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            B();
        }
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.f
    public synchronized void e(com.alipay.sdk.m.x.e eVar, String str) {
        if (!str.startsWith("http") && !eVar.getUrl().endsWith(str)) {
            this.K.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean f(com.alipay.sdk.m.x.e eVar, int i, String str, String str2) {
        this.J = true;
        l9m.h(this.I, "net", sgm.y, "onReceivedError:" + i + "|" + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void g(com.alipay.sdk.m.x.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.m.x.e.h
    public synchronized void h(com.alipay.sdk.m.x.e eVar) {
        z();
    }

    @Override // com.alipay.sdk.m.x.e.g
    public synchronized boolean i(com.alipay.sdk.m.x.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.i;
        if (activity == null) {
            return true;
        }
        l9m.h(this.I, "net", sgm.z, "2-" + sslError);
        activity.runOnUiThread(new RunnableC0155d(activity, sslErrorHandler));
        return true;
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized boolean m() {
        Activity activity = this.i;
        if (activity == null) {
            return true;
        }
        if (!l()) {
            if (!this.H) {
                z();
            }
            return true;
        }
        com.alipay.sdk.m.x.e eVar = this.K;
        if (eVar != null && eVar.getWebView() != null) {
            if (!eVar.getWebView().canGoBack()) {
                qgm.c(qgm.a());
                activity.finish();
            } else if (x()) {
                com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.NETWORK_ERROR.b());
                qgm.c(qgm.b(cVarB.b(), cVarB.a(), ""));
                activity.finish();
            }
            return true;
        }
        activity.finish();
        return true;
    }

    @Override // com.alipay.sdk.m.x.c
    public synchronized void n() {
        this.K.c();
        this.L.a();
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.H ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void p(String str) {
        if ("POST".equals(this.G)) {
            this.K.g(str, null);
        } else {
            this.K.f(str);
        }
        com.alipay.sdk.m.x.c.j(this.K.getWebView());
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    public final synchronized void q(String str, String str2, String str3) {
        try {
            com.alipay.sdk.m.x.e eVar = this.K;
            if (eVar == null) {
                return;
            }
            JSONObject jSONObjectX = com.alipay.sdk.m.u.a.X(str3);
            f fVar = new f(eVar, str, str2, jSONObjectX);
            Context context = eVar.getContext();
            try {
                switch (fVar.b) {
                    case "title":
                        if (jSONObjectX.has("title")) {
                            eVar.getTitle().setText(jSONObjectX.optString("title", ""));
                            break;
                        }
                        break;
                    case "refresh":
                        eVar.getWebView().reload();
                        break;
                    case "back":
                        C();
                        break;
                    case "exit":
                        qgm.c(jSONObjectX.optString("result", null));
                        s(jSONObjectX.optBoolean("success", false));
                        break;
                    case "backButton":
                        eVar.getBackButton().setVisibility(jSONObjectX.optBoolean(CardAction.LIFE_CIRCLE_VALUE_SHOW, true) ? 0 : 4);
                        break;
                    case "refreshButton":
                        eVar.getRefreshButton().setVisibility(jSONObjectX.optBoolean(CardAction.LIFE_CIRCLE_VALUE_SHOW, true) ? 0 : 4);
                        break;
                    case "pushWindow":
                        w(jSONObjectX.optString("url"), jSONObjectX.optString("title", ""));
                        break;
                    case "sdkInfo":
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sdk_version", ham.f12086j);
                        jSONObject.put("app_name", this.I.h());
                        jSONObject.put("app_version", this.I.m());
                        fVar.b(jSONObject);
                        break;
                    case "canUseTaoLogin":
                        String url = eVar.getUrl();
                        if (com.alipay.sdk.m.u.a.y(this.I, url)) {
                            JSONObject jSONObject2 = new JSONObject();
                            boolean zC = rom.c(this.I, context);
                            jSONObject2.put(ViewEntity.ENABLED, zC);
                            l9m.c(this.I, sgm.f16581l, sgm.t0, String.valueOf(zC));
                            fVar.b(jSONObject2);
                            break;
                        } else {
                            l9m.h(this.I, sgm.f16581l, "jsUrlErr", url);
                            break;
                        }
                        break;
                    case "taoLogin":
                        String url2 = eVar.getUrl();
                        if (com.alipay.sdk.m.u.a.y(this.I, url2)) {
                            String strOptString = jSONObjectX.optString("random");
                            JSONObject jSONObjectOptJSONObject = jSONObjectX.optJSONObject("options");
                            if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("url");
                                String strOptString3 = jSONObjectOptJSONObject.optString("action");
                                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                    rom.b(this.I, (Activity) context, 1010, strOptString2, strOptString3, new g(fVar, strOptString));
                                }
                            }
                            break;
                        } else {
                            l9m.h(this.I, sgm.f16581l, "jsUrlErr", url2);
                            break;
                        }
                        break;
                }
            } catch (Throwable th) {
                l9m.e(this.I, sgm.f16581l, "jInfoErr", th, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void r(String str, String str2, boolean z2) {
        this.G = str2;
        this.K.getTitle().setText(str);
        this.k = z2;
    }

    public final synchronized void s(boolean z2) {
        qgm.d(z2);
        this.i.finish();
    }

    public final synchronized void v(String str) {
        Map<String, String> mapD = com.alipay.sdk.m.u.a.D(this.I, str);
        if (str.startsWith(t)) {
            q(mapD.get(oea.FUNCTION), mapD.get("cbId"), mapD.get("data"));
        } else if (str.startsWith(f629n)) {
            C();
        } else if (str.startsWith("setTitle") && mapD.containsKey("title")) {
            this.K.getTitle().setText(mapD.get("title"));
        } else if (str.startsWith(p)) {
            this.K.getWebView().reload();
        } else if (str.startsWith(q) && mapD.containsKey("bshow")) {
            this.K.getBackButton().setVisibility(TextUtils.equals(SpeechConstant.TRUE_STR, mapD.get("bshow")) ? 0 : 4);
        } else if (str.startsWith(r)) {
            qgm.c(mapD.get("result"));
            s(TextUtils.equals(SpeechConstant.TRUE_STR, mapD.get("bsucc")));
        } else if (str.startsWith(s)) {
            this.K.f("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    public final synchronized boolean w(String str, String str2) {
        com.alipay.sdk.m.x.e eVar = this.K;
        try {
            com.alipay.sdk.m.x.e eVar2 = new com.alipay.sdk.m.x.e(this.i, this.I, new com.alipay.sdk.m.x.e.C0157e(!l(), !l()));
            this.K = eVar2;
            eVar2.setChromeProxy(this);
            this.K.setWebClientProxy(this);
            this.K.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.K.getTitle().setText(str2);
            }
            this.H = true;
            this.L.b(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.K.setAnimation(translateAnimation);
            addView(this.K);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    public boolean x() {
        return this.J;
    }

    public final synchronized boolean y() {
        if (this.L.c()) {
            this.i.finish();
        } else {
            this.H = true;
            com.alipay.sdk.m.x.e eVar = this.K;
            this.K = this.L.d();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(eVar));
            eVar.setAnimation(translateAnimation);
            removeView(eVar);
            addView(this.K);
        }
        return true;
    }

    public final synchronized void z() {
        Activity activity = this.i;
        com.alipay.sdk.m.x.e eVar = this.K;
        if (activity != null && eVar != null) {
            if (this.k) {
                activity.finish();
            } else {
                eVar.f("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }
}

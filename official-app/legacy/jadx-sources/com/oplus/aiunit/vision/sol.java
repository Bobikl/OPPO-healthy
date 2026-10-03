package com.oplus.aiunit.vision;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.heytap.webview.extension.protocol.Const;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class sol {
    public static final List<sol> g = new CopyOnWriteArrayList();
    public final or9 a;
    public e1a b;
    public final ija d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16675c = 0;
    public int f = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f16676e = new HashMap();

    public sol(or9 or9Var) {
        this.a = or9Var;
        this.d = new ija(or9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("broadcast url: ");
        e1a e1aVar = this.b;
        sb.append(e1aVar != null ? e1aVar.getUrl() : "null");
        sb.append("\n send broadcast: ");
        sb.append(str);
        sb.append("\n arguments: ");
        sb.append(str2);
        m7b.a("WebViewManager", sb.toString());
        for (sol solVar : g) {
            String str3 = solVar.f16676e.get(str);
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("broadcast url: ");
                e1a e1aVar2 = this.b;
                sb2.append(e1aVar2 != null ? e1aVar2.getUrl() : "null");
                sb2.append("\n receive broadcast: ");
                sb2.append(str);
                sb2.append("\n arguments: ");
                sb2.append(str2);
                m7b.a("WebViewManager", sb2.toString());
                String str4 = "window.HeytapJsApi.broadcastReceiver('" + str3 + "', " + str2 + ");";
                e1a e1aVar3 = solVar.b;
                if (e1aVar3 != null) {
                    e1aVar3.e(str4, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("invoke url: ");
        e1a e1aVar = this.b;
        sb.append(e1aVar != null ? e1aVar.getUrl() : "null");
        sb.append("\n method: ");
        sb.append(str);
        sb.append("\n arguments: ");
        sb.append(str2);
        m7b.a("WebViewManager", sb.toString());
        e1a e1aVar2 = this.b;
        lni.h(hg1.a(e1aVar2 != null ? e1aVar2.getUrl() : "null", TextUtils.isEmpty(str) ? "null" : str, TextUtils.isEmpty(str2) ? "null" : str2));
        this.d.c(str, str2, str3 != null ? new r3h(this.f16675c, str3, this, str) : new juc());
    }

    public static /* synthetic */ JSONArray k(String str) throws Exception {
        try {
            return new JSONArray(str);
        } catch (Exception e2) {
            m7b.f("WebViewManager", "Error parsing batch JSON", e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(JSONArray jSONArray) {
        if (jSONArray == null || this.a.getActivity() == null) {
            return;
        }
        v(jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("registerBroadcastReceiver url: ");
        e1a e1aVar = this.b;
        sb.append(e1aVar != null ? e1aVar.getUrl() : "null");
        sb.append("\n register broadcast: ");
        sb.append(str);
        m7b.a("WebViewManager", sb.toString());
        this.f16676e.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("removeBroadcastReceiver url: ");
        e1a e1aVar = this.b;
        sb.append(e1aVar != null ? e1aVar.getUrl() : "null");
        sb.append("\n remove broadcast: ");
        sb.append(str);
        m7b.a("WebViewManager", sb.toString());
        this.f16676e.remove(str);
    }

    @JavascriptInterface
    public void broadcast(final String str, final String str2) {
        mwj.h(new Runnable() { // from class: com.oplus.aiunit.vision.qol
            @Override // java.lang.Runnable
            public final void run() {
                this.i.i(str, str2);
            }
        });
    }

    public void g(long j2, String str, Object obj) {
        e1a e1aVar;
        if (j2 != this.f16675c || (e1aVar = this.b) == null) {
            return;
        }
        e1aVar.e("window.HeytapJsApi.callback('" + str + "', " + obj + ");", null);
    }

    @JavascriptInterface
    public int getNavBarType() {
        return qfc.a(c94.b());
    }

    public final void h(Bundle bundle, Bundle bundle2) {
        e1a e1aVar;
        e1a e1aVar2;
        if (bundle2 != null && (e1aVar2 = this.b) != null) {
            e1aVar2.a(bundle2);
        }
        if (bundle != null) {
            Uri uri = (Uri) bundle.getParcelable("$web_container_fragment_uri");
            HashMap map = (HashMap) bundle.getSerializable("$web_container_fragment_headers");
            if (uri == null || (e1aVar = this.b) == null) {
                return;
            }
            if (map != null) {
                e1aVar.b(uri.toString(), map);
            } else {
                e1aVar.m(uri.toString());
            }
        }
    }

    @JavascriptInterface
    public boolean invoke(final String str, final String str2, final String str3) {
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.nol
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j(str, str2, str3);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        mwj.h(runnable);
        return true;
    }

    @JavascriptInterface
    public void invokeBatch(final String str) {
        if (str != null) {
            mwj.l(new Callable() { // from class: com.oplus.aiunit.vision.lol
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return sol.k(str);
                }
            }, new mwj.b() { // from class: com.oplus.aiunit.vision.mol
                @Override // com.oplus.aiunit.vision.mwj.b
                public final void onResult(Object obj) {
                    this.a.l((JSONArray) obj);
                }
            });
        }
    }

    public final void o() {
        int navBarType = getNavBarType();
        if (navBarType == this.f) {
            return;
        }
        this.f = navBarType;
        e1a e1aVar = this.b;
        if (e1aVar != null) {
            e1aVar.e("window.HeytapJsApi.onNavBarTypeChanged(" + navBarType + ");", null);
        }
    }

    public void p(e1a e1aVar, Bundle bundle, Bundle bundle2) {
        this.b = e1aVar;
        this.f16675c = 0L;
        this.f16676e.clear();
        if (e1aVar != null) {
            e1aVar.addJavascriptInterface(this, Const.ObjectName.JS_API_OBJECT);
        }
        h(bundle, bundle2);
        g.add(this);
    }

    public void q() {
        this.f16675c = 0L;
        e1a e1aVar = this.b;
        if (e1aVar != null) {
            e1aVar.l(Const.ObjectName.JS_API_OBJECT);
        }
        g.remove(this);
        this.f16676e.clear();
        this.b = null;
    }

    public void r() {
        if (this.b != null) {
            this.f16675c = SystemClock.uptimeMillis();
            this.f16676e.clear();
        }
    }

    @JavascriptInterface
    public void registerBroadcastReceiver(final String str, final String str2) {
        mwj.h(new Runnable() { // from class: com.oplus.aiunit.vision.ool
            @Override // java.lang.Runnable
            public final void run() {
                this.i.m(str, str2);
            }
        });
    }

    @JavascriptInterface
    public void removeBroadcastReceiver(final String str) {
        mwj.h(new Runnable() { // from class: com.oplus.aiunit.vision.pol
            @Override // java.lang.Runnable
            public final void run() {
                this.i.n(str);
            }
        });
    }

    public void s() {
        e1a e1aVar = this.b;
        if (e1aVar != null) {
            e1aVar.onPause();
        }
    }

    public void t() {
        e1a e1aVar = this.b;
        if (e1aVar != null) {
            e1aVar.onResume();
        }
        o();
    }

    public void u(Bundle bundle) {
        e1a e1aVar = this.b;
        if (e1aVar != null) {
            e1aVar.d(bundle);
        }
    }

    public final void v(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("method") : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject(Const.Batch.ARGUMENTS) : null;
            String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(Const.Batch.CALLBACK_ID) : null;
            lr9 r3hVar = strOptString2 != null ? new r3h(this.f16675c, strOptString2, this, strOptString) : new juc();
            StringBuilder sb = new StringBuilder();
            sb.append("processBatch url: ");
            e1a e1aVar = this.b;
            sb.append(e1aVar != null ? e1aVar.getUrl() : "null");
            sb.append("\n method: ");
            sb.append(strOptString);
            sb.append("\n arguments: ");
            sb.append(jSONObjectOptJSONObject2);
            m7b.a("WebViewManager", sb.toString());
            this.d.h(strOptString, jSONObjectOptJSONObject2, r3hVar);
        }
    }
}

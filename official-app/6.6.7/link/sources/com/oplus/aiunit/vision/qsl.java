package com.oplus.aiunit.vision;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.oplus.smartenginehelper.ParserTag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class qsl {
    public static final List<qsl> g = new CopyOnWriteArrayList();
    public final us9 a;
    public l2a b;
    public final qka d;
    public long c = 0;
    public int f = -1;
    public final Map<String, String> e = new HashMap();

    public qsl(us9 us9Var) {
        this.a = us9Var;
        this.d = new qka(us9Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("broadcast url: ");
        l2a l2aVar = this.b;
        sb.append(l2aVar != null ? l2aVar.getUrl() : "null");
        sb.append("\n send broadcast: ");
        sb.append(str);
        sb.append("\n arguments: ");
        sb.append(str2);
        y8b.a("WebViewManager", sb.toString());
        for (qsl qslVar : g) {
            String str3 = qslVar.e.get(str);
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("broadcast url: ");
                l2a l2aVar2 = this.b;
                sb2.append(l2aVar2 != null ? l2aVar2.getUrl() : "null");
                sb2.append("\n receive broadcast: ");
                sb2.append(str);
                sb2.append("\n arguments: ");
                sb2.append(str2);
                y8b.a("WebViewManager", sb2.toString());
                String str4 = "window.HeytapJsApi.broadcastReceiver('" + str3 + "', " + str2 + ");";
                l2a l2aVar3 = qslVar.b;
                if (l2aVar3 != null) {
                    l2aVar3.e(str4, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("invoke url: ");
        l2a l2aVar = this.b;
        sb.append(l2aVar != null ? l2aVar.getUrl() : "null");
        sb.append("\n method: ");
        sb.append(str);
        sb.append("\n arguments: ");
        sb.append(str2);
        y8b.a("WebViewManager", sb.toString());
        l2a l2aVar2 = this.b;
        dri.h(wg1.a(l2aVar2 != null ? l2aVar2.getUrl() : "null", TextUtils.isEmpty(str) ? "null" : str, TextUtils.isEmpty(str2) ? "null" : str2));
        this.d.c(str, str2, str3 != null ? new j7h(this.c, str3, this, str) : new bwc());
    }

    public static /* synthetic */ JSONArray k(String str) throws Exception {
        try {
            return new JSONArray(str);
        } catch (Exception e) {
            y8b.f("WebViewManager", "Error parsing batch JSON", e);
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
        l2a l2aVar = this.b;
        sb.append(l2aVar != null ? l2aVar.getUrl() : "null");
        sb.append("\n register broadcast: ");
        sb.append(str);
        y8b.a("WebViewManager", sb.toString());
        this.e.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("removeBroadcastReceiver url: ");
        l2a l2aVar = this.b;
        sb.append(l2aVar != null ? l2aVar.getUrl() : "null");
        sb.append("\n remove broadcast: ");
        sb.append(str);
        y8b.a("WebViewManager", sb.toString());
        this.e.remove(str);
    }

    @JavascriptInterface
    public void broadcast(final String str, final String str2) {
        o0k.h(new Runnable() { // from class: com.oplus.aiunit.vision.osl
            @Override // java.lang.Runnable
            public final void run() {
                this.i.i(str, str2);
            }
        });
    }

    public void g(long j, String str, Object obj) {
        l2a l2aVar;
        if (j != this.c || (l2aVar = this.b) == null) {
            return;
        }
        l2aVar.e("window.HeytapJsApi.callback('" + str + "', " + obj + ");", null);
    }

    @JavascriptInterface
    public int getNavBarType() {
        return ihc.a(q94.b());
    }

    public final void h(Bundle bundle, Bundle bundle2) {
        l2a l2aVar;
        l2a l2aVar2;
        if (bundle2 != null && (l2aVar2 = this.b) != null) {
            l2aVar2.a(bundle2);
        }
        if (bundle != null) {
            Uri uri = (Uri) bundle.getParcelable("$web_container_fragment_uri");
            HashMap map = (HashMap) bundle.getSerializable("$web_container_fragment_headers");
            if (uri == null || (l2aVar = this.b) == null) {
                return;
            }
            if (map != null) {
                l2aVar.b(uri.toString(), map);
            } else {
                l2aVar.m(uri.toString());
            }
        }
    }

    @JavascriptInterface
    public boolean invoke(final String str, final String str2, final String str3) {
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.lsl
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j(str, str2, str3);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
            return true;
        }
        o0k.h(runnable);
        return true;
    }

    @JavascriptInterface
    public void invokeBatch(final String str) {
        if (str != null) {
            o0k.l(new Callable() { // from class: com.oplus.aiunit.vision.jsl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return qsl.k(str);
                }
            }, new o0k.b() { // from class: com.oplus.aiunit.vision.ksl
                @Override // com.oplus.aiunit.vision.o0k.b
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
        l2a l2aVar = this.b;
        if (l2aVar != null) {
            l2aVar.e("window.HeytapJsApi.onNavBarTypeChanged(" + navBarType + ");", null);
        }
    }

    public void p(l2a l2aVar, Bundle bundle, Bundle bundle2) {
        this.b = l2aVar;
        this.c = 0L;
        this.e.clear();
        if (l2aVar != null) {
            l2aVar.addJavascriptInterface(this, "HeytapNativeApi");
        }
        h(bundle, bundle2);
        g.add(this);
    }

    public void q() {
        this.c = 0L;
        l2a l2aVar = this.b;
        if (l2aVar != null) {
            l2aVar.l("HeytapNativeApi");
        }
        g.remove(this);
        this.e.clear();
        this.b = null;
    }

    public void r() {
        if (this.b != null) {
            this.c = SystemClock.uptimeMillis();
            this.e.clear();
        }
    }

    @JavascriptInterface
    public void registerBroadcastReceiver(final String str, final String str2) {
        o0k.h(new Runnable() { // from class: com.oplus.aiunit.vision.msl
            @Override // java.lang.Runnable
            public final void run() {
                this.i.m(str, str2);
            }
        });
    }

    @JavascriptInterface
    public void removeBroadcastReceiver(final String str) {
        o0k.h(new Runnable() { // from class: com.oplus.aiunit.vision.nsl
            @Override // java.lang.Runnable
            public final void run() {
                this.i.n(str);
            }
        });
    }

    public void s() {
        l2a l2aVar = this.b;
        if (l2aVar != null) {
            l2aVar.onPause();
        }
    }

    public void t() {
        l2a l2aVar = this.b;
        if (l2aVar != null) {
            l2aVar.onResume();
        }
        o();
    }

    public void u(Bundle bundle) {
        l2a l2aVar = this.b;
        if (l2aVar != null) {
            l2aVar.d(bundle);
        }
    }

    public final void v(JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString(ParserTag.TAG_METHOD) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("arguments") : null;
            String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("callback_id") : null;
            rs9 j7hVar = strOptString2 != null ? new j7h(this.c, strOptString2, this, strOptString) : new bwc();
            StringBuilder sb = new StringBuilder();
            sb.append("processBatch url: ");
            l2a l2aVar = this.b;
            sb.append(l2aVar != null ? l2aVar.getUrl() : "null");
            sb.append("\n method: ");
            sb.append(strOptString);
            sb.append("\n arguments: ");
            sb.append(jSONObjectOptJSONObject2);
            y8b.a("WebViewManager", sb.toString());
            this.d.h(strOptString, jSONObjectOptJSONObject2, j7hVar);
        }
    }
}

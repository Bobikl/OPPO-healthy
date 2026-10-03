package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.oplus.web.container.engine.config.IWebViewSettings;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface e1a {
    void a(Bundle bundle);

    void addJavascriptInterface(Object obj, String str);

    void b(String str, Map<String, String> map);

    boolean c();

    boolean canGoBack();

    void d(Bundle bundle);

    void destroy();

    void e(String str, wz9<String> wz9Var);

    default void f(g1a g1aVar) {
    }

    void g(qr9 qr9Var);

    Context getContext();

    IWebViewSettings getSettings();

    String getUrl();

    default View getWebView() {
        return null;
    }

    void goBack();

    void h(Object obj);

    void i(Object obj);

    void j();

    void k();

    void l(String str);

    void m(String str);

    qr9 n(String str, String str2, String str3);

    void onDestroy();

    void onPause();

    void onResume();

    void reload();

    default void setBackgroundColor(int i) {
    }

    void setForceDarkAllowed(boolean z);
}

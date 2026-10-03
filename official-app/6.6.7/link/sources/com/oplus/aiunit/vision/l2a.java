package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.oplus.web.container.engine.config.IWebViewSettings;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface l2a {
    void a(Bundle bundle);

    void addJavascriptInterface(Object obj, String str);

    void b(String str, Map<String, String> map);

    boolean c();

    boolean canGoBack();

    void d(Bundle bundle);

    void destroy();

    void e(String str, d1a<String> d1aVar);

    default void f(n2a n2aVar) {
    }

    void g(ws9 ws9Var);

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

    ws9 n(String str, String str2, String str3);

    void onDestroy();

    void onPause();

    void onResume();

    void reload();

    default void setBackgroundColor(int i) {
    }

    void setForceDarkAllowed(boolean z);
}

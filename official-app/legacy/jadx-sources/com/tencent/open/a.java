package com.tencent.open;

import android.net.Uri;
import android.webkit.WebView;
import com.oplus.aiunit.vision.q8g;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public HashMap<String, b> a = new HashMap<>();

    /* JADX INFO: renamed from: com.tencent.open.a$a, reason: collision with other inner class name */
    public static class C1011a {
        public WeakReference<WebView> a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20306c;

        public C1011a(WebView webView, long j2, String str) {
            this.a = new WeakReference<>(webView);
            this.b = j2;
            this.f20306c = str;
        }

        public void a() {
            WebView webView = this.a.get();
            if (webView == null) {
                return;
            }
            String str = "javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':1,'result':'no such method'})";
            webView.loadUrl(str);
            JSHookAop.loadUrl(webView, str);
        }

        public void b(Object obj) {
            String string;
            WebView webView = this.a.get();
            if (webView == null) {
                return;
            }
            if (obj instanceof String) {
                string = "'" + ((Object) ((String) obj).replace("\\", "\\\\").replace("'", "\\'")) + "'";
            } else {
                string = ((obj instanceof Number) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean)) ? obj.toString() : "'undefined'";
            }
            String str = "javascript:window.JsBridge&&JsBridge.callback(" + this.b + ",{'r':0,'result':" + string + "});";
            webView.loadUrl(str);
            JSHookAop.loadUrl(webView, str);
        }

        public void c(String str) {
            WebView webView = this.a.get();
            if (webView != null) {
                String str2 = "javascript:" + str;
                webView.loadUrl(str2);
                JSHookAop.loadUrl(webView, str2);
            }
        }
    }

    public static class b {
        public void call(String str, List<String> list, C1011a c1011a) {
            Method method;
            Object objInvoke;
            Method[] declaredMethods = getClass().getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = declaredMethods[i];
                if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                    break;
                } else {
                    i++;
                }
            }
            if (method == null) {
                if (c1011a != null) {
                    c1011a.a();
                    return;
                }
                return;
            }
            try {
                int size = list.size();
                if (size == 0) {
                    objInvoke = method.invoke(this, new Object[0]);
                } else if (size == 1) {
                    objInvoke = method.invoke(this, list.get(0));
                } else if (size == 2) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1));
                } else if (size == 3) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2));
                } else if (size != 4) {
                    objInvoke = size != 5 ? method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)) : method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                } else {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3));
                }
                Class<?> returnType = method.getReturnType();
                q8g.d("openSDK_LOG.JsBridge", "-->call, result: " + objInvoke + " | ReturnType: " + returnType.getName());
                if (!"void".equals(returnType.getName()) && returnType != Void.class) {
                    if (c1011a == null || !customCallback()) {
                        return;
                    }
                    c1011a.c(objInvoke != null ? objInvoke.toString() : null);
                    return;
                }
                if (c1011a != null) {
                    c1011a.b(null);
                }
            } catch (Exception e2) {
                q8g.g("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e2);
                if (c1011a != null) {
                    c1011a.a();
                }
            }
        }

        public boolean customCallback() {
            return false;
        }
    }

    public void a(b bVar, String str) {
        this.a.put(str, bVar);
    }

    public void b(String str, String str2, List<String> list, C1011a c1011a) {
        q8g.j("openSDK_LOG.JsBridge", "getResult---objName = " + str + " methodName = " + str2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                list.set(i, URLDecoder.decode(list.get(i), "UTF-8"));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        b bVar = this.a.get(str);
        if (bVar != null) {
            q8g.d("openSDK_LOG.JsBridge", "call----");
            bVar.call(str2, list, c1011a);
        } else {
            q8g.d("openSDK_LOG.JsBridge", "not call----objName NOT FIND");
            if (c1011a != null) {
                c1011a.a();
            }
        }
    }

    public boolean c(WebView webView, String str) {
        q8g.j("openSDK_LOG.JsBridge", "-->canHandleUrl---url = " + str);
        if (str == null || !Uri.parse(str).getScheme().equals("jsbridge")) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList((str + "/#").split("/")));
        if (arrayList.size() < 6) {
            return false;
        }
        String str2 = (String) arrayList.get(2);
        String str3 = (String) arrayList.get(3);
        List<String> listSubList = arrayList.subList(4, arrayList.size() - 1);
        C1011a c1011a = new C1011a(webView, 4L, str);
        webView.getUrl();
        b(str2, str3, listSubList, c1011a);
        return true;
    }
}

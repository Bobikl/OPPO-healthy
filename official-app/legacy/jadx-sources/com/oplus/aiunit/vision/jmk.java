package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.heytap.log.consts.BusinessType;
import com.oplus.instant.router.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class jmk {
    public List<rz9> a;

    public static class a implements rz9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.rz9
        public boolean a(WebView webView, String str) {
            a7b.f("UrlDispatcher", "FileHandler onIntercept:" + k99.a(str));
            if (!str.endsWith(".pdf") && !str.endsWith(".apk")) {
                return false;
            }
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        }
    }

    public static class b implements rz9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.rz9
        public boolean a(WebView webView, String str) {
            a7b.f("UrlDispatcher", "LinkHandler onIntercept:" + k99.a(str));
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                try {
                    Uri uri = Uri.parse(str);
                    if (uri != null && uri.getScheme() != null && uri.getScheme().startsWith(mmd.OPERATION_PREFIX)) {
                        z = true;
                    }
                    if (z) {
                        mmd.c().a(uri, null);
                    }
                } catch (Exception unused) {
                }
            }
            return z;
        }
    }

    public static class c implements rz9 {
        public List<String> a;

        public c(String[] strArr) {
            this.a = Arrays.asList(strArr);
        }

        @Override // com.oplus.aiunit.vision.rz9
        public boolean a(WebView webView, String str) {
            try {
                a7b.f("UrlDispatcher", "SchemaHandler onIntercept:" + k99.a(str));
                if (!this.a.contains(Uri.parse(str).getScheme())) {
                    return false;
                }
                webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return true;
            } catch (Exception e2) {
                a7b.b("UrlDispatcher", "onIntercept e:" + e2.getMessage());
                return false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jmk(rz9... rz9VarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        if (rz9VarArr != null) {
            arrayList.addAll(Arrays.asList(rz9VarArr));
        }
        a(new a());
        a(new b());
        a(new c(new String[]{"alipays", "weixin", "hap", Instant.SCHEME_OAPS, "oppostore", BusinessType.MARKET, "chinaunicom"}));
    }

    public void a(rz9 rz9Var) {
        if (this.a.contains(rz9Var)) {
            return;
        }
        this.a.add(rz9Var);
    }

    public boolean b(WebView webView, String str) {
        List<rz9> list;
        if (!TextUtils.isEmpty(str) && (list = this.a) != null) {
            Iterator<rz9> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(webView, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}

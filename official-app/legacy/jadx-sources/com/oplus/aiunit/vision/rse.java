package com.oplus.aiunit.vision;

import android.webkit.WebResourceResponse;
import com.heytap.webpro.preload.InterceptorResponse;

/* JADX INFO: loaded from: classes3.dex */
public class rse {
    public final int a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16338c;
    public final WebResourceResponse d;

    public rse(InterceptorResponse interceptorResponse, String str) {
        this(interceptorResponse.getCode(), interceptorResponse.getMsg(), str, null);
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public WebResourceResponse c() {
        return this.d;
    }

    public rse(int i, String str, String str2) {
        this(i, str, str2, null);
    }

    public rse(String str, WebResourceResponse webResourceResponse) {
        this(0, null, str, webResourceResponse);
    }

    public rse(int i, String str, String str2, WebResourceResponse webResourceResponse) {
        this.a = i;
        this.b = str;
        this.f16338c = str2;
        this.d = webResourceResponse;
    }
}

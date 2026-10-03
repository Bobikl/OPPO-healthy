package com.oplus.aiunit.vision;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class ymk {
    public static String a(String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            m7b.f(ymk.class.getSimpleName(), "getHost error!", e2);
            url = null;
        }
        return (url != null && url.getUserInfo() == null) ? url.getHost() : "";
    }
}

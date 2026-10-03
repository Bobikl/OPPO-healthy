package com.oplus.aiunit.vision;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class drk {
    public static String a(String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (IllegalArgumentException | MalformedURLException e) {
            y8b.f(drk.class.getSimpleName(), "getHost error!", e);
            url = null;
        }
        return (url != null && url.getUserInfo() == null) ? url.getHost() : "";
    }
}

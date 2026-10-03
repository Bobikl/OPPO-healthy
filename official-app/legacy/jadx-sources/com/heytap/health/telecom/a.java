package com.heytap.health.telecom;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public class a {

    /* JADX INFO: renamed from: com.heytap.health.telecom.a$a, reason: collision with other inner class name */
    public interface InterfaceC0655a<T> {
        void accept(T t);
    }

    public static void a(InterfaceC0655a<String> interfaceC0655a, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        interfaceC0655a.accept(str);
    }
}

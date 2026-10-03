package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class f8h {
    public static List<Object> a = new CopyOnWriteArrayList();
    public static Application b;

    public static void a(Context context) {
        if (context instanceof Application) {
            b = (Application) context;
        } else {
            b = (Application) context.getApplicationContext();
        }
        b();
    }

    public static void b() {
        a.add(new dp());
        a.add(new r2e());
        a.add(new xwc());
        a.add(new qyl());
        a.add(new hwl());
        a.add(new pyl());
    }
}

package com.oplus.aiunit.vision;

import android.app.Application;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class xbh {
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
        a.add(new lp());
        a.add(new o4e());
        a.add(new pyc());
        a.add(new o2m());
        a.add(new f0m());
        a.add(new n2m());
    }
}

package com.oplus.aiunit.vision;

import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class ktm implements itm {
    public static Map<String, a> a = new ConcurrentHashMap();

    public class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13411c;
        public final AtomicInteger d = new AtomicInteger(0);

        public a(int i, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.f13411c = i;
        }

        public final int a() {
            return this.d.incrementAndGet();
        }
    }

    public static void b(int i, String str, String str2, int i2) {
        if (i == 0) {
            l1n.c(xsm.t()).h(k1n.b(str, str2 + " counter " + i2));
        } else {
            l1n.c(xsm.t()).h(k1n.b(str, str2 + " counter " + i2));
        }
        if (gtm.b) {
            d(i, str, str2 + " counter " + i2);
        }
    }

    public static String c(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static void d(int i, String str, String str2) {
        if (i == 0) {
            Log.i("linklog", str + " " + str2);
            return;
        }
        Log.e("linklog", str + " " + str2);
    }

    @Override // com.oplus.aiunit.vision.itm
    public final void a(int i, String str, String str2) {
        try {
            String strC = c(i, str, str2);
            a aVar = a.get(strC);
            if (aVar == null) {
                aVar = new a(i, str, str2);
                a.put(strC, aVar);
            }
            if (aVar.a() > 100) {
                b(aVar.f13411c, aVar.a, aVar.b, aVar.d.get());
                a.remove(strC);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.oplus.aiunit.vision.itm
    public final void a() {
        try {
            Iterator<Map.Entry<String, a>> it = a.entrySet().iterator();
            while (it.hasNext()) {
                a value = it.next().getValue();
                if (value != null) {
                    b(value.f13411c, value.a, value.b, value.d.get());
                }
            }
            a.clear();
            l1n.c(xsm.t()).e();
        } catch (Throwable unused) {
        }
    }
}

package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.maps.model.LatLng;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class arm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9477c = false;
    public static volatile arm d;
    public Hashtable<String, String> a = new Hashtable<>();
    public WeakReference<Context> b = null;

    public static arm a() {
        if (d == null) {
            synchronized (arm.class) {
                if (d == null) {
                    d = new arm();
                }
            }
        }
        return d;
    }

    public static void e(boolean z) {
        f9477c = z;
    }

    public static void f() {
        if (d != null) {
            if (d.a != null && d.a.size() > 0) {
                synchronized (d.a) {
                    d.h();
                    if (d.b != null) {
                        d.b.clear();
                    }
                }
            }
            d = null;
        }
        e(false);
    }

    public static boolean g() {
        return f9477c;
    }

    public final void b(Context context) {
        if (context != null) {
            this.b = new WeakReference<>(context);
        }
    }

    public final void c(LatLng latLng, String str, String str2) {
        if (!f9477c) {
            this.a.clear();
            return;
        }
        if (latLng == null || TextUtils.isEmpty(str)) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(n04.OPEN_BRACE_REGEX);
        stringBuffer.append("\"lon\":");
        stringBuffer.append(latLng.longitude);
        stringBuffer.append(",");
        stringBuffer.append("\"lat\":");
        stringBuffer.append(latLng.latitude);
        stringBuffer.append(",");
        stringBuffer.append("\"title\":\"");
        stringBuffer.append(str);
        stringBuffer.append("\",");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        stringBuffer.append("\"snippet\":\"");
        stringBuffer.append(str2);
        stringBuffer.append("\"");
        stringBuffer.append("}");
        d(stringBuffer.toString());
    }

    public final void d(String str) {
        Hashtable<String, String> hashtable;
        if (str == null || (hashtable = this.a) == null) {
            return;
        }
        synchronized (hashtable) {
            String strD = t0n.d(str);
            Hashtable<String, String> hashtable2 = this.a;
            if (hashtable2 != null && !hashtable2.contains(strD)) {
                this.a.put(strD, str);
            }
            if (i()) {
                h();
            }
        }
    }

    public final void h() {
        WeakReference<Context> weakReference;
        if (!f9477c) {
            this.a.clear();
            return;
        }
        if (this.a != null) {
            StringBuffer stringBuffer = new StringBuffer();
            int size = this.a.size();
            if (size > 0) {
                stringBuffer.append("[");
                Iterator<String> it = this.a.values().iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    stringBuffer.append(it.next());
                    if (i < size) {
                        stringBuffer.append(",");
                    }
                }
                stringBuffer.append("]");
                String string = stringBuffer.toString();
                if (!TextUtils.isEmpty(string) && (weakReference = this.b) != null && weakReference.get() != null) {
                    u3n.a(string, this.b.get());
                }
            }
            this.a.clear();
        }
    }

    public final boolean i() {
        Hashtable<String, String> hashtable = this.a;
        return hashtable != null && hashtable.size() > 20;
    }
}

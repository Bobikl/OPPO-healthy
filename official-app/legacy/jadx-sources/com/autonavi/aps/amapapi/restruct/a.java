package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.oplus.aiunit.vision.q0n;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a<T> {
    public String a;
    private File b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f1116e;
    private String f;
    private boolean g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1115c = false;
    private Map<String, C0166a> d = new ConcurrentHashMap();
    private Runnable h = new Runnable() { // from class: com.autonavi.aps.amapapi.restruct.a.2
        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.f1115c) {
                if (a.this.g) {
                    a.this.e();
                    a.e(a.this);
                }
                if (a.this.f1116e != null) {
                    a.this.f1116e.postDelayed(a.this.h, 60000L);
                }
            }
        }
    };

    /* JADX INFO: renamed from: com.autonavi.aps.amapapi.restruct.a$a, reason: collision with other inner class name */
    public static class C0166a {
        int a;
        long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f1117c;

        public C0166a(int i, long j2, long j3) {
            this.a = i;
            this.b = j2;
            this.f1117c = j3;
        }
    }

    public a(Context context, String str, Handler handler) {
        this.f = null;
        if (context == null) {
            return;
        }
        this.f1116e = handler;
        this.a = TextUtils.isEmpty(str) ? "unknow" : str;
        this.f = com.autonavi.aps.amapapi.utils.k.l(context);
        try {
            this.b = new File(context.getFilesDir().getPath(), this.a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d();
    }

    public static int a(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static /* synthetic */ boolean e(a aVar) {
        aVar.g = false;
        return false;
    }

    public abstract void a(T t, long j2);

    public abstract long b();

    public abstract String b(T t);

    public abstract int c(T t);

    public abstract long c();

    public abstract long d(T t);

    private void b(T t, long j2) {
        if (t == null || d(t) < 0) {
            return;
        }
        String strB = b(t);
        C0166a c0166a = this.d.get(strB);
        if (c0166a == null) {
            a(t, j2);
            this.d.put(strB, new C0166a(c(t), d(t), j2));
            this.g = true;
            return;
        }
        c0166a.f1117c = j2;
        if (c0166a.a == c(t)) {
            a(t, c0166a.b);
            return;
        }
        a(t, j2);
        c0166a.a = c(t);
        c0166a.b = d(t);
        this.g = true;
    }

    private void d() {
        try {
            Iterator<String> it = com.autonavi.aps.amapapi.utils.k.a(this.b).iterator();
            while (it.hasNext()) {
                try {
                    String[] strArrSplit = new String(com.autonavi.aps.amapapi.security.a.b(q0n.g(it.next()), this.f), "UTF-8").split(",");
                    this.d.put(strArrSplit[0], new C0166a(Integer.parseInt(strArrSplit[1]), Long.parseLong(strArrSplit[2]), strArrSplit.length >= 4 ? Long.parseLong(strArrSplit[3]) : com.autonavi.aps.amapapi.utils.k.b()));
                } catch (Throwable th) {
                    if (this.b.exists()) {
                        this.b.delete();
                    }
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (c() > 0) {
            this.d.size();
            if (b() > 0) {
                long jB = com.autonavi.aps.amapapi.utils.k.b();
                Iterator<Map.Entry<String, C0166a>> it = this.d.entrySet().iterator();
                while (it.hasNext()) {
                    if (jB - this.d.get(it.next().getKey()).f1117c > b()) {
                        it.remove();
                    }
                }
            }
            if (this.d.size() > c()) {
                ArrayList arrayList = new ArrayList(this.d.keySet());
                Collections.sort(arrayList, new Comparator<String>() { // from class: com.autonavi.aps.amapapi.restruct.a.1
                    /* JADX INFO: Access modifiers changed from: private */
                    @Override // java.util.Comparator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public int compare(String str, String str2) {
                        return a.a(((C0166a) a.this.d.get(str2)).f1117c, ((C0166a) a.this.d.get(str)).f1117c);
                    }
                });
                for (int iC = (int) c(); iC < arrayList.size(); iC++) {
                    this.d.remove(arrayList.get(iC));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, C0166a> entry : this.d.entrySet()) {
            try {
                sb.append(q0n.f(com.autonavi.aps.amapapi.security.a.a((entry.getKey() + "," + entry.getValue().a + "," + entry.getValue().b + "," + entry.getValue().f1117c).getBytes("UTF-8"), this.f)) + Weather.SEPARATOR);
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        com.autonavi.aps.amapapi.utils.k.a(this.b, string);
    }

    public final void a() {
        Handler handler;
        if (!this.f1115c && (handler = this.f1116e) != null) {
            handler.removeCallbacks(this.h);
            this.f1116e.postDelayed(this.h, 60000L);
        }
        this.f1115c = true;
    }

    public final void a(boolean z) {
        Handler handler = this.f1116e;
        if (handler != null) {
            handler.removeCallbacks(this.h);
        }
        if (!z) {
            this.h.run();
        }
        this.f1115c = false;
    }

    public final void a(T t) {
        b(t, com.autonavi.aps.amapapi.utils.k.b());
    }

    public final void a(List<T> list) {
        long jB = com.autonavi.aps.amapapi.utils.k.b();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), jB);
        }
        if (this.d.size() >= list.size()) {
            this.g = true;
        }
        if (this.d.size() > 16384 || c() <= 0) {
            this.d.clear();
            for (T t : list) {
                this.d.put(b(t), new C0166a(c(t), d(t), jB));
            }
        }
    }
}

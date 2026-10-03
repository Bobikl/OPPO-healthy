package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class ji0 {
    public opa a;
    public final AtomicBoolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap<String, Long> f12913c;

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f12914j;

        public a(String str, long j2) {
            this.i = str;
            this.f12914j = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ji0.this.a.putLong(this.i, this.f12914j);
        }
    }

    public static class b {
        public static final ji0 a = new ji0();
    }

    public static ji0 c() {
        return b.a;
    }

    public final void a() {
        if (this.b.get()) {
            return;
        }
        z6b.u("AssignNumberManager", "AssignNumberManager not initialized, call init() first");
        d();
    }

    public long b(String str) {
        long jLongValue;
        a();
        synchronized (this.f12913c) {
            Long l2 = this.f12913c.get(str);
            jLongValue = 1;
            if (l2 != null) {
                if (l2.longValue() >= 9223372036854710272L) {
                    z6b.k("AssignNumberManager", "Counter for appId[" + str + "] reached MAX_VALUE, reset to 0");
                } else {
                    jLongValue = 1 + l2.longValue();
                }
            }
            this.f12913c.put(str, Long.valueOf(jLongValue));
        }
        e(str, jLongValue);
        z6b.k("AssignNumberManager", "Assigned sequence number [" + jLongValue + "] for appId[" + str + "]");
        return jLongValue;
    }

    public synchronized void d() {
        if (this.b.get()) {
            return;
        }
        opa opaVarH = tpe.h(w56.h(), "drs_app_storage");
        this.a = opaVarH;
        String[] strArrKeys = opaVarH.keys();
        if (strArrKeys == null || strArrKeys.length <= 0) {
            z6b.k("AssignNumberManager", "inited counter is empty");
        } else {
            for (String str : strArrKeys) {
                this.f12913c.put(str, Long.valueOf(this.a.getLong(str, 0L)));
            }
        }
        this.b.set(true);
    }

    public final void e(String str, long j2) {
        if (this.a == null || TextUtils.isEmpty(str)) {
            return;
        }
        u56.b().execute(new a(str, j2));
    }

    public ji0() {
        this.a = null;
        this.b = new AtomicBoolean(false);
        this.f12913c = new ConcurrentHashMap<>();
    }
}

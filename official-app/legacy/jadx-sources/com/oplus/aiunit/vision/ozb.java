package com.oplus.aiunit.vision;

import com.heytap.weather.vo.MethodVO;

/* JADX INFO: loaded from: classes3.dex */
public class ozb {
    public static volatile ozb d;
    public MethodVO a = null;
    public final long b = 604800000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15122c = System.currentTimeMillis();

    public static ozb c() {
        if (d == null) {
            synchronized (ozb.class) {
                if (d == null) {
                    d = new ozb();
                }
            }
        }
        return d;
    }

    public long a() {
        return 604800000L;
    }

    public long b() {
        return this.f15122c;
    }

    public MethodVO d() {
        return this.a;
    }

    public Boolean e() {
        return System.currentTimeMillis() - this.f15122c > 604800000 ? Boolean.TRUE : Boolean.FALSE;
    }

    public Boolean f() {
        return this.a == null ? Boolean.TRUE : Boolean.FALSE;
    }

    public void g(long j2) {
        this.f15122c = j2;
    }

    public void h(MethodVO methodVO) {
        this.a = methodVO;
    }
}

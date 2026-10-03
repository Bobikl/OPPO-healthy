package com.oplus.aiunit.vision;

import com.garmin.fit.Fit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class s05 implements Comparable<s05> {
    public static final long INVALID = Fit.UINT32_INVALID.longValue();
    public static final long MIN = 268435456;
    public static final long OFFSET = 631065600000L;
    public static final Map<Long, String> k;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f16418j;

    static {
        HashMap map = new HashMap();
        k = map;
        map.put(Long.valueOf(MIN), "MIN");
    }

    public s05(long j2) {
        this.i = j2;
        this.f16418j = 0.0d;
    }

    public void b(double d) {
        d(new s05(0L, d));
    }

    public void d(s05 s05Var) {
        this.i += s05Var.l().longValue();
        double dDoubleValue = this.f16418j + s05Var.i().doubleValue();
        this.f16418j = dDoubleValue;
        this.i += (long) Math.floor(dDoubleValue);
        double d = this.f16418j;
        this.f16418j = d - ((double) ((float) Math.floor(d)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(s05 s05Var) {
        if (this.i == s05Var.l().longValue()) {
            return Double.compare(this.f16418j, s05Var.i().doubleValue());
        }
        return this.i > s05Var.l().longValue() ? 1 : -1;
    }

    public void g(long j2) {
        long j3 = this.i;
        if (j3 < MIN) {
            this.i = j3 + j2;
        }
    }

    public Date h() {
        return new Date((this.i * 1000) + Math.round(this.f16418j * 1000.0d) + OFFSET);
    }

    public Double i() {
        return new Double(this.f16418j);
    }

    public Long l() {
        return new Long(this.i);
    }

    public String toString() {
        return h().toString();
    }

    public s05(Date date) {
        this.i = (date.getTime() - OFFSET) / 1000;
        this.f16418j = ((date.getTime() - OFFSET) % 1000) / 1000.0d;
    }

    public s05(s05 s05Var) {
        this(s05Var.l().longValue(), s05Var.i().doubleValue());
    }

    public s05(long j2, double d) {
        this.i = j2 + ((long) Math.floor(d));
        this.f16418j = d - Math.floor(d);
    }
}

package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class tv4 {
    public long a = 0;
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17166c = 0;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17167e = 0;
    public String f = "{}";
    public String g = "{}";
    public long h = 0;
    public long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17168j = "{}";
    public long k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f17169l = 0;
    public String m = "{}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f17170n = "{}";
    public long o = 0;
    public String p = "{}";
    public String q = "0";
    public int r = 0;
    public long s = System.currentTimeMillis();
    public long t = System.currentTimeMillis();

    public void A(String str) {
        this.p = str;
    }

    public void B(long j2) {
        this.s = j2;
    }

    public void C(long j2) {
        this.f17166c = j2;
    }

    public void D(String str) {
        this.g = str;
    }

    public void E(String str) {
        this.f17168j = str;
    }

    public void F(long j2) {
        this.a = j2;
    }

    public void G(long j2) {
        this.f17167e = j2;
    }

    public void H(int i) {
        this.r = i;
    }

    public void I(String str) {
        this.q = str;
    }

    public void J(int i) {
        this.d = i;
    }

    public void K(long j2) {
        this.t = j2;
    }

    public void L(long j2) {
        this.k = j2;
    }

    public void M(String str) {
        this.m = str;
    }

    public void N(long j2) {
        this.f17169l = j2;
    }

    public void O(String str) {
        this.f17170n = str;
    }

    public void P(long j2) {
        this.o = j2;
    }

    public void Q(String str) {
        this.f = str;
    }

    public String a() {
        return this.b;
    }

    public long b() {
        return this.h;
    }

    public long c() {
        return this.i;
    }

    public String d() {
        return this.p;
    }

    public double e() {
        long j2 = this.f17167e;
        if (j2 == 0) {
            return 100.0d;
        }
        return (this.o * 100.0d) / j2;
    }

    public long f() {
        return this.s;
    }

    public long g() {
        return this.f17166c;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.f17168j;
    }

    public long j() {
        return this.a;
    }

    public double k() {
        if (this.f17167e == 0) {
            return 0.0d;
        }
        return (p() * 100.0d) / this.f17167e;
    }

    public long l() {
        return this.f17167e;
    }

    public int m() {
        return this.r;
    }

    public String n() {
        return this.q;
    }

    public int o() {
        return this.d;
    }

    public long p() {
        return this.f17167e - this.o;
    }

    public long q() {
        return this.t;
    }

    public long r() {
        return this.k;
    }

    public String s() {
        return this.m;
    }

    public long t() {
        return this.f17169l;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", this.b);
            jSONObject.put("event_time", this.f17166c);
            jSONObject.put("source_process", this.d);
            jSONObject.put("received_count", this.f17167e);
            jSONObject.put("validation_failed_reasons", this.f);
            jSONObject.put("filtered_reasons", this.g);
            jSONObject.put("cached_count", this.h);
            jSONObject.put("cached_pending_count", this.i);
            jSONObject.put("flow_control_reasons", this.f17168j);
            jSONObject.put("upload_attempt_count", this.k);
            jSONObject.put("upload_request_count", this.f17169l);
            jSONObject.put("upload_failed_reasons", this.m);
            jSONObject.put("upload_retry_distribution", this.f17170n);
            jSONObject.put("uploaded_count", this.o);
            jSONObject.put("clear_reasons", this.p);
            jSONObject.put("sequence_id", this.q);
            jSONObject.put("record_date", this.r);
            jSONObject.put("completeness_rate", String.format("%.2f", Double.valueOf(e())));
            jSONObject.put("loss_rate", String.format("%.2f", Double.valueOf(k())));
            return jSONObject.toString();
        } catch (Exception unused) {
            return String.format("DataReconciliationEntity[appId=%s, eventTime=%d, recordDate=%d]", this.b, Long.valueOf(this.f17166c), Integer.valueOf(this.r));
        }
    }

    public String u() {
        return this.f17170n;
    }

    public long v() {
        return this.o;
    }

    public String w() {
        return this.f;
    }

    public void x(String str) {
        this.b = str;
    }

    public void y(long j2) {
        this.h = j2;
    }

    public void z(long j2) {
        this.i = j2;
    }
}

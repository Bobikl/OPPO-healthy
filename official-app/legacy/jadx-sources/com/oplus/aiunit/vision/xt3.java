package com.oplus.aiunit.vision;

import com.heytap.httpdns.webkit.extension.util.DnsEnv;
import com.heytap.httpdns.webkit.extension.util.DnsLogLevel;

/* JADX INFO: loaded from: classes19.dex */
public class xt3 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18752c;
    public final xq9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18753e;
    public final DnsEnv f;
    public final DnsLogLevel g;
    public final op9 h;
    public Boolean i;

    public static class b {
        public String a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18754c;
        public xq9 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f18755e;
        public DnsEnv f;
        public DnsLogLevel g;
        public op9 h;
        public String b = "";
        public Boolean i = Boolean.FALSE;

        public static /* synthetic */ fmi d(b bVar) {
            bVar.getClass();
            return null;
        }

        public xt3 k() {
            return new xt3(this);
        }

        public b l(DnsEnv dnsEnv) {
            this.f = dnsEnv;
            return this;
        }

        public b m(String str) {
            this.b = str;
            return this;
        }

        public b n(op9 op9Var) {
            this.h = op9Var;
            return this;
        }

        public b o(DnsLogLevel dnsLogLevel) {
            this.g = dnsLogLevel;
            return this;
        }

        public b p(String str) {
            this.f18754c = str;
            return this;
        }

        public b q(xq9 xq9Var) {
            this.d = xq9Var;
            return this;
        }
    }

    public xt3(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f18752c = bVar.f18754c;
        b.d(bVar);
        this.d = bVar.d;
        this.f18753e = bVar.f18755e;
        this.f = bVar.f;
        this.h = bVar.h;
        this.g = bVar.g;
        this.i = bVar.i;
    }
}

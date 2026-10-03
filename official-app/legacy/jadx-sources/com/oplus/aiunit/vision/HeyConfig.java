package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.SSLSessionCache;
import com.heytap.common.LogLevel;
import com.heytap.httpdns.env.ApiEnv;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes18.dex */
public class HeyConfig {
    public final Context a;
    public final ApiEnv b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9144c;
    public final LogLevel d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r7b.b f9145e;
    public final String f;
    public final String g;
    public final mj9 h;
    public final AllnetDnsConfig i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IPv6Config f9146j;
    public final AppTraceConfig k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HttpStatConfig f9147l;
    public final kz9 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9148n;
    public final SSLSessionCache o;
    public final File p;
    public final String q;
    public final String r;
    public final String s;
    public final ExecutorService t;
    public final o95 u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final int y;
    public final Boolean z;

    public static class Builder {
        public String a = "";
        public ApiEnv b = ApiEnv.RELEASE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LogLevel f9149c = LogLevel.LEVEL_WARNING;
        public String d = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9150e = "";
        public mj9 f = new mj9(false);
        public AllnetDnsConfig g = new AllnetDnsConfig(false, "", "", "", null);
        public IPv6Config h = new IPv6Config(true, 0, "", "", "IPv6");
        public AppTraceConfig i = new AppTraceConfig(true, 0, ne0.TAG);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public HttpStatConfig f9151j = new HttpStatConfig(true, null);
        public kz9 k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f9152l = null;
        public SSLSessionCache m = null;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public File f9153n = null;
        public r7b.b o = null;
        public String p = null;
        public ExecutorService q = null;
        public String r = "";
        public String s = "";
        public o95 t = null;
        public Boolean u;
        public Boolean v;
        public Boolean w;
        public int x;
        public Boolean y;

        public Builder() {
            Boolean bool = Boolean.FALSE;
            this.u = bool;
            this.v = bool;
            this.w = Boolean.TRUE;
            this.x = 0;
            this.y = bool;
        }

        public HeyConfig a(Context context) {
            b();
            return new HeyConfig(this, context);
        }

        public final void b() {
            if (this.h.getIpv6ConfigId() != 0) {
                IPv6Config iPv6Config = this.h;
                iPv6Config.d(Long.toString(iPv6Config.getIpv6ConfigId()));
            }
            if (this.d.isEmpty() || this.h.getIpv6ConfigCode().isEmpty()) {
                this.h.e(false);
            }
            if (this.i.getTraceConfigId() != 0) {
                AppTraceConfig appTraceConfig = this.i;
                appTraceConfig.e(Long.toString(appTraceConfig.getTraceConfigId()));
            }
            if (this.d.isEmpty() || this.i.getTraceConfigCode().isEmpty()) {
                this.i.d(false);
            }
            if (this.d.isEmpty() && this.u.booleanValue()) {
                this.u = Boolean.FALSE;
            }
            if ((this.f.getEnable() || this.g.getEnable()) && this.f.getRegion().isEmpty()) {
                throw new IllegalArgumentException("you should set region code when enable httpDns");
            }
        }

        public Builder c(ApiEnv apiEnv) {
            this.b = apiEnv;
            return this;
        }

        public Builder d(LogLevel logLevel) {
            this.f9149c = logLevel;
            return this;
        }

        public Builder e(File file) throws IOException {
            this.f9153n = file;
            return this;
        }

        public Builder f(int i) {
            this.x = i;
            return this;
        }

        public Builder g() {
            System.setProperty("taphttp.platform", "conscrypt");
            return this;
        }
    }

    public SSLSessionCache a() {
        return this.o;
    }

    public File b() {
        return this.p;
    }

    public int c() {
        return this.y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HeyConfig)) {
            return super.equals(obj);
        }
        HeyConfig heyConfig = (HeyConfig) obj;
        return heyConfig.b.equals(this.b) && heyConfig.d.equals(this.d) && heyConfig.h.equals(this.h) && heyConfig.k.equals(this.k) && heyConfig.i.equals(this.i) && heyConfig.f9146j.equals(this.f9146j) && heyConfig.f9144c.equals(this.f9144c);
    }

    public int hashCode() {
        int iHashCode = ((((((super.hashCode() * 31) + this.b.hashCode()) * 31) + this.f9144c.hashCode()) * 31) + this.d.hashCode()) * 31;
        r7b.b bVar = this.f9145e;
        return ((((((((((((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + Long.valueOf(this.f).hashCode()) * 31) + Long.valueOf(this.g).hashCode()) * 31) + this.i.hashCode()) * 31) + this.f9146j.hashCode()) * 31) + this.k.hashCode();
    }

    public String toString() {
        return "appId=" + this.f9144c + ",apiEnv:" + this.b + ",logLevel:" + this.d + ",cloudProudctId:" + this.f + ",cloudRegion:" + this.g + ",httpDnsConfig:" + this.h + ",extDns:" + this.i + ",ipv6:" + this.f9146j + ",apptrace:" + this.k + ",enableQuic:" + this.w;
    }

    public HeyConfig() {
        this(new Builder());
    }

    public HeyConfig(Builder builder) {
        this(builder, null);
    }

    public HeyConfig(Builder builder, Context context) {
        this.a = context;
        this.f9144c = builder.a;
        this.b = builder.b;
        this.d = builder.f9149c;
        this.f = builder.d;
        this.g = builder.f9150e;
        this.h = builder.f;
        this.i = builder.g;
        this.f9146j = builder.h;
        this.k = builder.i;
        this.f9147l = builder.f9151j;
        this.m = builder.k;
        this.f9148n = builder.f9152l;
        this.o = builder.m;
        this.p = builder.f9153n;
        this.f9145e = builder.o;
        this.s = builder.p;
        this.t = builder.q;
        this.q = builder.r;
        this.r = builder.s;
        this.u = builder.t;
        this.v = builder.u;
        this.w = builder.v;
        this.x = builder.w;
        this.y = builder.x;
        this.z = builder.y;
    }
}

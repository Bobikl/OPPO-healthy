package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.seedling.sdk.plugin.SeedlingConstants;

/* JADX INFO: loaded from: classes12.dex */
@u2n(a = "a")
public final class v0n {

    @v2n(a = "a1", b = 6)
    public String a;

    @v2n(a = "a2", b = 6)
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @v2n(a = "a6", b = 2)
    public int f17656c;

    @v2n(a = "a3", b = 6)
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @v2n(a = "a4", b = 6)
    public String f17657e;

    @v2n(a = "a5", b = 6)
    public String f;
    public String g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17658j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String[] f17659l;

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17660c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17661e = true;
        public String f = SeedlingConstants.PluginFilePath.FOLDER_SDK_STANDARD;
        public String[] g = null;

        public a(String str, String str2, String str3) {
            this.a = str2;
            this.b = str2;
            this.d = str3;
            this.f17660c = str;
        }

        public final a a(String str) {
            this.b = str;
            return this;
        }

        public final a b(boolean z) {
            this.f17661e = z;
            return this;
        }

        public final a c(String[] strArr) {
            if (strArr != null) {
                this.g = (String[]) strArr.clone();
            }
            return this;
        }

        public final v0n d() throws com.amap.api.col.p0003sl.ik {
            if (this.g != null) {
                return new v0n(this, (byte) 0);
            }
            throw new com.amap.api.col.p0003sl.ik("sdk packages is null");
        }
    }

    public /* synthetic */ v0n(a aVar, byte b) {
        this(aVar);
    }

    public static String b(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(";");
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String[] d(String str) {
        try {
            return str.split(";");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f17658j) && !TextUtils.isEmpty(this.a)) {
            this.f17658j = w0n.t(this.a);
        }
        return this.f17658j;
    }

    public final void c(boolean z) {
        this.f17656c = z ? 1 : 0;
    }

    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (v0n.class != obj.getClass()) {
            return false;
        }
        try {
            return this.f17658j.equals(((v0n) obj).f17658j) && this.g.equals(((v0n) obj).g) && this.h.equals(((v0n) obj).h);
        } catch (Throwable unused) {
        }
    }

    public final String f() {
        if (TextUtils.isEmpty(this.h) && !TextUtils.isEmpty(this.b)) {
            this.h = w0n.t(this.b);
        }
        return this.h;
    }

    public final String g() {
        if (TextUtils.isEmpty(this.k) && !TextUtils.isEmpty(this.f)) {
            this.k = w0n.t(this.f);
        }
        if (TextUtils.isEmpty(this.k)) {
            this.k = SeedlingConstants.PluginFilePath.FOLDER_SDK_STANDARD;
        }
        return this.k;
    }

    public final boolean h() {
        return this.f17656c == 1;
    }

    public final String[] i() {
        String[] strArr = this.f17659l;
        if ((strArr == null || strArr.length == 0) && !TextUtils.isEmpty(this.f17657e)) {
            this.f17659l = d(w0n.t(this.f17657e));
        }
        return (String[]) this.f17659l.clone();
    }

    public v0n() {
        this.f17656c = 1;
        this.f17659l = null;
    }

    public v0n(a aVar) {
        this.f17656c = 1;
        this.f17659l = null;
        this.g = aVar.a;
        this.h = aVar.b;
        this.f17658j = aVar.f17660c;
        this.i = aVar.d;
        this.f17656c = aVar.f17661e ? 1 : 0;
        this.k = aVar.f;
        this.f17659l = aVar.g;
        this.b = w0n.p(this.h);
        this.a = w0n.p(this.f17658j);
        this.d = w0n.p(this.i);
        this.f17657e = w0n.p(b(this.f17659l));
        this.f = w0n.p(this.k);
    }
}

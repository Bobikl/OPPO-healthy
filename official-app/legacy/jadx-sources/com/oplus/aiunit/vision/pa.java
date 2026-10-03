package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.account.config.AcAccountConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class pa {
    public final Context a;
    public final WeakReference<Context> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15278c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15279e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;

    public static final class b {
        public final Context a;
        public final WeakReference<Context> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15280c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f15281e;
        public String f;
        public String g;
        public int h;
        public String i;

        public b j(String str) {
            this.d = str;
            return this;
        }

        public b k(String str) {
            this.f15281e = str;
            return this;
        }

        public pa l() {
            return new pa(this);
        }

        public b m(String str) {
            this.f = str;
            return this;
        }

        public b n(String str) {
            this.g = str;
            return this;
        }

        public b o(int i) {
            this.h = i;
            return this;
        }

        public b p(String str) {
            this.i = str;
            return this;
        }

        public b q(String str) {
            this.f15280c = str;
            return this;
        }

        public b(Context context, WeakReference<Context> weakReference) {
            this.a = context;
            this.b = weakReference;
        }
    }

    public static pa a(Context context, WeakReference<Context> weakReference, String str, String str2, String str3) {
        String appK = "";
        AcAccountConfig acAccountConfigA = i8.a(str2 != null ? str2 : "");
        if (acAccountConfigA != null && acAccountConfigA.getAppK() != null) {
            appK = acAccountConfigA.getAppK();
        }
        return b(context, weakReference, str, str2, appK, str3);
    }

    public static pa b(Context context, WeakReference<Context> weakReference, String str, String str2, String str3, String str4) {
        b bVar = new b(context, weakReference);
        if (str == null) {
            str = "";
        }
        b bVarQ = bVar.q(str);
        if (str2 == null) {
            str2 = "";
        }
        b bVarJ = bVarQ.j(str2);
        if (str3 == null) {
            str3 = "";
        }
        b bVarO = bVarJ.k(str3).m(o8.d(context)).n(o8.e(context)).o(o8.f(context));
        if (str4 == null) {
            str4 = "";
        }
        return bVarO.p(str4).l();
    }

    public static pa c(Context context, WeakReference<Context> weakReference, Context context2, String str, String str2, String str3) {
        String appK = "";
        AcAccountConfig acAccountConfigA = i8.a(str2 != null ? str2 : "");
        if (acAccountConfigA != null && acAccountConfigA.getAppK() != null) {
            appK = acAccountConfigA.getAppK();
        }
        return d(context, weakReference, context2, str, str2, appK, str3);
    }

    public static pa d(Context context, WeakReference<Context> weakReference, Context context2, String str, String str2, String str3, String str4) {
        b bVar = new b(context, weakReference);
        if (str == null) {
            str = "";
        }
        b bVarQ = bVar.q(str);
        if (str2 == null) {
            str2 = "";
        }
        b bVarJ = bVarQ.j(str2);
        if (str3 == null) {
            str3 = "";
        }
        b bVarO = bVarJ.k(str3).m(o8.d(context2)).n(o8.e(context2)).o(o8.f(context2));
        if (str4 == null) {
            str4 = "";
        }
        return bVarO.p(str4).l();
    }

    public String e() {
        return this.d;
    }

    public String f() {
        return this.f15279e;
    }

    public Context g() {
        return this.a;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public String k() {
        return this.i;
    }

    public String l() {
        return this.f15278c;
    }

    public WeakReference<Context> m() {
        return this.b;
    }

    public pa(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f15278c = bVar.f15280c;
        this.d = bVar.d;
        this.f15279e = bVar.f15281e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
    }
}

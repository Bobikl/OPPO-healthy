package com.heytap.msp.ipc.interceptor;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public Context a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f7320c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable f7321e;
    public int f;

    public static class a {
        public Context a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f7322c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Parcelable f7323e;
        public int f;

        public b a() {
            return new b(this.a, this.b, this.f7322c, this.d, this.f7323e, this.f);
        }

        public a b(String str) {
            this.b = str;
            return this;
        }

        public a c(Context context) {
            this.a = context;
            return this;
        }

        public a d(Bundle bundle) {
            this.f7322c = bundle;
            return this;
        }

        public a e(int i) {
            this.f = i;
            return this;
        }

        public a f(String str) {
            this.d = str;
            return this;
        }

        public a g(Parcelable parcelable) {
            this.f7323e = parcelable;
            return this;
        }
    }

    public b(Context context, String str, Bundle bundle, String str2, Parcelable parcelable, int i) {
        this.a = context;
        this.b = str;
        this.f7320c = bundle;
        this.d = str2;
        this.f7321e = parcelable;
        this.f = i;
    }

    public Context a() {
        return this.a;
    }

    public int b() {
        return this.f;
    }

    public String c() {
        return this.d;
    }

    public Parcelable d() {
        return this.f7321e;
    }
}

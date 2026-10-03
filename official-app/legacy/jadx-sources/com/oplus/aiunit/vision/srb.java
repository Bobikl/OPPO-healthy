package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.net.Uri;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes15.dex */
public class srb {
    public Uri a;
    public ContentValues b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16721c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16722e;
    public String f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16723j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f16724l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16725n;
    public String o;
    public String p;
    public int q;

    @SuppressLint({"ObsoleteSdkInt"})
    public static abstract class a<T extends a<T, K>, K extends srb> {
        public Uri a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16726c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f16727e;
        public int f;
        public int g;
        public int h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f16728j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f16729l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f16730n;
        public String o;
        public int p;
        public ContentValues q = new ContentValues();

        public a(Uri uri) {
            this.a = uri;
        }

        public T q(String str) {
            this.q.put("_display_name", str);
            this.d = str;
            return this;
        }

        public T r(String str) {
            this.q.put("mime_type", str);
            this.i = str;
            return this;
        }

        @RequiresApi(api = 29)
        public T s(String str) {
            this.q.put("relative_path", str);
            this.m = str;
            return this;
        }
    }

    public srb(a aVar) {
        this.f16722e = aVar.d;
        this.f16725n = aVar.m;
        this.f16723j = aVar.i;
        this.i = aVar.h;
        this.q = aVar.p;
        this.a = aVar.a;
        this.p = aVar.o;
        this.o = aVar.f16730n;
        this.m = aVar.f16729l;
        this.f16724l = aVar.k;
        this.k = aVar.f16728j;
        this.h = aVar.g;
        this.g = aVar.f;
        this.f = aVar.f16727e;
        this.d = aVar.f16726c;
        this.f16721c = aVar.b;
        this.b = aVar.q;
    }

    public Uri a() {
        return this.a;
    }

    public ContentValues b() {
        return this.b;
    }
}

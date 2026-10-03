package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class eim {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f10946c;

    public static class b {
        public static final /* synthetic */ boolean d = true;
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, String> f10947c;

        public b() {
        }

        public b a(String str) {
            this.b = str.toLowerCase();
            return this;
        }

        public b b(String str, String str2) {
            if (this.f10947c == null) {
                this.f10947c = new HashMap();
            }
            this.f10947c.put(str, str2);
            return this;
        }

        public eim c() {
            if (d || TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
                return new eim(this);
            }
            throw new AssertionError();
        }

        public b e(String str) {
            this.a = str;
            return this;
        }
    }

    public eim(b bVar) {
        this.f10946c = bVar.f10947c;
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public static b d() {
        return new b();
    }

    public Map<String, String> a() {
        return this.f10946c;
    }

    public String b() {
        return this.b.toUpperCase();
    }

    public String c() {
        return this.a;
    }
}

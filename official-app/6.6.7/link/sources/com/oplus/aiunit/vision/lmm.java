package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lmm {
    public String a;
    public String b;
    public Map<String, String> c;

    public static class b {
        public static final /* synthetic */ boolean d = true;
        public String a;
        public String b;
        public Map<String, String> c;

        public b() {
        }

        public b a(String str) {
            this.b = str.toLowerCase();
            return this;
        }

        public b b(String str, String str2) {
            if (this.c == null) {
                this.c = new HashMap();
            }
            this.c.put(str, str2);
            return this;
        }

        public lmm c() {
            if (d || TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
                return new lmm(this);
            }
            throw new AssertionError();
        }

        public b e(String str) {
            this.a = str;
            return this;
        }
    }

    public lmm(b bVar) {
        this.c = bVar.c;
        this.a = bVar.a;
        this.b = bVar.b;
    }

    public static b d() {
        return new b();
    }

    public Map<String, String> a() {
        return this.c;
    }

    public String b() {
        return this.b.toUpperCase();
    }

    public String c() {
        return this.a;
    }
}

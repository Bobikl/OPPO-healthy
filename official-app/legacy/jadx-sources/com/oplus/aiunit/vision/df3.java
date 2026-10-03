package com.oplus.aiunit.vision;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class df3 {
    public static final int ENV_DEBUG = 1;
    public static final int ENV_RELEASE = 0;
    public static final int HEADER_FLAG_GUID = 4;
    public static final int HEADER_FLAG_IMEI = 1;
    public static final int HEADER_FLAG_PCBA = 2;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10538c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10539e;
    public JSONObject f;
    public String g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10540j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10541l;

    public String a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public String c() {
        return this.g;
    }

    public JSONObject d() {
        return this.f;
    }

    public df3(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f10538c = bVar.f10542c;
        this.d = bVar.d;
        this.f10539e = bVar.f10543e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.f10540j = bVar.f10544j;
        this.k = bVar.k;
        this.f10541l = bVar.f10545l;
    }

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10542c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10543e;
        public JSONObject f;
        public String g;
        public String h;
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f10544j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10545l;

        public b(String str, String str2, String str3) {
            this.a = "";
            this.b = "";
            this.f10542c = false;
            this.d = false;
            this.f10543e = false;
            this.f = new JSONObject();
            this.g = "";
            this.h = "";
            this.i = "";
            this.f10544j = zz4.JOURNAL_SIZE_LIMIT_LOW;
            this.k = 0;
            if (str2 == null || str2.length() == 0) {
                throw new IllegalArgumentException("appKey can't be empty");
            }
            if (str3 == null || str3.length() == 0) {
                throw new IllegalArgumentException("appSecret can't be empty");
            }
            this.h = str2;
            this.i = str3;
            if (str == null || str.length() <= 0) {
                return;
            }
            this.a = str;
            this.b = str;
        }

        public df3 m() {
            return new df3(this);
        }

        public b n(String str) {
            if (str != null) {
                this.g = str;
            }
            return this;
        }

        public b o(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f = jSONObject;
            }
            return this;
        }

        public b p(boolean z) {
            this.f10543e = z;
            return this;
        }

        public b q(boolean z) {
            this.f10542c = z;
            return this;
        }

        public b r(boolean z) {
            this.d = z;
            return this;
        }

        public b s(long j2) {
            this.f10544j = j2;
            return this;
        }

        public b(String str, String str2, String str3, String str4) {
            this(str, str3, str4);
            if (str2 == null || str2.length() <= 0) {
                return;
            }
            this.b = str2;
        }
    }
}

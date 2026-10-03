package com.heytap.omas.omkms.data;

import android.text.TextUtils;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    private String a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7607c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f7608e;
    private Omkms3.WBKeyIndex f;
    private Omkms3.UAKIndex g;
    private String h;
    private long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f7609j;

    public static class a {
        private String b;
        private Omkms3.WBKeyIndex g;
        private Omkms3.UAKIndex h;
        private String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f7612j;
        private String k;
        private final String a = "HeaderConfig";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7610c = 1;
        private String d = "EncryptedData";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f7611e = "SignedData";
        private String f = "WB";

        public a a(int i) {
            this.f7610c = i;
            return this;
        }

        public a c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("nonce cannot be null or empty.");
            }
            this.k = str;
            return this;
        }

        public a d(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("requestId cannot be null or empty.");
            }
            this.b = str;
            return this;
        }

        public a e(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("signature cannot be null or empty.");
            }
            this.f7611e = str;
            return this;
        }

        public a f(String str) {
            this.i = str;
            return this;
        }

        public a a(long j2) {
            if (j2 <= 0) {
                throw new IllegalArgumentException("Unix system time must not < 0.");
            }
            this.f7612j = j2;
            return this;
        }

        public a b(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("keyType cannot be null or empty.");
            }
            this.f = str;
            return this;
        }

        public a a(Omkms3.UAKIndex uAKIndex) {
            if (TextUtils.isEmpty(this.d)) {
                throw new IllegalArgumentException("encryptType cannot be null or empty.");
            }
            this.h = uAKIndex;
            return this;
        }

        public a a(Omkms3.WBKeyIndex wBKeyIndex) {
            if (wBKeyIndex == null) {
                throw new IllegalArgumentException("wbKeyIndex cannot be null.");
            }
            this.g = wBKeyIndex;
            return this;
        }

        public a a(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("encryptType cannot be null or empty.");
            }
            this.d = str;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c() {
        this.b = 1;
        this.f7607c = "EncryptedData";
        this.d = "SignedData";
        this.f7608e = "WB";
    }

    public static a k() {
        return new a();
    }

    public String a() {
        return this.f7607c;
    }

    public String b() {
        return this.f7608e;
    }

    public String c() {
        return this.f7609j;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.d;
    }

    public long f() {
        return this.i;
    }

    public Omkms3.UAKIndex g() {
        return this.g;
    }

    public String h() {
        return this.h;
    }

    public int i() {
        return this.b;
    }

    public Omkms3.WBKeyIndex j() {
        return this.f;
    }

    public c(a aVar) {
        this.b = 1;
        this.f7607c = "EncryptedData";
        this.d = "SignedData";
        this.f7608e = "WB";
        this.a = aVar.b;
        this.b = aVar.f7610c;
        this.f7607c = aVar.d;
        this.d = aVar.f7611e;
        this.f7608e = aVar.f;
        this.f = aVar.g;
        this.g = aVar.h;
        this.h = aVar.i;
        this.i = aVar.f7612j;
        this.f7609j = aVar.k;
    }
}

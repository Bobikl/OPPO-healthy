package com.heytap.omas.omkms.data;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private h a;
    private byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f7613c;

    public static final class b {
        private h a;
        private byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f7614c;

        private b(h hVar) {
            this.a = hVar;
        }

        public b a(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        public b b(byte[] bArr) {
            this.f7614c = bArr;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    private d(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f7613c = bVar.f7614c;
    }

    public static b a(@NonNull h hVar) {
        if (hVar != null) {
            return new b(hVar);
        }
        throw new IllegalArgumentException("userInitParamSpec cannot be null.");
    }

    public h b() {
        return this.a;
    }

    public byte[] c() {
        return this.f7613c;
    }

    public String toString() {
        return "InitParamData{{userInitParamSpec=" + this.a.toString() + "}, hash=" + Arrays.toString(this.b) + ", pkgInfo=" + Arrays.toString(this.f7613c) + '}';
    }

    public byte[] a() {
        return this.b;
    }
}

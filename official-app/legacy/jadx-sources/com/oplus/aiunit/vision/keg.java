package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class keg {
    public List<a> a;
    public int b;

    public static class a {
        public UUID a;
        public byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f13250c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f13251e;
        public int f = -1;
        public byte[] g;
        public byte[] h;

        public String a() {
            return this.f13251e;
        }

        public String b() {
            return this.d;
        }

        public byte[] c() {
            return this.g;
        }

        public byte[] d() {
            return this.h;
        }

        public int e() {
            return this.f;
        }

        public byte[] f() {
            return this.b;
        }

        public byte[] g() {
            return this.f13250c;
        }

        public UUID h() {
            return this.a;
        }

        public boolean i() {
            return this.f > 0 && this.g != null;
        }

        public void j(String str) {
            this.f13251e = str;
        }

        public void k(int i, byte[] bArr) {
            this.f = i;
            this.g = bArr;
            this.h = null;
        }

        public void l(UUID uuid) {
            this.a = uuid;
            this.b = null;
            this.f13250c = null;
        }
    }

    public static class b {
        public int a = 10000;
        public List<a> b = new ArrayList();

        public b a(a aVar) {
            if (aVar != null) {
                this.b.add(aVar);
            }
            return this;
        }

        public keg b() {
            keg kegVar = new keg();
            if (this.b.size() > 0) {
                kegVar.a = this.b;
            }
            kegVar.b = this.a;
            return kegVar;
        }

        public b c(int i) {
            this.a = i;
            return this;
        }
    }

    public List<a> c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

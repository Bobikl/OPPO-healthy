package com.oplus.aiunit.vision;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class y26 {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18844c;
    public Map<String, Object> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18845e;

    public y26(String str, String str2, Map<String, Object> map) {
        this(str, str2, true, map);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public Map<String, Object> c() {
        return this.d;
    }

    public String d() {
        return this.f18845e;
    }

    public boolean e() {
        return this.f18844c;
    }

    public void f(String str) {
        this.a = str;
    }

    public String toString() {
        return "DownloadResource{dirPath='" + this.a + "', filePath='" + this.b + "', needUnzip=" + this.f18844c + ", params=" + this.d + '}';
    }

    public y26(String str, boolean z, Map<String, Object> map) {
        this("", str, z, map);
    }

    public y26(String str, String str2, boolean z, Map<String, Object> map) {
        this.f18844c = true;
        this.f18845e = UUID.randomUUID().toString();
        this.a = str;
        this.b = str2;
        this.f18844c = z;
        this.d = map;
    }
}

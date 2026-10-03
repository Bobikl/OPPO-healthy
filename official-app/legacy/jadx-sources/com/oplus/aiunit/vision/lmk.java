package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class lmk {
    public static final int LOAD_DATA = 100;
    public lmk a;
    public List<lmk> b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13768c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13769e;

    public lmk(String str) {
        this.f13768c = str;
    }

    public void a(lmk lmkVar) {
        this.b.add(0, lmkVar);
    }

    public String b() {
        return this.d;
    }

    public lmk c() {
        return this.a;
    }

    public List<lmk> d() {
        return this.b;
    }

    public int e() {
        return this.f13769e;
    }

    public String f() {
        return this.f13768c;
    }

    public void g(lmk lmkVar) {
        if (this.b.contains(lmkVar)) {
            this.b.remove(lmkVar);
        }
    }

    public void h(lmk lmkVar) {
        this.a = lmkVar;
    }

    @NonNull
    public String toString() {
        return "UrlInfo---url: " + f() + ", type: " + e() + ", extra: " + b();
    }

    public lmk(String str, int i, String str2) {
        this.f13768c = str;
        this.f13769e = i;
        this.d = str2;
    }
}

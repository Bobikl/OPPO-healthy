package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public class kie {
    public boolean a = true;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13297c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13298e;

    public kie(int i, int i2) {
        this.b = i;
        this.f13297c = i2;
        this.d = i;
        this.f13298e = i2;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.f13298e;
    }

    public boolean c() {
        return this.a;
    }

    public void d(boolean z) {
        this.a = z;
    }

    @NonNull
    public String toString() {
        return "PhotoCrop{isCrop=" + this.a + ", aspectX=" + this.b + ", aspectY=" + this.f13297c + ", outputX=" + this.d + ", outputY=" + this.f13298e + '}';
    }
}

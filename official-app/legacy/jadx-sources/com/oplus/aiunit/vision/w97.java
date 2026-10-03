package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class w97 extends aa7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18165c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18166e;
    public double f;
    public double g;
    public String h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<da7> f18167j;
    public ArrayList<p2j> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Profile$Type f18168l;
    public boolean m;

    public w97(w97 w97Var) {
        super(w97Var);
        if (w97Var != null) {
            this.f18165c = w97Var.f18165c;
            this.d = w97Var.d;
            this.f18166e = w97Var.f18166e;
            this.f18168l = w97Var.f18168l;
            this.f = w97Var.f;
            this.g = w97Var.g;
            this.h = w97Var.h;
            this.i = w97Var.i;
            this.f18167j = w97Var.f18167j;
            this.k = w97Var.k;
            this.m = w97Var.m;
            return;
        }
        this.f18165c = "unknown";
        this.d = 255;
        this.f18166e = 0;
        this.f18168l = Profile$Type.ENUM;
        this.f = 1.0d;
        this.g = 0.0d;
        this.h = "";
        this.i = false;
        this.a = new ArrayList<>();
        this.f18167j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.m = false;
    }

    @Override // com.oplus.aiunit.vision.aa7
    public p2j B(int i) {
        if (i < 0 || i >= this.k.size()) {
            return null;
        }
        return this.k.get(i);
    }

    @Override // com.oplus.aiunit.vision.aa7
    public int C() {
        return this.f18166e;
    }

    public boolean R() {
        return this.i;
    }

    public int S() {
        return this.d;
    }

    public void T(boolean z) {
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.aa7
    public String h() {
        return this.f18165c;
    }

    @Override // com.oplus.aiunit.vision.aa7
    public double s() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.aa7
    public double v() {
        return this.f;
    }

    public w97(String str, int i, int i2, double d, double d2, String str2, boolean z, Profile$Type profile$Type) {
        this.f18165c = str;
        this.d = i;
        this.f18166e = i2;
        this.f18168l = profile$Type;
        this.f = d;
        this.g = d2;
        this.h = str2;
        this.i = z;
        this.f18167j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.m = false;
    }
}

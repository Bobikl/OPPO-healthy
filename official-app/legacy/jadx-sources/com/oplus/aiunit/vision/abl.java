package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class abl {

    @SerializedName(TypedValues.CycleType.S_WAVE_OFFSET)
    int a;

    @SerializedName("size")
    int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("token")
    String f9287c;

    @SerializedName("start")
    int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("id")
    int f9288e;

    @SerializedName("type")
    int f;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public void d(int i) {
        this.a = i;
    }

    public void e(int i) {
        this.b = i;
    }

    public void f(int i) {
        this.d = i;
    }

    public void g(String str) {
        this.f9287c = str;
    }
}

package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class ofd {

    @SerializedName("deviceType")
    private Integer a;

    @SerializedName("versionType")
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("model")
    private String f14927c;

    public Integer a() {
        return this.a;
    }

    public String b() {
        return this.f14927c;
    }

    public int c() {
        return this.b;
    }

    public void d(String str) {
        this.f14927c = str;
    }

    public void e(int i) {
        this.b = i;
    }
}

package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class wt3 {

    @SerializedName(fkj.PARAM_SWITCH_STATUS)
    public int a;

    @SerializedName("customConfig")
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(t04.DEVICE_UNIQUE_ID)
    public String f18391c = ilj.e();

    @SerializedName("switchType")
    public int d;

    public wt3(int i) {
        this.d = i;
    }

    public boolean a() {
        return this.a == 0;
    }

    public wt3 b(boolean z) {
        this.a = !z ? 1 : 0;
        return this;
    }
}

package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class orf {

    @SerializedName("appList")
    List<aqf> a;
    public int b;

    public List<aqf> a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return "ResAppListOpenSourceStatement{appList=" + this.a + ", resultCode=" + this.b + '}';
    }
}

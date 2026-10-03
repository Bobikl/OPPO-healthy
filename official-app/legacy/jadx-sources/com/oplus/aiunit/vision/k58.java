package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class k58 {

    @SerializedName("appPackages")
    List<String> a;

    @SerializedName("deviceImei")
    String b;

    public void a(List<String> list) {
        this.a = list;
    }

    public void b(String str) {
        this.b = str;
    }

    public String toString() {
        return "GetAppIconsReq{appPackages=" + this.a + ", deviceImei='" + this.b + "'}";
    }
}

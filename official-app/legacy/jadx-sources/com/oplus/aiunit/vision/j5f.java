package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.connect.config.connectid.ConnectIdLogic;

/* JADX INFO: loaded from: classes16.dex */
public class j5f {

    @SerializedName("type")
    private int a;

    @SerializedName(ConnectIdLogic.PARAM_OS_TYPE)
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private String f12759c;

    public void a(int i) {
        this.b = i;
    }

    public void b(int i) {
        this.a = i;
    }

    public void c(String str) {
        this.f12759c = str;
    }

    public String toString() {
        return "QueryDeviceModelsListReq{type=" + this.a + ", osType=" + this.b + ", version='" + this.f12759c + "'}";
    }
}

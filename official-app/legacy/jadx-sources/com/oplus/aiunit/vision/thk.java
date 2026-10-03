package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class thk {

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String a;

    @SerializedName("appTerminalId")
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("ssoid")
    private String f17018c;

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        this.a = str;
    }

    public void c(String str) {
        this.f17018c = str;
    }
}

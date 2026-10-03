package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class rhk {

    @SerializedName("ticketNo")
    private String a;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("appTerminalId")
    private String f16206c;

    @SerializedName("ssoid")
    private String d;

    public void a(String str) {
        this.f16206c = str;
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.a = str;
    }
}

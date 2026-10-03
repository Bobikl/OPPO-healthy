package com.amap.api.col.p0003sl;

import android.os.Build;
import com.oplus.aiunit.vision.w0n;

/* JADX INFO: loaded from: classes12.dex */
public enum jq {
    MIUI(w0n.t("IeGlhb21p")),
    Flyme(w0n.t("IbWVpenU")),
    RH(w0n.t("IaHVhd2Vp")),
    ColorOS(w0n.t("Ib3Bwbw")),
    FuntouchOS(w0n.t("Idml2bw")),
    SmartisanOS(w0n.t("Mc21hcnRpc2Fu")),
    AmigoOS(w0n.t("IYW1pZ28")),
    EUI(w0n.t("IbGV0dg")),
    Sense(w0n.t("EaHRj")),
    LG(w0n.t("EbGdl")),
    Google(w0n.t("IZ29vZ2xl")),
    NubiaUI(w0n.t("IbnViaWE")),
    Other("");


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f763n;
    private int o;
    private String p;
    private String q;
    private String r = Build.MANUFACTURER;

    jq(String str) {
        this.f763n = str;
    }

    public final String a() {
        return this.f763n;
    }

    public final String b() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "ROM{name='" + name() + "',versionCode=" + this.o + ", versionName='" + this.q + "',ma=" + this.f763n + "',manufacturer=" + this.r + "'}";
    }

    public final void a(int i) {
        this.o = i;
    }

    public final void b(String str) {
        this.q = str;
    }

    public final void a(String str) {
        this.p = str;
    }
}

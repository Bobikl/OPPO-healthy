package com.heytap.msp.push.mode;

import android.text.TextUtils;
import com.oplus.aiunit.vision.cpm;
import com.oplus.aiunit.vision.sbe;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7356c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7357e;
    public String f;
    public long g;
    public String h;
    public String i;

    public c() {
        this.a = 4096;
        this.g = System.currentTimeMillis();
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public void c(String str) {
        this.f7356c = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(String str) {
        this.h = str;
    }

    public void g(String str) {
        this.f7357e = str;
    }

    public void h(int i) {
        this.a = i;
    }

    public String i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("messageType", Integer.valueOf(this.a));
            jSONObject.putOpt("eventID", this.f7356c);
            jSONObject.putOpt("appPackage", this.b);
            jSONObject.putOpt(sbe.PAY_SDK_EVENT_TIME, Long.valueOf(this.g));
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.putOpt("globalID", this.d);
            }
            if (!TextUtils.isEmpty(this.f7357e)) {
                jSONObject.putOpt("taskID", this.f7357e);
            }
            if (!TextUtils.isEmpty(this.f)) {
                jSONObject.putOpt("property", this.f);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.putOpt("statistics_extra", this.h);
            }
            if (!TextUtils.isEmpty(this.i)) {
                jSONObject.putOpt("data_extra", this.i);
            }
        } catch (Exception e2) {
            cpm.c(e2.getLocalizedMessage());
        }
        return jSONObject.toString();
    }

    public c(int i, String str, String str2, String str3, String str4, String str5) {
        this(i, str, str2, str3, str4, str5, "", "");
    }

    public c(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = 4096;
        this.g = System.currentTimeMillis();
        h(i);
        a(str);
        d(str2);
        g(str3);
        c(str4);
        e(str5);
        f(str6);
        b(str7);
    }

    public c(String str, String str2) {
        this(4096, str, null, null, str2, "");
    }
}

package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.settings.band.utils.Bandsp;

/* JADX INFO: loaded from: classes17.dex */
public class rjk {
    public static String TAG = "UpdateSpBean";
    public String a;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16224c = true;

    public static rjk c(String str) {
        String strD = Bandsp.c(Bandsp.SpName.MOREMANAGER).D(Bandsp.b(str, TAG));
        if (!TextUtils.isEmpty(strD)) {
            return (rjk) sc8.a(strD, rjk.class);
        }
        rjk rjkVar = new rjk();
        rjkVar.a = str;
        return rjkVar;
    }

    public boolean a() {
        return this.f16224c;
    }

    public boolean b() {
        return this.b;
    }

    public void d() {
        Bandsp.c(Bandsp.SpName.MOREMANAGER).U(Bandsp.b(this.a, TAG), sc8.g(this));
    }

    public void e(boolean z) {
        this.b = z;
    }

    public void f(boolean z) {
        this.f16224c = z;
    }
}

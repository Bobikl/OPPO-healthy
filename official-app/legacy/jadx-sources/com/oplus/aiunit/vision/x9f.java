package com.oplus.aiunit.vision;

import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.health.settings.band.utils.Bandsp;

/* JADX INFO: loaded from: classes17.dex */
public class x9f {
    public static final String NIGHT = "night";
    public static final String RAISE = "rasise";
    public String a;

    public x9f(Bundle bundle) {
        if (bundle != null) {
            this.a = bundle.getString("settingsDeviceMac", "");
        }
    }

    public msc a() {
        String strD = Bandsp.c(Bandsp.SpName.RAISEMANAGER).D(Bandsp.b(this.a, NIGHT));
        return TextUtils.isEmpty(strD) ? msc.a() : (msc) sc8.a(strD, msc.class);
    }

    public w9f b() {
        String strD = Bandsp.c(Bandsp.SpName.RAISEMANAGER).D(Bandsp.b(this.a, RAISE));
        return TextUtils.isEmpty(strD) ? w9f.a() : (w9f) sc8.a(strD, w9f.class);
    }

    public void c(w9f w9fVar) {
        Bandsp.c(Bandsp.SpName.RAISEMANAGER).U(Bandsp.b(this.a, RAISE), w9fVar.d());
    }

    public void d(msc mscVar) {
        Bandsp.c(Bandsp.SpName.RAISEMANAGER).U(Bandsp.b(this.a, NIGHT), mscVar.d());
    }
}

package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.settings.band.utils.Bandsp;

/* JADX INFO: loaded from: classes17.dex */
public class m3c {
    public static String TAG = "morebean";
    public boolean a = false;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13937c;

    public static int b() {
        return v9g.w().z("k_hand_prefer", 0);
    }

    public static m3c c(String str) {
        String strD = Bandsp.c(Bandsp.SpName.MOREMANAGER).D(Bandsp.b(str, TAG));
        m3c m3cVar = !TextUtils.isEmpty(strD) ? (m3c) sc8.a(strD, m3c.class) : null;
        if (m3cVar != null) {
            return m3cVar;
        }
        m3c m3cVar2 = new m3c();
        m3cVar2.f13937c = str;
        m3cVar2.b = b();
        return m3cVar2;
    }

    public int a() {
        return this.b;
    }

    public void d() {
        Bandsp.c(Bandsp.SpName.MOREMANAGER).U(Bandsp.b(this.f13937c, TAG), sc8.g(this));
    }

    public void e(int i) {
        this.b = i;
    }
}

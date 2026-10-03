package com.oplus.aiunit.vision;

import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class m2n {
    public static m2n f;
    public String a = "";
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13929c = "";
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13930e = "";

    public static m2n a() {
        if (f == null) {
            f = Locale.getDefault().toString().startsWith("zh") ? new n3n() : new r4n();
        }
        return f;
    }
}

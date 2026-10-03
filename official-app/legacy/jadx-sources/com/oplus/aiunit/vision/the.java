package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class the {
    public String a = "";
    public String b = "0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17014c = "";
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17015e = "unknown";
    public String f = "";

    public static class a {
        public Context a;

        public a(Context context) {
            this.a = context;
        }

        public the a() {
            the theVar = new the();
            theVar.a = String.valueOf(Build.VERSION.SDK_INT);
            theVar.f17014c = Build.VERSION.RELEASE;
            theVar.d = Build.MODEL;
            String strB = gq5.b(this.a);
            if (!TextUtils.isEmpty(strB)) {
                theVar.f17015e = strB.toLowerCase();
            }
            theVar.f = rqk.m(this.a);
            return theVar;
        }
    }

    public String f() {
        return this.f17015e;
    }

    public String g() {
        return this.d;
    }

    public String toString() {
        return "PhoneInfo:{, platform:" + this.a + ", system_type:" + this.b + ", rom_version:" + this.f17014c + ", mobile_name:" + this.d + ", brand:" + this.f17015e + ", region:" + this.f + "}";
    }
}

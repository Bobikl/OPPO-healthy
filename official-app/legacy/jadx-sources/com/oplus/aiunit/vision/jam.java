package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes12.dex */
public class jam {
    public String a;
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f12819c = null;
    public Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12820e;

    public jam(Context context, String str, String str2, boolean z, boolean z2) {
        this.b = null;
        this.f12820e = z2;
        this.a = str2;
        this.d = context;
        if (context != null) {
            this.b = context.getSharedPreferences(str2, 0);
        }
    }

    public String a(String str) {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString(str, "");
            if (!gvm.b(string)) {
                return string;
            }
        }
        return "";
    }

    public void b(String str, String str2) {
        if (gvm.b(str) || str.equals("t")) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f12819c;
        if (editor != null) {
            editor.putString(str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public boolean c() {
        boolean z;
        Context context;
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editor = this.f12819c;
        if (editor == null) {
            z = true;
        } else {
            if (!this.f12820e && this.b != null) {
                editor.putLong("t", jCurrentTimeMillis);
            }
            if (this.f12819c.commit()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (this.b != null && (context = this.d) != null) {
            this.b = context.getSharedPreferences(this.a, 0);
        }
        return z;
    }

    public final void d() {
        SharedPreferences sharedPreferences;
        if (this.f12819c != null || (sharedPreferences = this.b) == null) {
            return;
        }
        this.f12819c = sharedPreferences.edit();
    }

    public void e(String str) {
        if (gvm.b(str) || str.equals("t")) {
            return;
        }
        d();
        SharedPreferences.Editor editor = this.f12819c;
        if (editor != null) {
            editor.remove(str);
        }
    }
}

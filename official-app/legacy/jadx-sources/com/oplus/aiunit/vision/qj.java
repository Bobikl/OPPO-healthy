package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class qj {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile qj f15814c;
    public SharedPreferences a;
    public SharedPreferences.Editor b;

    public qj(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ac_sdk_sp_manager_file", 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    public static qj c(Context context) {
        if (f15814c == null) {
            synchronized (qj.class) {
                if (f15814c == null) {
                    f15814c = new qj(context);
                }
            }
        }
        return f15814c;
    }

    public boolean a(String str) {
        return this.a.getBoolean(str, false);
    }

    public String b(String str) {
        return this.a.getString("key_host_config" + str, "");
    }

    public long d() {
        return this.a.getLong("key_last_fetch_config_time", 0L);
    }

    public long e() {
        return this.a.getLong("key_refresh_config_interval", 0L);
    }

    public String f(String str, String str2) {
        return this.a.getString(str, str2);
    }

    public String g() {
        return this.a.getString("key_user_region", "");
    }

    public void h(String str, boolean z) {
        this.b.putBoolean(str, z);
        this.b.commit();
    }

    public void i(String str, String str2) {
        this.b.putString(str, str2);
        this.b.commit();
    }

    public void j(String str, String str2) {
        this.b.putString("key_host_config" + str, str2);
        this.b.commit();
    }

    public void k(long j2) {
        this.b.putLong("key_last_fetch_config_time", j2);
        this.b.commit();
    }

    public void l(long j2) {
        this.b.putLong("key_refresh_config_interval", j2);
        this.b.commit();
    }

    public void m(String str) {
        this.b.putString("key_user_region", str);
        this.b.commit();
    }
}

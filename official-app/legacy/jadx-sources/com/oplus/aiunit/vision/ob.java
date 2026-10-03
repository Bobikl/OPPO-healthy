package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public class ob {
    public static volatile ob d;
    public Context a;
    public SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f14863c;

    public ob(Context context) {
        this.a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("ac_net_request", 0);
        this.b = sharedPreferences;
        this.f14863c = sharedPreferences.edit();
    }

    public static ob b(Context context) {
        if (d == null) {
            synchronized (ob.class) {
                if (d == null) {
                    d = new ob(context);
                }
            }
        }
        return d;
    }

    public String a(String str) {
        return this.b.getString("key_host_config" + str, "");
    }

    public long c() {
        return this.b.getLong("key_last_fetch_config_time", 0L);
    }

    public long d() {
        return this.b.getLong("key_refresh_config_interval", 0L);
    }

    public String e() {
        return this.b.getString("key_rsa_pubkey", "");
    }

    public String f() {
        return this.b.getString("key_user_region", "");
    }

    public void g(String str, String str2) {
        this.f14863c.putString("key_host_config" + str, str2);
        this.f14863c.commit();
    }

    public void h(long j2) {
        this.f14863c.putLong("key_last_fetch_config_time", j2);
        this.f14863c.commit();
    }

    public void i(long j2) {
        this.f14863c.putLong("key_refresh_config_interval", j2);
        this.f14863c.commit();
    }

    public void j(String str) {
        this.f14863c.putString("key_rsa_pubkey", str);
        this.f14863c.commit();
    }

    public void k(String str) {
        this.f14863c.putString("key_user_region", str);
        this.f14863c.commit();
    }
}

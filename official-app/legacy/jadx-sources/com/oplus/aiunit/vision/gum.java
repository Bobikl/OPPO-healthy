package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class gum implements m06 {
    public final Map<Integer, po9> a;
    public final zom b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elm f11906c;
    public final r0h d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jm0 f11907e;
    public final srm f;
    public final WeakReference<Activity> g;
    public im3 h;

    public gum(Activity activity, String str) {
        HashMap map = new HashMap(2);
        this.a = map;
        Context applicationContext = activity.getApplicationContext();
        this.g = new WeakReference<>(activity);
        this.d = new r0h(applicationContext, str);
        this.f11907e = new jm0(str);
        this.b = new zom(str);
        this.f11906c = new elm(str);
        this.h = new im3(applicationContext, str);
        this.f = new srm(applicationContext);
        map.put(1, new nsg());
        map.put(2, new rzg());
    }

    @Override // com.oplus.aiunit.vision.m06
    public boolean a(izg izgVar) {
        if (izgVar != null && this.f.isAppSupportShare()) {
            return this.d.c(this.g.get(), "douyinapi.DouYinEntryActivity", this.f.getPackageName(), "share.SystemShareActivity", izgVar, this.f.getRemoteAuthEntryActivity(), "opensdk-china-external", "0.1.9.0");
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.m06
    public boolean b() {
        return this.f.a();
    }

    @Override // com.oplus.aiunit.vision.m06
    public boolean c(Intent intent, bm9 bm9Var) {
        if (bm9Var == null) {
            return false;
        }
        if (intent == null) {
            bm9Var.a(intent);
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            bm9Var.a(intent);
            return false;
        }
        int i = extras.getInt("_bytedance_params_type");
        if (i == 0) {
            i = extras.getInt("_aweme_open_sdk_params_type");
        }
        switch (i) {
            case 1:
            case 2:
                return this.a.get(1).a(i, extras, bm9Var);
            case 3:
            case 4:
                return this.a.get(2).a(i, extras, bm9Var);
            case 5:
            case 6:
                return new apm().a(i, extras, bm9Var);
            case 7:
            case 8:
                return new flm().a(i, extras, bm9Var);
            default:
                h7b.a("DouYinOpenApiImpl", "handleIntent: unknown type " + i);
                return this.a.get(1).a(i, extras, bm9Var);
        }
    }

    @Override // com.oplus.aiunit.vision.m06
    public boolean isAppInstalled() {
        return this.f.isAppInstalled();
    }
}

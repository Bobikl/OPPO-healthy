package com.oplus.instant.router.callback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes16.dex */
public class c extends Callback {
    public Context a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Callback f19888c;

    public c(Context context, String str, Callback callback) {
        this.a = context;
        this.b = str;
        this.f19888c = callback;
    }

    public final String a(String str) {
        return str.replace("hap://app/", "hap://on_stack/");
    }

    @Override // com.oplus.instant.router.callback.Callback
    public void onResponse(Callback.Response response) {
        if (this.f19888c == null) {
            return;
        }
        if (!(this.a instanceof Activity)) {
            response.a = 200;
            response.b = "context is not activity";
        } else if (response.a == 1) {
            Intent intent = new Intent("android.intent.action.instant.on_stack", Uri.parse(a(this.b)));
            intent.putExtra("in_one_task", "1");
            if (intent.resolveActivity(this.a.getPackageManager()) != null) {
                this.a.startActivity(intent);
            }
        }
        this.f19888c.onResponse(response);
    }
}

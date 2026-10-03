package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public class r0h {
    public final Context a;
    public final String b;

    public r0h(Context context, String str) {
        this.a = context.getApplicationContext();
        this.b = str;
    }

    public final String a(String str, String str2) {
        return "com.ss.android.ugc.aweme." + str2;
    }

    public void b(String str, String str2, izg izgVar, Bundle bundle) {
        if (re0.b(this.a, str, str2) >= 3) {
            izgVar.toBundle(bundle);
        }
    }

    public boolean c(Activity activity, String str, String str2, String str3, izg izgVar, String str4, String str5, String str6) {
        if (activity == null) {
            h7b.a("ShareImpl", "share: activity is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            h7b.a("ShareImpl", "share: remotePackageName is " + str2);
            return false;
        }
        if (izgVar == null) {
            h7b.a("ShareImpl", "share: request is null");
            return false;
        }
        if (!izgVar.checkArgs()) {
            h7b.a("ShareImpl", "share: checkArgs fail");
            return false;
        }
        Bundle bundle = new Bundle();
        b(str2, str4, izgVar, bundle);
        bundle.putString("_aweme_open_sdk_params_client_key", this.b);
        bundle.putString("_aweme_open_sdk_params_caller_package", this.a.getPackageName());
        bundle.putString("_aweme_open_sdk_params_caller_sdk_version", "1");
        if (TextUtils.isEmpty(izgVar.callerLocalEntry)) {
            bundle.putString("_aweme_open_sdk_params_caller_local_entry", this.a.getPackageName() + "." + str);
        }
        Bundle bundle2 = izgVar.extras;
        if (bundle2 != null) {
            bundle.putBundle("_bytedance_params_extra", bundle2);
        }
        bundle.putString("_aweme_params_caller_open_sdk_name", str5);
        bundle.putString("_aweme_params_caller_open_sdk_version", str6);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str2, a(str2, str3)));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        try {
            activity.startActivityForResult(intent, 103);
            return true;
        } catch (Exception e2) {
            h7b.b("ShareImpl", "fail to startActivity", e2);
            return false;
        }
    }
}

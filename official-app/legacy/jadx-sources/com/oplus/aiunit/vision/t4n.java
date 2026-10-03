package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.EnvUtils;

/* JADX INFO: loaded from: classes12.dex */
public class t4n {
    public static final String a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String a(Context context) {
        if (EnvUtils.b()) {
            return ham.b;
        }
        if (EnvUtils.a()) {
            return ham.f12084c;
        }
        if (context == null) {
            return ham.a;
        }
        String str = ham.a;
        return TextUtils.isEmpty(str) ? ham.a : str;
    }
}

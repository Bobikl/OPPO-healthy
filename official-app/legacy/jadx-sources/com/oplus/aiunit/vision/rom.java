package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class rom {
    public static final int a = 1010;
    public static a b;

    public interface a {
        void a(boolean z, JSONObject jSONObject, String str);
    }

    public static boolean a(qam qamVar, int i, int i2, Intent intent) {
        if (i != 1010 || intent == null) {
            return false;
        }
        a aVar = b;
        if (aVar == null) {
            return true;
        }
        b = null;
        if (i2 == -1) {
            l9m.c(qamVar, sgm.f16581l, sgm.x0, intent.toUri(1));
            aVar.a(true, com.alipay.sdk.m.u.a.s(intent), "OK");
        } else if (i2 != 0) {
            l9m.h(qamVar, sgm.f16581l, sgm.w0, "" + i2);
        } else {
            l9m.c(qamVar, sgm.f16581l, sgm.v0, intent.toUri(1));
            aVar.a(false, null, "CANCELED");
        }
        return true;
    }

    public static boolean b(qam qamVar, Activity activity, int i, String str, String str2, a aVar) {
        try {
            l9m.b(qamVar, sgm.f16581l, sgm.u0);
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i);
            b = aVar;
            return true;
        } catch (Throwable th) {
            aVar.a(false, null, "UNKNOWN_ERROR");
            l9m.d(qamVar, sgm.f16581l, sgm.y0, th);
            return false;
        }
    }

    public static boolean c(qam qamVar, Context context) {
        return com.alipay.sdk.m.u.a.w(qamVar, context, Collections.singletonList(new h9m.b("com.taobao.taobao", 0, "")), false);
    }
}

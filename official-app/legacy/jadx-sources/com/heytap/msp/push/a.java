package com.heytap.msp.push;

import android.app.Activity;
import android.content.Context;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static void a() {
        PushService.j().g();
    }

    public static void b(Context context, boolean z) {
        PushService.j().w(context, z);
    }

    public static boolean c(Context context) {
        return PushService.j().y(context);
    }

    public static void d(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        e(context, str, str2, null, iCallBackResultService);
    }

    public static void e(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        PushService.j().A(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void f(Activity activity, INotificationPermissionCallback iNotificationPermissionCallback, int i) {
        PushService.j().B(activity, iNotificationPermissionCallback, i);
    }
}

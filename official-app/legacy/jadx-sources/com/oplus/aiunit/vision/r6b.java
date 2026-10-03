package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class r6b {
    public static Handler a;
    public static boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Toast f16085c;
    public static long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f16086e;

    public static boolean b(Context context) {
        ComponentName componentName;
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
        if (runningTasks == null || runningTasks.size() < 1 || (componentName = runningTasks.get(0).topActivity) == null) {
            return false;
        }
        return TextUtils.equals(context.getPackageName(), componentName.getPackageName());
    }

    public static /* synthetic */ void c(String str, String str2, Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - d;
        if (TextUtils.equals(str, f16086e) && j2 < 5000) {
            wil.k(str2, "logToast: " + str);
            return;
        }
        Toast toast = f16085c;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(context, str, 0);
        f16085c = toastMakeText;
        toastMakeText.show();
        d = jCurrentTimeMillis;
        f16086e = str;
    }

    public static synchronized void d(final Context context, final String str, final String str2) {
        wil.k(str, "logToast: " + str2);
        if (b) {
            if (a == null) {
                synchronized (r6b.class) {
                    if (a == null) {
                        a = new Handler(Looper.getMainLooper());
                    }
                }
            }
            if (b(context)) {
                a.post(new Runnable() { // from class: com.oplus.aiunit.vision.q6b
                    @Override // java.lang.Runnable
                    public final void run() {
                        r6b.c(str2, str, context);
                    }
                });
            } else {
                wil.d("LogToast", "app not foreground");
            }
        }
    }

    public static void e(boolean z) {
        b = z;
    }
}

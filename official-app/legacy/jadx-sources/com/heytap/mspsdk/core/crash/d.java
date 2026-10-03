package com.heytap.mspsdk.core.crash;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.heytap.msp.sdk.base.common.CrashConstant;
import com.heytap.mspsdk.log.MspLog;
import com.heytap.mspsdk.util.f;
import com.oplus.aiunit.vision.pca;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class d {
    public static Map<String, List<e>> a;
    public static AppCrashReceiver b = new AppCrashReceiver();

    public static class a {
        public static final d a = new d();
    }

    public static d f() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Context context) {
        int iIntValue = ((Integer) new f(context, "sp_common_file", 0).b("key_version_code", 0)).intValue();
        if (iIntValue > 0) {
            com.heytap.mspsdk.core.b bVarG = com.heytap.mspsdk.core.b.g(context);
            int i = bVarG.i();
            String strJ = bVarG.j();
            if (i > iIntValue) {
                k(context, i, strJ);
            }
        }
    }

    public static /* synthetic */ void i(Context context, String str, int i, int i2, int i3, String str2) {
        try {
            f fVar = new f(context, "sp_common_file", 0);
            fVar.c("key_process_name", str);
            fVar.c("key_crash_count", Integer.valueOf(i));
            fVar.c("key_launch_count", Integer.valueOf(i2));
            fVar.c("key_version_code", Integer.valueOf(i3));
            fVar.c("key_version_name", str2);
            fVar.a();
        } catch (Exception e2) {
            MspLog.e("AppCrashManager", e2);
        }
    }

    public static /* synthetic */ void j(Context context) {
        try {
            new f(context, "sp_common_file", 0).d("key_version_code").d("key_version_name").d("key_crash_count").d("key_launch_count").d("key_process_name").a();
        } catch (Exception e2) {
            MspLog.e("AppCrashManager", e2);
        }
    }

    public static String o(Context context, String str) {
        return str.contains("com.heytap.htms") ? str.replace("com.heytap.htms", com.heytap.mspsdk.core.b.g(context).h()) : str;
    }

    public static void p(Map<String, List<e>> map) {
        a = map;
    }

    public synchronized void d(Context context, String str, e eVar) {
        MspLog.d("AppCrashManager", "addMspProcessCrashListener:" + str);
        if (a == null) {
            p(new ConcurrentHashMap());
        }
        List<e> copyOnWriteArrayList = a.containsKey(str) ? a.get(str) : null;
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        if (copyOnWriteArrayList.size() > 10) {
            return;
        }
        copyOnWriteArrayList.add(eVar);
        a.put(str, copyOnWriteArrayList);
        e(context);
    }

    public final void e(final Context context) {
        com.heytap.mspsdk.executor.e.d().execute(new Runnable() { // from class: com.heytap.mspsdk.core.crash.a
            @Override // java.lang.Runnable
            public final void run() {
                this.i.h(context);
            }
        });
    }

    public synchronized void g(Context context, String str, int i, int i2, int i3, String str2) {
        l(context, str, i, i2, i3, str2);
        if (a.containsKey(str)) {
            List<e> list = a.get(str);
            if (list != null && list.size() > 0) {
                Iterator<e> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onMspProcessCrash(i2, i, str, i3, str2);
                }
            }
        }
    }

    public synchronized void k(Context context, int i, String str) {
        n(context);
        for (String str2 : a.keySet()) {
            List<e> list = a.get(str2);
            if (list != null && list.size() > 0) {
                Iterator<e> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onMspProcessRecover(str2, i, str);
                }
            }
        }
    }

    public final synchronized void l(final Context context, final String str, final int i, final int i2, final int i3, final String str2) {
        com.heytap.mspsdk.executor.e.d().execute(new Runnable() { // from class: com.heytap.mspsdk.core.crash.b
            @Override // java.lang.Runnable
            public final void run() {
                d.i(context, str, i, i2, i3, str2);
            }
        });
    }

    public void m(Context context) {
        MspLog.d("AppCrashManager", "registerCrashReceiver");
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, CrashConstant.SUB_PROCESS_CRASH_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            context.getApplicationContext().registerReceiver(b, intentFilter, 4);
        } else {
            context.getApplicationContext().registerReceiver(b, intentFilter);
        }
    }

    public final synchronized void n(final Context context) {
        com.heytap.mspsdk.executor.e.d().execute(new Runnable() { // from class: com.heytap.mspsdk.core.crash.c
            @Override // java.lang.Runnable
            public final void run() {
                d.j(context);
            }
        });
    }
}

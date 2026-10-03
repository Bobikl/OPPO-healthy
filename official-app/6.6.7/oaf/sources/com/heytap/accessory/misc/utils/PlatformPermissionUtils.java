package com.heytap.accessory.misc.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class PlatformPermissionUtils {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final String c = "PlatformPermissionUtils";
    public static Handler d;
    public static ArrayList<a> e;
    public static Map<String, String> f;

    public static class CheckPermissionReceiver extends BroadcastReceiver {
        public String a;
        public PlatformUtils.a b;
        public Runnable c;

        public class a implements Runnable {
            public final /* synthetic */ boolean a;

            public class a implements Runnable {
                public final /* synthetic */ a a;

                public a(a aVar) {
                    this.a = aVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (a.this.a) {
                        this.a.b().b();
                    } else {
                        this.a.b().a();
                    }
                }
            }

            public a(boolean z) {
                this.a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a) {
                    com.heytap.accessory.base.logging.a.c(PlatformPermissionUtils.c, "User isGranted!!!mPermissionRequestResult.onSuccess");
                    CheckPermissionReceiver.this.b.b();
                } else {
                    com.heytap.accessory.base.logging.a.e(PlatformPermissionUtils.c, "User rejected.. Give invalid profileId");
                    CheckPermissionReceiver.this.b.a();
                }
                for (int size = PlatformPermissionUtils.e.size() - 1; size >= 0; size--) {
                    a aVar = (a) PlatformPermissionUtils.e.get(size);
                    if (CheckPermissionReceiver.this.a.equals(aVar.a())) {
                        PlatformPermissionUtils.e.remove(size);
                        PlatformPermissionUtils.d.postDelayed(new a(aVar), ((long) 1) * 50);
                    }
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            try {
                String action = intent.getAction();
                if ("com.heytap.accessory.PERMISSION_CHECK".equals(action)) {
                    boolean booleanExtra = intent.getBooleanExtra("PERMISSION_CHECK_RESULT", false);
                    synchronized (PlatformPermissionUtils.a) {
                        if (PlatformPermissionUtils.f.get(this.a) != null) {
                            com.heytap.accessory.base.thread.a.b().a("daemon", new a(booleanExtra), 0L);
                        } else {
                            com.heytap.accessory.base.logging.a.e(PlatformPermissionUtils.c, "Result already delivered");
                        }
                        PlatformPermissionUtils.f.remove(this.a);
                    }
                } else {
                    com.heytap.accessory.base.logging.a.e(PlatformPermissionUtils.c, "Unknown action : " + action);
                }
                PlatformPermissionUtils.d.removeCallbacks(this.c);
                context.unregisterReceiver(this);
            } catch (Exception e) {
                com.heytap.accessory.base.logging.a.e(PlatformPermissionUtils.c, "CheckPermissionReceiver Exception:" + e);
            }
        }
    }

    public static class a {
        public String a;
        public PlatformUtils.a b;

        public String a() {
            return this.a;
        }

        public PlatformUtils.a b() {
            return this.b;
        }
    }

    public static void f() {
        d = com.heytap.accessory.base.thread.a.b().a("daemon");
    }

    public static int a(String str) {
        int i;
        synchronized (b) {
            i = 0;
            SharedPreferences.Editor editorEdit = PlatformUtils.getSharedPreferences(PlatformUtils.PERMISSION_PREFS, 0).edit();
            editorEdit.remove(str);
            if (editorEdit.commit()) {
                com.heytap.accessory.base.logging.a.a(c, "AccessPermission of AFP FW is deleted! - " + str);
            } else {
                com.heytap.accessory.base.logging.a.e(c, "AccessPermission of AFP FW isn't deleted! - " + str);
                i = -1;
            }
        }
        return i;
    }
}

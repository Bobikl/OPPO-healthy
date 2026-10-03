package com.heytap.accessory.connectivity.autoconnect;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.PowerManager;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.services.FrameworkService;
import com.oplus.aiunit.vision.xda;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AutoConnectionManager {
    public static final String d = "AutoConnectionManager";
    public static volatile AutoConnectionManager e;
    public b a = new b();
    public com.heytap.accessory.connectivity.autoconnect.a b = new com.heytap.accessory.connectivity.autoconnect.a(this.a);
    public BroadcastReceiver c = new a();

    public static class ReconnectReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            com.heytap.accessory.base.logging.a.c(AutoConnectionManager.d, "ReconnectReceiver Intent Action: " + intent.getAction());
            try {
                if ("com.heytap.accessory.action.AUTO_CONNECT".equalsIgnoreCase(intent.getAction())) {
                    if (FrameworkService.isFrameworkStarted()) {
                        AutoConnectionManager.e.a.a(intent.getStringExtra("address"), intent.getIntExtra("transport", 0), intent.getIntExtra("retryMode", 0), intent.getIntExtra(Constants.EXTRA_UUID, 0));
                        return;
                    }
                    Intent intent2 = new Intent(context, (Class<?>) FrameworkService.class);
                    intent2.setAction(intent.getAction());
                    intent2.putExtra("address", intent.getStringExtra("address"));
                    intent2.putExtra("transport", intent.getIntExtra("transport", 0));
                    intent2.putExtra("retryMode", intent.getIntExtra("retryMode", 0));
                    intent2.putExtra(Constants.EXTRA_UUID, intent.getIntExtra(Constants.EXTRA_UUID, 0));
                    context.startService(intent2);
                }
            } catch (Exception unused) {
                com.heytap.accessory.base.logging.a.e(AutoConnectionManager.d, "ReconnectReceiver onReceive Exception");
            }
        }
    }

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            com.heytap.accessory.base.logging.a.c(AutoConnectionManager.d, "eventReceiver Intent Action: " + intent.getAction());
            if ("android.intent.action.ACTION_POWER_CONNECTED".equalsIgnoreCase(intent.getAction())) {
                com.heytap.accessory.connectivity.autoconnect.a.b(2);
                AutoConnectionManager.this.b.c();
            } else {
                if ("android.intent.action.ACTION_POWER_DISCONNECTED".equalsIgnoreCase(intent.getAction())) {
                    com.heytap.accessory.connectivity.autoconnect.a.b(0);
                    return;
                }
                if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equalsIgnoreCase(intent.getAction())) {
                    PowerManager powerManager = (PowerManager) PlatformUtils.getContext().getSystemService("power");
                    if (powerManager == null || powerManager.isDeviceIdleMode()) {
                        AutoConnectionManager.this.b.c();
                    }
                }
            }
        }
    }

    public AutoConnectionManager() {
        IntentFilter intentFilter = new IntentFilter();
        xda.a(intentFilter, "android.intent.action.SCREEN_ON");
        xda.a(intentFilter, "android.intent.action.ACTION_POWER_CONNECTED");
        xda.a(intentFilter, "android.intent.action.ACTION_POWER_DISCONNECTED");
        xda.a(intentFilter, "android.os.action.DEVICE_IDLE_MODE_CHANGED");
        PlatformUtils.getContext().registerReceiver(this.c, intentFilter);
    }

    public static AutoConnectionManager c() {
        if (e == null) {
            synchronized (AutoConnectionManager.class) {
                if (e == null) {
                    e = new AutoConnectionManager();
                }
            }
        }
        return e;
    }

    public boolean a(int i) {
        return i == 2 || i == 4 || i == 1;
    }

    public int d(String str, int i, int i2) {
        return this.b.c(str, i, i2);
    }

    public int e(String str, int i, int i2) {
        return this.b.d(str, i, i2);
    }

    public boolean f(String str, int i, int i2) {
        if (a(i)) {
            return this.b.e(str, i, i2);
        }
        return false;
    }

    public boolean g(String str, int i, int i2) {
        return this.b.f(str, i, i2);
    }

    public boolean h(String str, int i, int i2) {
        return this.b.g(str, i, i2);
    }

    public boolean i(String str, int i, int i2) {
        return this.b.h(str, i, i2);
    }

    public boolean j(String str, int i, int i2) {
        return this.b.i(str, i, i2);
    }

    public boolean k(String str, int i, int i2) {
        return this.b.j(str, i, i2);
    }

    public void l(String str, int i, int i2) {
        this.b.k(str, i, i2);
    }

    public void m(String str, int i, int i2) {
        this.b.l(str, i, i2);
    }

    public void n(String str, int i, int i2) {
        this.b.m(str, i, i2);
    }

    public void o(String str, int i, int i2) {
        this.b.n(str, i, i2);
    }

    public void p(String str, int i, int i2) {
        com.heytap.accessory.base.logging.a.a(d, "AutoConnectionManager startReconnectTimer");
        this.b.o(str, i, i2);
    }

    public void b(String str, int i, int i2, int i3) {
        String str2 = d;
        com.heytap.accessory.base.logging.a.c(str2, "Calling reconnect retryMode: " + i2);
        com.heytap.accessory.connectivity.autoconnect.a.a aVarB = this.b.b(str, i, i3);
        if (aVarB == null) {
            com.heytap.accessory.base.logging.a.a(str2, "Details not found in map. Adding..");
            a(str, i, i2, i3);
        } else {
            this.b.a(aVarB, 2);
            if (aVarB.f() != 1) {
                com.heytap.accessory.base.logging.a.a(str2, "Not in Queued status!..");
                return;
            }
        }
        this.a.a(str, i, i3);
    }

    public void a(Handler handler) {
        this.a.a(handler);
    }

    public final void a(String str, int i, int i2, int i3, int i4) {
        if (i3 != 0) {
            if (i3 == 1) {
                if (i4 < 5) {
                    c(str, i, i3, i2);
                    c(str, i, i2);
                    return;
                }
                return;
            }
            if (i3 != 2) {
                com.heytap.accessory.base.logging.a.e(d, "Invalid retry mode: " + i3);
                return;
            }
            c(str, i, i3, i2);
            c(str, i, i2);
        }
    }

    public void c(String str, int i, int i2, int i3, int i4) {
        if (f(str, i, i3)) {
            a(str, i, i3, i2, i4);
        } else {
            b(str, i, i2, i3, i4);
        }
    }

    public void a(String str, int i, int i2, int i3) {
        this.b.a(str, i, i2, i3);
    }

    public final void c(String str, int i, int i2) {
        com.heytap.accessory.connectivity.autoconnect.a.a aVarB = this.b.b(str, i, i2);
        if (aVarB != null) {
            aVarB.j();
            if (aVarB.f() == 1) {
                this.a.a(aVarB.b());
                this.b.a(aVarB, 2);
                this.b.b(str, i, i2).a(-1);
                p(aVarB.a, aVarB.b, i2);
                return;
            }
            com.heytap.accessory.base.logging.a.e(d, "existReconnect:  current address is connecting, ignore this request");
        }
    }

    public void a(String str, int i, int i2) {
        this.b.a(str, i, i2);
    }

    public final void b(String str, int i, int i2, int i3, int i4) {
        if (i2 == 0) {
            com.heytap.accessory.base.logging.a.e(d, "Improper retry mode: " + i2);
            return;
        }
        if (i4 == 3 || i4 == 4 || i4 == 2 || (i4 >= 5 && i2 == 2)) {
            a(str, i, i2, i3);
            return;
        }
        if (i4 != 1 && i4 != 0) {
            com.heytap.accessory.base.logging.a.e(d, "Accessory is already connected!");
            return;
        }
        a(str, i, i2, i3);
        l(str, i, i3);
        this.b.b(str, i, i3).a(-1);
        p(str, i, i3);
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        this.b.a(bVar);
    }

    public boolean b(com.heytap.accessory.base.bean.b bVar) {
        if (!a(bVar.h()) || !f(bVar.d(), bVar.h(), bVar.F())) {
            return false;
        }
        o(bVar.d(), bVar.h(), bVar.F());
        if (d(bVar.d(), bVar.h(), bVar.F()) != 1) {
            return false;
        }
        a(bVar.d(), bVar.h(), bVar.F());
        com.heytap.accessory.base.logging.a.c(d, "Stopping reconnect for accessory: " + PlatformUtils.getAddrforLog(bVar.d()));
        return true;
    }

    public void c(String str, int i, int i2, int i3) {
        this.b.b(str, i, i2, i3);
    }

    public boolean b(String str, int i, int i2) {
        com.heytap.accessory.connectivity.autoconnect.a.a aVarB = this.b.b(str, i, i2);
        if (aVarB == null) {
            return false;
        }
        if (j(str, aVarB.g(), aVarB.h())) {
            com.heytap.accessory.base.logging.a.e(d, "set disableAutoConnect");
            m(str, aVarB.g(), aVarB.h());
            return true;
        }
        a(str, aVarB.g(), aVarB.h());
        return true;
    }

    public void b(int i) {
        this.b.c(i);
    }
}

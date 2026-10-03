package com.heytap.accessory.connectivity.autoconnect;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String c = "a";
    public static final Object d = new Object();
    public static Integer e = 0;
    public Set<a> a = new HashSet();
    public b b;

    public static class a {
        public String a;
        public int b;
        public int c;
        public PendingIntent e;
        public int g;
        public int h;
        public int i = 0;
        public int f = 1;
        public boolean d = false;

        public a(String str, int i, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.g = i2;
            this.c = i3;
            Intent intent = new Intent(PlatformUtils.getContext(), (Class<?>) AutoConnectionManager.ReconnectReceiver.class);
            intent.putExtra("address", this.a);
            intent.putExtra("transport", this.b);
            intent.putExtra("retryMode", this.g);
            intent.putExtra(Constants.EXTRA_UUID, this.c);
            intent.setAction("com.heytap.accessory.action.AUTO_CONNECT");
            synchronized (this) {
                Integer unused = a.e = Integer.valueOf(a.e.intValue() + 1);
            }
            Context context = PlatformUtils.getContext();
            int iIntValue = a.e.intValue();
            PushAutoTrackHelper.hookIntentGetBroadcast(context, iIntValue, intent, 0);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, iIntValue, intent, 0);
            PushAutoTrackHelper.hookPendingIntentGetBroadcast(broadcast, context, iIntValue, intent, 0);
            this.e = broadcast;
            this.h = 0;
        }

        public synchronized String a() {
            return this.a;
        }

        public synchronized void b(int i) {
            this.g = i;
        }

        public synchronized void c(int i) {
            com.heytap.accessory.base.logging.a.a(a.c, "setRetryStatus: value = " + i);
            this.h = i;
        }

        public synchronized void d(int i) {
            com.heytap.accessory.base.logging.a.a(a.c, "setStatus: state = " + i);
            this.i = i;
        }

        public synchronized int e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public synchronized int f() {
            return this.i;
        }

        public synchronized int g() {
            return this.b;
        }

        public int h() {
            return this.c;
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
        }

        public boolean i() {
            return this.d;
        }

        public void j() {
            this.f = 1;
        }

        public void k() {
            this.d = true;
        }

        public void a(int i) {
            this.f = i;
        }

        public PendingIntent b() {
            return this.e;
        }

        public int c() {
            int i = this.f;
            if (i == -1) {
                this.f = 0;
            } else if (i == 0) {
                this.f = 2;
            } else {
                if (i >= 256) {
                    return 600;
                }
                int i2 = i * 2;
                this.f = i2;
                if (i2 - i < 4 && i2 != 2) {
                    this.f = i2 * 2;
                }
            }
            return this.f;
        }

        public synchronized int d() {
            return this.g;
        }
    }

    public a(b bVar) {
        this.b = bVar;
    }

    public static void b(int i) {
    }

    public final boolean a(int i) {
        return i == 0;
    }

    public int c(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.d();
    }

    public int d(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB == null) {
            return 0;
        }
        return aVarB.f;
    }

    public boolean e(String str, int i, int i2) {
        return b(str, i, i2) != null;
    }

    public boolean f(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB == null) {
            return false;
        }
        return aVarB.i();
    }

    public boolean g(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        return aVarB != null && aVarB.f() == 1;
    }

    public boolean h(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        return aVarB != null && aVarB.f() == 3;
    }

    public boolean i(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        return aVarB != null && aVarB.f() == 2;
    }

    public boolean j(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        return aVarB != null && aVarB.f() == 4;
    }

    public void k(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB != null) {
            aVarB.c(3);
        }
    }

    public void l(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB != null) {
            aVarB.k();
        }
    }

    public void m(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB != null) {
            aVarB.d(3);
        }
    }

    public void n(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB != null) {
            this.b.a(aVarB);
            aVarB.d(0);
            aVarB.j();
        }
    }

    public void o(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB != null) {
            aVarB.d(1);
            synchronized (d) {
                int iE = aVarB.e();
                aVarB.c(0);
                b(aVarB, iE);
            }
        }
    }

    public a b(String str, int i, int i2) {
        synchronized (d) {
            for (a aVar : this.a) {
                if (aVar.a().equals(str) && aVar.g() == i && aVar.h() == i2) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public void c(int i) {
        synchronized (d) {
            Iterator<a> it = this.a.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.g() == i) {
                    this.b.a(next);
                    it.remove();
                }
            }
        }
    }

    public void a(String str, int i, int i2, int i3) {
        a aVar = new a(str, i, i2, i3);
        synchronized (d) {
            this.a.add(aVar);
        }
    }

    public final void a(a aVar) {
        synchronized (d) {
            this.a.remove(aVar);
        }
    }

    public void b(String str, int i, int i2, int i3) {
        a aVarB = b(str, i, i3);
        if (aVarB != null) {
            aVarB.b(i2);
        }
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        a aVarB = b(bVar.d(), bVar.h(), bVar.F());
        if (aVarB != null) {
            aVarB.d(2);
        }
    }

    public final void b(a aVar, int i) {
        String str = c;
        com.heytap.accessory.base.logging.a.a(str, "AutoConnectionDetails startReconnectTimer: det = " + aVar.a + " retry = " + i);
        if ((i & 2) == 2) {
            int iC = aVar.c() * 1000;
            com.heytap.accessory.base.logging.a.d(str, "startReconnectTimer: retry = " + i + " timer:" + iC);
            if (a(iC)) {
                this.b.a(aVar.a, aVar.b, aVar.g, aVar.c);
                return;
            }
            if (PlatformUtils.isApiLevelBelowMarshMallow()) {
                this.b.b(iC, aVar.b());
                return;
            }
            PowerManager powerManager = (PowerManager) PlatformUtils.getContext().getSystemService("power");
            if (powerManager != null && !powerManager.isDeviceIdleMode()) {
                this.b.b(iC, aVar.b());
            } else {
                this.b.a(iC, aVar.b());
            }
        }
    }

    public void c() {
        synchronized (d) {
            for (a aVar : this.a) {
                aVar.j();
                if (aVar.i == 1) {
                    com.heytap.accessory.base.logging.a.c(c, "Attempting reconnect of device " + PlatformUtils.getAddrforLog(aVar.a) + " : " + aVar.b);
                    a(aVar, 2);
                    this.b.a(aVar.b());
                    this.b.a(aVar.a, aVar.b, aVar.h());
                }
            }
        }
    }

    public void a(a aVar, int i) {
        synchronized (d) {
            aVar.c(i | aVar.e());
        }
    }

    public void a(String str, int i, int i2) {
        a aVarB = b(str, i, i2);
        if (aVarB != null) {
            this.b.a(aVarB);
            a(aVarB);
            com.heytap.accessory.base.logging.a.d(c, "Retry removed for address " + str + " transport " + i);
        }
    }
}

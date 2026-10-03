package com.heytap.accessory.connectivity.autoconnect;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2468c = "a";
    public static final Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Integer f2469e = 0;
    public Set<C0230a> a = new HashSet();
    public b b;

    /* JADX INFO: renamed from: com.heytap.accessory.connectivity.autoconnect.a$a, reason: collision with other inner class name */
    public static class C0230a {
        public String a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2470c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public PendingIntent f2471e;
        public int g;
        public int h;
        public int i = 0;
        public int f = 1;
        public boolean d = false;

        public C0230a(String str, int i, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.g = i2;
            this.f2470c = i3;
            Intent intent = new Intent(PlatformUtils.getContext(), (Class<?>) AutoConnectionManager.ReconnectReceiver.class);
            intent.putExtra("address", this.a);
            intent.putExtra(NotificationCompat.CATEGORY_TRANSPORT, this.b);
            intent.putExtra("retryMode", this.g);
            intent.putExtra("uuid", this.f2470c);
            intent.setAction("com.heytap.accessory.action.AUTO_CONNECT");
            synchronized (this) {
                Integer unused = a.f2469e = Integer.valueOf(a.f2469e.intValue() + 1);
            }
            Context context = PlatformUtils.getContext();
            int iIntValue = a.f2469e.intValue();
            PushAutoTrackHelper.hookIntentGetBroadcast(context, iIntValue, intent, 0);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, iIntValue, intent, 0);
            PushAutoTrackHelper.hookPendingIntentGetBroadcast(broadcast, context, iIntValue, intent, 0);
            this.f2471e = broadcast;
            this.h = 0;
        }

        public synchronized String a() {
            return this.a;
        }

        public synchronized void b(int i) {
            this.g = i;
        }

        public synchronized void c(int i) {
            com.heytap.accessory.base.logging.a.a(a.f2468c, "setRetryStatus: value = " + i);
            this.h = i;
        }

        public synchronized void d(int i) {
            com.heytap.accessory.base.logging.a.a(a.f2468c, "setStatus: state = " + i);
            this.i = i;
        }

        public synchronized int e() {
            return this.h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0230a.class != obj.getClass()) {
                return false;
            }
            C0230a c0230a = (C0230a) obj;
            return this.b == c0230a.b && this.f2470c == c0230a.f2470c && this.d == c0230a.d;
        }

        public synchronized int f() {
            return this.i;
        }

        public synchronized int g() {
            return this.b;
        }

        public int h() {
            return this.f2470c;
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.f2470c));
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
            return this.f2471e;
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
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB == null) {
            return -1;
        }
        return c0230aB.d();
    }

    public int d(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB == null) {
            return 0;
        }
        return c0230aB.f;
    }

    public boolean e(String str, int i, int i2) {
        return b(str, i, i2) != null;
    }

    public boolean f(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB == null) {
            return false;
        }
        return c0230aB.i();
    }

    public boolean g(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        return c0230aB != null && c0230aB.f() == 1;
    }

    public boolean h(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        return c0230aB != null && c0230aB.f() == 3;
    }

    public boolean i(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        return c0230aB != null && c0230aB.f() == 2;
    }

    public boolean j(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        return c0230aB != null && c0230aB.f() == 4;
    }

    public void k(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB != null) {
            c0230aB.c(3);
        }
    }

    public void l(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB != null) {
            c0230aB.k();
        }
    }

    public void m(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB != null) {
            c0230aB.d(3);
        }
    }

    public void n(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB != null) {
            this.b.a(c0230aB);
            c0230aB.d(0);
            c0230aB.j();
        }
    }

    public void o(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB != null) {
            c0230aB.d(1);
            synchronized (d) {
                int iE = c0230aB.e();
                c0230aB.c(0);
                b(c0230aB, iE);
            }
        }
    }

    public C0230a b(String str, int i, int i2) {
        synchronized (d) {
            for (C0230a c0230a : this.a) {
                if (c0230a.a().equals(str) && c0230a.g() == i && c0230a.h() == i2) {
                    return c0230a;
                }
            }
            return null;
        }
    }

    public void c(int i) {
        synchronized (d) {
            Iterator<C0230a> it = this.a.iterator();
            while (it.hasNext()) {
                C0230a next = it.next();
                if (next.g() == i) {
                    this.b.a(next);
                    it.remove();
                }
            }
        }
    }

    public void a(String str, int i, int i2, int i3) {
        C0230a c0230a = new C0230a(str, i, i2, i3);
        synchronized (d) {
            this.a.add(c0230a);
        }
    }

    public final void a(C0230a c0230a) {
        synchronized (d) {
            this.a.remove(c0230a);
        }
    }

    public void b(String str, int i, int i2, int i3) {
        C0230a c0230aB = b(str, i, i3);
        if (c0230aB != null) {
            c0230aB.b(i2);
        }
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        C0230a c0230aB = b(bVar.d(), bVar.h(), bVar.F());
        if (c0230aB != null) {
            c0230aB.d(2);
        }
    }

    public final void b(C0230a c0230a, int i) {
        String str = f2468c;
        com.heytap.accessory.base.logging.a.a(str, "AutoConnectionDetails startReconnectTimer: det = " + c0230a.a + " retry = " + i);
        if ((i & 2) == 2) {
            int iC = c0230a.c() * 1000;
            com.heytap.accessory.base.logging.a.d(str, "startReconnectTimer: retry = " + i + " timer:" + iC);
            if (a(iC)) {
                this.b.a(c0230a.a, c0230a.b, c0230a.g, c0230a.f2470c);
                return;
            }
            if (PlatformUtils.isApiLevelBelowMarshMallow()) {
                this.b.b(iC, c0230a.b());
                return;
            }
            PowerManager powerManager = (PowerManager) PlatformUtils.getContext().getSystemService("power");
            if (powerManager != null && !powerManager.isDeviceIdleMode()) {
                this.b.b(iC, c0230a.b());
            } else {
                this.b.a(iC, c0230a.b());
            }
        }
    }

    public void c() {
        synchronized (d) {
            for (C0230a c0230a : this.a) {
                c0230a.j();
                if (c0230a.i == 1) {
                    com.heytap.accessory.base.logging.a.c(f2468c, "Attempting reconnect of device " + PlatformUtils.getAddrforLog(c0230a.a) + " : " + c0230a.b);
                    a(c0230a, 2);
                    this.b.a(c0230a.b());
                    this.b.a(c0230a.a, c0230a.b, c0230a.h());
                }
            }
        }
    }

    public void a(C0230a c0230a, int i) {
        synchronized (d) {
            c0230a.c(i | c0230a.e());
        }
    }

    public void a(String str, int i, int i2) {
        C0230a c0230aB = b(str, i, i2);
        if (c0230aB != null) {
            this.b.a(c0230aB);
            a(c0230aB);
            com.heytap.accessory.base.logging.a.d(f2468c, "Retry removed for address " + str + " transport " + i);
        }
    }
}

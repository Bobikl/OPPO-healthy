package OO0;

import O00.O00;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.oplus.aiunit.vision.d1d;
import com.oplus.carlink.controlsdk.CarControlManager;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public O00 a;
    public final Intent d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f166e;
    public volatile int b = 0;
    public final a f = new a();
    public final C0003b g = new C0003b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f165c = new Object();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            O00 c0001o00;
            d1d.a("CallableImpl", "onServiceConnected");
            b bVar = b.this;
            int i = O00.AbstractBinderC0000O00.f157O00;
            if (iBinder == null) {
                c0001o00 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.oplus.carlink.ICallable");
                c0001o00 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof O00)) ? new O00.AbstractBinderC0000O00.C0001O00(iBinder) : (O00) iInterfaceQueryLocalInterface;
            }
            bVar.a = c0001o00;
            try {
                iBinder.linkToDeath(b.this.g, 0);
            } catch (Exception e2) {
                d1d.c("CallableImpl", "Exception when link to death. " + e2.getMessage());
            }
            synchronized (b.this.f165c) {
                b.this.b = 2;
                b.this.f166e.b();
                b.this.f165c.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            d1d.a("CallableImpl", "onServiceDisconnected");
            b.this.e();
        }
    }

    /* JADX INFO: renamed from: OO0.b$b, reason: collision with other inner class name */
    public class C0003b implements IBinder.DeathRecipient {
        public C0003b() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            b.this.e();
        }
    }

    public interface c {
        void a();

        void b();
    }

    public b(Intent intent, c cVar) {
        this.d = intent;
        this.f166e = cVar;
    }

    public final Bundle a(String str, String str2, Bundle bundle) {
        synchronized (this.f165c) {
            if (this.b != 2) {
                if (this.b == 0) {
                    this.b = 1;
                    b();
                }
                try {
                    d1d.c("CallableImpl", "mLock.wait()");
                    this.f165c.wait(5000L);
                } catch (Exception e2) {
                    d1d.c("CallableImpl", "Exception when wait for service connected. " + e2.getMessage());
                }
            }
        }
        Bundle bundleO00 = null;
        try {
            O00 o00 = this.a;
            if (o00 == null) {
                d1d.c("CallableImpl", "Binder is null when call ".concat(str));
            } else {
                bundleO00 = o00.O00(str, str2, bundle);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            d1d.c("CallableImpl", "Exception when execute call method. " + th.getMessage());
        }
        return bundleO00;
    }

    public final void b() {
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.oplus.aiunit.vision.r0d
            @Override // java.lang.Runnable
            public final void run() {
                this.i.d();
            }
        });
    }

    public final void c() {
        synchronized (this.f165c) {
            if (this.b == 0) {
                return;
            }
            Context context = CarControlManager.getInstance().getContext();
            if (context == null) {
                d1d.c("CallableImpl", "Context is null when unbind service.");
            } else {
                d1d.a("CallableImpl", "bindService");
                context.unbindService(this.f);
            }
            this.b = 0;
        }
    }

    public final /* synthetic */ void d() {
        Context context = CarControlManager.getInstance().getContext();
        if (context == null) {
            d1d.c("CallableImpl", "Context is null when bind service.");
            return;
        }
        d1d.a("CallableImpl", "bindService");
        context.bindService(this.d, this.f, 1);
        d1d.a("CallableImpl", "call bindService end");
    }

    public final void e() {
        synchronized (this.f165c) {
            this.f165c.notifyAll();
            this.b = 0;
        }
        this.f166e.a();
    }
}

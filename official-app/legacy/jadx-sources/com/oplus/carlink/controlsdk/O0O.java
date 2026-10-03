package com.oplus.carlink.controlsdk;

import O00.OO0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.d1d;
import com.oplus.aiunit.vision.f1d;
import com.oplus.carlink.controlsdk.O0O;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class O0O {
    public final Context a;
    public final Intent b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f19657c = new CopyOnWriteArrayList();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<f1d> f19658e = new AtomicReference<>(null);
    public final List<BinderC0953O0O> f = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.oplus.carlink.controlsdk.O0O$O0O, reason: collision with other inner class name */
    public class BinderC0953O0O extends O00.O0O.O00 {

        /* JADX INFO: renamed from: O00, reason: collision with root package name */
        public final O00.O0O f19659O00;

        /* JADX INFO: renamed from: O0O, reason: collision with root package name */
        public final AtomicBoolean f19660O0O = new AtomicBoolean(false);

        public BinderC0953O0O(O00.O0O o0o) {
            this.f19659O00 = o0o;
        }

        public final void O00() {
            if (this.f19660O0O.compareAndSet(false, true)) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("code", -1);
                    this.f19659O00.O00(bundle);
                } catch (Exception e2) {
                    d1d.b("ServiceConnector", DeviceInfoCompat.DeviceState.DISCONNECTED, e2);
                }
            }
        }

        public final /* synthetic */ void O0O(Bundle bundle) {
            try {
                this.f19659O00.O00(bundle);
            } catch (RemoteException e2) {
                d1d.c("ServiceConnector", "RemoteException " + e2);
            }
        }

        @Override // O00.O0O
        public final void O00(final Bundle bundle) {
            if (this.f19660O0O.compareAndSet(false, true)) {
                CarControlCenter.getInstance(O0O.this.a).threadCall(new Runnable() { // from class: com.oplus.aiunit.vision.u0d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.O0O(bundle);
                    }
                });
                synchronized (this) {
                    O0O.this.f.remove(this);
                }
            }
        }
    }

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OO0 c0002o00;
            O0O o0o = O0O.this;
            int i = OO0.O00.f159O00;
            if (iBinder == null) {
                c0002o00 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.oplus.carlink.ICarControlCenterClient");
                c0002o00 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OO0)) ? new OO0.O00.C0002O00(iBinder) : (OO0) iInterfaceQueryLocalInterface;
            }
            b bVar = o0o.new b(c0002o00);
            O0O.this.d.set(false);
            O0O.this.f19658e.set(bVar);
            O0O.this.e(bVar);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            O0O.this.f19658e.set(null);
            d1d.a("ServiceConnector", "onServiceDisconnected");
            O0O.this.a();
        }
    }

    public class b implements f1d {
        public final OO0 a;

        public b(OO0 oo0) {
            this.a = oo0;
        }

        @Override // com.oplus.aiunit.vision.f1d
        public final void a(@NonNull String str, @NonNull Bundle bundle, @NonNull O00.O0O o0o) {
            OO0 oo0 = this.a;
            O0O o0o2 = O0O.this;
            o0o2.getClass();
            BinderC0953O0O binderC0953O0O = o0o2.new BinderC0953O0O(o0o);
            o0o2.f.add(binderC0953O0O);
            oo0.O00(str, bundle, binderC0953O0O);
        }
    }

    public interface c {
        void a(@NonNull f1d f1dVar);

        void b(int i);
    }

    public O0O(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final void a() {
        this.f.forEach(new Consumer() { // from class: com.oplus.aiunit.vision.s0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((O0O.BinderC0953O0O) obj).O00();
            }
        });
        this.f.clear();
    }

    public final void b(final int i) {
        this.f19657c.forEach(new Consumer() { // from class: com.oplus.aiunit.vision.t0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((O0O.c) obj).b(i);
            }
        });
        this.f19657c.clear();
    }

    public final void e(final b bVar) {
        this.f19657c.forEach(new Consumer() { // from class: com.oplus.aiunit.vision.q0d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((O0O.c) obj).a(bVar);
            }
        });
        this.f19657c.clear();
    }

    public final void f(c cVar) {
        int i;
        if (this.a != null) {
            this.f19657c.add(cVar);
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null) {
                try {
                    packageManager.getApplicationInfo("com.heytap.opluscarlink", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 10000;
                }
            }
            if (this.a.checkSelfPermission("com.oplus.permission.safe.CAR_LINK") != 0) {
                i = 10002;
                b(i);
                return;
            }
            f1d f1dVar = this.f19658e.get();
            if (f1dVar != null) {
                cVar.a(f1dVar);
                return;
            }
            if (this.d.compareAndSet(false, true)) {
                boolean zBindService = this.a.bindService(this.b, new a(), 1);
                d1d.a("ServiceConnector", "bindService: " + zBindService);
                if (zBindService) {
                    return;
                }
                this.d.set(false);
                b(10001);
            }
        }
    }
}

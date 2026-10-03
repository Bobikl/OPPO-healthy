package com.heytap.health.linkage.watch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.deviceinfo.DeviceAppCallbackInterface;
import com.heytap.deviceinfo.MyDevicesInterface;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.fa5;
import com.oplus.aiunit.vision.fq5;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.jya;
import com.oplus.aiunit.vision.r70;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.vda;
import com.oplus.aiunit.vision.wr9;
import com.oplus.aiunit.vision.yxa;
import com.oplus.aiunit.vision.zq8;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.mydevices.sdk.DeviceSdk;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes16.dex */
public class LinkageConnectManagerImpl implements wr9, Handler.Callback, ul4.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MyDevicesInterface f4928j;
    public fa5 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f4930n;
    public volatile boolean o;
    public volatile boolean p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile int s;
    public volatile int t;
    public final Handler u;
    public r70<MyDevicesInterface> v;
    public final IBinder k = new LocalDeviceAppBinder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f4929l = new a();
    public final ExecutorService i = zq8.e("LA.LCMI");

    public class LocalDeviceAppBinder extends DeviceAppCallbackInterface.Stub {
        @Override // com.heytap.deviceinfo.DeviceAppCallbackInterface
        public Bundle call(int i, Bundle bundle) throws RemoteException {
            return LinkageConnectManagerImpl.this.m != null ? LinkageConnectManagerImpl.this.m.call(i, bundle) : new Bundle();
        }

        private LocalDeviceAppBinder() {
        }
    }

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            a7b.f("LA.LCMI", "onReceive: action " + action);
            if (TextUtils.equals(action, Constants.ACTION_NOTIFY_APP_ALIVE)) {
                LinkageConnectManagerImpl.this.p(intent);
            } else if (TextUtils.equals(action, Constants.ACTION_NOTIFY_EVENT)) {
                LinkageConnectManagerImpl.this.q(intent);
            }
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkageConnectManagerImpl() {
        HandlerThread handlerThread = new HandlerThread("LA.LCMI");
        handlerThread.start();
        this.u = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(IBinder iBinder) {
        this.f4928j = MyDevicesInterface.Stub.asInterface(iBinder);
        r();
        this.r = DeviceSdk.isMyDevicesSupportNotKeepAlive();
        a7b.f("LA.LCMI", "onServiceConnected: mMyDevicesSupportNotKeepAlive " + this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final IBinder iBinder) {
        this.i.execute(new Runnable() { // from class: com.oplus.aiunit.vision.gya
            @Override // java.lang.Runnable
            public final void run() {
                this.i.s(iBinder);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        a7b.f("LA.LCMI", "[onServiceDisconnected]");
        this.f4928j = null;
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        a7b.f("LA.LCMI", "binderDied: ");
        this.f4928j = null;
        x();
    }

    public final void A() {
        this.u.removeMessages(101);
        this.u.sendEmptyMessageDelayed(101, 15000L);
    }

    public final synchronized void B() {
        final int i = this.s;
        if (this.q || this.o) {
            i |= 2;
        }
        if (i == 0 && fq5.k()) {
            a7b.b("LA.LCMI", "updateAliveFlag mydevice app is error version,fix");
            i |= 1;
        }
        if (this.t == i) {
            a7b.f("LA.LCMI", "preFlag == currFlag," + i);
            return;
        }
        this.t = i;
        a7b.f("LA.LCMI", "updateAliveFlag: " + i);
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.bya
            @Override // java.lang.Runnable
            public final void run() {
                DeviceSdk.setAliveFlag(i);
            }
        });
    }

    public final void C() {
        if (this.p) {
            if (!yxa.c(b78.a())) {
                a7b.b("LA.LCMI", "LinkageApp init fail");
                return;
            }
            WatchController watchControllerB = jya.a().b();
            if (watchControllerB != null) {
                watchControllerB.Q();
            } else {
                a7b.f("LA.LCMI", "updateBattery --> watchController == null");
            }
        }
    }

    @Override // com.oplus.aiunit.vision.wr9
    public void a(fa5 fa5Var) {
        this.m = fa5Var;
    }

    @Override // com.oplus.aiunit.vision.wr9
    public void b(boolean z) {
        a7b.f("LA.LCMI", "updateWatchLinkageState : " + z);
        this.o = z;
        B();
        k();
    }

    @Override // com.oplus.aiunit.vision.wr9
    public Bundle call(int i, Bundle bundle) {
        MyDevicesInterface myDevicesInterfaceO = o();
        if (myDevicesInterfaceO == null) {
            a7b.m("LA.LCMI", "call: deviceApi == null code = " + i);
            return null;
        }
        try {
            return myDevicesInterfaceO.call(i, bundle);
        } catch (RemoteException e2) {
            a7b.m("LA.LCMI", "call: code = " + i + " , error " + e2.getMessage());
            return null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        a7b.f("LA.LCMI", "handleMessage: " + message.what);
        int i = message.what;
        if (i == 100) {
            o();
            return false;
        }
        if (i != 101) {
            return false;
        }
        this.u.removeMessages(101);
        if (l()) {
            return false;
        }
        this.v.y();
        return false;
    }

    @Override // com.oplus.aiunit.vision.wr9
    public void init(Context context) {
        this.f4930n = context;
        r70<MyDevicesInterface> r70Var = new r70<>("linkage", context, n(), new r70.e() { // from class: com.oplus.aiunit.vision.cya
            @Override // com.oplus.aiunit.vision.r70.e
            public final Object a(IBinder iBinder) {
                return MyDevicesInterface.Stub.asInterface(iBinder);
            }
        }, new r70.f() { // from class: com.oplus.aiunit.vision.dya
            @Override // com.oplus.aiunit.vision.r70.f
            public final void a(IBinder iBinder) {
                this.a.t(iBinder);
            }
        }, new r70.g() { // from class: com.oplus.aiunit.vision.eya
            @Override // com.oplus.aiunit.vision.r70.g
            public final void onDisconnected() {
                this.a.u();
            }
        });
        this.v = r70Var;
        r70Var.r(new r70.d() { // from class: com.oplus.aiunit.vision.fya
            @Override // com.oplus.aiunit.vision.r70.d
            public final void onDead() {
                this.a.v();
            }
        });
        y();
        gl4.devicePrimary.nodeApi.g(this);
    }

    public final void k() {
        if (!l()) {
            A();
            return;
        }
        this.u.removeMessages(101);
        if (this.f4928j == null) {
            z();
        }
    }

    public final boolean l() {
        boolean zIsCurrentConnected = gl4.managerApi.isCurrentConnected();
        a7b.f("LA.LCMI", "checkNeedKeepLongBinder: connected " + zIsCurrentConnected + ", mIsShowCard " + this.p + ", mIsLinkageSwitch " + this.q + ", mKeepLongLinkageWatch " + this.o + ", mNotifyAppAliveFlag " + this.s);
        if (fq5.k()) {
            a7b.b("LA.LCMI", "checkNeedKeepLongBinder mydevice app is error version,fix");
            return true;
        }
        if (!zIsCurrentConnected) {
            return false;
        }
        if (!this.r) {
            a7b.f("LA.LCMI", "checkNeedKeepLongBinder : old device support keep alive");
            return true;
        }
        if (fq5.i()) {
            return this.p || this.q || this.o;
        }
        return this.p;
    }

    public final boolean m(int i, int i2) {
        return (i & i2) > 0;
    }

    public final Intent n() {
        Intent intent = new Intent();
        intent.setPackage(Constants.PACKAGE_NAME_MY_DEVICE);
        intent.setAction(Constants.ACTION_MY_DEVICE_SERVICE);
        return intent;
    }

    @Nullable
    public MyDevicesInterface o() {
        if (yxa.c(b78.a())) {
            return (MyDevicesInterface) this.v.u();
        }
        a7b.b("LA.LCMI", "LinkageApp init fail");
        return null;
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(Node node) {
        k();
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(Node node) {
        this.o = false;
        k();
    }

    public final void p(Intent intent) {
        int intExtra = intent.getIntExtra("flag", 0);
        this.p = m(intExtra, 1);
        this.q = m(intExtra, 2);
        this.s = intExtra;
        a7b.f("LA.LCMI", "handleNotifyAppAlive: flag " + intExtra);
        B();
        k();
        C();
    }

    public final void q(Intent intent) {
        if (this.f4928j != null) {
            return;
        }
        Bundle bundleB = vda.b(intent, "extra");
        fa5 fa5Var = this.m;
        if (fa5Var != null) {
            fa5Var.call(Constants.CODE_NOTIFY_EVENT, bundleB);
        }
    }

    public final void r() {
        try {
            if (this.f4928j == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("authority", "com.heytap.health.WatchProvider");
            bundle.putBinder("callback", this.k);
            bundle.putBoolean(Constants.KEY_SUPPORT_AUDIO_CONN, true);
            bundle.putString("package_name", this.f4930n.getPackageName());
            Bundle bundleCall = this.f4928j.call(0, bundle);
            if (bundleCall == null) {
                a7b.m("LA.LCMI", "initDeviceApi: result == null ");
                return;
            }
            a7b.f("LA.LCMI", "initMyDevice: resultCode " + bundleCall.getInt("result_code"));
        } catch (RemoteException e2) {
            a7b.b("LA.LCMI", "initDeviceApi RemoteException:" + e2.getMessage());
        }
    }

    public final void x() {
        if (l()) {
            z();
        }
    }

    public final void y() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(Constants.ACTION_NOTIFY_APP_ALIVE);
            intentFilter.addAction(Constants.ACTION_NOTIFY_EVENT);
            rdf.a(this.f4930n, this.f4929l, intentFilter, 2);
        } catch (Exception e2) {
            a7b.m("LA.LCMI", "registerReceiver: " + e2.getMessage());
        }
    }

    public final void z() {
        this.u.sendEmptyMessage(100);
    }
}

package com.heytap.msp.sdk.core;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.msp.IBizBinder;
import com.heytap.msp.bean.BaseRequest;
import com.heytap.msp.bean.BizRequest;
import com.heytap.msp.bean.Request;
import com.heytap.msp.bean.Response;
import com.heytap.msp.sdk.base.BaseSdkAgent;
import com.heytap.msp.sdk.base.common.BrandConstant;
import com.heytap.msp.sdk.base.common.Constants;
import com.heytap.msp.sdk.base.common.executor.impl.ThreadExecutor;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.heytap.msp.sdk.base.common.util.AppUtils;
import com.heytap.msp.sdk.base.common.util.DeviceUtils;
import com.heytap.msp.sdk.base.common.util.JsonUtil;
import com.heytap.msp.sdk.base.common.util.Md5Util;
import com.heytap.msp.sdk.common.utils.ActivityLifeCallBack;
import com.heytap.msp.sdk.common.utils.Reflector;
import com.heytap.msp.sdk.common.utils.SdkConstant;
import com.heytap.msp.sdk.common.utils.SdkUtil;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public Context a;
    public volatile IBizBinder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f7372c;
    public AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConcurrentLinkedQueue<k> f7373e;
    public ConcurrentLinkedQueue<k> f;
    public Handler g;
    public volatile boolean h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f7374j;
    public volatile boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7375l;
    public List<String> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IBinder.DeathRecipient f7376n;
    public ServiceConnection o;
    public ServiceConnection p;

    /* JADX INFO: renamed from: com.heytap.msp.sdk.core.a$a, reason: collision with other inner class name */
    public class C0721a implements IBinder.DeathRecipient {
        public C0721a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            String str;
            String str2;
            synchronized (j.a) {
                a.this.Z();
                a.this.b = null;
                BaseSdkAgent.getInstance().notifyAllCallback();
                BaseSdkAgent.getInstance().notifyServerDiedListener();
                if (!a.this.f.isEmpty()) {
                    a.this.f.clear();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (ActivityLifeCallBack.getInstance().getActivity() == null) {
                    a.this.d.set(true);
                    str = "IpcConnectionManager";
                    str2 = "deathRecipient | Set mNeedConn into true, do not reconnect.";
                } else if (jCurrentTimeMillis - a.this.f7372c > 30000) {
                    MspLog.i("IpcConnectionManager", "deathRecipient | reconnect.");
                    a.this.u();
                    a.this.f7372c = jCurrentTimeMillis;
                } else {
                    str = "IpcConnectionManager";
                    str2 = "deathRecipient | less than 30s, do not reconnect.";
                }
                MspLog.i(str, str2);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SdkUtil.isInstallAppCustom(a.this.a)) {
                return;
            }
            a.M().X();
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            a aVar;
            ServiceConnection serviceConnectionP;
            int i = message.what;
            MspLog.d("IpcConnectionManager", "IpcHandler handleMessage, what:" + i);
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        aVar = a.this;
                        serviceConnectionP = aVar.P();
                    } else if (i == 3) {
                        a.this.t(true);
                        return;
                    } else if (i == 4) {
                        a.this.W();
                        return;
                    } else {
                        if (i != 5) {
                            return;
                        }
                        aVar = a.this;
                        serviceConnectionP = aVar.J();
                    }
                    aVar.k(serviceConnectionP);
                    return;
                }
                a aVar2 = a.this;
                aVar2.k(aVar2.P());
            }
            a.this.B();
        }
    }

    public class d extends ResultReceiver {
        public d(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            super.onReceiveResult(i, bundle);
            if (BaseSdkAgent.getInstance().getUpgradeCallback() != null) {
                BaseSdkAgent.getInstance().getUpgradeCallback().onResult((Response) JsonUtil.jsonToBean(bundle.getString("data"), Response.class));
            }
        }
    }

    public class e extends ResultReceiver {
        public e(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            super.onReceiveResult(i, bundle);
            if (i == 6667) {
                a.this.g(0, 0);
            }
        }
    }

    public class f extends ResultReceiver {
        public f(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            super.onReceiveResult(i, bundle);
            if (i == 8889) {
                MspLog.d("IpcConnectionManager", "ResultReceiver App service started.");
                a.this.g(2, 0);
            }
        }
    }

    public class g extends ResultReceiver {
        final /* synthetic */ Class a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Handler handler, Class cls, String str) {
            super(handler);
            this.a = cls;
            this.b = str;
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            super.onReceiveResult(i, bundle);
            if (i == 6666) {
                Response response = (Response) JsonUtil.jsonToBean(bundle.getString("data"), this.a);
                MspLog.d("IpcConnectionManager", "Application ResultReceiver, response data:" + response.toString());
                BaseSdkAgent.getInstance().notifyInnerCallback(this.b, response);
            } else {
                MspLog.e("IpcConnectionManager", "Intent execute error");
                BaseSdkAgent.getInstance().notifyInnerCallback(this.b, Response.create(bundle.getInt("code"), bundle.getString("message"), this.a));
            }
            if (a.this.t(false) == null) {
                a.this.g(2, 0);
            }
            a.this.g(0, 0);
        }
    }

    public class h implements ServiceConnection {
        public h() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (j.a) {
                a.this.h = false;
                MspLog.d("IpcConnectionManager", "AIDL onServiceConnected()");
                a.this.b = IBizBinder.Stub.asInterface(iBinder);
                a.this.T();
                try {
                    iBinder.linkToDeath(a.this.f7376n, 0);
                } catch (RemoteException e2) {
                    MspLog.e("IpcConnectionManager", e2.getClass().getSimpleName() + ":" + e2.getMessage());
                }
                if (!a.this.f.isEmpty() && ((k) a.this.f.peek()).f7378c == 1) {
                    if (a.this.g != null) {
                        a.this.g.removeMessages(1);
                    }
                    a.this.g(0, 0);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (j.a) {
                MspLog.d("IpcConnectionManager", "AIDL onServiceDisconnected()");
                a.this.Z();
                BaseSdkAgent.getInstance().notifyServerDiedListener();
                a.this.b = null;
                if (!a.this.f.isEmpty()) {
                    a.this.f.clear();
                }
            }
        }
    }

    public class i implements ServiceConnection {
        public i() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MspLog.iIgnore("IpcConnectionManager", "empty service connected");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MspLog.iIgnore("IpcConnectionManager", "empty service disconnected");
            BaseSdkAgent.getInstance().notifyServerDiedListener();
        }
    }

    public static class j {
        public static final a a = new a(null);
    }

    public final class k<T extends Response> {
        public Request a;
        public Class<T> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7378c;

        public k(Request request, Class<T> cls, int i) {
            this.a = request;
            this.b = cls;
            this.f7378c = i;
        }
    }

    public static class l {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f7379c;

        public l() {
            this.a = null;
            this.b = null;
            this.f7379c = null;
        }

        public /* synthetic */ l(C0721a c0721a) {
            this();
        }
    }

    public a() {
        this.f7372c = 0L;
        this.d = new AtomicBoolean(false);
        this.f7373e = new ConcurrentLinkedQueue<>();
        this.f = new ConcurrentLinkedQueue<>();
        this.g = null;
        this.h = false;
        this.i = 0L;
        this.f7374j = false;
        this.k = false;
        this.f7375l = "com.heytap.htms.BinderProvider";
        this.m = Arrays.asList("MEIZU");
        this.f7376n = new C0721a();
        this.o = null;
        this.p = null;
    }

    public static a M() {
        return j.a;
    }

    public void A() {
        MspLog.iIgnore("IpcConnectionManager", "destroy");
        Z();
        Y();
        a0();
        if (this.f7373e.isEmpty()) {
            return;
        }
        this.f7373e.clear();
    }

    public final synchronized void B() {
        if (!this.f.isEmpty()) {
            MspLog.d("IpcConnectionManager", "doNext mRequestingQueue size : " + this.f.size());
            this.f.clear();
        }
        MspLog.d("IpcConnectionManager", "doNext mRequestWaitQueue size : " + this.f7373e.size());
        if (!this.f7373e.isEmpty()) {
            k kVarPoll = this.f7373e.poll();
            if (kVarPoll == null) {
                return;
            }
            int i2 = kVarPoll.f7378c;
            if (i2 == 0) {
                if (!kVarPoll.a.getBizRequest().isSilentMode() || H() == null) {
                    m(kVarPoll.a, kVarPoll.b);
                } else {
                    BaseSdkAgent.getInstance().connectAppUseAidl(kVarPoll.a, kVarPoll.b);
                }
            } else if (i2 == 1) {
                f();
            }
        }
    }

    public final ResultReceiver E() {
        return c(new e(null));
    }

    public final ResultReceiver G() {
        return c(new d(null));
    }

    public synchronized IBizBinder H() {
        if (this.b == null || !this.b.asBinder().isBinderAlive()) {
            MspLog.d("IpcConnectionManager", "getBinder | binder is null.");
            return null;
        }
        MspLog.d("IpcConnectionManager", "getBinder | binder is available.");
        return this.b;
    }

    public final ServiceConnection J() {
        if (this.p == null) {
            this.p = new i();
        }
        return this.p;
    }

    public String O() {
        IBizBinder iBizBinderH;
        if (Build.VERSION.SDK_INT >= 30 && (iBizBinderH = H()) != null) {
            try {
                return iBizBinderH.getVersionInfo();
            } catch (Throwable th) {
                MspLog.e("IpcConnectionManager", "getMspVersionInfoByProvider: " + th.getMessage());
            }
        }
        return "";
    }

    public final synchronized ServiceConnection P() {
        if (this.o == null) {
            this.o = new h();
        }
        return this.o;
    }

    public final boolean S() {
        try {
            return BaseSdkAgent.getInstance().getContext().getPackageManager().getPackageInfo("com.heytap.htms", 16384).versionCode >= 1040200;
        } catch (PackageManager.NameNotFoundException unused) {
            MspLog.e("IpcConnectionManager", "getPackageInfo Error");
            return false;
        }
    }

    public final void T() {
        try {
            this.b.registerClientProxy(AppUtils.getPackageName(), new com.heytap.msp.a());
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public void U() {
        if (this.d.getAndSet(false)) {
            MspLog.i("IpcConnectionManager", "restore2Foreground | connectApp");
            if (Build.VERSION.SDK_INT < 30 || SdkUtil.isInstallTargetVersionApp(this.a)) {
                u();
            } else {
                ThreadExecutor.getInstance().execute(new b());
            }
        }
    }

    public final synchronized boolean V() {
        if (this.b != null && this.b.asBinder().isBinderAlive()) {
            MspLog.d("IpcConnectionManager", "shouldConnectAppForProvider binder is valid.");
            return false;
        }
        Handler handler = this.g;
        if (handler != null && handler.hasMessages(3)) {
            return false;
        }
        if (this.k) {
            return false;
        }
        this.k = true;
        return true;
    }

    public final synchronized void W() {
        String stackTrace;
        String str;
        if (this.b != null && this.b.asBinder().isBinderAlive()) {
            MspLog.iIgnore("IpcConnectionManager", "tryConnectApp binder is valid.");
            return;
        }
        boolean zS = S();
        this.f7374j = zS;
        Activity activity = ActivityLifeCallBack.getInstance().getActivity();
        StringBuilder sb = new StringBuilder();
        sb.append("tryConnectApp() hasServiceAct = ");
        sb.append(zS);
        sb.append(", activity = ");
        sb.append(activity == null ? "null" : activity.getClass().getSimpleName());
        MspLog.iIgnore("IpcConnectionManager", sb.toString());
        if (!zS || SdkUtil.mustDownloadDestVersionApp(this.a)) {
            Intent intent = new Intent();
            intent.setPackage(this.a.getPackageName());
            intent.setComponent(new ComponentName("com.heytap.htms", SdkConstant.APP_DIALOG_ACT));
            intent.putExtra("flag", 8888);
            try {
                if (activity != null) {
                    activity.startActivity(intent);
                } else {
                    intent.addFlags(276824064);
                    this.a.startActivity(intent);
                }
                g(2, 2000);
            } catch (Throwable th) {
                stackTrace = MspLog.getStackTrace(th);
                str = "IpcConnectionManager";
                MspLog.iIgnore(str, stackTrace);
            }
        } else {
            Intent intent2 = new Intent();
            intent2.setPackage(this.a.getPackageName());
            intent2.setComponent(new ComponentName("com.heytap.htms", SdkConstant.APP_SERVICE_ACT));
            intent2.putExtra(SdkConstant.APP_RESULT_RECEIVER, b(null, null, null, 1));
            intent2.putExtra("flag", 8888);
            try {
                if (activity != null) {
                    activity.startActivity(intent2);
                } else {
                    intent2.addFlags(276824064);
                    this.a.startActivity(intent2);
                }
            } catch (Throwable th2) {
                stackTrace = MspLog.getStackTrace(th2);
                str = "IpcConnectionManager";
                MspLog.iIgnore(str, stackTrace);
            }
        }
    }

    public synchronized void X() {
        MspLog.iIgnore("IpcConnectionManager", "tryConnectAppForce()");
        g(4, 0);
    }

    public final void Y() {
        MspLog.d("IpcConnectionManager", "unbindService");
        ServiceConnection serviceConnection = this.p;
        if (serviceConnection != null) {
            v(serviceConnection);
        }
        ServiceConnection serviceConnection2 = this.o;
        if (serviceConnection2 != null) {
            v(serviceConnection2);
        }
    }

    public final synchronized void Z() {
        try {
            if (this.b != null) {
                this.b.asBinder().unlinkToDeath(this.f7376n, 0);
            }
        } catch (Exception e2) {
            MspLog.e("IpcConnectionManager", e2.getClass().getSimpleName() + ":" + e2.getMessage());
        }
    }

    public final void a0() {
        try {
            this.b.unregisterClientProxy(AppUtils.getPackageName());
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public final <T extends Response> ResultReceiver b(Context context, Class<T> cls, String str, int i2) {
        ResultReceiver gVar;
        System.currentTimeMillis();
        if (i2 == 1) {
            gVar = new f(null);
        } else {
            if (context == null) {
                return null;
            }
            boolean z = context instanceof Activity;
            gVar = new g(null, cls, str);
        }
        return c(gVar);
    }

    public final ResultReceiver c(ResultReceiver resultReceiver) {
        Parcel parcelObtain = Parcel.obtain();
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return resultReceiver2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #1 {, blocks: (B:16:0x0034, B:19:0x003a, B:20:0x0046, B:24:0x0078, B:27:0x0089, B:23:0x0053, B:26:0x007f, B:32:0x0090, B:33:0x0093, B:14:0x002b), top: B:39:0x0002, inners: #0, #4 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[Catch: all -> 0x0094, TryCatch #1 {, blocks: (B:16:0x0034, B:19:0x003a, B:20:0x0046, B:24:0x0078, B:27:0x0089, B:23:0x0053, B:26:0x007f, B:32:0x0090, B:33:0x0093, B:14:0x002b), top: B:39:0x0002, inners: #0, #4 }] */
    @Nullable
    public synchronized IBizBinder e(boolean z) {
        IBizBinder iBizBinderAsInterface;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        iBizBinderAsInterface = null;
        try {
            contentProviderClientAcquireUnstableContentProviderClient = this.a.getContentResolver().acquireUnstableContentProviderClient(Uri.parse("content://com.heytap.htms.BinderProvider"));
            try {
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getBizBinder", null, null);
                if (bundleCall != null) {
                    iBizBinderAsInterface = IBizBinder.Stub.asInterface(bundleCall.getBinder("bizBinder"));
                }
            } catch (Throwable th) {
                th = th;
                try {
                    MspLog.d("IpcConnectionManager", MspLog.getStackTrace(th));
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    }
                    if (iBizBinderAsInterface != null) {
                        MspLog.d("IpcConnectionManager", "bizBinder is obtained by provider");
                        this.b = iBizBinderAsInterface;
                        T();
                        try {
                            this.b.asBinder().linkToDeath(this.f7376n, 0);
                        } catch (RemoteException e2) {
                            MspLog.e("IpcConnectionManager", e2.getClass().getSimpleName() + ":" + e2.getMessage());
                        }
                        g(5, 0);
                    } else if (z) {
                        MspLog.d("IpcConnectionManager", "bizBinder is not obtained by provider, bind service");
                        f();
                    }
                    this.k = false;
                    return iBizBinderAsInterface;
                } catch (Throwable th2) {
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
        contentProviderClientAcquireUnstableContentProviderClient.close();
        if (iBizBinderAsInterface != null) {
            MspLog.d("IpcConnectionManager", "bizBinder is obtained by provider");
            this.b = iBizBinderAsInterface;
            T();
            this.b.asBinder().linkToDeath(this.f7376n, 0);
            g(5, 0);
        } else if (z) {
            MspLog.d("IpcConnectionManager", "bizBinder is not obtained by provider, bind service");
            f();
        }
        this.k = false;
        return iBizBinderAsInterface;
    }

    public final synchronized void f() {
        String str;
        String str2;
        if (this.b != null && this.b.asBinder().isBinderAlive()) {
            MspLog.d("IpcConnectionManager", "connectApp binder is valid.");
            return;
        }
        if (SdkUtil.isInstallTargetVersionApp(this.a)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.h && jCurrentTimeMillis - this.i < 5000) {
                MspLog.d("IpcConnectionManager", "connectApp too frequent.");
                return;
            }
            this.h = true;
            this.i = jCurrentTimeMillis;
            boolean zS = S();
            this.f7374j = zS;
            Activity activity = ActivityLifeCallBack.getInstance().getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append("connectApp() hasServiceAct = ");
            sb.append(zS);
            sb.append(", activity = ");
            sb.append(activity == null ? "null" : activity.getClass().getSimpleName());
            MspLog.d("IpcConnectionManager", sb.toString());
            if (!zS || SdkUtil.mustDownloadDestVersionApp(this.a)) {
                Intent intent = new Intent();
                intent.setPackage(this.a.getPackageName());
                intent.setComponent(new ComponentName("com.heytap.htms", SdkConstant.APP_DIALOG_ACT));
                intent.putExtra("flag", 8888);
                try {
                    if (activity != null) {
                        activity.startActivity(intent);
                        g(2, 2000);
                    } else {
                        k kVar = new k(null, null, 1);
                        if (this.f.isEmpty()) {
                            MspLog.d("IpcConnectionManager", "connectApp() context is Application, startCoreActivity");
                            intent.addFlags(276824064);
                            this.a.startActivity(intent);
                            this.f.offer(kVar);
                            g(1, 2000);
                        } else {
                            this.f7373e.offer(kVar);
                            MspLog.d("IpcConnectionManager", "connectApp() context is Application, queue");
                            g(0, 3000);
                        }
                    }
                } catch (Exception e2) {
                    str = "connectApp only one CoreActivity: " + e2.getMessage();
                    str2 = "IpcConnectionManager";
                    MspLog.e(str2, str);
                }
            } else {
                Intent intent2 = new Intent();
                intent2.setPackage(this.a.getPackageName());
                intent2.setComponent(new ComponentName("com.heytap.htms", SdkConstant.APP_SERVICE_ACT));
                ResultReceiver resultReceiverB = b(null, null, null, 1);
                ResultReceiver resultReceiverG = G();
                intent2.putExtra(SdkConstant.APP_RESULT_RECEIVER, resultReceiverB);
                intent2.putExtra(SdkConstant.APP_UPGRADE_RECEIVER, resultReceiverG);
                intent2.putExtra("flag", 8888);
                try {
                    if (activity != null) {
                        activity.startActivity(intent2);
                    } else {
                        intent2.addFlags(276824064);
                        this.a.startActivity(intent2);
                    }
                } catch (Exception e3) {
                    str = "connectApp hasServiceAct: " + e3.getMessage();
                    str2 = "IpcConnectionManager";
                    MspLog.e(str2, str);
                }
            }
        }
    }

    public void g(int i2, int i3) {
        synchronized (this) {
            if (this.g == null) {
                HandlerThread handlerThread = new HandlerThread("ipc handlerThread");
                handlerThread.start();
                this.g = new c(handlerThread.getLooper());
            }
            if (i2 == 0) {
                MspLog.iIgnore("IpcConnectionManager", "handleNextReq MSG_WHAT_NEXT");
                if (!this.g.hasMessages(0)) {
                    this.g.sendEmptyMessageDelayed(i2, i3);
                    MspLog.iIgnore("IpcConnectionManager", "sendEmptyMessageDelayed MSG_WHAT_NEXT");
                }
            } else {
                this.g.sendEmptyMessageDelayed(i2, i3);
            }
        }
    }

    public void h(Context context) {
        this.a = context;
    }

    public final void i(Context context, Intent intent) {
        MspLog.d("IpcConnectionManager", "startBizActivityDirectly");
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final synchronized void j(Context context, k kVar) {
        if (kVar != null) {
            if (kVar.f7378c == 0) {
                Intent intent = new Intent();
                intent.setPackage(this.a.getPackageName());
                intent.setComponent(new ComponentName("com.heytap.htms", SdkConstant.APP_DIALOG_ACT));
                ResultReceiver resultReceiverB = b(context, kVar.b, kVar.a.getRequestId(), kVar.f7378c);
                ResultReceiver resultReceiverG = G();
                ResultReceiver resultReceiverE = E();
                if (resultReceiverB == null) {
                    return;
                }
                intent.putExtra("flag", -8888);
                intent.putExtra(SdkConstant.APP_RESULT_RECEIVER, resultReceiverB);
                intent.putExtra(SdkConstant.APP_UPGRADE_RECEIVER, resultReceiverG);
                intent.putExtra(SdkConstant.APP_NOTIFY_RECEIVER, resultReceiverE);
                int mspAppVersionCode = AppUtils.getMspAppVersionCode(this.a);
                l lVar = new l(null);
                if (mspAppVersionCode < 1050000) {
                    l(kVar.a, lVar);
                    intent.putExtra("request", kVar.a);
                } else {
                    intent.putExtra("request_json", JsonUtil.beanToJson(kVar.a));
                }
                if (this.f.isEmpty()) {
                    if (context instanceof Activity) {
                        MspLog.d("IpcConnectionManager", "startAppCoreActivity() context is Activity");
                    } else {
                        intent.addFlags(276824064);
                        MspLog.d("IpcConnectionManager", "startAppCoreActivity() context is Application, startActivity");
                    }
                    context.startActivity(intent);
                    this.f.offer(kVar);
                } else {
                    this.f7373e.offer(kVar);
                    MspLog.d("IpcConnectionManager", "startAppCoreActivity(), queue");
                    g(0, 3000);
                }
                if (mspAppVersionCode < 1050000) {
                    w(kVar.a, lVar);
                }
            }
        }
    }

    public final void k(ServiceConnection serviceConnection) {
        MspLog.d("IpcConnectionManager", "AIDL bindService()");
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.htms", SdkConstant.APP_SERVICE));
        intent.setAction(SdkConstant.APP_BIZ_SERVICE_ACTION);
        this.a.bindService(intent, serviceConnection, 1);
    }

    public final void l(Request request, l lVar) {
        try {
            p(request, lVar);
            p(request.getBaseRequest(), lVar);
            p(request.getBizRequest(), lVar);
        } catch (Exception e2) {
            MspLog.e("IpcConnectionManager", "checkRequest reflect: " + e2.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T extends Response> void m(Request request, Class<T> cls) {
        Response responseCreate;
        BaseSdkAgent baseSdkAgent;
        Context activity = ActivityLifeCallBack.getInstance().getActivity();
        StringBuilder sb = new StringBuilder();
        sb.append("connectAppWithIntent() request = ");
        sb.append(request.toString());
        sb.append("\n, activity = ");
        sb.append(activity == null ? "null" : activity.getClass().getSimpleName());
        MspLog.d("IpcConnectionManager", sb.toString());
        try {
            try {
                Intent intentS = s(request, cls);
                if (intentS == null) {
                    try {
                        MspLog.iIgnore("IpcConnectionManager", "intent from provider is null , use core act");
                        j(activity != null ? activity : this.a, new k(request, cls, 0));
                    } catch (Exception e2) {
                        MspLog.e("IpcConnectionManager", "connectAppWithIntent startAppCoreActivity Exception catch: " + e2.getMessage());
                        BaseSdkAgent.getInstance().notifyInnerCallback(request, Response.create(20507, "start app core activity fail", cls));
                    }
                } else if (intentS.getIntExtra("biz_has_done", 0) != 1) {
                    MspLog.d("IpcConnectionManager", "Intent from provider is obtained, " + intentS.toUri(0));
                    i(activity == null ? this.a : activity, intentS);
                }
            } catch (SecurityException e3) {
                try {
                    if (TextUtils.equals(BrandConstant.VV_X20, Md5Util.md5Digest(Build.MODEL.toUpperCase()))) {
                        Intent intent = new Intent();
                        intent.addFlags(268435456);
                        intent.setComponent(new ComponentName(DeviceUtils.getVvx20PackageXor8(), DeviceUtils.getVvx20ComponentXor8()));
                        this.a.startActivity(intent);
                    } else {
                        BaseSdkAgent.getInstance().notifyInnerCallback(request, Response.create(20507, "start app core activity fail", cls));
                    }
                } catch (Exception unused) {
                    MspLog.e("IpcConnectionManager", "connectAppWithIntent SecurityException catch: " + e3.getMessage());
                    BaseSdkAgent baseSdkAgent2 = BaseSdkAgent.getInstance();
                    responseCreate = Response.create(20507, "start app core activity fail", cls);
                    baseSdkAgent = baseSdkAgent2;
                    baseSdkAgent.notifyInnerCallback(request, responseCreate);
                }
            }
        } catch (Exception e4) {
            MspLog.e("IpcConnectionManager", "connectAppWithIntent: " + e4.getMessage());
            try {
                MspLog.iIgnore("IpcConnectionManager", "use core act");
                if (activity == null) {
                    activity = this.a;
                }
                j(activity, new k(request, cls, 0));
            } catch (Exception e5) {
                MspLog.e("IpcConnectionManager", "connectAppWithIntent startAppCoreActivity Exception catch: " + e5.getMessage());
                BaseSdkAgent baseSdkAgent3 = BaseSdkAgent.getInstance();
                responseCreate = Response.create(20507, "start app core activity fail", cls);
                baseSdkAgent = baseSdkAgent3;
                baseSdkAgent.notifyInnerCallback(request, responseCreate);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    public final void p(Object obj, l lVar) throws Reflector.ReflectedException {
        String name = obj.getClass().getName();
        Reflector reflectorField = Reflector.on((Class<?>) Class.class).field("name");
        boolean z = true;
        if (obj instanceof Request) {
            if (Constants.APP_REQUEST_CLAZZ_NAME.equals(name)) {
                z = false;
            } else {
                reflectorField.set(obj.getClass(), Constants.APP_REQUEST_CLAZZ_NAME);
                lVar.a = name;
            }
        } else if (obj instanceof BaseRequest) {
            if (Constants.APP_REQUEST_BASE_REQ_CLAZZ_NAME.equals(name)) {
                z = false;
            } else {
                reflectorField.set(obj.getClass(), Constants.APP_REQUEST_BASE_REQ_CLAZZ_NAME);
                lVar.b = name;
            }
        } else if (!(obj instanceof BizRequest) || Constants.APP_REQUEST_BIZ_REQ_CLAZZ_NAME.equals(name)) {
            z = false;
        } else {
            reflectorField.set(obj.getClass(), Constants.APP_REQUEST_BIZ_REQ_CLAZZ_NAME);
            lVar.f7379c = name;
        }
        if (z) {
            MspLog.iIgnore("IpcConnectionManager", "adjustClassName klazzName: " + name + "-->" + obj.getClass().getName());
        }
    }

    public boolean r(String str) {
        return this.m.contains(str.toUpperCase());
    }

    public final <T extends Response> Intent s(Request request, Class<T> cls) throws Throwable {
        Throwable th;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        String str;
        Uri uri = Uri.parse("content://com.heytap.htms.BinderProvider");
        Bundle bundle = new Bundle();
        bundle.putSerializable("request", request);
        bundle.putParcelable(SdkConstant.APP_RESULT_RECEIVER, b(this.a, cls, request.getRequestId(), 0));
        Intent intent = null;
        try {
            contentProviderClientAcquireUnstableContentProviderClient = this.a.getContentResolver().acquireUnstableContentProviderClient(uri);
            try {
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("getBizIntent", null, bundle);
                if (bundleCall != null) {
                    intent = (Intent) bundleCall.getParcelable("intent");
                    str = intent == null ? "Intent from provider is null" : "Bundle from provider is null";
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                    return intent;
                }
                MspLog.e("IpcConnectionManager", str);
                contentProviderClientAcquireUnstableContentProviderClient.close();
                return intent;
            } catch (Throwable th2) {
                th = th2;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        }
    }

    public synchronized IBizBinder t(boolean z) {
        if (H() == null) {
            return e(z);
        }
        this.k = false;
        return this.b;
    }

    public synchronized void u() {
        MspLog.d("IpcConnectionManager", "connectAppByProvider()");
        if (V()) {
            g(3, 0);
        }
    }

    public final void v(ServiceConnection serviceConnection) {
        try {
            this.a.unbindService(serviceConnection);
        } catch (Exception e2) {
            MspLog.d("IpcConnectionManager", e2.getMessage());
        }
    }

    public final void w(Request request, l lVar) {
        try {
            y(request, lVar);
            y(request.getBaseRequest(), lVar);
            y(request.getBizRequest(), lVar);
        } catch (Exception e2) {
            MspLog.e("IpcConnectionManager", "restoreRequest reflect: " + e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    public final void y(Object obj, l lVar) throws Reflector.ReflectedException {
        Class<?> cls;
        String str;
        String name = obj.getClass().getName();
        Reflector reflectorField = Reflector.on((Class<?>) Class.class).field("name");
        boolean z = true;
        if (obj instanceof Request) {
            if (TextUtils.isEmpty(lVar.a)) {
                z = false;
            } else {
                cls = obj.getClass();
                str = lVar.a;
                reflectorField.set(cls, str);
            }
        } else if (obj instanceof BaseRequest) {
            if (TextUtils.isEmpty(lVar.b)) {
                z = false;
            } else {
                cls = obj.getClass();
                str = lVar.b;
                reflectorField.set(cls, str);
            }
        } else if (!(obj instanceof BizRequest) || TextUtils.isEmpty(lVar.f7379c)) {
            z = false;
        } else {
            cls = obj.getClass();
            str = lVar.f7379c;
            reflectorField.set(cls, str);
        }
        if (z) {
            MspLog.iIgnore("IpcConnectionManager", "restoreReqClassName klazzName: " + name + "-->" + obj.getClass().getName());
        }
    }

    public /* synthetic */ a(C0721a c0721a) {
        this();
    }
}

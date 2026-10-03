package com.oplus.wearable.linkservice.sdk;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.ja7;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.oxb;
import com.oplus.aiunit.vision.rtc;
import com.oplus.aiunit.vision.v07;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.xc7;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import com.opos.process.bridge.base.BridgeConstant;

/* JADX INFO: loaded from: classes5.dex */
public abstract class WearableListenerService extends Service implements oxb, rtc, ja7 {
    public static final String BIND_INTENT_ACTION = "com.heytap.wearable.linkservice.BIND_LISTENER";
    public volatile int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f20142j = new Object();
    public IBinder k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Intent f20143l;
    public a m;

    public class WearableListener extends IWearableListener.Stub {

        public class a implements Runnable {
            public final /* synthetic */ String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ MessageEvent f20144j;

            public a(String str, MessageEvent messageEvent) {
                this.i = str;
                this.f20144j = messageEvent;
            }

            @Override // java.lang.Runnable
            public void run() {
                WearableListenerService.this.onMessageReceived(this.i, this.f20144j);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ Node i;

            public b(Node node) {
                this.i = node;
            }

            @Override // java.lang.Runnable
            public void run() {
                WearableListenerService.this.onPeerConnected(this.i);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ Node i;

            public c(Node node) {
                this.i = node;
            }

            @Override // java.lang.Runnable
            public void run() {
                WearableListenerService.this.onPeerDisconnected(this.i);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ FileTransferTask i;

            public d(FileTransferTask fileTransferTask) {
                this.i = fileTransferTask;
            }

            @Override // java.lang.Runnable
            public void run() {
                mc7 fileTaskInfo = this.i.toFileTaskInfo();
                String nodeId = this.i.getNodeId();
                xc7.a().b(nodeId, fileTaskInfo);
                WearableListenerService.this.c(nodeId, fileTaskInfo);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ FileTransferTask i;

            public e(FileTransferTask fileTransferTask) {
                this.i = fileTransferTask;
            }

            @Override // java.lang.Runnable
            public void run() {
                mc7 fileTaskInfo = this.i.toFileTaskInfo();
                String nodeId = this.i.getNodeId();
                xc7.a().d(nodeId, fileTaskInfo);
                WearableListenerService.this.a(nodeId, fileTaskInfo);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ FileTransferTask i;

            public f(FileTransferTask fileTransferTask) {
                this.i = fileTransferTask;
            }

            @Override // java.lang.Runnable
            public void run() {
                mc7 fileTaskInfo = this.i.toFileTaskInfo();
                String nodeId = this.i.getNodeId();
                xc7.a().c(nodeId, fileTaskInfo.h());
                WearableListenerService.this.b(nodeId, fileTaskInfo);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void checkFileInfo(FileTransferTask fileTransferTask) throws RemoteException {
            v07.a(fileTransferTask);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
            wil.a("WearableListenerService", "onMessageReceived " + messageEvent);
            WearableListenerService.this.h();
            synchronized (WearableListenerService.this.f20142j) {
                WearableListenerService.this.m.post(new a(str, messageEvent));
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerConnected(Node node) throws RemoteException {
            wil.a("WearableListenerService", "onPeerConnected");
            WearableListenerService.this.h();
            synchronized (WearableListenerService.this.f20142j) {
                WearableListenerService.this.m.post(new b(node));
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerDisconnected(Node node) throws RemoteException {
            wil.a("WearableListenerService", "onPeerDisconnected");
            WearableListenerService.this.h();
            synchronized (WearableListenerService.this.f20142j) {
                WearableListenerService.this.m.post(new c(node));
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferComplete(FileTransferTask fileTransferTask) throws RemoteException {
            WearableListenerService.this.h();
            synchronized (WearableListenerService.this.f20142j) {
                WearableListenerService.this.m.post(new f(fileTransferTask));
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferProgress(FileTransferTask fileTransferTask) throws RemoteException {
            WearableListenerService.this.h();
            synchronized (WearableListenerService.this.f20142j) {
                WearableListenerService.this.m.post(new e(fileTransferTask));
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferRequested(FileTransferTask fileTransferTask) throws RemoteException {
            WearableListenerService.this.h();
            synchronized (WearableListenerService.this.f20142j) {
                WearableListenerService.this.m.post(new d(fileTransferTask));
            }
        }

        private WearableListener() {
        }
    }

    public final class a extends Handler {
        public boolean a;
        public final b b;

        public a(Looper looper) {
            super(looper);
            this.a = false;
            this.b = new b();
        }

        public final synchronized void b() {
            wil.a("WearableListenerService", "acquireL");
            if (!this.a) {
                WearableListenerService wearableListenerService = WearableListenerService.this;
                wearableListenerService.bindService(wearableListenerService.f20143l, this.b, 1);
                this.a = true;
            }
        }

        public final void c() {
            getLooper().quit();
            d("quit");
        }

        public final synchronized void d(String str) {
            wil.a("WearableListenerService", "releaseL:" + str);
            if (this.a) {
                try {
                    WearableListenerService.this.unbindService(this.b);
                } catch (RuntimeException e2) {
                    wil.l("WearableListenerService", "Exception when unbinding from local service", e2);
                }
                this.a = false;
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            b();
            try {
                super.dispatchMessage(message);
            } finally {
                if (!hasMessages(0)) {
                    d(BridgeConstant.PROVIDER_DISPATCH_METHOD);
                }
            }
        }
    }

    public final class b implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        public b() {
        }
    }

    @Override // com.oplus.aiunit.vision.ja7
    public void a(String str, mc7 mc7Var) {
    }

    @Override // com.oplus.aiunit.vision.ja7
    public void b(String str, mc7 mc7Var) {
    }

    @Override // com.oplus.aiunit.vision.ja7
    public void c(String str, mc7 mc7Var) {
    }

    public final void h() throws SecurityException {
        int callingUid = Binder.getCallingUid();
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), 0);
            if (applicationInfo != null && applicationInfo.uid == callingUid) {
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            wil.k("WearableListenerService", "securityCheck: not find self package " + getPackageName());
        }
        if (callingUid != this.i) {
            if (!i(callingUid)) {
                throw new SecurityException("Caller is not Open Wear Service");
            }
            this.i = callingUid;
        }
    }

    public final boolean i(int i) {
        PackageManager packageManager = getPackageManager();
        if (packageManager == null) {
            wil.b("WearableListenerService", "verifyPackage: PackageManager is null");
            return false;
        }
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            wil.b("WearableListenerService", "verifyPackage: Not fount package for Uid[" + i + "]");
            return false;
        }
        for (String str : packagesForUid) {
            if (TextUtils.equals(str, "com.heytap.health")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            wil.b("WearableListenerService", "onBind: Intent is null");
            return null;
        }
        if (TextUtils.equals(intent.getAction(), BIND_INTENT_ACTION)) {
            return this.k;
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        wil.a("WearableListenerService", "onCreate");
        this.k = new WearableListener();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.m = new a(handlerThread.getLooper());
        ComponentName componentName = new ComponentName(this, getClass().getName());
        Intent intent = new Intent(BIND_INTENT_ACTION);
        this.f20143l = intent;
        intent.setComponent(componentName);
    }

    @Override // android.app.Service
    public void onDestroy() {
        wil.a("WearableListenerService", "onDestroy");
        synchronized (this.f20142j) {
            this.m.c();
        }
        super.onDestroy();
    }

    @Override // com.oplus.aiunit.vision.oxb
    public void onMessageReceived(String str, MessageEvent messageEvent) {
    }

    @Override // com.oplus.aiunit.vision.rtc
    public void onPeerConnected(@NonNull Node node) {
    }

    @Override // com.oplus.aiunit.vision.rtc
    public void onPeerDisconnected(@NonNull Node node) {
    }
}

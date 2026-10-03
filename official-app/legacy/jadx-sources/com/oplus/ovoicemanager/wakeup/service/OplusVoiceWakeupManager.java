package com.oplus.ovoicemanager.wakeup.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.oplus.aiunit.vision.x8d;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
public class OplusVoiceWakeupManager {
    public static Handler d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f20048e = null;
    public static x8d f = null;
    public static OplusVoiceWakeupManager g = null;
    public static volatile boolean h = false;
    public IVoiceWakeupManager a = null;
    public ServiceConnection b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder.DeathRecipient f20049c = new b();

    public static class HotwordRecordingListenerStub extends HotwordRecordingListener.Stub {
        private HotwordRecordingListener mHotwordListener;

        public class a implements Runnable {
            public final /* synthetic */ byte[] i;

            public a(byte[] bArr) {
                this.i = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (HotwordRecordingListenerStub.this.mHotwordListener != null) {
                        HotwordRecordingListenerStub.this.mHotwordListener.onBufferReceive(this.i);
                    }
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }

        public HotwordRecordingListenerStub(HotwordRecordingListener hotwordRecordingListener) {
            this.mHotwordListener = hotwordRecordingListener;
        }

        private void executeOnMainThread(Runnable runnable) {
            OplusVoiceWakeupManager.d.post(runnable);
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public String getClientPackageName() throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.mHotwordListener;
            return hotwordRecordingListener != null ? hotwordRecordingListener.getClientPackageName() : "";
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onBufferReceive(byte[] bArr) {
            executeOnMainThread(new a(bArr));
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onEvent(int i, Bundle bundle) throws RemoteException {
            HotwordRecordingListener hotwordRecordingListener = this.mHotwordListener;
            if (hotwordRecordingListener != null) {
                hotwordRecordingListener.onEvent(i, bundle);
            }
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public void onResult(int i, int i2) throws RemoteException {
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int read(byte[] bArr, int i, int i2) throws RemoteException {
            return -1;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int startRecording(int i) throws RemoteException {
            return -1;
        }

        @Override // com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener
        public int stopRecording() throws RemoteException {
            return -1;
        }
    }

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i("OVMS-OplusVoiceWakeupManager", "onServiceConnected, bind the service success.");
            if (iBinder != null) {
                OplusVoiceWakeupManager.this.a = IVoiceWakeupManager.Stub.asInterface(iBinder);
            }
            boolean unused = OplusVoiceWakeupManager.h = true;
            if (OplusVoiceWakeupManager.f != null) {
                OplusVoiceWakeupManager.f.onServiceConnected();
            } else {
                Log.e("OVMS-OplusVoiceWakeupManager", "onServiceConnected: sOVoiceCallback = null");
            }
            if (iBinder != null) {
                try {
                    iBinder.linkToDeath(OplusVoiceWakeupManager.this.f20049c, 0);
                } catch (RemoteException e2) {
                    Log.e("OVMS-OplusVoiceWakeupManager", "linkToDeath failed: " + e2.getMessage());
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.i("OVMS-OplusVoiceWakeupManager", "onServiceDisconnected, unbind the service success.");
            OplusVoiceWakeupManager unused = OplusVoiceWakeupManager.g = null;
            OplusVoiceWakeupManager.this.a = null;
            boolean unused2 = OplusVoiceWakeupManager.h = false;
            if (OplusVoiceWakeupManager.f != null) {
                OplusVoiceWakeupManager.f.onServiceDisconnected();
            } else {
                Log.e("OVMS-OplusVoiceWakeupManager", "onServiceDisconnected: sOVoiceCallback = null");
            }
        }
    }

    public class b implements IBinder.DeathRecipient {
        public b() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            Log.e("OVMS-OplusVoiceWakeupManager", "binderDied !!");
            if (OplusVoiceWakeupManager.this.a != null) {
                OplusVoiceWakeupManager.this.a.asBinder().unlinkToDeath(OplusVoiceWakeupManager.this.f20049c, 0);
                OplusVoiceWakeupManager.this.a = null;
            }
            boolean unused = OplusVoiceWakeupManager.h = false;
        }
    }

    public static OplusVoiceWakeupManager k(Context context, x8d x8dVar) {
        if (context == null) {
            throw new IllegalArgumentException();
        }
        f20048e = context.getApplicationContext();
        d = new Handler(f20048e.getMainLooper());
        if (x8dVar != null) {
            f = x8dVar;
        } else {
            Log.e("OVMS-OplusVoiceWakeupManager", "getInstance: callback = null");
        }
        if (g == null) {
            synchronized (OplusVoiceWakeupManager.class) {
                if (g == null) {
                    g = new OplusVoiceWakeupManager();
                }
            }
        }
        return g;
    }

    public void h() {
        if (h) {
            return;
        }
        Log.i("OVMS-OplusVoiceWakeupManager", "OVoiceWakeupManager dobind, service:com.oplus.intent.action.HotWordRecord , package:com.oplus.ovoicemanager.wakeup");
        Intent intent = new Intent("com.oplus.intent.action.HotWordRecord");
        intent.setPackage("com.oplus.ovoicemanager.wakeup");
        h = f20048e.bindService(intent, this.b, 1);
        Log.i("OVMS-OplusVoiceWakeupManager", "bind the service com.oplus.ovoicemanager.wakeup result is: " + h);
    }

    public void i() {
        try {
            if (h && this.a.asBinder().isBinderAlive()) {
                this.a.asBinder().unlinkToDeath(this.f20049c, 0);
            }
        } catch (NoSuchElementException e2) {
            Log.e("OVMS-OplusVoiceWakeupManager", "unlinkToDeath failed: " + e2.getMessage());
        }
        if (h) {
            Log.i("OVMS-OplusVoiceWakeupManager", "Enter doUnbind");
            f20048e.unbindService(this.b);
            h = false;
        }
    }

    public int j(IBinder iBinder) {
        try {
            IVoiceWakeupManager iVoiceWakeupManager = this.a;
            if (iVoiceWakeupManager == null) {
                Log.e("OVMS-OplusVoiceWakeupManager", "establishSession failed.");
                return 0;
            }
            iVoiceWakeupManager.establishSession(iBinder);
            return 0;
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public boolean l() {
        return h && this.a != null;
    }

    public int m(int i, Bundle bundle) {
        try {
            IVoiceWakeupManager iVoiceWakeupManager = this.a;
            if (iVoiceWakeupManager == null) {
                Log.e("OVMS-OplusVoiceWakeupManager", "onRecognition failed.");
                return 0;
            }
            iVoiceWakeupManager.onRecognition(i, bundle);
            return 0;
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public int n() {
        try {
            IVoiceWakeupManager iVoiceWakeupManager = this.a;
            if (iVoiceWakeupManager == null) {
                Log.e("OVMS-OplusVoiceWakeupManager", "terminateSession failed.");
                return 0;
            }
            iVoiceWakeupManager.terminateSession();
            return 0;
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }
}

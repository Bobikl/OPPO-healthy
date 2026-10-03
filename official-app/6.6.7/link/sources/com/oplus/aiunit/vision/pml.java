package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class pml extends g6 {
    public String d;
    public Set<ComponentName> e;
    public Set<Integer> f;
    public final RemoteCallbackList<IWearableListener> g;

    public pml(Context context, String str) {
        this(context, null, str);
    }

    @Override // com.oplus.aiunit.vision.g6
    public void b(ComponentName componentName) {
        super.b(componentName);
        this.e.add(componentName);
    }

    @Override // com.oplus.aiunit.vision.g6
    public String c() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.g6
    public void e(DeviceInfo deviceInfo) {
        synchronized (this.g) {
            int iBeginBroadcast = this.g.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((IWearableListener) this.g.getBroadcastItem(i)).onPeerConnected(deviceInfo.toNode());
                } catch (RemoteException e) {
                    uml.b("WearableClientProxy", "handleDeviceConnected: exception " + e.getMessage());
                }
            }
            this.g.finishBroadcast();
        }
        super.e(deviceInfo);
    }

    @Override // com.oplus.aiunit.vision.g6
    public void f(DeviceInfo deviceInfo) {
        synchronized (this.g) {
            int iBeginBroadcast = this.g.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((IWearableListener) this.g.getBroadcastItem(i)).onPeerDisconnected(deviceInfo.toNode());
                } catch (RemoteException e) {
                    uml.b("WearableClientProxy", "handleDeviceDisconnected: exception " + e.getMessage());
                }
            }
            this.g.finishBroadcast();
        }
        super.f(deviceInfo);
    }

    @Override // com.oplus.aiunit.vision.g6
    public void g(FileTransferTask fileTransferTask) {
        super.g(fileTransferTask);
        synchronized (this.g) {
            int iBeginBroadcast = this.g.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                IWearableListener iWearableListener = (IWearableListener) this.g.getBroadcastItem(i);
                try {
                    synchronized (fileTransferTask) {
                        try {
                            boolean zIsChecked = fileTransferTask.isChecked();
                            uml.a("WearableClientProxy", "handleFileTransferComplete: checked=" + zIsChecked);
                            if (!zIsChecked && fileTransferTask.isReceiveTask()) {
                                iWearableListener.checkFileInfo(fileTransferTask);
                                vd7.e().i(fileTransferTask.getTaskId(), fileTransferTask.getErrorCode());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e) {
                    uml.b("WearableClientProxy", "handleFileTransferComplete: check error " + e.getMessage());
                }
                try {
                    iWearableListener.onTransferComplete(fileTransferTask);
                } catch (RemoteException e2) {
                    uml.b("WearableClientProxy", "handleFileTransferComplete: " + e2.getMessage());
                }
            }
            this.g.finishBroadcast();
        }
    }

    @Override // com.oplus.aiunit.vision.g6
    public void h(FileTransferTask fileTransferTask) {
        super.h(fileTransferTask);
        synchronized (this.g) {
            int iBeginBroadcast = this.g.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((IWearableListener) this.g.getBroadcastItem(i)).onTransferProgress(fileTransferTask);
                } catch (RemoteException e) {
                    uml.b("WearableClientProxy", "handleFileTransferProgress: " + e.getMessage());
                }
            }
            this.g.finishBroadcast();
        }
    }

    @Override // com.oplus.aiunit.vision.g6
    public void i(FileTransferTask fileTransferTask) {
        super.i(fileTransferTask);
        synchronized (this.g) {
            int iBeginBroadcast = this.g.beginBroadcast();
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((IWearableListener) this.g.getBroadcastItem(i)).onTransferRequested(fileTransferTask);
                } catch (RemoteException e) {
                    uml.b("WearableClientProxy", "handleFileTransferRequest: " + e.getMessage());
                }
            }
            this.g.finishBroadcast();
        }
    }

    @Override // com.oplus.aiunit.vision.g6
    public void j(String str, MessageEvent messageEvent) {
        super.j(str, messageEvent);
        synchronized (this.g) {
            int iBeginBroadcast = this.g.beginBroadcast();
            uml.d("WearableClientProxy", "dispatch " + messageEvent + " to " + c() + "#" + iBeginBroadcast + " from=" + veb.a(str));
            for (int i = 0; i < iBeginBroadcast; i++) {
                try {
                    ((IWearableListener) this.g.getBroadcastItem(i)).onMessageReceived(str, messageEvent);
                } catch (RemoteException e) {
                    uml.b("WearableClientProxy", "handleMessageEvent: " + e.getMessage());
                }
            }
            this.g.finishBroadcast();
        }
    }

    @Override // com.oplus.aiunit.vision.g6
    public boolean k() {
        return true;
    }

    public void l(IWearableListener iWearableListener) {
        this.g.register(iWearableListener);
    }

    public boolean m(int i) {
        Set<Integer> set = this.f;
        if (set == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i));
    }

    public void n(IWearableListener iWearableListener) {
        this.g.unregister(iWearableListener);
    }

    public boolean o(Set<Integer> set) {
        if (this.f == null) {
            this.f = new HashSet();
        }
        this.f.clear();
        return this.f.addAll(set);
    }

    public String toString() {
        return "WearableClientProxy{mPackageName='" + this.d + "', mServiceCmpNameSet=" + this.e + ", mServiceModuleSet=" + this.f + ", mWearableListeners=" + this.g.getRegisteredCallbackCount() + '}';
    }

    public pml(Context context, Looper looper, String str) {
        super(context, looper);
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new RemoteCallbackList<>();
        this.d = str;
    }
}

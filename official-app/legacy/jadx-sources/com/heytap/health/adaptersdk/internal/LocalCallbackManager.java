package com.heytap.health.adaptersdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.RemoteException;
import com.heytap.health.adaptersdk.IFileCallback;
import com.heytap.health.adaptersdk.IMessageCallback;
import com.heytap.health.adaptersdk.INodeCallback;
import com.heytap.health.adaptersdk.IOAFAdapterService;
import com.heytap.health.adaptersdk.IRunModeCallback;
import com.oplus.aiunit.vision.c2g;
import com.oplus.aiunit.vision.fe8;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.ja7;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.oxb;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.rtc;
import com.oplus.aiunit.vision.ufd;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes15.dex */
public class LocalCallbackManager {
    public static final LocalCallbackManager i = new LocalCallbackManager();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set<oxb> f3081j = new CopyOnWriteArraySet();
    public static final Set<rtc> k = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set<c2g> f3082l = new CopyOnWriteArraySet();
    public b a;
    public BroadcastReceiver b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final INodeCallback f3083c = new INodeCallback.Stub() { // from class: com.heytap.health.adaptersdk.internal.LocalCallbackManager.2
        @Override // com.heytap.health.adaptersdk.INodeCallback
        public void onPeerConnected(Node node) throws RemoteException {
            LocalCallbackManager.this.i(node);
        }

        @Override // com.heytap.health.adaptersdk.INodeCallback
        public void onPeerDisConnected(Node node) throws RemoteException {
            LocalCallbackManager.this.j(node);
        }
    };
    public final IMessageCallback d = new IMessageCallback.Stub() { // from class: com.heytap.health.adaptersdk.internal.LocalCallbackManager.3
        @Override // com.heytap.health.adaptersdk.IMessageCallback
        public void onMessageReceived(String str, MessageEvent messageEvent) throws RemoteException {
            LocalCallbackManager.this.n(str, messageEvent, messageEvent.getSequence());
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IRunModeCallback f3084e = new IRunModeCallback.Stub() { // from class: com.heytap.health.adaptersdk.internal.LocalCallbackManager.4
        @Override // com.heytap.health.adaptersdk.IRunModeCallback
        public void onRunModeChanged(Node node, int i2, int i3) throws RemoteException {
            LocalCallbackManager.this.o(node, i2, i3);
        }
    };
    public final Map<String, Set<ja7>> f = new ConcurrentHashMap();
    public final Set<ja7> g = new HashSet();
    public final IFileCallback.Stub h = new IFileCallback.Stub() { // from class: com.heytap.health.adaptersdk.internal.LocalCallbackManager.5
        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onProgressChanged(String str, FileTransferTask fileTransferTask) throws RemoteException {
            LocalCallbackManager.this.l(str, fileTransferTask);
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onTransferCompleted(String str, FileTransferTask fileTransferTask) throws RemoteException {
            LocalCallbackManager.this.k(str, fileTransferTask);
        }

        @Override // com.heytap.health.adaptersdk.IFileCallback
        public void onTransferRequested(String str, FileTransferTask fileTransferTask) throws RemoteException {
            LocalCallbackManager.this.m(str, fileTransferTask);
        }
    };

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final LocalCallbackManager localCallbackManager = LocalCallbackManager.this;
            ufd.a(new Runnable() { // from class: com.oplus.aiunit.vision.v3b
                @Override // java.lang.Runnable
                public final void run() {
                    localCallbackManager.p();
                }
            });
        }
    }

    public interface b {
        IOAFAdapterService a();
    }

    public static LocalCallbackManager g() {
        return i;
    }

    public void f(IOAFAdapterService iOAFAdapterService, oxb oxbVar) {
        Set<oxb> set = f3081j;
        synchronized (set) {
            set.add(oxbVar);
            if (iOAFAdapterService != null) {
                try {
                    iOAFAdapterService.addMessageListener(this.d);
                } catch (RemoteException e2) {
                    wil.b("LocalCallbackManager", "addMessageListener: ex " + e2);
                }
            }
        }
    }

    public void h(Context context, b bVar) {
        this.a = bVar;
        Context applicationContext = context.getApplicationContext();
        rdf.a(applicationContext, this.b, new IntentFilter(l9d.a(applicationContext)), 2);
    }

    public void i(Node node) {
        HashSet hashSet;
        wil.a("LocalCallbackManager", "notifyConnected: node " + node);
        if (node == null) {
            wil.b("LocalCallbackManager", "notifyConnected: node is null");
            return;
        }
        Set<rtc> set = k;
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((rtc) it.next()).onPeerConnected(node);
        }
    }

    public void j(Node node) {
        HashSet hashSet;
        wil.a("LocalCallbackManager", "notifyDisConnected: node " + node);
        if (node == null) {
            wil.b("LocalCallbackManager", "notifyConnected: node is null");
            return;
        }
        Set<rtc> set = k;
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((rtc) it.next()).onPeerDisconnected(node);
        }
    }

    public final void k(String str, FileTransferTask fileTransferTask) {
        mc7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
        String strI = fileTaskInfo.i();
        wil.a("LocalCallbackManager", "notifyListenerTaskInfoCompleted: uri=" + strI + " taskId=" + fileTaskInfo.h());
        Set<ja7> set = this.f.get(strI);
        if (set != null) {
            Iterator<ja7> it = set.iterator();
            while (it.hasNext()) {
                it.next().b(str, fileTaskInfo);
            }
        }
        Iterator<ja7> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().b(str, fileTaskInfo);
        }
    }

    public final void l(String str, FileTransferTask fileTransferTask) {
        mc7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
        String strI = fileTaskInfo.i();
        wil.a("LocalCallbackManager", "notifyListenerTaskInfoProgressChanged: uri=" + strI + " taskId=" + fileTaskInfo.h());
        Set<ja7> set = this.f.get(strI);
        if (set != null) {
            Iterator<ja7> it = set.iterator();
            while (it.hasNext()) {
                it.next().a(str, fileTaskInfo);
            }
        }
        Iterator<ja7> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().a(str, fileTaskInfo);
        }
    }

    public final void m(String str, FileTransferTask fileTransferTask) {
        mc7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
        String strI = fileTaskInfo.i();
        wil.a("LocalCallbackManager", "notifyListenerTransferRequested: uri=" + strI + " taskId=" + fileTaskInfo.h());
        Set<ja7> set = this.f.get(strI);
        if (set != null) {
            Iterator<ja7> it = set.iterator();
            while (it.hasNext()) {
                it.next().c(str, fileTaskInfo);
            }
        }
        Iterator<ja7> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().c(str, fileTaskInfo);
        }
    }

    public void n(String str, MessageEvent messageEvent, int i2) {
        HashSet hashSet;
        if (qe0.w()) {
            wil.d("LocalCallbackManager", "onMessageReceived: rcvSeq=" + i2 + " to " + gdb.a(str) + " sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId() + " data=" + fe8.a(messageEvent.getData()));
        } else {
            wil.d("LocalCallbackManager", "onMessageReceived: rcvSeq=" + i2 + " to " + gdb.a(str) + " " + messageEvent);
        }
        Set<oxb> set = f3081j;
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((oxb) it.next()).onMessageReceived(str, messageEvent);
        }
    }

    public final void o(Node node, int i2, int i3) {
        HashSet hashSet;
        Set<c2g> set = f3082l;
        synchronized (set) {
            hashSet = new HashSet(set);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c2g) it.next()).onRunModeChanged(node, i2, i3);
        }
    }

    public final void p() {
        wil.a("LocalCallbackManager", "reAddRemoteListener: ");
        IOAFAdapterService iOAFAdapterServiceA = this.a.a();
        if (iOAFAdapterServiceA == null) {
            wil.b("LocalCallbackManager", "reAddRemoteListener: apiSync is null");
            return;
        }
        Set<rtc> set = k;
        synchronized (set) {
            if (set.isEmpty()) {
                wil.k("LocalCallbackManager", "reAddRemoteListener: mNodeCallbackHolder is empty");
            } else {
                try {
                    iOAFAdapterServiceA.addNodeListener(this.f3083c);
                } catch (RemoteException e2) {
                    wil.b("LocalCallbackManager", "reAddRemoteListener: ex " + e2);
                }
            }
        }
        Set<oxb> set2 = f3081j;
        synchronized (set2) {
            if (set2.isEmpty()) {
                wil.k("LocalCallbackManager", "reAddRemoteListener: mMessageCallbackHolder is empty");
            } else {
                try {
                    iOAFAdapterServiceA.addMessageListener(this.d);
                } catch (RemoteException e3) {
                    wil.b("LocalCallbackManager", "reAddRemoteListener: ex " + e3);
                }
            }
        }
        synchronized (this.f) {
            if (this.f.isEmpty()) {
                wil.k("LocalCallbackManager", "reAddRemoteListener: mFtListener is empty");
            } else {
                try {
                    iOAFAdapterServiceA.addFileListener(this.h);
                } catch (RemoteException e4) {
                    wil.b("LocalCallbackManager", "reAddRemoteListener: ex " + e4);
                }
            }
        }
        Set<c2g> set3 = f3082l;
        synchronized (set3) {
            if (set3.isEmpty()) {
                wil.k("LocalCallbackManager", "reAddRemoteListener: mRunModeCallbackHolder is empty");
            } else {
                try {
                    iOAFAdapterServiceA.addRunModeListener(this.f3084e);
                } catch (RemoteException e5) {
                    wil.b("LocalCallbackManager", "reAddRemoteListener: ex " + e5);
                }
            }
        }
    }

    public void q(IOAFAdapterService iOAFAdapterService, oxb oxbVar) {
        Set<oxb> set = f3081j;
        synchronized (set) {
            set.remove(oxbVar);
            if (set.isEmpty() && iOAFAdapterService != null) {
                try {
                    iOAFAdapterService.removeMessageListener(this.d);
                } catch (RemoteException e2) {
                    wil.b("LocalCallbackManager", "removeMessageListener: ex " + e2);
                }
            }
        }
    }
}

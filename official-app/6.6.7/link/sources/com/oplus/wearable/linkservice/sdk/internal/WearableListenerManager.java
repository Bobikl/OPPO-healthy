package com.oplus.wearable.linkservice.sdk.internal;

import android.text.TextUtils;
import com.oplus.aiunit.vision.cga;
import com.oplus.aiunit.vision.dzb;
import com.oplus.aiunit.vision.jvc;
import com.oplus.aiunit.vision.lb7;
import com.oplus.aiunit.vision.od7;
import com.oplus.aiunit.vision.uml;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WearableListenerManager {

    public class WearableListener extends IWearableListener.Stub {
        final /* synthetic */ WearableListenerManager this$0;

        public WearableListener(WearableListenerManager wearableListenerManager) {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void checkFileInfo(FileTransferTask fileTransferTask) {
            uml.a("WearableListenerManager", "checkFileInfo: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                uml.b("WearableListenerManager", "checkFileInfo: task uri is null");
                return;
            }
            cga cgaVar = (cga) WearableListenerManager.b(null).get(uri);
            if (cgaVar == null) {
                return;
            }
            cgaVar.checkFileInfo(fileTransferTask);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onMessageReceived(String str, MessageEvent messageEvent) {
            uml.a("WearableListenerManager", "onMessageReceived:");
            Iterator it = WearableListenerManager.c(null).iterator();
            while (it.hasNext()) {
                ((dzb) it.next()).onMessageReceived(str, messageEvent);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerConnected(Node node) {
            uml.a("WearableListenerManager", "onPeerConnected:");
            Iterator it = WearableListenerManager.d(null).iterator();
            while (it.hasNext()) {
                ((jvc) it.next()).onPeerConnected(node);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerDisconnected(Node node) {
            uml.a("WearableListenerManager", "onPeerDisconnected: ");
            Iterator it = WearableListenerManager.d(null).iterator();
            while (it.hasNext()) {
                ((jvc) it.next()).onPeerDisconnected(node);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferComplete(FileTransferTask fileTransferTask) {
            uml.a("WearableListenerManager", "onTransferComplete: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                uml.b("WearableListenerManager", "onTransferComplete: task uri is null");
                return;
            }
            cga cgaVar = (cga) WearableListenerManager.b(null).get(uri);
            if (cgaVar != null) {
                cgaVar.onTransferComplete(fileTransferTask);
            }
            od7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
            Iterator it = WearableListenerManager.a(null).iterator();
            while (it.hasNext()) {
                ((lb7) it.next()).b(fileTransferTask.getNodeId(), fileTaskInfo);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferProgress(FileTransferTask fileTransferTask) {
            uml.a("WearableListenerManager", "onTransferProgress: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                uml.b("WearableListenerManager", "onTransferProgress: task uri is null");
                return;
            }
            cga cgaVar = (cga) WearableListenerManager.b(null).get(uri);
            if (cgaVar != null) {
                cgaVar.onTransferProgress(fileTransferTask);
            }
            od7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
            Iterator it = WearableListenerManager.a(null).iterator();
            while (it.hasNext()) {
                ((lb7) it.next()).a(fileTransferTask.getNodeId(), fileTaskInfo);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferRequested(FileTransferTask fileTransferTask) {
            uml.a("WearableListenerManager", "onTransferRequested: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                uml.b("WearableListenerManager", "onTransferRequested: task uri is null");
                return;
            }
            cga cgaVar = (cga) WearableListenerManager.b(null).get(uri);
            if (cgaVar != null) {
                cgaVar.onTransferRequested(fileTransferTask);
            }
            od7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
            Iterator it = WearableListenerManager.a(null).iterator();
            while (it.hasNext()) {
                ((lb7) it.next()).c(fileTransferTask.getNodeId(), fileTaskInfo);
            }
        }
    }

    public static /* bridge */ /* synthetic */ Set a(WearableListenerManager wearableListenerManager) {
        throw null;
    }

    public static /* bridge */ /* synthetic */ ConcurrentHashMap b(WearableListenerManager wearableListenerManager) {
        throw null;
    }

    public static /* bridge */ /* synthetic */ CopyOnWriteArraySet c(WearableListenerManager wearableListenerManager) {
        throw null;
    }

    public static /* bridge */ /* synthetic */ CopyOnWriteArraySet d(WearableListenerManager wearableListenerManager) {
        throw null;
    }
}

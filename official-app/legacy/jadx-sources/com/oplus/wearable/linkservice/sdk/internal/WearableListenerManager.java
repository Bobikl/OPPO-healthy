package com.oplus.wearable.linkservice.sdk.internal;

import android.text.TextUtils;
import com.oplus.aiunit.vision.ja7;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.oxb;
import com.oplus.aiunit.vision.rtc;
import com.oplus.aiunit.vision.uea;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.sdk.IWearableListener;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
public class WearableListenerManager {

    public class WearableListener extends IWearableListener.Stub {
        final /* synthetic */ WearableListenerManager this$0;

        public WearableListener(WearableListenerManager wearableListenerManager) {
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void checkFileInfo(FileTransferTask fileTransferTask) {
            wil.a("WearableListenerManager", "checkFileInfo: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                wil.b("WearableListenerManager", "checkFileInfo: task uri is null");
                return;
            }
            uea ueaVar = (uea) WearableListenerManager.b(null).get(uri);
            if (ueaVar == null) {
                return;
            }
            ueaVar.checkFileInfo(fileTransferTask);
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onMessageReceived(String str, MessageEvent messageEvent) {
            wil.a("WearableListenerManager", "onMessageReceived:");
            Iterator it = WearableListenerManager.c(null).iterator();
            while (it.hasNext()) {
                ((oxb) it.next()).onMessageReceived(str, messageEvent);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerConnected(Node node) {
            wil.a("WearableListenerManager", "onPeerConnected:");
            Iterator it = WearableListenerManager.d(null).iterator();
            while (it.hasNext()) {
                ((rtc) it.next()).onPeerConnected(node);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onPeerDisconnected(Node node) {
            wil.a("WearableListenerManager", "onPeerDisconnected: ");
            Iterator it = WearableListenerManager.d(null).iterator();
            while (it.hasNext()) {
                ((rtc) it.next()).onPeerDisconnected(node);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferComplete(FileTransferTask fileTransferTask) {
            wil.a("WearableListenerManager", "onTransferComplete: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                wil.b("WearableListenerManager", "onTransferComplete: task uri is null");
                return;
            }
            uea ueaVar = (uea) WearableListenerManager.b(null).get(uri);
            if (ueaVar != null) {
                ueaVar.onTransferComplete(fileTransferTask);
            }
            mc7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
            Iterator it = WearableListenerManager.a(null).iterator();
            while (it.hasNext()) {
                ((ja7) it.next()).b(fileTransferTask.getNodeId(), fileTaskInfo);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferProgress(FileTransferTask fileTransferTask) {
            wil.a("WearableListenerManager", "onTransferProgress: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                wil.b("WearableListenerManager", "onTransferProgress: task uri is null");
                return;
            }
            uea ueaVar = (uea) WearableListenerManager.b(null).get(uri);
            if (ueaVar != null) {
                ueaVar.onTransferProgress(fileTransferTask);
            }
            mc7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
            Iterator it = WearableListenerManager.a(null).iterator();
            while (it.hasNext()) {
                ((ja7) it.next()).a(fileTransferTask.getNodeId(), fileTaskInfo);
            }
        }

        @Override // com.oplus.wearable.linkservice.sdk.IWearableListener
        public void onTransferRequested(FileTransferTask fileTransferTask) {
            wil.a("WearableListenerManager", "onTransferRequested: ");
            String uri = fileTransferTask.getUri();
            if (TextUtils.isEmpty(uri)) {
                wil.b("WearableListenerManager", "onTransferRequested: task uri is null");
                return;
            }
            uea ueaVar = (uea) WearableListenerManager.b(null).get(uri);
            if (ueaVar != null) {
                ueaVar.onTransferRequested(fileTransferTask);
            }
            mc7 fileTaskInfo = fileTransferTask.toFileTaskInfo();
            Iterator it = WearableListenerManager.a(null).iterator();
            while (it.hasNext()) {
                ((ja7) it.next()).c(fileTransferTask.getNodeId(), fileTaskInfo);
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

package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class s07 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static s07 f16419e;
    public final jza<String, FileTransferTask> a = new jza<>();
    public final HashMap<String, uoj> b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap<String, HandlerThread> f16420c = new HashMap<>();
    public final Object d = new Object();

    public static s07 e() {
        if (f16419e == null) {
            f16419e = new s07();
        }
        return f16419e;
    }

    public void a(String str, FileTransferTask fileTransferTask) {
        if (str == null) {
            wil.b("FTTaskQueueManager", "addPendingTask: nodeId is null");
            return;
        }
        synchronized (this.d) {
            this.a.d(fileTransferTask.getTaskId(), fileTransferTask);
        }
    }

    public void b(String str, uoj uojVar) {
        if (str == null) {
            wil.b("FTTaskQueueManager", "addTransferringTaskOperation: nodeId is null");
            return;
        }
        synchronized (this.d) {
            HandlerThread handlerThread = this.f16420c.get(str);
            if (handlerThread == null) {
                handlerThread = new HandlerThread(Const.Scheme.SCHEME_FILE);
                handlerThread.start();
                this.f16420c.put(str, handlerThread);
            }
            uojVar.m(handlerThread);
            this.b.put(uojVar.i(), uojVar);
        }
    }

    public final boolean c(FileTransferTask fileTransferTask, FileTransferTask fileTransferTask2) {
        return Arrays.equals(fileTransferTask.getMD5(), fileTransferTask2.getMD5()) && fileTransferTask.getFilePath().equalsIgnoreCase(fileTransferTask2.getFilePath()) && Objects.equals(fileTransferTask.getUri(), fileTransferTask.getUri()) && Objects.equals(fileTransferTask.getNodeId(), fileTransferTask.getNodeId());
    }

    public FileTransferTask d(String str, FileTransferTask fileTransferTask) {
        if (str == null) {
            wil.b("FTTaskQueueManager", "findExistSendTask: nodeId is null");
            return null;
        }
        if (fileTransferTask == null) {
            return null;
        }
        synchronized (this.d) {
            for (FileTransferTask fileTransferTask2 : g(str)) {
                if (!fileTransferTask2.isReceiveTask() && c(fileTransferTask2, fileTransferTask)) {
                    return fileTransferTask2;
                }
            }
            Iterator<uoj> it = h(str).iterator();
            while (it.hasNext()) {
                FileTransferTask fileTransferTaskH = it.next().h();
                if (!fileTransferTaskH.isReceiveTask() && c(fileTransferTaskH, fileTransferTask)) {
                    return fileTransferTaskH;
                }
            }
            return null;
        }
    }

    public FileTransferTask f(String str) {
        if (str == null) {
            wil.b("FTTaskQueueManager", "addPendingTask: nodeId is null");
            return null;
        }
        synchronized (this.d) {
            for (FileTransferTask fileTransferTask : g(str)) {
                if (TextUtils.equals(fileTransferTask.getNodeId(), str)) {
                    return fileTransferTask;
                }
            }
            return null;
        }
    }

    public final List<FileTransferTask> g(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.d) {
            for (FileTransferTask fileTransferTask : this.a.b()) {
                if (TextUtils.equals(fileTransferTask.getNodeId(), str)) {
                    arrayList.add(fileTransferTask);
                }
            }
        }
        return arrayList;
    }

    public final List<uoj> h(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.d) {
            for (uoj uojVar : this.b.values()) {
                if (TextUtils.equals(uojVar.h().getNodeId(), str)) {
                    arrayList.add(uojVar);
                }
            }
        }
        return arrayList;
    }

    public FileTransferTask i(String str) {
        FileTransferTask fileTransferTaskC;
        if (str == null) {
            wil.b("FTTaskQueueManager", "addPendingTask: taskId is null ");
            return null;
        }
        synchronized (this.d) {
            fileTransferTaskC = this.a.c(str);
        }
        return fileTransferTaskC;
    }

    public uoj j(String str) {
        uoj uojVar;
        synchronized (this.d) {
            uojVar = this.b.get(str);
        }
        return uojVar;
    }

    public uoj k(String str, int i) {
        uoj uojVar;
        if (str == null) {
            wil.b("FTTaskQueueManager", "getTransferringTaskOperation: nodeId is null");
            return null;
        }
        String strGenerateTaskId = FileTransferTask.generateTaskId(str, i);
        if (strGenerateTaskId == null) {
            wil.b("FTTaskQueueManager", "getTransferringTaskOperation: taskId is null ");
            return null;
        }
        synchronized (this.d) {
            uojVar = this.b.get(strGenerateTaskId);
        }
        return uojVar;
    }

    public int l(String str) {
        int i = 0;
        if (str == null) {
            wil.b("FTTaskQueueManager", "getTransferringTaskSize: nodeId is null");
            return 0;
        }
        synchronized (this.d) {
            Iterator<uoj> it = h(str).iterator();
            while (it.hasNext()) {
                if (!it.next().h().isReceiveTask()) {
                    i++;
                }
            }
        }
        return i;
    }

    public void m(String str, int i, sc7 sc7Var) {
        HandlerThread handlerThreadRemove;
        if (str == null) {
            wil.b("FTTaskQueueManager", "handleDeviceDisconnected: nodeId is null");
            return;
        }
        for (FileTransferTask fileTransferTask : g(str)) {
            fileTransferTask.setState(FileTransferTask.State.FAILED);
            fileTransferTask.setErrorCode(504);
            sc7Var.onTransferComplete(fileTransferTask);
            synchronized (this.d) {
                this.a.e(fileTransferTask.getTaskId());
            }
        }
        for (uoj uojVar : h(str)) {
            uojVar.e();
            FileTransferTask fileTransferTaskH = uojVar.h();
            fileTransferTaskH.setState(FileTransferTask.State.FAILED);
            fileTransferTaskH.setErrorCode(504);
            sc7Var.onTransferComplete(fileTransferTaskH);
            synchronized (this.d) {
                this.b.remove(uojVar.i());
                uojVar.r();
            }
        }
        synchronized (this.d) {
            if (h(str).size() == 0 && (handlerThreadRemove = this.f16420c.remove(str)) != null) {
                handlerThreadRemove.quitSafely();
            }
        }
    }

    public synchronized void n(sc7 sc7Var) {
        ArrayList<uoj> arrayList;
        ArrayList<FileTransferTask> arrayListB = this.a.b();
        synchronized (this.d) {
            arrayList = new ArrayList(this.b.values());
        }
        for (FileTransferTask fileTransferTask : arrayListB) {
            fileTransferTask.setState(FileTransferTask.State.FAILED);
            fileTransferTask.setErrorCode(NearHintRedDot.RED_POINT_ANIM_DURATION);
            sc7Var.onTransferComplete(fileTransferTask);
        }
        for (uoj uojVar : arrayList) {
            uojVar.e();
            FileTransferTask fileTransferTaskH = uojVar.h();
            fileTransferTaskH.setState(FileTransferTask.State.FAILED);
            fileTransferTaskH.setErrorCode(NearHintRedDot.RED_POINT_ANIM_DURATION);
            sc7Var.onTransferComplete(fileTransferTaskH);
        }
        synchronized (this.d) {
            this.a.a();
            this.b.clear();
        }
    }

    public void o(String str) {
        if (str == null) {
            wil.b("FTTaskQueueManager", "removePendingTask: taskId is null ");
            return;
        }
        synchronized (this.d) {
            this.a.e(str);
        }
    }

    public void p(String str, String str2) {
        if (str == null) {
            wil.b("FTTaskQueueManager", "removeTransferringTaskOperation: nodeId is null");
            return;
        }
        if (str2 == null) {
            wil.b("FTTaskQueueManager", "removeTransferringTaskOperation: taskId is null ");
            return;
        }
        synchronized (this.d) {
            uoj uojVarRemove = this.b.remove(str2);
            if (uojVarRemove != null) {
                uojVarRemove.r();
            }
            if (h(str).size() == 0) {
                this.b.remove(str);
                HandlerThread handlerThreadRemove = this.f16420c.remove(str);
                if (handlerThreadRemove != null) {
                    handlerThreadRemove.quitSafely();
                }
            }
        }
    }
}

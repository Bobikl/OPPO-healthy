package com.oplus.aiunit.vision;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class t17 {
    public static t17 e;
    public final u0b<String, FileTransferTask> a = new u0b<>();
    public final HashMap<String, vsj> b = new HashMap<>();
    public final HashMap<String, HandlerThread> c = new HashMap<>();
    public final Object d = new Object();

    public static t17 e() {
        if (e == null) {
            e = new t17();
        }
        return e;
    }

    public void a(String str, FileTransferTask fileTransferTask) {
        if (str == null) {
            uml.b("FTTaskQueueManager", "addPendingTask: nodeId is null");
            return;
        }
        synchronized (this.d) {
            this.a.d(fileTransferTask.getTaskId(), fileTransferTask);
        }
    }

    public void b(String str, vsj vsjVar) {
        if (str == null) {
            uml.b("FTTaskQueueManager", "addTransferringTaskOperation: nodeId is null");
            return;
        }
        synchronized (this.d) {
            HandlerThread handlerThread = this.c.get(str);
            if (handlerThread == null) {
                handlerThread = new HandlerThread("file");
                handlerThread.start();
                this.c.put(str, handlerThread);
            }
            vsjVar.m(handlerThread);
            this.b.put(vsjVar.i(), vsjVar);
        }
    }

    public final boolean c(FileTransferTask fileTransferTask, FileTransferTask fileTransferTask2) {
        return Arrays.equals(fileTransferTask.getMD5(), fileTransferTask2.getMD5()) && fileTransferTask.getFilePath().equalsIgnoreCase(fileTransferTask2.getFilePath()) && Objects.equals(fileTransferTask.getUri(), fileTransferTask.getUri()) && Objects.equals(fileTransferTask.getNodeId(), fileTransferTask.getNodeId());
    }

    public FileTransferTask d(String str, FileTransferTask fileTransferTask) {
        if (str == null) {
            uml.b("FTTaskQueueManager", "findExistSendTask: nodeId is null");
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
            Iterator<vsj> it = h(str).iterator();
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
            uml.b("FTTaskQueueManager", "addPendingTask: nodeId is null");
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

    public final List<vsj> h(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.d) {
            for (vsj vsjVar : this.b.values()) {
                if (TextUtils.equals(vsjVar.h().getNodeId(), str)) {
                    arrayList.add(vsjVar);
                }
            }
        }
        return arrayList;
    }

    public FileTransferTask i(String str) {
        FileTransferTask fileTransferTaskC;
        if (str == null) {
            uml.b("FTTaskQueueManager", "addPendingTask: taskId is null ");
            return null;
        }
        synchronized (this.d) {
            fileTransferTaskC = this.a.c(str);
        }
        return fileTransferTaskC;
    }

    public vsj j(String str) {
        vsj vsjVar;
        synchronized (this.d) {
            vsjVar = this.b.get(str);
        }
        return vsjVar;
    }

    public vsj k(String str, int i) {
        vsj vsjVar;
        if (str == null) {
            uml.b("FTTaskQueueManager", "getTransferringTaskOperation: nodeId is null");
            return null;
        }
        String strGenerateTaskId = FileTransferTask.generateTaskId(str, i);
        if (strGenerateTaskId == null) {
            uml.b("FTTaskQueueManager", "getTransferringTaskOperation: taskId is null ");
            return null;
        }
        synchronized (this.d) {
            vsjVar = this.b.get(strGenerateTaskId);
        }
        return vsjVar;
    }

    public int l(String str) {
        int i = 0;
        if (str == null) {
            uml.b("FTTaskQueueManager", "getTransferringTaskSize: nodeId is null");
            return 0;
        }
        synchronized (this.d) {
            Iterator<vsj> it = h(str).iterator();
            while (it.hasNext()) {
                if (!it.next().h().isReceiveTask()) {
                    i++;
                }
            }
        }
        return i;
    }

    public void m(String str, int i, ud7 ud7Var) {
        HandlerThread handlerThreadRemove;
        if (str == null) {
            uml.b("FTTaskQueueManager", "handleDeviceDisconnected: nodeId is null");
            return;
        }
        for (FileTransferTask fileTransferTask : g(str)) {
            fileTransferTask.setState(FileTransferTask.State.FAILED);
            fileTransferTask.setErrorCode(504);
            ud7Var.onTransferComplete(fileTransferTask);
            synchronized (this.d) {
                this.a.e(fileTransferTask.getTaskId());
            }
        }
        for (vsj vsjVar : h(str)) {
            vsjVar.e();
            FileTransferTask fileTransferTaskH = vsjVar.h();
            fileTransferTaskH.setState(FileTransferTask.State.FAILED);
            fileTransferTaskH.setErrorCode(504);
            ud7Var.onTransferComplete(fileTransferTaskH);
            synchronized (this.d) {
                this.b.remove(vsjVar.i());
                vsjVar.r();
            }
        }
        synchronized (this.d) {
            if (h(str).size() == 0 && (handlerThreadRemove = this.c.remove(str)) != null) {
                handlerThreadRemove.quitSafely();
            }
        }
    }

    public synchronized void n(ud7 ud7Var) {
        ArrayList<vsj> arrayList;
        ArrayList<FileTransferTask> arrayListB = this.a.b();
        synchronized (this.d) {
            arrayList = new ArrayList(this.b.values());
        }
        for (FileTransferTask fileTransferTask : arrayListB) {
            fileTransferTask.setState(FileTransferTask.State.FAILED);
            fileTransferTask.setErrorCode(520);
            ud7Var.onTransferComplete(fileTransferTask);
        }
        for (vsj vsjVar : arrayList) {
            vsjVar.e();
            FileTransferTask fileTransferTaskH = vsjVar.h();
            fileTransferTaskH.setState(FileTransferTask.State.FAILED);
            fileTransferTaskH.setErrorCode(520);
            ud7Var.onTransferComplete(fileTransferTaskH);
        }
        synchronized (this.d) {
            this.a.a();
            this.b.clear();
        }
    }

    public void o(String str) {
        if (str == null) {
            uml.b("FTTaskQueueManager", "removePendingTask: taskId is null ");
            return;
        }
        synchronized (this.d) {
            this.a.e(str);
        }
    }

    public void p(String str, String str2) {
        if (str == null) {
            uml.b("FTTaskQueueManager", "removeTransferringTaskOperation: nodeId is null");
            return;
        }
        if (str2 == null) {
            uml.b("FTTaskQueueManager", "removeTransferringTaskOperation: taskId is null ");
            return;
        }
        synchronized (this.d) {
            vsj vsjVarRemove = this.b.remove(str2);
            if (vsjVarRemove != null) {
                vsjVarRemove.r();
            }
            if (h(str).size() == 0) {
                this.b.remove(str);
                HandlerThread handlerThreadRemove = this.c.remove(str);
                if (handlerThreadRemove != null) {
                    handlerThreadRemove.quitSafely();
                }
            }
        }
    }
}

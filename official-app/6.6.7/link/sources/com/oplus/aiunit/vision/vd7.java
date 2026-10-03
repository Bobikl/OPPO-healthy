package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponse;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.util.Random;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vd7 {
    public static vd7 h;
    public xd7 a;
    public u17 b;
    public o17 c;
    public n17 d;
    public Random e = new Random(System.currentTimeMillis());
    public d04 f = new a();
    public final ud7 g = new b();

    public class a extends d04 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.d04
        public void d(@NonNull DeviceInfo deviceInfo, int i) {
            ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
            if (mainModuleInfo != null && mainModuleInfo.getState() == 3) {
                t17.e().m(mainModuleInfo.getNodeId(), i, vd7.this.g);
                return;
            }
            ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
            if (stubModuleInfo == null || stubModuleInfo.getState() != 3) {
                return;
            }
            t17.e().m(stubModuleInfo.getNodeId(), i, vd7.this.g);
        }
    }

    public class b implements ud7 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ud7
        public void onTransferComplete(FileTransferTask fileTransferTask) {
            uml.d("FileTransferManager", "onTransferProgress: taskId=" + fileTransferTask.getTaskId() + " " + fileTransferTask.getTransferId() + " " + fileTransferTask.getErrorCode());
            if (!fileTransferTask.isReceiveTask() || fileTransferTask.getState() != FileTransferTask.State.CHECK) {
                if (!fileTransferTask.isReceiveTask()) {
                    t17.e().o(fileTransferTask.getTaskId());
                }
                t17.e().p(fileTransferTask.getNodeId(), fileTransferTask.getTaskId());
            }
            wml.h().i(fileTransferTask);
            vd7.this.c(fileTransferTask.getNodeId());
        }

        @Override // com.oplus.aiunit.vision.ud7
        public void onTransferProgress(FileTransferTask fileTransferTask) {
            uml.d("FileTransferManager", "onTransferProgress: taskId=" + fileTransferTask.getTaskId() + " " + fileTransferTask.getTransferId() + " " + fileTransferTask.getProgress());
            wml.h().j(fileTransferTask);
        }

        @Override // com.oplus.aiunit.vision.ud7
        public void onTransferRequested(FileTransferTask fileTransferTask) {
            uml.d("FileTransferManager", "onTransferRequested: " + fileTransferTask);
            wml.h().k(fileTransferTask);
        }
    }

    public static vd7 e() {
        if (h == null) {
            h = new vd7();
        }
        return h;
    }

    public void b(String str) {
        FileTransferTask fileTransferTaskI = t17.e().i(str);
        if (fileTransferTaskI != null) {
            uml.a("FileTransferManager", "cancel: pending taskId=" + str);
            t17.e().o(str);
            fileTransferTaskI.setState(FileTransferTask.State.CANCEL);
            fileTransferTaskI.setErrorCode(509);
            this.g.onTransferComplete(fileTransferTaskI);
            return;
        }
        vsj vsjVarJ = t17.e().j(str);
        if (vsjVarJ == null) {
            return;
        }
        uml.a("FileTransferManager", "cancel: sending taskId=" + str);
        vsjVarJ.s(vsjVarJ.y);
        this.d.b(vsjVarJ.h().getNodeId(), (FTCancel$FTCancelRequestResponse) FTCancel$FTCancelRequestResponse.newBuilder().setTaskId(vsjVarJ.j()).build());
    }

    public synchronized void c(String str) {
        FileTransferTask fileTransferTaskF = t17.e().f(str);
        if (fileTransferTaskF == null) {
            return;
        }
        int iL = t17.e().l(str);
        ModuleInfo moduleInfoA = m08.a(str);
        if (moduleInfoA != null) {
            int connectionType = moduleInfoA.getConnectionType();
            if (iL < m08.b(connectionType)) {
                t17.e().o(fileTransferTaskF.getTaskId());
                t17.e().b(str, new vsj(fileTransferTaskF, this.g, this.d, connectionType));
                m(fileTransferTaskF.getTaskId());
            }
            return;
        }
        uml.k("FileTransferManager", "checkNextTask: connectNode is null " + veb.a(str));
        fileTransferTaskF.setState(FileTransferTask.State.FAILED);
        fileTransferTaskF.setErrorCode(504);
        this.g.onTransferComplete(fileTransferTaskF);
        t17.e().o(fileTransferTaskF.getTaskId());
    }

    public final synchronized int d(String str) {
        int iD;
        iD = -(this.e.nextInt(2147483646) + 1);
        while (t17.e().k(str, iD) != null) {
            uml.d("FileTransferManager", "generateTransferId: exist id=" + iD);
            iD = d(str);
        }
        return iD;
    }

    public void f() {
        xd7 xd7Var = new xd7();
        this.a = xd7Var;
        n17 n17Var = new n17(xd7Var);
        this.d = n17Var;
        v17 v17Var = new v17(n17Var, this.g);
        this.b = v17Var;
        o17 o17Var = new o17(v17Var, this.g, this.d);
        this.c = o17Var;
        this.a.c(o17Var);
        kd5.v().h(this.f);
    }

    public final boolean g(int i, FileTransferTask fileTransferTask) {
        vsj vsjVarJ = t17.e().j(fileTransferTask.getTaskId());
        if (vsjVarJ == null) {
            uml.b("FileTransferManager", "receiveFile: not find taskOperation for transferId=" + fileTransferTask.getTransferId());
            return false;
        }
        vsjVarJ.s(vsjVarJ.y);
        if (i != 0) {
            fileTransferTask.setErrorCode(i);
            fileTransferTask.setState(FileTransferTask.State.FAILED);
            this.g.onTransferComplete(fileTransferTask);
        } else {
            i = vsjVarJ.k(e88.a());
            if (i != 0) {
                fileTransferTask.setState(FileTransferTask.State.COMPLETE);
                fileTransferTask.setErrorCode(i);
                this.g.onTransferComplete(fileTransferTask);
            }
        }
        vsjVarJ.p();
        return i == 0;
    }

    public boolean h(int i, String str, String str2, String str3) {
        vsj vsjVarJ = t17.e().j(str);
        if (vsjVarJ == null) {
            uml.b("FileTransferManager", "transferId=" + str + " not exist");
            return false;
        }
        FileTransferTask fileTransferTaskH = vsjVarJ.h();
        synchronized (fileTransferTaskH) {
            if (fileTransferTaskH.getFinalSavePath() == null) {
                fileTransferTaskH.setFinalSavePath(str3);
                if (fileTransferTaskH.getState() == FileTransferTask.State.READY) {
                    fileTransferTaskH.setTargetPath(str2);
                    fileTransferTaskH.setState(FileTransferTask.State.TRANSFERING);
                    return g(i, fileTransferTaskH);
                }
                uml.b("FileTransferManager", "task has received id=" + str + " status=" + fileTransferTaskH.getState());
                return false;
            }
            if (TextUtils.equals(fileTransferTaskH.getFinalSavePath(), str3)) {
                uml.k("FileTransferManager", "task has received " + str + " status=" + fileTransferTaskH.getState() + " oldPath=" + fileTransferTaskH.getFinalSavePath());
                return true;
            }
            uml.b("FileTransferManager", "task has received" + str + " status=" + fileTransferTaskH.getState() + " oldPath=" + fileTransferTaskH.getFinalSavePath() + " newPath=" + str3);
            return false;
        }
    }

    public void i(String str, int i) {
        uml.a("FileTransferManager", "receiveFileComplete: taskId=" + str);
        vsj vsjVarJ = t17.e().j(str);
        if (vsjVarJ != null) {
            this.d.g(vsjVarJ.h().getNodeId(), (FTComplete$FTCompleteRequestResponse) FTComplete$FTCompleteRequestResponse.newBuilder().setState(i).setTaskId(vsjVarJ.j()).build());
            t17.e().p(vsjVarJ.h().getNodeId(), str);
        } else {
            uml.b("FileTransferManager", "receiveFileComplete: not find taskId=" + str);
        }
    }

    public void j(String str) {
        vsj vsjVarJ = t17.e().j(str);
        if (vsjVarJ != null) {
            vsjVarJ.s(vsjVarJ.y);
            vsjVarJ.q();
        } else {
            uml.b("FileTransferManager", "reject: not find taskOperation for taskId=" + str);
        }
    }

    public void k() {
        uml.k("FileTransferManager", "release:");
        this.a.e();
        kd5.v().l(this.f);
        t17.e().n(this.g);
    }

    public FileTransferTask l(String str, String str2, FileTransferTask fileTransferTask) {
        if (fileTransferTask == null) {
            uml.b("FileTransferManager", "sendFile: task is null");
            return null;
        }
        pml pmlVarG = wml.h().g(str);
        if (pmlVarG == null || !pmlVarG.m(fileTransferTask.getServiceId())) {
            uml.b("FileTransferManager", "sendFile: caller " + str + " not permit send file to " + fileTransferTask.getServiceId());
            return null;
        }
        FileTransferTask fileTransferTaskD = t17.e().d(str2, fileTransferTask);
        if (fileTransferTaskD != null) {
            uml.d("FileTransferManager", "sendFile: task exist with " + fileTransferTask);
            return fileTransferTaskD;
        }
        fileTransferTask.setTransferId(d(str2));
        fileTransferTask.setState(FileTransferTask.State.READY);
        uml.a("FileTransferManager", "sendFile: " + fileTransferTask);
        t17.e().a(str2, fileTransferTask);
        c(str2);
        return fileTransferTask;
    }

    public final void m(String str) {
        vsj vsjVarJ = t17.e().j(str);
        if (vsjVarJ == null) {
            return;
        }
        int iL = vsjVarJ.l(e88.a());
        FileTransferTask fileTransferTaskH = vsjVarJ.h();
        if (iL == 0) {
            vsjVarJ.t();
            return;
        }
        fileTransferTaskH.setState(FileTransferTask.State.COMPLETE);
        fileTransferTaskH.setErrorCode(iL);
        this.g.onTransferComplete(fileTransferTaskH);
    }
}

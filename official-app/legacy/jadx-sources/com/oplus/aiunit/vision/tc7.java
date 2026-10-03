package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponse;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import com.oppo.store.web.jsbridge.jscalljava.JsCallJavaMessageHandler;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class tc7 {
    public static tc7 h;
    public vc7 a;
    public t07 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n07 f16965c;
    public m07 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Random f16966e = new Random(System.currentTimeMillis());
    public qz3 f = new a();
    public final sc7 g = new b();

    public class a extends qz3 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qz3
        public void d(@NonNull DeviceInfo deviceInfo, int i) {
            ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
            if (mainModuleInfo != null && mainModuleInfo.getState() == 3) {
                s07.e().m(mainModuleInfo.getNodeId(), i, tc7.this.g);
                return;
            }
            ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
            if (stubModuleInfo == null || stubModuleInfo.getState() != 3) {
                return;
            }
            s07.e().m(stubModuleInfo.getNodeId(), i, tc7.this.g);
        }
    }

    public class b implements sc7 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.sc7
        public void onTransferComplete(FileTransferTask fileTransferTask) {
            wil.d("FileTransferManager", "onTransferProgress: taskId=" + fileTransferTask.getTaskId() + " " + fileTransferTask.getTransferId() + " " + fileTransferTask.getErrorCode());
            if (!fileTransferTask.isReceiveTask() || fileTransferTask.getState() != FileTransferTask.State.CHECK) {
                if (!fileTransferTask.isReceiveTask()) {
                    s07.e().o(fileTransferTask.getTaskId());
                }
                s07.e().p(fileTransferTask.getNodeId(), fileTransferTask.getTaskId());
            }
            yil.h().i(fileTransferTask);
            tc7.this.c(fileTransferTask.getNodeId());
        }

        @Override // com.oplus.aiunit.vision.sc7
        public void onTransferProgress(FileTransferTask fileTransferTask) {
            wil.d("FileTransferManager", "onTransferProgress: taskId=" + fileTransferTask.getTaskId() + " " + fileTransferTask.getTransferId() + " " + fileTransferTask.getProgress());
            yil.h().j(fileTransferTask);
        }

        @Override // com.oplus.aiunit.vision.sc7
        public void onTransferRequested(FileTransferTask fileTransferTask) {
            wil.d("FileTransferManager", "onTransferRequested: " + fileTransferTask);
            yil.h().k(fileTransferTask);
        }
    }

    public static tc7 e() {
        if (h == null) {
            h = new tc7();
        }
        return h;
    }

    public void b(String str) {
        FileTransferTask fileTransferTaskI = s07.e().i(str);
        if (fileTransferTaskI != null) {
            wil.a("FileTransferManager", "cancel: pending taskId=" + str);
            s07.e().o(str);
            fileTransferTaskI.setState(FileTransferTask.State.CANCEL);
            fileTransferTaskI.setErrorCode(509);
            this.g.onTransferComplete(fileTransferTaskI);
            return;
        }
        uoj uojVarJ = s07.e().j(str);
        if (uojVarJ == null) {
            return;
        }
        wil.a("FileTransferManager", "cancel: sending taskId=" + str);
        uojVarJ.s(uojVarJ.y);
        this.d.b(uojVarJ.h().getNodeId(), FTCancel$FTCancelRequestResponse.newBuilder().setTaskId(uojVarJ.j()).build());
    }

    public synchronized void c(String str) {
        FileTransferTask fileTransferTaskF = s07.e().f(str);
        if (fileTransferTaskF == null) {
            return;
        }
        int iL = s07.e().l(str);
        ModuleInfo moduleInfoA = jz7.a(str);
        if (moduleInfoA != null) {
            int connectionType = moduleInfoA.getConnectionType();
            if (iL < jz7.b(connectionType)) {
                s07.e().o(fileTransferTaskF.getTaskId());
                s07.e().b(str, new uoj(fileTransferTaskF, this.g, this.d, connectionType));
                m(fileTransferTaskF.getTaskId());
            }
            return;
        }
        wil.k("FileTransferManager", "checkNextTask: connectNode is null " + gdb.a(str));
        fileTransferTaskF.setState(FileTransferTask.State.FAILED);
        fileTransferTaskF.setErrorCode(504);
        this.g.onTransferComplete(fileTransferTaskF);
        s07.e().o(fileTransferTaskF.getTaskId());
    }

    public final synchronized int d(String str) {
        int iD;
        iD = -(this.f16966e.nextInt(JsCallJavaMessageHandler.MSG_TOP_RIGHT_CONTROL) + 1);
        while (s07.e().k(str, iD) != null) {
            wil.d("FileTransferManager", "generateTransferId: exist id=" + iD);
            iD = d(str);
        }
        return iD;
    }

    public void f() {
        vc7 vc7Var = new vc7();
        this.a = vc7Var;
        m07 m07Var = new m07(vc7Var);
        this.d = m07Var;
        u07 u07Var = new u07(m07Var, this.g);
        this.b = u07Var;
        n07 n07Var = new n07(u07Var, this.g, this.d);
        this.f16965c = n07Var;
        this.a.c(n07Var);
        pc5.v().h(this.f);
    }

    public final boolean g(int i, FileTransferTask fileTransferTask) {
        uoj uojVarJ = s07.e().j(fileTransferTask.getTaskId());
        if (uojVarJ == null) {
            wil.b("FileTransferManager", "receiveFile: not find taskOperation for transferId=" + fileTransferTask.getTransferId());
            return false;
        }
        uojVarJ.s(uojVarJ.y);
        if (i != 0) {
            fileTransferTask.setErrorCode(i);
            fileTransferTask.setState(FileTransferTask.State.FAILED);
            this.g.onTransferComplete(fileTransferTask);
        } else {
            i = uojVarJ.k(b78.a());
            if (i != 0) {
                fileTransferTask.setState(FileTransferTask.State.COMPLETE);
                fileTransferTask.setErrorCode(i);
                this.g.onTransferComplete(fileTransferTask);
            }
        }
        uojVarJ.p();
        return i == 0;
    }

    public boolean h(int i, String str, String str2, String str3) {
        uoj uojVarJ = s07.e().j(str);
        if (uojVarJ == null) {
            wil.b("FileTransferManager", "transferId=" + str + " not exist");
            return false;
        }
        FileTransferTask fileTransferTaskH = uojVarJ.h();
        synchronized (fileTransferTaskH) {
            if (fileTransferTaskH.getFinalSavePath() == null) {
                fileTransferTaskH.setFinalSavePath(str3);
                if (fileTransferTaskH.getState() == FileTransferTask.State.READY) {
                    fileTransferTaskH.setTargetPath(str2);
                    fileTransferTaskH.setState(FileTransferTask.State.TRANSFERING);
                    return g(i, fileTransferTaskH);
                }
                wil.b("FileTransferManager", "task has received id=" + str + " status=" + fileTransferTaskH.getState());
                return false;
            }
            if (TextUtils.equals(fileTransferTaskH.getFinalSavePath(), str3)) {
                wil.k("FileTransferManager", "task has received " + str + " status=" + fileTransferTaskH.getState() + " oldPath=" + fileTransferTaskH.getFinalSavePath());
                return true;
            }
            wil.b("FileTransferManager", "task has received" + str + " status=" + fileTransferTaskH.getState() + " oldPath=" + fileTransferTaskH.getFinalSavePath() + " newPath=" + str3);
            return false;
        }
    }

    public void i(String str, int i) {
        wil.a("FileTransferManager", "receiveFileComplete: taskId=" + str);
        uoj uojVarJ = s07.e().j(str);
        if (uojVarJ != null) {
            this.d.g(uojVarJ.h().getNodeId(), FTComplete$FTCompleteRequestResponse.newBuilder().setState(i).setTaskId(uojVarJ.j()).build());
            s07.e().p(uojVarJ.h().getNodeId(), str);
        } else {
            wil.b("FileTransferManager", "receiveFileComplete: not find taskId=" + str);
        }
    }

    public void j(String str) {
        uoj uojVarJ = s07.e().j(str);
        if (uojVarJ != null) {
            uojVarJ.s(uojVarJ.y);
            uojVarJ.q();
        } else {
            wil.b("FileTransferManager", "reject: not find taskOperation for taskId=" + str);
        }
    }

    public void k() {
        wil.k("FileTransferManager", "release:");
        this.a.e();
        pc5.v().l(this.f);
        s07.e().n(this.g);
    }

    public FileTransferTask l(String str, String str2, FileTransferTask fileTransferTask) {
        if (fileTransferTask == null) {
            wil.b("FileTransferManager", "sendFile: task is null");
            return null;
        }
        ril rilVarG = yil.h().g(str);
        if (rilVarG == null || !rilVarG.m(fileTransferTask.getServiceId())) {
            wil.b("FileTransferManager", "sendFile: caller " + str + " not permit send file to " + fileTransferTask.getServiceId());
            return null;
        }
        FileTransferTask fileTransferTaskD = s07.e().d(str2, fileTransferTask);
        if (fileTransferTaskD != null) {
            wil.d("FileTransferManager", "sendFile: task exist with " + fileTransferTask);
            return fileTransferTaskD;
        }
        fileTransferTask.setTransferId(d(str2));
        fileTransferTask.setState(FileTransferTask.State.READY);
        wil.a("FileTransferManager", "sendFile: " + fileTransferTask);
        s07.e().a(str2, fileTransferTask);
        c(str2);
        return fileTransferTask;
    }

    public final void m(String str) {
        uoj uojVarJ = s07.e().j(str);
        if (uojVarJ == null) {
            return;
        }
        int iL = uojVarJ.l(b78.a());
        FileTransferTask fileTransferTaskH = uojVarJ.h();
        if (iL == 0) {
            uojVarJ.t();
            return;
        }
        fileTransferTaskH.setState(FileTransferTask.State.COMPLETE);
        fileTransferTaskH.setErrorCode(iL);
        this.g.onTransferComplete(fileTransferTaskH);
    }
}

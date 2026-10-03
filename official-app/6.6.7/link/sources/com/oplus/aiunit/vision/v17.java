package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponse;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class v17 implements u17 {
    public final n17 a;
    public final ud7 b;

    public v17(n17 n17Var, ud7 ud7Var) {
        this.a = n17Var;
        this.b = ud7Var;
    }

    @Override // com.oplus.aiunit.vision.u17
    public void a(vsj vsjVar) {
        uml.a("FTCmdListen", "handleFTCompleteRequest: " + vsjVar.j());
        FileTransferTask fileTransferTaskH = vsjVar.h();
        vsjVar.s(vsjVar.x);
        fileTransferTaskH.setState(FileTransferTask.State.CHECK);
        this.b.onTransferComplete(fileTransferTaskH);
    }

    @Override // com.oplus.aiunit.vision.u17
    public void b(vsj vsjVar) {
        int i;
        uml.a("FTCmdListen", "handleFTCancelRequest: " + vsjVar.j());
        FileTransferTask fileTransferTaskH = vsjVar.h();
        if (fileTransferTaskH.getState() == FileTransferTask.State.COMPLETE) {
            i = 0;
        } else {
            vsjVar.e();
            fileTransferTaskH.setState(FileTransferTask.State.CANCEL);
            i = 509;
            fileTransferTaskH.setErrorCode(509);
            this.b.onTransferComplete(fileTransferTaskH);
        }
        this.a.c(fileTransferTaskH.getNodeId(), (FTCancel$FTCancelRequestResponse) FTCancel$FTCancelRequestResponse.newBuilder().setState(i).setTaskId(fileTransferTaskH.getTransferId()).build());
    }

    @Override // com.oplus.aiunit.vision.u17
    public void c(vsj vsjVar, int i, int i2, int i3) {
        uml.a("FTCmdListen", "handleFTChunkResponse: " + vsjVar.j() + " index=" + i + " endPoint=" + i2 + " state=" + i3);
        vsjVar.s(vsjVar.u);
        if (i3 == 0 ? vsjVar.y(i, i2, i3) : false) {
            return;
        }
        FileTransferTask fileTransferTaskH = vsjVar.h();
        fileTransferTaskH.setState(FileTransferTask.State.FAILED);
        fileTransferTaskH.setErrorCode(i3);
        this.b.onTransferComplete(fileTransferTaskH);
    }

    @Override // com.oplus.aiunit.vision.u17
    public void d(vsj vsjVar, int i, int i2, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("handleFTChunkRequest: ");
        sb.append(vsjVar.j());
        sb.append(" index=");
        sb.append(i);
        sb.append(" dataLen=");
        sb.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        uml.a("FTCmdListen", sb.toString());
        if (i == 0) {
            vsjVar.s(vsjVar.w);
        } else {
            vsjVar.s(vsjVar.x);
        }
        vsjVar.w(i, i2, bArr);
    }

    @Override // com.oplus.aiunit.vision.u17
    public void e(vsj vsjVar, int i) {
        uml.a("FTCmdListen", "handleFTCancelResponse: " + vsjVar.j() + " state=" + i);
        if (i != 509) {
            uml.k("FTCmdListen", "handleFTCancelResponse: not need cancel " + i);
            return;
        }
        vsjVar.e();
        FileTransferTask fileTransferTaskH = vsjVar.h();
        fileTransferTaskH.setState(FileTransferTask.State.CANCEL);
        fileTransferTaskH.setErrorCode(509);
        this.b.onTransferComplete(fileTransferTaskH);
    }

    @Override // com.oplus.aiunit.vision.u17
    public void f(vsj vsjVar, int i) {
        uml.a("FTCmdListen", "handleFTSendResponse: " + vsjVar.j() + " state=" + i);
        vsjVar.s(vsjVar.t);
        if (i == 0) {
            vsjVar.h().setState(FileTransferTask.State.TRANSFERING);
            vsjVar.v();
            return;
        }
        uml.k("FTCmdListen", "handleFTSendResponse: response error " + i);
        vsjVar.h().setState(FileTransferTask.State.COMPLETE);
        vsjVar.h().setErrorCode(i);
        this.b.onTransferComplete(vsjVar.h());
    }

    @Override // com.oplus.aiunit.vision.u17
    public void g(vsj vsjVar, int i) {
        uml.a("FTCmdListen", "handleFTCompleteResponse: " + vsjVar.j() + " state=" + i);
        vsjVar.s(vsjVar.v);
        FileTransferTask fileTransferTaskH = vsjVar.h();
        fileTransferTaskH.setState(FileTransferTask.State.COMPLETE);
        fileTransferTaskH.setErrorCode(i);
        this.b.onTransferComplete(fileTransferTaskH);
    }

    @Override // com.oplus.aiunit.vision.u17
    public void h(String str, vsj vsjVar) {
        uml.a("FTCmdListen", "handleFTSendRequest: " + vsjVar.j());
        t17.e().b(str, vsjVar);
        vsjVar.o(vsjVar.y);
        this.b.onTransferRequested(vsjVar.h());
    }
}

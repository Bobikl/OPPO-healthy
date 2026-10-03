package com.oplus.aiunit.vision;

import com.google.protobuf.InvalidProtocolBufferException;
import com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponse;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class o17 implements nd5 {
    public final ud7 a;
    public final n17 b;
    public final u17 c;

    public o17(u17 u17Var, ud7 ud7Var, n17 n17Var) {
        this.c = u17Var;
        this.a = ud7Var;
        this.b = n17Var;
    }

    @Override // com.oplus.aiunit.vision.nd5
    public synchronized void a(ModuleInfo moduleInfo, byte[] bArr) {
        try {
            if (bArr == null) {
                uml.b("FtCmdTransfer", "handlerData: data is null");
                return;
            }
            if (bArr.length < 2) {
                uml.b("FtCmdTransfer", "handlerData: data length is " + bArr.length);
                return;
            }
            int i = bArr[0] & 255;
            int i2 = bArr[1] & 255;
            if (i != 3) {
                return;
            }
            if (moduleInfo == null) {
                uml.b("FtCmdTransfer", "deviceInfo is null, drop sid=" + i + " cid=" + i2);
                return;
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 2, bArr.length);
            uml.d("FtCmdTransfer", "handleReceiveData sid=" + i + " cid=" + i2);
            String nodeId = moduleInfo.getNodeId();
            if (nodeId == null) {
                uml.b("FtCmdTransfer", "handleReceiveData: nodeId is null");
                return;
            }
            if (i2 == 2) {
                e(nodeId, bArrCopyOfRange);
            } else if (i2 == 3) {
                g(nodeId, bArrCopyOfRange);
            } else if (i2 == 4) {
                i(nodeId, bArrCopyOfRange, moduleInfo);
            } else if (i2 != 5) {
                switch (i2) {
                    case 130:
                        f(nodeId, bArrCopyOfRange);
                        break;
                    case 131:
                        h(nodeId, bArrCopyOfRange);
                        break;
                    case 132:
                        j(nodeId, bArrCopyOfRange);
                        break;
                    case 133:
                        d(nodeId, bArrCopyOfRange);
                        break;
                    default:
                        uml.b("FtCmdTransfer", "handlerData: error cid=" + i2);
                        break;
                }
            } else {
                c(nodeId, bArrCopyOfRange);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final FileTransferTask b(String str, FTSend$FTSendRequestResponse fTSend$FTSendRequestResponse) {
        FileTransferTask fileTransferTask = new FileTransferTask();
        fileTransferTask.setTransferId(fTSend$FTSendRequestResponse.getTaskId());
        fileTransferTask.setFilePath(fTSend$FTSendRequestResponse.getFilePath());
        fileTransferTask.setFileName(new File(fTSend$FTSendRequestResponse.getFilePath()).getName());
        fileTransferTask.setUri(fTSend$FTSendRequestResponse.getUri());
        fileTransferTask.setFileSize(fTSend$FTSendRequestResponse.getFileSize());
        fileTransferTask.setMD5(fTSend$FTSendRequestResponse.getMD5().toByteArray());
        fileTransferTask.setServiceId(fTSend$FTSendRequestResponse.getServiceId());
        fileTransferTask.setNodeId(str);
        return fileTransferTask;
    }

    public final synchronized void c(String str, byte[] bArr) {
        FTCancel$FTCancelRequestResponse from;
        try {
            from = FTCancel$FTCancelRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTCancelRequest: proto convert error ");
            from = null;
        }
        if (from == null) {
            uml.b("FtCmdTransfer", "handleFTCancelRequest ftCancelRequest == null");
            return;
        }
        int taskId = from.getTaskId();
        vsj vsjVarK = t17.e().k(str, taskId);
        if (vsjVarK == null) {
            uml.k("FtCmdTransfer", "handleFTCancelRequest not find receive taskId=" + taskId);
            vsjVarK = t17.e().k(str, taskId);
            if (vsjVarK == null) {
                uml.b("FtCmdTransfer", "handleFTCancelRequest not find taskId=" + taskId);
                return;
            }
        }
        uml.d("FtCmdTransfer", "handleFTCancelRequest: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg());
        this.c.b(vsjVarK);
    }

    public final synchronized void d(String str, byte[] bArr) {
        FTCancel$FTCancelRequestResponse from;
        try {
            from = FTCancel$FTCancelRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTCancelResponse: proto convert error ");
            from = null;
        }
        if (from == null) {
            uml.b("FtCmdTransfer", "handleFTCancelResponse ftCancelResponse == null");
            return;
        }
        int taskId = from.getTaskId();
        int state = from.getState();
        vsj vsjVarK = t17.e().k(str, taskId);
        if ((vsjVarK != null ? vsjVarK.h() : null) == null) {
            uml.k("FtCmdTransfer", "handleFTCancelResponse not find send taskId=" + taskId);
            vsjVarK = t17.e().k(str, taskId);
            if (vsjVarK == null) {
                uml.b("FtCmdTransfer", "handleFTCancelResponse not find taskId=" + taskId);
                return;
            }
        }
        uml.d("FtCmdTransfer", "handleFTCancelResponse: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg());
        this.c.e(vsjVarK, state);
    }

    public final synchronized void e(String str, byte[] bArr) {
        FTChunk$FTChunkRequestResponse from;
        try {
            from = FTChunk$FTChunkRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTChunkRequest: proto convert error ");
            from = null;
        }
        if (from == null) {
            uml.b("FtCmdTransfer", "handleFTChunkRequest ftChunkRequest == null");
            return;
        }
        int taskId = from.getTaskId();
        vsj vsjVarK = t17.e().k(str, taskId);
        if (vsjVarK == null) {
            uml.b("FtCmdTransfer", "handleFTChunkRequest not find receive taskId=" + taskId);
            return;
        }
        uml.d("FtCmdTransfer", "handleFTChunkRequest: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg());
        this.c.d(vsjVarK, from.getIndex(), from.getEndPoint(), from.getContent().toByteArray());
    }

    public final synchronized void f(String str, byte[] bArr) {
        FTChunk$FTChunkRequestResponse from;
        try {
            from = FTChunk$FTChunkRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTChunkResponse: proto convert error ");
            from = null;
        }
        if (from == null) {
            uml.b("FtCmdTransfer", "handleFTChunkResponse ftChunkResponse == null");
            return;
        }
        int taskId = from.getTaskId();
        vsj vsjVarK = t17.e().k(str, taskId);
        if (vsjVarK == null) {
            uml.b("FtCmdTransfer", "handleFTChunkResponse not find send taskId=" + taskId);
            return;
        }
        uml.d("FtCmdTransfer", "handleFTChunkResponse: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg());
        this.c.c(vsjVarK, from.getIndex(), from.getEndPoint(), from.getState());
    }

    public final synchronized void g(String str, byte[] bArr) {
        FTComplete$FTCompleteRequestResponse from;
        try {
            from = FTComplete$FTCompleteRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTCompleteRequest: proto convert error ");
            from = null;
        }
        if (from == null) {
            uml.b("FtCmdTransfer", "handleFTCompleteRequest ftCompleteRequest == null");
            return;
        }
        int taskId = from.getTaskId();
        vsj vsjVarK = t17.e().k(str, taskId);
        if (vsjVarK == null) {
            uml.b("FtCmdTransfer", "handleFTCompleteRequest not find receive taskId=" + taskId);
            return;
        }
        uml.d("FtCmdTransfer", "handleFTCompleteRequest: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg());
        this.c.a(vsjVarK);
    }

    public final synchronized void h(String str, byte[] bArr) {
        FTComplete$FTCompleteRequestResponse from;
        try {
            from = FTComplete$FTCompleteRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTCompleteResponse: proto convert error ");
            from = null;
        }
        if (from == null) {
            uml.b("FtCmdTransfer", "handleFTCompleteResponse ftCompleteResponse == null");
            return;
        }
        int taskId = from.getTaskId();
        int state = from.getState();
        vsj vsjVarK = t17.e().k(str, taskId);
        if (vsjVarK == null) {
            uml.b("FtCmdTransfer", "handleFTCompleteResponse not find send taskId=" + taskId);
            return;
        }
        uml.d("FtCmdTransfer", "handleFTCompleteResponse: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg());
        this.c.g(vsjVarK, state);
    }

    public final synchronized void i(String str, byte[] bArr, ModuleInfo moduleInfo) {
        FTSend$FTSendRequestResponse from;
        try {
            from = FTSend$FTSendRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTSendRequest: proto convert error ");
            from = null;
        }
        if (from == null) {
            return;
        }
        FileTransferTask fileTransferTaskB = b(str, from);
        fileTransferTaskB.setReceiveTask(true);
        fileTransferTaskB.setState(FileTransferTask.State.READY);
        vsj vsjVar = new vsj(fileTransferTaskB, this.a, this.b, moduleInfo.getConnectionType());
        vsjVar.f().e(from.getSupportOption());
        uml.d("FtCmdTransfer", "handleFTSendRequest: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg() + " " + vsjVar.f());
        if (vsjVar.f().f()) {
            vsjVar.u(Math.min(from.getFtBufferSize(), m08.MAX_BUFFER_SIZE));
        }
        this.c.h(str, vsjVar);
    }

    public final synchronized void j(String str, byte[] bArr) {
        FTSend$FTSendRequestResponse from;
        try {
            from = FTSend$FTSendRequestResponse.parseFrom(bArr);
        } catch (InvalidProtocolBufferException unused) {
            uml.b("FtCmdTransfer", "handleFTSendResponse: proto convert error ");
            from = null;
        }
        if (from == null) {
            return;
        }
        int taskId = from.getTaskId();
        int state = from.getState();
        vsj vsjVarK = t17.e().k(str, taskId);
        if (vsjVarK == null) {
            uml.b("FtCmdTransfer", "handleFTSendResponse not find send taskId=" + taskId);
            return;
        }
        vsjVarK.f().e(from.getSupportOption());
        if (vsjVarK.f().f()) {
            vsjVarK.u(from.getFtBufferSize());
        } else {
            uml.a("FtCmdTransfer", "handleFTSendResponse: not support FtBuffer use def=" + vsjVarK.g());
        }
        uml.d("FtCmdTransfer", "handleFTSendResponse: tid=" + from.getTaskId() + " st=" + from.getState() + " msg=" + from.getErrorMsg() + " " + vsjVarK.f());
        this.c.f(vsjVarK, state);
    }
}

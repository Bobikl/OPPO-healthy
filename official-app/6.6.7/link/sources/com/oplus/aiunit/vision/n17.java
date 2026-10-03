package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.google.protobuf.GeneratedMessageLite;
import com.oplus.wearable.linkservice.file.data.proto.FTCancel$FTCancelRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponse;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class n17 {
    public pd5 a;

    public class a implements lt2<Void> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.lt2
        public void a(Throwable th, int i) {
        }

        @Override // com.oplus.aiunit.vision.lt2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }
    }

    public n17(pd5 pd5Var) {
        this.a = pd5Var;
    }

    public final void a(String str, int i, GeneratedMessageLite generatedMessageLite) {
        if (TextUtils.isEmpty(str)) {
            uml.l("FTCommandSender", "sendCommand: node is null ", new Throwable());
            return;
        }
        byte[] byteArray = generatedMessageLite.toByteArray();
        byte[] bArr = new byte[byteArray.length + 2];
        bArr[0] = 3;
        bArr[1] = (byte) i;
        System.arraycopy(byteArray, 0, bArr, 2, byteArray.length);
        this.a.a(str, bArr, new a());
    }

    public void b(String str, FTCancel$FTCancelRequestResponse fTCancel$FTCancelRequestResponse) {
        uml.a("FTCommandSender", "sendFTCancelRequest: " + fTCancel$FTCancelRequestResponse.getTaskId());
        a(str, 5, fTCancel$FTCancelRequestResponse);
    }

    public void c(String str, FTCancel$FTCancelRequestResponse fTCancel$FTCancelRequestResponse) {
        uml.a("FTCommandSender", "sendFTCancelResponse: " + fTCancel$FTCancelRequestResponse.getTaskId() + " state: " + fTCancel$FTCancelRequestResponse.getState());
        a(str, 133, fTCancel$FTCancelRequestResponse);
    }

    public void d(String str, FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse) {
        uml.a("FTCommandSender", "sendFTChunkRequest: " + fTChunk$FTChunkRequestResponse.getTaskId() + " " + fTChunk$FTChunkRequestResponse.getIndex() + " " + fTChunk$FTChunkRequestResponse.getEndPoint());
        a(str, 2, fTChunk$FTChunkRequestResponse);
    }

    public void e(String str, FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse) {
        uml.a("FTCommandSender", "sendFTChunkResponse: " + fTChunk$FTChunkRequestResponse.getTaskId() + " state: " + fTChunk$FTChunkRequestResponse.getState());
        a(str, 130, fTChunk$FTChunkRequestResponse);
    }

    public void f(String str, FTComplete$FTCompleteRequestResponse fTComplete$FTCompleteRequestResponse) {
        uml.a("FTCommandSender", "sendFTCompleteRequest: " + fTComplete$FTCompleteRequestResponse.getTaskId());
        a(str, 3, fTComplete$FTCompleteRequestResponse);
    }

    public void g(String str, FTComplete$FTCompleteRequestResponse fTComplete$FTCompleteRequestResponse) {
        uml.a("FTCommandSender", "sendFTCompleteResponse: " + fTComplete$FTCompleteRequestResponse.getTaskId() + " state: " + fTComplete$FTCompleteRequestResponse.getState());
        a(str, 131, fTComplete$FTCompleteRequestResponse);
    }

    public void h(String str, FTSend$FTSendRequestResponse fTSend$FTSendRequestResponse) {
        uml.a("FTCommandSender", "sendFTRequest: " + fTSend$FTSendRequestResponse.getTaskId());
        a(str, 4, fTSend$FTSendRequestResponse);
    }

    public void i(String str, FTSend$FTSendRequestResponse fTSend$FTSendRequestResponse) {
        uml.a("FTCommandSender", "sendFTSendResponse: " + fTSend$FTSendRequestResponse.getTaskId() + " state: " + fTSend$FTSendRequestResponse.getState());
        a(str, 132, fTSend$FTSendRequestResponse);
    }
}

package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.google.protobuf.ByteString;
import com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTComplete$FTCompleteRequestResponse;
import com.oplus.wearable.linkservice.file.data.proto.FTSend$FTSendRequestResponse;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vsj implements Handler.Callback {
    public static final int MSG_TIMEOUT_RCV_FTChunkResponse_wait_FTChunkRequest_or_FTCompleteRequest = 804;
    public static final int MSG_TIMEOUT_RCV_FTSendRequest_wait_Receive_or_reject = 805;
    public static final int MSG_TIMEOUT_RCV_FTSendResponse_wait_FTChunkRequest = 803;
    public static final int MSG_TIMEOUT_SEND_FTChunkRequest_wait_FTChunkResponse = 801;
    public static final int MSG_TIMEOUT_SEND_FTCompleteRequest_wait_FTCompleteResponse = 802;
    public static final int MSG_TIMEOUT_SEND_FTSendRequest_wait_FTSendResponse = 800;
    public final FileTransferTask i;
    public final n17 j;
    public final ud7 k;
    public final int l;
    public zp9 m;
    public bq9 n;
    public Handler o;
    public Handler p;
    public HandlerThread q;
    public final l08 r = new l08();
    public int s;
    public final b t;
    public final b u;
    public final b v;
    public final b w;
    public final b x;
    public final b y;

    public class a implements Runnable {
        public final /* synthetic */ int i;
        public final /* synthetic */ int j;
        public final /* synthetic */ byte[] k;

        public a(int i, int i2, byte[] bArr) {
            this.i = i;
            this.j = i2;
            this.k = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            vsj.this.x(this.i, this.j, this.k);
        }
    }

    public class b implements Runnable {
        public final int i;
        public final String j;
        public int k;

        public int a() {
            return (vsj.this.r.g() && this.i == 801) ? m08.b(vsj.this.l) * 2000 : m08.b(vsj.this.l) * 8000;
        }

        public String b() {
            return this.j;
        }

        public int c() {
            return this.k;
        }

        public void d(int i) {
            this.k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            vsj.this.n(this, this.i, this.j);
        }

        public b(int i, String str) {
            this.i = i;
            this.j = str;
        }
    }

    public vsj(FileTransferTask fileTransferTask, ud7 ud7Var, n17 n17Var, int i) {
        this.t = new b(MSG_TIMEOUT_SEND_FTSendRequest_wait_FTSendResponse, "SEND_FTSendRequest_wait_FTSendResponse");
        this.u = new b(MSG_TIMEOUT_SEND_FTChunkRequest_wait_FTChunkResponse, "SEND_FTChunkRequest_wait_FTChunkResponse");
        this.v = new b(MSG_TIMEOUT_SEND_FTCompleteRequest_wait_FTCompleteResponse, "SEND_FTCompleteRequest_wait_FTCompleteResponse");
        this.w = new b(MSG_TIMEOUT_RCV_FTSendResponse_wait_FTChunkRequest, "RCV_FTSendResponse_wait_FTChunkRequest");
        this.x = new b(MSG_TIMEOUT_RCV_FTChunkResponse_wait_FTChunkRequest_or_FTCompleteRequest, "RCV_FTChunkResponse_wait_FTChunkRequest_or_FTCompleteRequest");
        this.y = new b(MSG_TIMEOUT_RCV_FTSendRequest_wait_Receive_or_reject, "RCV_FTSendRequest_wait_Receive_or_reject");
        this.i = fileTransferTask;
        this.k = ud7Var;
        this.j = n17Var;
        this.l = i;
        this.s = m08.c(i);
    }

    public int e() {
        bq9 bq9Var = this.n;
        if (bq9Var != null) {
            bq9Var.clean();
        }
        zp9 zp9Var = this.m;
        if (zp9Var == null) {
            return 0;
        }
        zp9Var.clean();
        return 0;
    }

    public l08 f() {
        return this.r;
    }

    public int g() {
        return this.s;
    }

    public FileTransferTask h() {
        return this.i;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 100:
            case 102:
                this.j.f(this.i.getNodeId(), (FTComplete$FTCompleteRequestResponse) FTComplete$FTCompleteRequestResponse.newBuilder().setTaskId(j()).setState(h().getErrorCode()).build());
                if (h().getErrorCode() == 0) {
                    o(this.v);
                }
                break;
            case 101:
                this.k.onTransferProgress((FileTransferTask) message.obj);
                break;
        }
        return false;
    }

    public String i() {
        return this.i.getTaskId();
    }

    public int j() {
        return this.i.getTransferId();
    }

    public int k(Context context) {
        String targetPath = this.i.getTargetPath();
        if (TextUtils.isEmpty(targetPath)) {
            uml.k("TaskOperation", "initDataReceiver fileName isEmpty");
            return 513;
        }
        Uri uri = Uri.parse(targetPath);
        String scheme = uri.getScheme();
        uml.a("TaskOperation", "initDataReceiver " + uri);
        if (TextUtils.isEmpty(scheme)) {
            this.m = new hw4(this.o);
        } else {
            this.m = new d17(this.o, context);
        }
        return this.m.c(this.i, targetPath);
    }

    public int l(Context context) {
        String scheme = Uri.parse(this.i.getFilePath()).getScheme();
        uml.a("TaskOperation", "initDataSender: scheme = " + scheme);
        if (TextUtils.isEmpty(scheme)) {
            this.n = new vw4(this, this.o, this.j, this.q);
        } else {
            this.n = new e17(this, this.o, context, this.j, this.q);
        }
        return this.n.c();
    }

    public void m(HandlerThread handlerThread) {
        this.q = handlerThread;
        this.o = new Handler(handlerThread.getLooper(), this);
        this.p = new Handler(handlerThread.getLooper(), this);
    }

    public final void n(b bVar, int i, String str) {
        int iC;
        if (this.r.g() && i == 801 && (iC = bVar.c()) < 3) {
            uml.k("TaskOperation", "onTimeOut: reSendLastChunk " + iC + " taskId=" + i());
            bq9 bq9Var = this.n;
            if (bq9Var != null) {
                bq9Var.b();
                o(this.u);
            } else {
                uml.k("TaskOperation", "onTimeOut: mIDataSender is null");
            }
            bVar.d(iC + 1);
            return;
        }
        uml.b("TaskOperation", "onTimeOut: transferId=" + j() + " type=" + i + ", des=" + str);
        r();
        this.i.setState(FileTransferTask.State.FAILED);
        this.i.setErrorCode(503);
        this.k.onTransferComplete(this.i);
    }

    public void o(b bVar) {
        uml.a("TaskOperation", "postTimeout: " + j() + " " + bVar.b());
        Handler handler = this.p;
        if (handler != null) {
            handler.postDelayed(bVar, bVar.a());
            return;
        }
        uml.b("TaskOperation", "postTimeout: mTimeOutHandler is null " + j() + " " + bVar.b());
    }

    public int p() {
        this.j.i(h().getNodeId(), (FTSend$FTSendRequestResponse) FTSend$FTSendRequestResponse.newBuilder().setTaskId(j()).setSupportOption(this.r.b()).setFtBufferSize(this.s).setState(this.i.getErrorCode()).build());
        if (this.i.getErrorCode() != 0) {
            return 0;
        }
        o(this.w);
        return 0;
    }

    public void q() {
        if (this.i.getState() == FileTransferTask.State.READY) {
            this.j.i(this.i.getNodeId(), (FTSend$FTSendRequestResponse) FTSend$FTSendRequestResponse.newBuilder().setTaskId(j()).setState(506).setSupportOption(this.r.b()).setFtBufferSize(this.s).build());
        } else {
            uml.d("TaskOperation", "reject: can not reject status=" + this.i.getState());
        }
    }

    public void r() {
        uml.a("TaskOperation", "release: " + j());
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.p = null;
        }
        Handler handler2 = this.o;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.o = null;
        }
        bq9 bq9Var = this.n;
        if (bq9Var != null) {
            bq9Var.clean();
            this.n = null;
        }
        zp9 zp9Var = this.m;
        if (zp9Var != null) {
            zp9Var.clean();
            this.m = null;
        }
    }

    public void s(b bVar) {
        uml.a("TaskOperation", "removeTimeout: " + j() + " " + bVar.b());
        bVar.d(0);
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacks(bVar);
        }
    }

    public int t() {
        byte[] md5 = this.i.getMD5();
        if (md5 == null) {
            md5 = new byte[0];
        }
        this.j.h(this.i.getNodeId(), (FTSend$FTSendRequestResponse) FTSend$FTSendRequestResponse.newBuilder().setMD5(ByteString.copyFrom(md5)).setTaskId(this.i.getTransferId()).setFilePath(this.i.getFileName()).setFileSize((int) this.i.getFileSize()).setUri(this.i.getUri()).setSupportOption(this.r.b()).setFtBufferSize(this.s).setServiceId(this.i.getServiceId()).build());
        o(this.t);
        return this.i.getTransferId();
    }

    public void u(int i) {
        if (!this.r.f()) {
            uml.a("TaskOperation", "setBufferSize: not support FtBuffer use def=" + this.s);
            return;
        }
        uml.d("TaskOperation", "setBufferSize: old=" + this.s + " new=" + i);
        this.s = i;
    }

    public void v() {
        uml.d("TaskOperation", "startSendFile: " + j());
        this.n.a();
    }

    public void w(int i, int i2, byte[] bArr) {
        Handler handler = this.o;
        if (handler == null) {
            uml.b("TaskOperation", "writeChunk: mWorkHandler is null");
        } else {
            handler.post(new a(i, i2, bArr));
        }
    }

    public final void x(int i, int i2, byte[] bArr) {
        zp9 zp9Var = this.m;
        if (zp9Var == null) {
            return;
        }
        int iB = zp9Var.b(f().g(), i, i2, bArr);
        if (iB != 0) {
            FileTransferTask fileTransferTaskH = h();
            fileTransferTaskH.setState(FileTransferTask.State.FAILED);
            fileTransferTaskH.setErrorCode(iB);
            this.k.onTransferComplete(fileTransferTaskH);
        } else {
            o(this.x);
        }
        zp9 zp9Var2 = this.m;
        this.j.e(this.i.getNodeId(), (FTChunk$FTChunkRequestResponse) FTChunk$FTChunkRequestResponse.newBuilder().setTaskId(j()).setState(iB).setEndPoint((int) (zp9Var2 != null ? zp9Var2.a() : 0L)).setIndex(i).build());
    }

    public boolean y(int i, int i2, int i3) {
        bq9 bq9Var = this.n;
        if (bq9Var != null) {
            return bq9Var.d(f().g(), i, i2, i3);
        }
        return false;
    }
}

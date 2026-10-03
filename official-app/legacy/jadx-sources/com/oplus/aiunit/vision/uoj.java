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

/* JADX INFO: loaded from: classes5.dex */
public class uoj implements Handler.Callback {
    public static final int MSG_TIMEOUT_RCV_FTChunkResponse_wait_FTChunkRequest_or_FTCompleteRequest = 804;
    public static final int MSG_TIMEOUT_RCV_FTSendRequest_wait_Receive_or_reject = 805;
    public static final int MSG_TIMEOUT_RCV_FTSendResponse_wait_FTChunkRequest = 803;
    public static final int MSG_TIMEOUT_SEND_FTChunkRequest_wait_FTChunkResponse = 801;
    public static final int MSG_TIMEOUT_SEND_FTCompleteRequest_wait_FTCompleteResponse = 802;
    public static final int MSG_TIMEOUT_SEND_FTSendRequest_wait_FTSendResponse = 800;
    public final FileTransferTask i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m07 f17544j;
    public final sc7 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f17545l;
    public to9 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public vo9 f17546n;
    public Handler o;
    public Handler p;
    public HandlerThread q;
    public final iz7 r = new iz7();
    public int s;
    public final b t;
    public final b u;
    public final b v;
    public final b w;
    public final b x;
    public final b y;

    public class a implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f17547j;
        public final /* synthetic */ byte[] k;

        public a(int i, int i2, byte[] bArr) {
            this.i = i;
            this.f17547j = i2;
            this.k = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            uoj.this.x(this.i, this.f17547j, this.k);
        }
    }

    public class b implements Runnable {
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f17549j;
        public int k;

        public int a() {
            return (uoj.this.r.g() && this.i == 801) ? jz7.b(uoj.this.f17545l) * 2000 : jz7.b(uoj.this.f17545l) * 8000;
        }

        public String b() {
            return this.f17549j;
        }

        public int c() {
            return this.k;
        }

        public void d(int i) {
            this.k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            uoj.this.n(this, this.i, this.f17549j);
        }

        public b(int i, String str) {
            this.i = i;
            this.f17549j = str;
        }
    }

    public uoj(FileTransferTask fileTransferTask, sc7 sc7Var, m07 m07Var, int i) {
        this.t = new b(800, "SEND_FTSendRequest_wait_FTSendResponse");
        this.u = new b(801, "SEND_FTChunkRequest_wait_FTChunkResponse");
        this.v = new b(802, "SEND_FTCompleteRequest_wait_FTCompleteResponse");
        this.w = new b(803, "RCV_FTSendResponse_wait_FTChunkRequest");
        this.x = new b(804, "RCV_FTChunkResponse_wait_FTChunkRequest_or_FTCompleteRequest");
        this.y = new b(805, "RCV_FTSendRequest_wait_Receive_or_reject");
        this.i = fileTransferTask;
        this.k = sc7Var;
        this.f17544j = m07Var;
        this.f17545l = i;
        this.s = jz7.c(i);
    }

    public int e() {
        vo9 vo9Var = this.f17546n;
        if (vo9Var != null) {
            vo9Var.clean();
        }
        to9 to9Var = this.m;
        if (to9Var == null) {
            return 0;
        }
        to9Var.clean();
        return 0;
    }

    public iz7 f() {
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
                this.f17544j.f(this.i.getNodeId(), FTComplete$FTCompleteRequestResponse.newBuilder().setTaskId(j()).setState(h().getErrorCode()).build());
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
            wil.k("TaskOperation", "initDataReceiver fileName isEmpty");
            return 513;
        }
        Uri uri = Uri.parse(targetPath);
        String scheme = uri.getScheme();
        wil.a("TaskOperation", "initDataReceiver " + uri);
        if (TextUtils.isEmpty(scheme)) {
            this.m = new qv4(this.o);
        } else {
            this.m = new c07(this.o, context);
        }
        return this.m.c(this.i, targetPath);
    }

    public int l(Context context) {
        String scheme = Uri.parse(this.i.getFilePath()).getScheme();
        wil.a("TaskOperation", "initDataSender: scheme = " + scheme);
        if (TextUtils.isEmpty(scheme)) {
            this.f17546n = new ew4(this, this.o, this.f17544j, this.q);
        } else {
            this.f17546n = new d07(this, this.o, context, this.f17544j, this.q);
        }
        return this.f17546n.c();
    }

    public void m(HandlerThread handlerThread) {
        this.q = handlerThread;
        this.o = new Handler(handlerThread.getLooper(), this);
        this.p = new Handler(handlerThread.getLooper(), this);
    }

    public final void n(b bVar, int i, String str) {
        int iC;
        if (this.r.g() && i == 801 && (iC = bVar.c()) < 3) {
            wil.k("TaskOperation", "onTimeOut: reSendLastChunk " + iC + " taskId=" + i());
            vo9 vo9Var = this.f17546n;
            if (vo9Var != null) {
                vo9Var.b();
                o(this.u);
            } else {
                wil.k("TaskOperation", "onTimeOut: mIDataSender is null");
            }
            bVar.d(iC + 1);
            return;
        }
        wil.b("TaskOperation", "onTimeOut: transferId=" + j() + " type=" + i + ", des=" + str);
        r();
        this.i.setState(FileTransferTask.State.FAILED);
        this.i.setErrorCode(503);
        this.k.onTransferComplete(this.i);
    }

    public void o(b bVar) {
        wil.a("TaskOperation", "postTimeout: " + j() + " " + bVar.b());
        Handler handler = this.p;
        if (handler != null) {
            handler.postDelayed(bVar, bVar.a());
            return;
        }
        wil.b("TaskOperation", "postTimeout: mTimeOutHandler is null " + j() + " " + bVar.b());
    }

    public int p() {
        this.f17544j.i(h().getNodeId(), FTSend$FTSendRequestResponse.newBuilder().setTaskId(j()).setSupportOption(this.r.b()).setFtBufferSize(this.s).setState(this.i.getErrorCode()).build());
        if (this.i.getErrorCode() != 0) {
            return 0;
        }
        o(this.w);
        return 0;
    }

    public void q() {
        if (this.i.getState() == FileTransferTask.State.READY) {
            this.f17544j.i(this.i.getNodeId(), FTSend$FTSendRequestResponse.newBuilder().setTaskId(j()).setState(506).setSupportOption(this.r.b()).setFtBufferSize(this.s).build());
        } else {
            wil.d("TaskOperation", "reject: can not reject status=" + this.i.getState());
        }
    }

    public void r() {
        wil.a("TaskOperation", "release: " + j());
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
        vo9 vo9Var = this.f17546n;
        if (vo9Var != null) {
            vo9Var.clean();
            this.f17546n = null;
        }
        to9 to9Var = this.m;
        if (to9Var != null) {
            to9Var.clean();
            this.m = null;
        }
    }

    public void s(b bVar) {
        wil.a("TaskOperation", "removeTimeout: " + j() + " " + bVar.b());
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
        this.f17544j.h(this.i.getNodeId(), FTSend$FTSendRequestResponse.newBuilder().setMD5(ByteString.copyFrom(md5)).setTaskId(this.i.getTransferId()).setFilePath(this.i.getFileName()).setFileSize((int) this.i.getFileSize()).setUri(this.i.getUri()).setSupportOption(this.r.b()).setFtBufferSize(this.s).setServiceId(this.i.getServiceId()).build());
        o(this.t);
        return this.i.getTransferId();
    }

    public void u(int i) {
        if (!this.r.f()) {
            wil.a("TaskOperation", "setBufferSize: not support FtBuffer use def=" + this.s);
            return;
        }
        wil.d("TaskOperation", "setBufferSize: old=" + this.s + " new=" + i);
        this.s = i;
    }

    public void v() {
        wil.d("TaskOperation", "startSendFile: " + j());
        this.f17546n.a();
    }

    public void w(int i, int i2, byte[] bArr) {
        Handler handler = this.o;
        if (handler == null) {
            wil.b("TaskOperation", "writeChunk: mWorkHandler is null");
        } else {
            handler.post(new a(i, i2, bArr));
        }
    }

    public final void x(int i, int i2, byte[] bArr) {
        to9 to9Var = this.m;
        if (to9Var == null) {
            return;
        }
        int iB = to9Var.b(f().g(), i, i2, bArr);
        if (iB != 0) {
            FileTransferTask fileTransferTaskH = h();
            fileTransferTaskH.setState(FileTransferTask.State.FAILED);
            fileTransferTaskH.setErrorCode(iB);
            this.k.onTransferComplete(fileTransferTaskH);
        } else {
            o(this.x);
        }
        to9 to9Var2 = this.m;
        this.f17544j.e(this.i.getNodeId(), FTChunk$FTChunkRequestResponse.newBuilder().setTaskId(j()).setState(iB).setEndPoint((int) (to9Var2 != null ? to9Var2.a() : 0L)).setIndex(i).build());
    }

    public boolean y(int i, int i2, int i3) {
        vo9 vo9Var = this.f17546n;
        if (vo9Var != null) {
            return vo9Var.d(f().g(), i, i2, i3);
        }
        return false;
    }
}

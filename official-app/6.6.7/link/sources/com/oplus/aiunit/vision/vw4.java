package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.NonNull;
import com.google.protobuf.ByteString;
import com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponse;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class vw4 extends xs4 {
    public n17 b;
    public RandomAccessFile c;
    public Handler d;
    public Runnable e;
    public FileTransferTask f;
    public byte[] g;
    public long h;
    public int i;
    public long j;
    public HandlerThread k;
    public FTChunk$FTChunkRequestResponse l;

    public class a implements Runnable {
        public final /* synthetic */ vsj i;

        public a(vsj vsjVar) {
            this.i = vsjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            vw4.this.m(this.i);
        }
    }

    public vw4(vsj vsjVar, Handler handler, @NonNull n17 n17Var, HandlerThread handlerThread) {
        super(handler);
        this.i = 0;
        this.b = n17Var;
        this.f = vsjVar.h();
        this.k = handlerThread;
        this.e = new a(vsjVar);
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized void a() {
        this.j = System.currentTimeMillis();
        uml.a("DataSenderImpl", "startSend mStartTime " + this.j);
        this.f.setState(FileTransferTask.State.TRANSFERING);
        this.i = 0;
        Handler handler = this.d;
        if (handler != null) {
            handler.post(this.e);
        } else {
            uml.b("DataSenderImpl", "startSend not initialize");
        }
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized void b() {
        if (this.l != null) {
            this.b.d(this.f.getNodeId(), this.l);
        } else {
            uml.k("DataSenderImpl", "reSendLastChunk: mLastChunkRequest is null");
        }
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized int c() {
        uml.a("DataSenderImpl", "prepareToSend ");
        l();
        this.d = new Handler(this.k.getLooper());
        return k(this.f.getFilePath());
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized void clean() {
        uml.a("DataSenderImpl", "clean");
        l();
        this.h = 0L;
        g();
        this.f = null;
        this.l = null;
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized boolean d(boolean z, int i, int i2, int i3) {
        if (z) {
            FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse = this.l;
            if (fTChunk$FTChunkRequestResponse != null && i == fTChunk$FTChunkRequestResponse.getIndex() - 1) {
                uml.k("DataSenderImpl", "sendNextChunk: same position of last send,ignore mIndex=" + this.i + " mSend=" + this.h + " index=" + i + " eP=" + i2);
                return true;
            }
        }
        if (i + 1 == this.i) {
            Handler handler = this.d;
            if (handler != null) {
                handler.post(this.e);
                return true;
            }
        } else {
            uml.b("DataSenderImpl", "sendNextChunk: mIndexCount=" + this.i + " rcvIndex=" + i);
        }
        return false;
    }

    public final synchronized void f(int i) {
        byte[] bArr = this.g;
        if (bArr == null || bArr.length != i) {
            this.g = new byte[i];
        }
    }

    public final void g() {
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                uml.b("DataSenderImpl", "closeStream: " + e.getMessage());
            }
            this.c = null;
        }
    }

    public int h() {
        return this.i;
    }

    public final synchronized void i(int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        FileTransferTask fileTransferTask = this.f;
        messageObtain.obj = fileTransferTask;
        fileTransferTask.setState(FileTransferTask.State.FAILED);
        this.f.setErrorCode(i);
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final void j(FileTransferTask fileTransferTask, long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        messageObtain.obj = fileTransferTask;
        fileTransferTask.setProgress((int) ((j * 100) / fileTransferTask.getFileSize()));
        fileTransferTask.setState(FileTransferTask.State.TRANSFERING);
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public synchronized int k(String str) {
        try {
            this.c = new RandomAccessFile(str, "r");
        } catch (FileNotFoundException e) {
            uml.b("DataSenderImpl", "prepareStream: " + e.getMessage() + " mFilePath :" + str);
            return 518;
        }
        return 0;
    }

    public final synchronized void l() {
        uml.a("DataSenderImpl", "releaseHandler");
        Handler handler = this.d;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.d = null;
        }
    }

    public final synchronized void m(vsj vsjVar) {
        if (this.c == null) {
            uml.b("DataSenderImpl", "sendChunk mRandomAccessFile == null");
            return;
        }
        FileTransferTask fileTransferTask = this.f;
        if (fileTransferTask == null) {
            uml.b("DataSenderImpl", "sendChunk: task == null");
            return;
        }
        FileTransferTask.State state = fileTransferTask.getState();
        FileTransferTask.State state2 = FileTransferTask.State.COMPLETE;
        if (state != state2 && this.f.getState() != FileTransferTask.State.FAILED) {
            f(vsjVar.g());
            try {
                int i = this.c.read(this.g);
                if (i < 0) {
                    uml.b("DataSenderImpl", "sendChunk read == -1");
                    return;
                }
                this.h += (long) i;
                long fileSize = this.f.getFileSize();
                if (this.h > fileSize) {
                    uml.b("DataSenderImpl", "sendChunk mTotalSize > fileSize ," + this.h + " > " + fileSize);
                    return;
                }
                FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse = (FTChunk$FTChunkRequestResponse) FTChunk$FTChunkRequestResponse.newBuilder().setContent(ByteString.copyFrom(Arrays.copyOf(this.g, i))).setIndex(h()).setTaskId(this.f.getTransferId()).build();
                this.l = fTChunk$FTChunkRequestResponse;
                this.b.d(this.f.getNodeId(), fTChunk$FTChunkRequestResponse);
                vsjVar.o(vsjVar.u);
                this.i++;
                j(this.f, this.h);
                if (this.h == fileSize) {
                    this.f.setState(state2);
                    uml.a("DataSenderImpl", "sendChunk mIsCompleted time " + (System.currentTimeMillis() - this.j) + " fileSize " + fileSize);
                    g();
                }
                return;
            } catch (IOException e) {
                uml.b("DataSenderImpl", "sendChunk =" + e.getMessage());
                i(501);
            }
        }
        uml.b("DataSenderImpl", "sendChunk state " + this.f.getState());
        l();
    }
}

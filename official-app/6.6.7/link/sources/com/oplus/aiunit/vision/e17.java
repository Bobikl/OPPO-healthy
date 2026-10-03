package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.protobuf.ByteString;
import com.oplus.wearable.linkservice.file.data.proto.FTChunk$FTChunkRequestResponse;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class e17 extends xs4 {
    public n17 b;
    public Handler c;
    public Runnable d;
    public FileTransferTask e;
    public byte[] f;
    public long g;
    public int h;
    public long i;
    public Context j;
    public ParcelFileDescriptor.AutoCloseInputStream k;
    public HandlerThread l;
    public ContentProviderClient m;
    public FTChunk$FTChunkRequestResponse n;
    public boolean o;

    public class a implements Runnable {
        public final /* synthetic */ vsj i;

        public a(vsj vsjVar) {
            this.i = vsjVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e17.this.o(this.i);
        }
    }

    public e17(Handler handler) {
        super(handler);
        this.h = 0;
        this.o = false;
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized void a() {
        this.i = System.currentTimeMillis();
        uml.a("FDDataSenderImpl", "startSend mStartTime " + this.i);
        this.h = 0;
        this.e.setState(FileTransferTask.State.TRANSFERING);
        Handler handler = this.c;
        if (handler != null) {
            handler.post(this.d);
        } else {
            uml.b("FDDataSenderImpl", "startSend not initialize");
        }
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized void b() {
        if (this.n != null) {
            this.b.d(this.e.getNodeId(), this.n);
        } else {
            uml.k("FDDataSenderImpl", "reSendLastChunk: mLastChunkRequest is null");
        }
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized int c() {
        uml.a("FDDataSenderImpl", "prepareToSend ");
        this.e.setReceiveTask(false);
        n();
        this.c = new Handler(this.l.getLooper());
        return m(this.e.getFilePath(), this.e.getFileAndroidUri());
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized void clean() {
        uml.a("FDDataSenderImpl", "clean");
        this.g = 0L;
        n();
        h();
        g();
        this.e = null;
        this.n = null;
        this.o = true;
    }

    @Override // com.oplus.aiunit.vision.bq9
    public synchronized boolean d(boolean z, int i, int i2, int i3) {
        if (z) {
            FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse = this.n;
            if (fTChunk$FTChunkRequestResponse != null && i == fTChunk$FTChunkRequestResponse.getIndex() - 1) {
                uml.k("FDDataSenderImpl", "sendNextChunk: same position of last send,ignore mIndex=" + this.h + " mSend=" + this.g + " index=" + i + " eP=" + i2);
                return true;
            }
        }
        if (i + 1 == this.h) {
            Handler handler = this.c;
            if (handler != null) {
                handler.post(this.d);
                return true;
            }
        } else {
            uml.b("FDDataSenderImpl", "sendNextChunk: mIndexCount=" + this.h + " rcvIndex=" + i);
        }
        return false;
    }

    public final synchronized void f(int i) {
        byte[] bArr = this.f;
        if (bArr == null || bArr.length != i) {
            this.f = new byte[i];
        }
    }

    public final synchronized void g() {
        ContentProviderClient contentProviderClient = this.m;
        if (contentProviderClient != null) {
            try {
                contentProviderClient.close();
            } catch (Exception e) {
                uml.b("FDDataSenderImpl", "CloseContentProviderClient Exception: " + e.getMessage());
            }
            this.m = null;
        }
    }

    public final synchronized void h() {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = this.k;
        if (autoCloseInputStream != null) {
            try {
                autoCloseInputStream.close();
            } catch (IOException e) {
                uml.b("FDDataSenderImpl", "closeStream: " + e.getMessage());
            }
            this.k = null;
        }
    }

    public int i() {
        return this.h;
    }

    public final synchronized void j(FileTransferTask fileTransferTask) {
        uml.d("FDDataSenderImpl", "notifyComplete " + fileTransferTask + " " + fileTransferTask.getErrorCode());
        if (this.o) {
            uml.k("FDDataSenderImpl", "notifyComplete already has notify complete, ignore");
            return;
        }
        this.o = true;
        Message messageObtain = Message.obtain();
        messageObtain.what = 102;
        messageObtain.obj = fileTransferTask;
        this.o = true;
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final synchronized void k(int i) {
        if (this.o) {
            uml.k("FDDataSenderImpl", "notifyError already has notify complete, ignore");
            return;
        }
        this.o = true;
        FileTransferTask fileTransferTask = this.e;
        if (fileTransferTask == null) {
            uml.k("FDDataSenderImpl", "notifyError mTask is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = fileTransferTask;
        fileTransferTask.setErrorCode(i);
        fileTransferTask.setState(FileTransferTask.State.FAILED);
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final void l(FileTransferTask fileTransferTask, long j, int i) {
        Message messageObtain = Message.obtain();
        fileTransferTask.setFileTransferSize((int) j);
        messageObtain.what = 101;
        fileTransferTask.setState(FileTransferTask.State.TRANSFERING);
        fileTransferTask.setProgress((int) ((j * 100) / fileTransferTask.getFileSize()));
        messageObtain.obj = fileTransferTask;
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public synchronized int m(String str, Uri uri) {
        if (uri == null) {
            try {
                uri = Uri.parse(str);
                uml.d("FDDataSenderImpl", "prepareStream: use android uri");
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.j.getContentResolver().acquireUnstableContentProviderClient(uri);
            this.m = contentProviderClientAcquireUnstableContentProviderClient;
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return 516;
            }
            try {
                try {
                    this.k = new ParcelFileDescriptor.AutoCloseInputStream(contentProviderClientAcquireUnstableContentProviderClient.openFile(uri, "r"));
                    return 0;
                } catch (RemoteException e) {
                    uml.b("FDDataSenderImpl", "RemoteException: " + e.getMessage());
                    return 501;
                }
            } catch (FileNotFoundException e2) {
                uml.b("FDDataSenderImpl", "prepareStream FileNotFoundException " + e2.getMessage() + " mFilePath :" + str);
                return 501;
            }
        } catch (Exception unused) {
            uml.b("FDDataSenderImpl", "prepareStream: no file provider permission " + str);
            return 515;
        }
    }

    public final synchronized void n() {
        uml.a("FDDataSenderImpl", "releaseHandler");
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.c = null;
        }
    }

    public final synchronized void o(vsj vsjVar) {
        FileTransferTask fileTransferTask = this.e;
        if (fileTransferTask == null) {
            uml.b("FDDataSenderImpl", "sendChunk: mFileTransferTask == null");
            k(501);
            return;
        }
        FileTransferTask.State state = fileTransferTask.getState();
        FileTransferTask.State state2 = FileTransferTask.State.COMPLETE;
        if (state == state2) {
            uml.d("FDDataSenderImpl", "sendChunk: state COMPLETE");
            j(this.e);
            return;
        }
        if (this.e.getState() == FileTransferTask.State.FAILED) {
            uml.b("FDDataSenderImpl", "sendChunk mFileTransferTask.getState() " + this.e.getState());
            k(501);
            n();
            return;
        }
        if (this.k == null) {
            uml.b("FDDataSenderImpl", "sendChunk: mInputStream == null");
            k(501);
            return;
        }
        f(vsjVar.g());
        try {
            int i = this.k.read(this.f);
            if (i < 0) {
                uml.b("FDDataSenderImpl", "sendChunk read == -1");
                k(501);
                return;
            }
            this.g += (long) i;
            long fileSize = this.e.getFileSize();
            uml.a("FDDataSenderImpl", "sendChunk mSendSize " + this.g + " ,fileSize " + fileSize);
            if (this.g > fileSize) {
                uml.b("FDDataSenderImpl", "sendChunk mSendSize > fileSize ," + this.g + " > " + fileSize);
                k(501);
                return;
            }
            FTChunk$FTChunkRequestResponse fTChunk$FTChunkRequestResponse = (FTChunk$FTChunkRequestResponse) FTChunk$FTChunkRequestResponse.newBuilder().setContent(ByteString.copyFrom(Arrays.copyOf(this.f, i))).setIndex(i()).setTaskId(this.e.getTransferId()).setEndPoint((int) this.g).build();
            this.n = fTChunk$FTChunkRequestResponse;
            this.b.d(this.e.getNodeId(), fTChunk$FTChunkRequestResponse);
            vsjVar.o(vsjVar.u);
            this.h++;
            long j = this.g;
            if (j >= fileSize) {
                l(this.e, j, i);
                this.e.setState(state2);
                uml.a("FDDataSenderImpl", "sendChunk mIsCompleted time " + (System.currentTimeMillis() - this.i) + " fileSize " + fileSize);
                h();
            } else {
                l(this.e, j, i);
            }
        } catch (IOException e) {
            uml.b("FDDataSenderImpl", "sendChunk IOException =" + e.getMessage());
            k(501);
        }
    }

    public e17(vsj vsjVar, Handler handler, Context context, @NonNull n17 n17Var, HandlerThread handlerThread) {
        this(handler);
        this.j = context.getApplicationContext();
        this.e = vsjVar.h();
        this.b = n17Var;
        this.l = handlerThread;
        this.d = new a(vsjVar);
    }
}

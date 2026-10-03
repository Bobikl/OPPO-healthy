package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class d17 extends ws4 {
    public Context b;
    public FileTransferTask c;
    public long d;
    public int e;
    public String f;
    public ParcelFileDescriptor.AutoCloseOutputStream g;
    public int h;
    public ContentProviderClient i;

    public d17(Handler handler) {
        super(handler);
        this.d = 0L;
        this.e = -1;
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized long a() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized int b(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if (this.e == i) {
                long j = i2;
                long j2 = this.d;
                if (j == j2 && j2 != 0) {
                    uml.d("FDDataReceiverImpl", "onReceiveData: index=" + i + " endPoint=" + i2 + " repeat last");
                    return 0;
                }
            }
        }
        this.h = i;
        int i3 = this.e;
        if (i3 < 0 && i != 0) {
            uml.b("FDDataReceiverImpl", "onReceiveData FTChunkRequest index = " + i + " mLastIndex " + this.e);
            return 510;
        }
        if (i3 >= 0 && i3 + 1 != i) {
            uml.b("FDDataReceiverImpl", "onReceiveData ERROR_CONTENT_INDEX index = " + i + " mLastIndex " + this.e);
            d();
            return 510;
        }
        this.e = i;
        if (bArr != null && bArr.length != 0) {
            int i4 = i(bArr);
            if (!z || this.d == i2) {
                return i4;
            }
            uml.k("FDDataReceiverImpl", "onReceiveData: mReceiveSize=" + this.d + " endPoint=" + i2);
            return 501;
        }
        uml.b("FDDataReceiverImpl", "onReceiveData buffer == null or buffer.length == 0 ");
        return 523;
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized int c(FileTransferTask fileTransferTask, String str) {
        uml.a("FDDataReceiverImpl", "prepareReceive ");
        try {
            this.c = fileTransferTask;
            fileTransferTask.setReceiveTask(true);
            if (TextUtils.isEmpty(str)) {
                uml.b("FDDataReceiverImpl", "prepareReceive:fileName == null ");
                return 514;
            }
            this.d = 0L;
            this.f = str;
            return h(str);
        } catch (Exception e) {
            uml.b("FDDataReceiverImpl", "prepareStream Exception: " + e.getMessage());
            return 0;
        }
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized void clean() {
        uml.a("FDDataReceiverImpl", "clean");
        this.e = -1;
        this.c = null;
        f();
        e();
    }

    public final void d() {
        uml.a("FDDataReceiverImpl", "cancelReceive");
        clean();
    }

    public final void e() {
        ContentProviderClient contentProviderClient = this.i;
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    public final void f() {
        uml.a("FDDataReceiverImpl", "closeStream");
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.g;
        if (autoCloseOutputStream != null) {
            try {
                autoCloseOutputStream.close();
            } catch (IOException e) {
                uml.b("FDDataReceiverImpl", "closeStream: " + e.getMessage());
            }
            this.g = null;
        }
    }

    public final void g(FileTransferTask fileTransferTask, long j, int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        messageObtain.obj = fileTransferTask;
        fileTransferTask.setFileTransferSize((int) j);
        fileTransferTask.setProgress((int) ((j * 100) / fileTransferTask.getFileSize()));
        fileTransferTask.setState(FileTransferTask.State.TRANSFERING);
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final synchronized int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return 514;
        }
        e();
        Uri uri = Uri.parse(str);
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.b.getContentResolver().acquireUnstableContentProviderClient(uri);
            this.i = contentProviderClientAcquireUnstableContentProviderClient;
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return 516;
            }
            try {
                this.g = new ParcelFileDescriptor.AutoCloseOutputStream(contentProviderClientAcquireUnstableContentProviderClient.openFile(uri, "w"));
                return 0;
            } catch (Exception e) {
                uml.b("FDDataReceiverImpl", "CloseStream Exception: " + e.getMessage());
                return 501;
            }
        } catch (Exception e2) {
            uml.b("FDDataReceiverImpl", "prepareStream: no file provider permission " + str + " " + e2.getMessage());
            return 517;
        }
    }

    public final synchronized int i(byte[] bArr) {
        FileTransferTask fileTransferTask = this.c;
        if (fileTransferTask == null) {
            uml.b("FDDataReceiverImpl", "writeFile mFileTransferTask == null");
            return 523;
        }
        if (fileTransferTask.getState() != FileTransferTask.State.FAILED && this.c.getState() != FileTransferTask.State.COMPLETE) {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.g;
            if (autoCloseOutputStream == null) {
                uml.b("FDDataReceiverImpl", "writeFile mOutputStream == null");
                return 523;
            }
            try {
                autoCloseOutputStream.write(bArr);
                int length = bArr.length;
                long j = this.d + ((long) length);
                this.d = j;
                g(this.c, j, length);
                return 0;
            } catch (IOException e) {
                uml.b("FDDataReceiverImpl", "writeFile: write " + e.getMessage());
                return 501;
            }
        }
        uml.b("FDDataReceiverImpl", "writeFile state = " + this.c.getState());
        return 523;
    }

    public d17(Handler handler, Context context) {
        this(handler);
        this.b = context;
    }
}

package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class c07 extends gs4 {
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FileTransferTask f9906c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9907e;
    public String f;
    public ParcelFileDescriptor.AutoCloseOutputStream g;
    public int h;
    public ContentProviderClient i;

    public c07(Handler handler) {
        super(handler);
        this.d = 0L;
        this.f9907e = -1;
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized long a() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized int b(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if (this.f9907e == i) {
                long j2 = i2;
                long j3 = this.d;
                if (j2 == j3 && j3 != 0) {
                    wil.d("FDDataReceiverImpl", "onReceiveData: index=" + i + " endPoint=" + i2 + " repeat last");
                    return 0;
                }
            }
        }
        this.h = i;
        int i3 = this.f9907e;
        if (i3 < 0 && i != 0) {
            wil.b("FDDataReceiverImpl", "onReceiveData FTChunkRequest index = " + i + " mLastIndex " + this.f9907e);
            return TypedValues.PositionType.TYPE_POSITION_TYPE;
        }
        if (i3 >= 0 && i3 + 1 != i) {
            wil.b("FDDataReceiverImpl", "onReceiveData ERROR_CONTENT_INDEX index = " + i + " mLastIndex " + this.f9907e);
            d();
            return TypedValues.PositionType.TYPE_POSITION_TYPE;
        }
        this.f9907e = i;
        if (bArr != null && bArr.length != 0) {
            int i4 = i(bArr);
            if (!z || this.d == i2) {
                return i4;
            }
            wil.k("FDDataReceiverImpl", "onReceiveData: mReceiveSize=" + this.d + " endPoint=" + i2);
            return 501;
        }
        wil.b("FDDataReceiverImpl", "onReceiveData buffer == null or buffer.length == 0 ");
        return 523;
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized int c(FileTransferTask fileTransferTask, String str) {
        wil.a("FDDataReceiverImpl", "prepareReceive ");
        try {
            this.f9906c = fileTransferTask;
            fileTransferTask.setReceiveTask(true);
            if (TextUtils.isEmpty(str)) {
                wil.b("FDDataReceiverImpl", "prepareReceive:fileName == null ");
                return 514;
            }
            this.d = 0L;
            this.f = str;
            return h(str);
        } catch (Exception e2) {
            wil.b("FDDataReceiverImpl", "prepareStream Exception: " + e2.getMessage());
            return 0;
        }
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized void clean() {
        wil.a("FDDataReceiverImpl", "clean");
        this.f9907e = -1;
        this.f9906c = null;
        f();
        e();
    }

    public final void d() {
        wil.a("FDDataReceiverImpl", "cancelReceive");
        clean();
    }

    public final void e() {
        ContentProviderClient contentProviderClient = this.i;
        if (contentProviderClient != null) {
            contentProviderClient.close();
        }
    }

    public final void f() {
        wil.a("FDDataReceiverImpl", "closeStream");
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.g;
        if (autoCloseOutputStream != null) {
            try {
                autoCloseOutputStream.close();
            } catch (IOException e2) {
                wil.b("FDDataReceiverImpl", "closeStream: " + e2.getMessage());
            }
            this.g = null;
        }
    }

    public final void g(FileTransferTask fileTransferTask, long j2, int i) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        messageObtain.obj = fileTransferTask;
        fileTransferTask.setFileTransferSize((int) j2);
        fileTransferTask.setProgress((int) ((j2 * 100) / fileTransferTask.getFileSize()));
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
                return k18.GL_GREATER;
            }
            try {
                this.g = new ParcelFileDescriptor.AutoCloseOutputStream(contentProviderClientAcquireUnstableContentProviderClient.openFile(uri, "w"));
                return 0;
            } catch (Exception e2) {
                wil.b("FDDataReceiverImpl", "CloseStream Exception: " + e2.getMessage());
                return 501;
            }
        } catch (Exception e3) {
            wil.b("FDDataReceiverImpl", "prepareStream: no file provider permission " + str + " " + e3.getMessage());
            return k18.GL_NOTEQUAL;
        }
    }

    public final synchronized int i(byte[] bArr) {
        FileTransferTask fileTransferTask = this.f9906c;
        if (fileTransferTask == null) {
            wil.b("FDDataReceiverImpl", "writeFile mFileTransferTask == null");
            return 523;
        }
        if (fileTransferTask.getState() != FileTransferTask.State.FAILED && this.f9906c.getState() != FileTransferTask.State.COMPLETE) {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.g;
            if (autoCloseOutputStream == null) {
                wil.b("FDDataReceiverImpl", "writeFile mOutputStream == null");
                return 523;
            }
            try {
                autoCloseOutputStream.write(bArr);
                int length = bArr.length;
                long j2 = this.d + ((long) length);
                this.d = j2;
                g(this.f9906c, j2, length);
                return 0;
            } catch (IOException e2) {
                wil.b("FDDataReceiverImpl", "writeFile: write " + e2.getMessage());
                return 501;
            }
        }
        wil.b("FDDataReceiverImpl", "writeFile state = " + this.f9906c.getState());
        return 523;
    }

    public c07(Handler handler, Context context) {
        this(handler);
        this.b = context;
    }
}

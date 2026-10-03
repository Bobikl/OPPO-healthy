package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Message;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes5.dex */
public class qv4 extends gs4 {
    public FileTransferTask b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f15959c;
    public long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15960e;
    public String f;
    public int g;

    public qv4(Handler handler) {
        super(handler);
        this.d = 0L;
        this.f15960e = -1;
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized long a() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized int b(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if (this.f15960e == i) {
                long j2 = i2;
                long j3 = this.d;
                if (j2 == j3 && j3 != 0) {
                    wil.d("DataReceiver", "onReceiveData: index=" + i + " endPoint=" + i2 + " repeat last");
                    return 0;
                }
            }
        }
        this.g = i;
        int i3 = this.f15960e;
        if (i3 < 0 && i != 0) {
            wil.b("DataReceiver", "onReceiveData FTChunkRequest index = " + i + " mLastIndex " + this.f15960e);
            return TypedValues.PositionType.TYPE_POSITION_TYPE;
        }
        if (i3 >= 0 && i3 + 1 != i) {
            wil.b("DataReceiver", "onReceiveData ERROR_CONTENT_INDEX index = " + i + " mLastIndex " + this.f15960e);
            d();
            return TypedValues.PositionType.TYPE_POSITION_TYPE;
        }
        this.f15960e = i;
        if (this.f15959c == null) {
            wil.b("DataReceiver", "onReceiveData mRandomAccessFile == null ");
            return 523;
        }
        if (bArr != null && bArr.length != 0) {
            return i(bArr);
        }
        wil.b("DataReceiver", "onReceiveData buffer == null or buffer.length == 0 ");
        return 523;
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized int c(FileTransferTask fileTransferTask, String str) {
        long length;
        String absolutePath;
        wil.a("DataReceiver", "prepareReceive ");
        this.b = fileTransferTask;
        File file = new File(str);
        this.d = file.length();
        length = file.length();
        absolutePath = file.getAbsolutePath();
        this.f = absolutePath;
        return h(absolutePath, length);
    }

    @Override // com.oplus.aiunit.vision.to9
    public synchronized void clean() {
        wil.d("DataReceiver", "clean:");
        this.f15960e = -1;
        e();
    }

    public final synchronized void d() {
        wil.a("DataReceiver", "cancelReceive");
        clean();
    }

    public final synchronized void e() {
        wil.a("DataReceiver", "closeStream");
        RandomAccessFile randomAccessFile = this.f15959c;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                    wil.b("DataReceiver", "closeStream: " + e2.getMessage());
                }
                this.f15959c = null;
            } catch (Throwable th) {
                this.f15959c = null;
                throw th;
            }
        }
    }

    public final synchronized void f(FileTransferTask fileTransferTask, long j2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        fileTransferTask.setFileTransferSize((int) j2);
        messageObtain.obj = fileTransferTask;
        int fileSize = (int) ((j2 * 100) / fileTransferTask.getFileSize());
        fileTransferTask.setState(FileTransferTask.State.TRANSFERING);
        fileTransferTask.setProgress(fileSize);
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final void g(FileTransferTask fileTransferTask, long j2) {
        f(fileTransferTask, j2);
    }

    public final synchronized int h(String str, long j2) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            this.f15959c = randomAccessFile;
            randomAccessFile.seek(j2);
            return 0;
        }
        try {
            file.createNewFile();
        } catch (IOException e2) {
            wil.b("DataReceiver", "prepareStream: " + e2.getMessage());
        }
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
                this.f15959c = randomAccessFile2;
                randomAccessFile2.seek(j2);
                return 0;
            } catch (IOException e3) {
                wil.b("DataReceiver", "prepareStream: IOException: " + e3.getMessage());
                try {
                    file.delete();
                } catch (Exception e4) {
                    wil.b("DataReceiver", "file delete: " + e4.getMessage());
                    return 501;
                }
                return 501;
            }
        } catch (FileNotFoundException e5) {
            wil.b("DataReceiver", "prepareStream: FileNotFoundException: " + e5.getMessage());
            file.delete();
            return 501;
        }
        throw th;
    }

    public final synchronized int i(byte[] bArr) {
        if (this.f15959c == null) {
            wil.b("DataReceiver", "writeFile mRandomAccessFile == null");
            return 523;
        }
        FileTransferTask fileTransferTask = this.b;
        if (fileTransferTask == null) {
            wil.b("DataReceiver", "writeFile mFileTransferTask == null");
            return 523;
        }
        if (fileTransferTask.getState() != FileTransferTask.State.COMPLETE && this.b.getState() != FileTransferTask.State.FAILED) {
            long fileSize = this.b.getFileSize();
            int length = bArr.length;
            try {
                this.f15959c.write(bArr);
                long j2 = this.d + ((long) length);
                this.d = j2;
                if (j2 > fileSize) {
                    wil.b("DataReceiver", "writeFile mReceiveSize > mFileTransferTask.getFileSize() " + this.d + " > " + fileSize);
                    try {
                        if (this.f15959c.length() > fileSize) {
                            return 512;
                        }
                    } catch (IOException e2) {
                        wil.b("DataReceiver", "writeFile: length " + e2.getMessage());
                        return 501;
                    }
                }
                g(this.b, this.d);
                return 0;
            } catch (IOException e3) {
                wil.b("DataReceiver", "writeFile: write " + e3.getMessage());
                return 501;
            }
        }
        wil.b("DataReceiver", "writeFile state  = " + this.b.getState());
        return 523;
    }
}
